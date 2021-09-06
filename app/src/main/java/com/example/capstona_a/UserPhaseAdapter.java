package com.example.capstona_a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.CMatch;
import com.example.capstona_a.data.CMatchDetailDTO;
import com.example.capstona_a.retrofit.RetroMatchBuild;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseAdapter extends BaseAdapter {

    private final Context myContext;
    private final LayoutInflater myInflater;
    private final ArrayList<CMatch> cMatch;
    private final String api_key = Util.API_KEY();

    CMatchDetailDTO[] dtos;

    public UserPhaseAdapter(Context context, ArrayList<CMatch> data) {
        myContext = context;
        cMatch = data;
        myInflater = LayoutInflater.from(myContext);
        dtos = new CMatchDetailDTO[cMatch.size()];
    }

    @Override
    public int getCount() {
        return cMatch.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public CMatch getItem(int position) {
        return cMatch.get(position);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        Log.d("UserPhaseAdapter2", position + " getView()");
        View convertView = v;
        UserPhaseViewHolder currentVH;
        if (convertView == null) {
            Log.d("UserPhaseAdapter2", position + " v=null");
            convertView = myInflater.inflate(R.layout.listview_user_phase_single, parent, false);

            currentVH = new UserPhaseViewHolder();
            viewBinding(convertView, currentVH);
            convertView.setTag(currentVH);
        } else {
            Log.d("UserPhaseAdapter2", position + " v 는 가져옴");
            currentVH = (UserPhaseViewHolder) convertView.getTag();
        }

        // Retrofit 요청
        convertView.setVisibility(View.INVISIBLE);
        matchDetail(currentVH, position, convertView);
        return convertView;
    }

    /*
    getView 를 위한 함수들
     */
    private void viewBinding(View v, UserPhaseViewHolder currentVH) {
        currentVH.champImg = v.findViewById(R.id.img_record_champ);
        currentVH.kda = v.findViewById(R.id.tv_record_kda);
        currentVH.average = v.findViewById(R.id.tv_record_average);
        currentVH.btn = v.findViewById(R.id.btn_user_phase_single_detail);
        currentVH.item0 = v.findViewById(R.id.Item0);
        currentVH.item1 = v.findViewById(R.id.Item1);
        currentVH.item2 = v.findViewById(R.id.Item2);
        currentVH.item3 = v.findViewById(R.id.Item3);
        currentVH.item4 = v.findViewById(R.id.Item4);
        currentVH.item5 = v.findViewById(R.id.Item5);
        currentVH.gameDuration = v.findViewById(R.id.tv_game_duration);
    }

    private void image(String path, ImageView imageView) {
        try {
            URL url = new URL(path);
            URLConnection con = url.openConnection();
            con.connect();
            InputStream stream = con.getInputStream();
            Bitmap bitmap = BitmapFactory.decodeStream(stream);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("UserPhaseAdapter", "아이템 이미지 요청중 오류 발생" + e.getMessage());
        }
    }

    private void matchDetail(UserPhaseViewHolder currentVH, int position, View v) {
        if (dtos[position] != null) {
            // View 세팅
            set(dtos[position], currentVH, position);

            // View 핸들러 달기
            currentVH.btn.setOnClickListener(view -> {
                Intent intent = new Intent(view.getContext(), UserphaseDetailActivity.class);
                intent.putExtra("GameData", dtos[position]);
                view.getContext().startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            });
            v.setVisibility(View.VISIBLE);
        } else {
            Call<CMatchDetailDTO> matchDetailDTOCall = RetroMatchBuild.getInstance2().getService().getMatchDetail(cMatch.get(position).getGameId().toString(), api_key);
            matchDetailDTOCall.enqueue(new Callback<CMatchDetailDTO>() {
                @Override
                public void onResponse(@NonNull Call<CMatchDetailDTO> call, @NonNull Response<CMatchDetailDTO> response) {
                    Log.d("UserPhaseAdapter", response.toString());
                    CMatchDetailDTO dto = response.body();

                    if (dto == null) {
                        // TODO 매칭 디테일 정보가 없을 경우 해당 없다고 표시해줘야함.
                        Log.d("UserPhaseAdapter", "매칭 디테일 정보가 오류 인해 없습니다.");
                        Toast.makeText(myContext, "매칭 디테일 정보가 오류 인해 없습니다.", Toast.LENGTH_SHORT).show();
                    } else {
                        dtos[position] = dto;
                        // View 세팅
                        set(dto, currentVH, position);

                        // View 핸들러 달기
                        currentVH.btn.setOnClickListener(view -> {
                            Intent intent = new Intent(view.getContext(), UserphaseDetailActivity.class);
                            intent.putExtra("GameData", dto);
                            view.getContext().startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        });
                        v.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onFailure(@NonNull Call<CMatchDetailDTO> call, @NonNull Throwable t) {
                    // TODO 매칭 디테일 정보가 없을 경우 해당 없다고 표시해줘야함.
                    Log.d("UserPhaseAdapter", "매칭 디테일 정보가 오류 인해 없습니다." + t.getMessage());
                    Toast.makeText(myContext, "매칭 디테일 정보가 오류 인해 없습니다.", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void set(CMatchDetailDTO dto, UserPhaseViewHolder vh, int position) {

        dto.activatePlayerNum(cMatch.get(position).getName());

        int playerNum = dto.getPlayernum();

        Long kill = dto.getParticipants().get(playerNum).getStats().getKills();
        Long death = dto.getParticipants().get(playerNum).getStats().getDeaths();
        Long assist = dto.getParticipants().get(playerNum).getStats().getAssists();

        String k_d_a = kill + "/" + death + "/" + assist;
        String aver = myContext.getString(R.string.f_2, ((float) (kill + assist)) / death);

        vh.kda.setText(k_d_a);
        vh.average.setText("("+aver+")");
        vh.gameDuration.setText(myContext.getString(R.string.minute_second_dd, dto.getGameDuration() / 60, dto.getGameDuration() % 60));


        Long item_0 = dto.getParticipants().get(dto.getPlayernum()).getStats().getItem0();
        Long item_1 = dto.getParticipants().get(dto.getPlayernum()).getStats().getItem1();
        Long item_2 = dto.getParticipants().get(dto.getPlayernum()).getStats().getItem2();
        Long item_3 = dto.getParticipants().get(dto.getPlayernum()).getStats().getItem3();
        Long item_4 = dto.getParticipants().get(dto.getPlayernum()).getStats().getItem4();
        Long item_5 = dto.getParticipants().get(dto.getPlayernum()).getStats().getItem5();

        Glide.with(myContext).load(Util.getItemImgSrc(item_0)).into(vh.item0);
        Glide.with(myContext).load(Util.getItemImgSrc(item_1)).into(vh.item1);
        Glide.with(myContext).load(Util.getItemImgSrc(item_2)).into(vh.item2);
        Glide.with(myContext).load(Util.getItemImgSrc(item_3)).into(vh.item3);
        Glide.with(myContext).load(Util.getItemImgSrc(item_4)).into(vh.item4);
        Glide.with(myContext).load(Util.getItemImgSrc(item_5)).into(vh.item5);

        Glide.with(myContext).load(cMatch.get(position).getImgSrc()).circleCrop().into(vh.champImg);

    }
}

/*
    findViewById() 의 호출을 줄이기 위한 View 바인 들의 모음
 */
class UserPhaseViewHolder {
    ImageView champImg;

    TextView gameDuration;

    ImageView item0;
    ImageView item1;
    ImageView item2;
    ImageView item3;
    ImageView item4;
    ImageView item5;

    TextView kda;
    TextView average;
    Button btn;
    // TextView champName;
}

