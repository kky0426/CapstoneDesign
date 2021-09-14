package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.CMatch;
import com.example.capstona_a.data.CMatchData;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.data.CUserSetleagueEntryDTO;
import com.example.capstona_a.data.CuserLeagueEntryDTO;
import com.example.capstona_a.retrofit.RetroBuild;

import java.util.ArrayList;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseActivity extends AppCompatActivity {

    private TextView textView_nameSummoner;
    private TextView textView_nameTier;
    private TextView textView_nameScore;
    private TextView textView_RecordGame;
    private TextView textView_winningPercentage;

    private Button btn;

    private ImageView img_summoner;
    private ImageView img_Tier;
    private ImageView img_loading;

    private ListView listView;

    private final ArrayList<CMatch> matchList = new ArrayList<>();

    private final int MATCH_LENGTH = 11;
//    private final String LATEST_VERSION = "11.16.1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase);

        // 뷰 바인딩
        viewBinding();

        //
        Intent intent = getIntent();
        CUserDTO user = (CUserDTO) intent.getSerializableExtra("user");

        // 뷰 세팅
        textView_nameSummoner.setText(user.getName());
        String profileImgSrc = Util.getProfileImgSrc(user.getProfileIconId());
        Glide.with(this).load(profileImgSrc).into(img_summoner);
        // Glide.with(this).asGif().diskCacheStrategy(DiskCacheStrategy.RESOURCE).load(R.drawable.poro2).into(img_loading);

        // Retrofit call
        String api_key = Util.API_KEY();
        league(user, api_key);
        match(user, api_key);

        // 뷰에 핸들러 달기
        btn.setOnClickListener(v -> {
            Intent intent1 = new Intent(UserPhaseActivity.this, IngameActivity.class);
            intent1.putExtra("user", user);
            startActivity(intent1);
        });
    }

    private void viewBinding() {
        textView_nameSummoner = findViewById(R.id.tv_name_summoner);
        textView_nameTier = findViewById(R.id.tv_tier1);
        textView_nameScore = findViewById(R.id.tv_tier2);
        textView_RecordGame = findViewById(R.id.tv_record_game);
        textView_winningPercentage = findViewById(R.id.tv_user_phase_win_rate);

        btn = findViewById(R.id.btn_ingame_info);

        img_summoner = findViewById(R.id.img_summoner);
        img_Tier = findViewById(R.id.img_tier);
        img_loading = findViewById(R.id.img_user_phase_loading);

        listView = findViewById(R.id.listview_user_phase);
    }

    private void league(CUserDTO user, String api_key) {
        Call<Set<CuserLeagueEntryDTO>> res1 = RetroBuild.getInstance().getService().getLeagueV4(user.getId(), api_key);
        res1.enqueue(new Callback<Set<CuserLeagueEntryDTO>>() {
            @Override
            public void onResponse(@NonNull Call<Set<CuserLeagueEntryDTO>> call, @NonNull Response<Set<CuserLeagueEntryDTO>> response) {
                Log.d("Retro CUsDetail success", response.toString());
                Set<CuserLeagueEntryDTO> leagueEntryDTO = response.body();
                CUserSetleagueEntryDTO dto = new CUserSetleagueEntryDTO();
                CuserLeagueEntryDTO test= new CuserLeagueEntryDTO();
                dto.setLeagueEntryDTO(leagueEntryDTO);
                ArrayList<CuserLeagueEntryDTO> arrayList = new ArrayList<>(dto.getLeagueEntryDTO().size());

                if (leagueEntryDTO == null) {
                    // TODO 만약 리그 정보가 아예 없을 경우를 처리 해야함.
                    Log.d("UserPhaseActivity", "리그 V4 정보가 없습니다: " + user.getName());
                } else {
                    arrayList.addAll(leagueEntryDTO);
                    test = getSoloRank(arrayList);
                    if(test==null){
                        //TODO 예외처리 필요
                    }
                    Log.d("test",test.getQueueType().toString());

                    String tier = Util.changeTierToKoreanAndSetImg(test.getTier(), img_Tier);
                    textView_nameTier.setText(getString(R.string.with_space_ss, tier, test.getRank()));
                    textView_nameScore.setText(getString(R.string.score_before_d, test.getLeaguePoints()));
                    textView_RecordGame.setText(getString(R.string.win_lose_score_dd, test.getWins(), test.getLosses()));
                    double winningP = (float) test.getWins() / (test.getWins() + test.getLosses()) * 100.0;
                    textView_winningPercentage.setText(getString(R.string.win_late_f, winningP));
                }
            }

            @Override
            public void onFailure(@NonNull Call<Set<CuserLeagueEntryDTO>> call, @NonNull Throwable t) {
            }
        });
    }

    private void match(CUserDTO user, String api_key) {
        Call<CMatchData> res2 = RetroBuild.getInstance().getService().getMatchId(user.getAccountId(), api_key);

        res2.enqueue(new Callback<CMatchData>() {
            @Override
            public void onResponse(@NonNull Call<CMatchData> call, @NonNull Response<CMatchData> response) {
                Log.d("Retrofit CMatch success", response.toString());
                CMatchData matchData = response.body();
                if (matchData == null) {
                    // TODO 만약 매칭 정보가 아예 없을 경우를 처리 해야함.
                    Log.d("UserPhaseActivity", "메칭 정보가 없습니다." + user.getName());
                } else {
                    for (int i = 0; i < MATCH_LENGTH; i++) {
                        CMatch match1 = matchData.getMatches().get(i);
                        int champCode = match1.getChampion();
                        String champName = Util.changeChampionIdToName(champCode);
                        String champImgSrc = Util.getChampImgSrc(champName, 0);
                        String champNameKR = Util.changeEnglishToKoreanName(champCode);
                        match1.setChampName(champNameKR);
                        match1.setImgSrc(champImgSrc);
                        match1.setName(user.getName());
                        matchList.add(i, match1);
                    }

                    final UserPhaseAdapter userPhaseAdapter = new UserPhaseAdapter(getApplicationContext(), matchList);

                    listView.setAdapter(userPhaseAdapter);
                    listView.setVisibility(View.VISIBLE);
                    img_loading.setVisibility(View.INVISIBLE);
                    img_loading.setEnabled(false);
                }

            }

            @Override
            public void onFailure(@NonNull Call<CMatchData> call, @NonNull Throwable t) {
            }
        });
    }
    CuserLeagueEntryDTO getSoloRank(ArrayList<CuserLeagueEntryDTO>list){
        int i;
        for(i=0; i<list.size();i++) {
            if (list.get(i).getQueueType().equals("RANKED_SOLO_5x5")) {
                break;

            }
        }
        return list.get(i);
    }




}


//주석1
//주석2
//주석3
