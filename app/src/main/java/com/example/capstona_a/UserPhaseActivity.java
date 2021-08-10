package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase);
        Intent intent = getIntent();
        CUserDTO User =(CUserDTO)intent.getSerializableExtra("user");
        TextView textView_nameSummoner = (TextView)findViewById(R.id.textview_nameSummoner);
        TextView textView_nameTier=(TextView)findViewById(R.id.textview_tier1);
        TextView textView_nameScore=(TextView)findViewById(R.id.textview_tier2);
        TextView textView_Recordgame=(TextView)findViewById(R.id.textview_Recordgame);
        Button btn = (Button)findViewById(R.id.btn_ingameInfo);
        ImageView img_summoner = (ImageView)findViewById(R.id.img_summoner);
        ImageView img_Tier=(ImageView)findViewById(R.id.img_Tier);
        String api_key="RGAPI-d98dcf8f-04bb-4516-a455-0f302548115e";
        CMatchData_a matchdatalist=(CMatchData_a)getApplication();
        textView_nameSummoner.setText(User.getName());
        String profileimgSrc = "https://ddragon.leagueoflegends.com/cdn/11.15.1/img/profileicon/"+String.valueOf(User.getProfileIconId())+".png";
        Glide.with(this).load(profileimgSrc).into(img_summoner);
        ListView listView = (ListView)findViewById(R.id.listview_user_phase);
        Call<Set<CuserLeagueEntryDTO>>res1=RetroBuild.getInstance().getService().getleaguev4(User.getId(),api_key);
        ArrayList<CMatch> CMatchArrayList = new ArrayList<CMatch>();
        res1.enqueue(new Callback<Set<CuserLeagueEntryDTO>>() {
            @Override
            public void onResponse(Call<Set<CuserLeagueEntryDTO>> call, Response<Set<CuserLeagueEntryDTO>> response) {
                Log.d("Retro CUsDetail success",response.toString());
                Set<CuserLeagueEntryDTO> LeagueEntryDTO = response.body();
                CUserSetleagueEntryDTO dto = new CUserSetleagueEntryDTO();
                dto.setLeagueEntryDTO(LeagueEntryDTO);
                ArrayList<CuserLeagueEntryDTO> arrayList=new ArrayList<>(dto.getLeagueEntryDTO().size());
                int k=0;
                for(CuserLeagueEntryDTO i: LeagueEntryDTO)
                {
                    arrayList.add(k++,i);
                }
                String tier=ChangeTiertoKoreanandimg(arrayList.get(1).getTier(),img_Tier);
                textView_nameTier.setText(tier+" "+arrayList.get(1).getRank());
                textView_nameScore.setText("점수: "+arrayList.get(1).getLeaguePoints());
                textView_Recordgame.setText("승: "+arrayList.get(1).getWins()+"  패: "+arrayList.get(1).getLosses());






            }

            @Override
            public void onFailure(Call<Set<CuserLeagueEntryDTO>> call, Throwable t) {
            }
        });

        Call <CMatchData> res2 = RetroBuild.getInstance().getService().getMatchId(User.getAccountId(), api_key);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                res2.enqueue(new Callback<CMatchData>() {
                    @Override
                    public void onResponse(Call<CMatchData> call, Response<CMatchData> response) {
                        Log.d("Retrofit CMatch success", response.toString());
                        CMatchData matchData = response.body();
                        //Toast.makeText(getApplicationContext(), CMatchData.getMatches().get(1).getLane(), Toast.LENGTH_SHORT).show();


                        for(int i=0; i<11; i++){
                            CMatch match1 = new CMatch();
                            match1 = matchData.getMatches().get(i);
                            int Champcode= match1.getChampion();
                            String Champname=changeChampionIdToName(Champcode);
                            String champimgsrc="https://ddragon.leagueoflegends.com/cdn/img/champion/splash/"+Champname+"_0.jpg";
                            String ChampnameKR=changeEnglishToKoreanName(Champcode);
                            match1.setImgSrc(champimgsrc);
                            match1.setChampName(ChampnameKR);
                            match1.setAccountId(User.getAccountId());
                            CMatchArrayList.add(i, match1);

                        }

                        final UserPhaseAdapter userPhaseAdapter = new UserPhaseAdapter(getApplicationContext(), CMatchArrayList);
                        listView.setAdapter(userPhaseAdapter);


                        // ArrayList<CUserPrintData>UserDataList=PrintAnyway(CMatchArrayList,User);











                    }

                    @Override
                    public void onFailure(Call<CMatchData> call, Throwable t) {

                    }
                });

            }
        });


        //Toast.makeText(getApplicationContext(),matchdatalist.getCMatchlist().get(0).getChampName(), Toast.LENGTH_SHORT).show();
        /*
        ArrayList<CMatch> matchprintlist=matchdatalist.getCMatchlist();
        final UserPhaseAdapter userPhaseAdapter = new UserPhaseAdapter(getApplicationContext(), matchprintlist);
        listView.setAdapter(userPhaseAdapter);
        */









        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(UserPhaseActivity.this,IngameActivity.class);
                intent1.putExtra("user",User);
                startActivity(intent1);
            }
        });



    }


    String changeChampionIdToName(int champcode) // 매개변수: 챔피언 id
    {
        String id= null;
        switch (champcode) {
            case 266:
                id = "Aatrox";break; // 챔피언 영어 이름
            case 412:
                id ="Thresh";break;
            case 23:
                id = "Tryndamere";break;
            case 79:
                id = "Gragas";break;
            case 69:
                id = "Cassiopeia";break;
            case  136:
                id = "AurelionSol";break;
            case   13:
                id = "Ryze";break;
            case   78:
                id = "Poppy";break;
            case  14:
                id = "Sion";break;
            case  1:
                id = "Annie";break;
            case  202:
                id = "Jhin";break;
            case 43:
                id = "Karma";break;
            case  111:
                id = "Nautilus";break;
            case 240:
                id = "Kled";break;
            case   99:
                id = "Lux";break;
            case  103:
                id =  "Ahri";break;
            case   2:
                id =  "Olaf";break;
            case   112:
                id =  "Viktor";break;
            case  34:
                id=  "Anivia";break;
            case   27:
                id = "Singed";break;
            case   86:
                id = "Garen";break;
            case   127:
                id = "Lissandra";break;
            case  57:
                id =    "Maokai";break;
            case  25:
                id =  "Morgana";break;
            case    28:
                id =  "Evelynn";break;
            case   105:
                id =  "Fizz";break;
            case   74:
                id =  "Heimerdinger";break;
            case   238:
                id =  "Zed";break;
            case   68:
                id =  "Rumble";break;
            case  82:
                id =  "Mordekaiser";break;
            case  37:
                id =  "Sona";break;
            case  96:
                id =  "KogMaw";break;
            case  55:
                id =  "Katarina";break;
            case  117:
                id =  "Lulu";break;
            case  22:
                id =  "Ashe";break;
            case  30:
                id =  "Karthus";break;
            case  12:
                id =  "Alistar";break;
            case  122:
                id =  "Darius";break;
            case   67:
                id = "Vayne";break;
            case  110:
                id = "Varus";break;
            case  77:
                id =  "Udyr";break;
            case  89:
                id =  "Leona";break;
            case   126:
                id = "Jayce";break;
            case   134:
                id = "Syndra";break;
            case   80:
                id =  "Pantheon";break;
            case  92:
                id = "Riven";break;
            case  121:
                id = "Khazix";break;
            case  42:
                id =  "Corki";break;
            case  268:
                id =   "Azir";break;
            case 51:
                id =   "Caitlyn";break;
            case   76:
                id =  "Nidalee";break;
            case 85:
                id =  "Kennen";break;
            case 3:
                id =  "Galio";break;
            case 45:
                id =  "Veigar";break;
            case 432:
                id =  "Bard";break;
            case 150:
                id = "Gnar";break;
            case 90:
                id =   "Malzahar";break;
            case   104:
                id =  "Graves";break;
            case  254:
                id =  "Vi";break;
            case  10:
                id =  "Kayle";break;
            case  39:
                id =  "Irelia";break;
            case  64:
                id = "LeeSin";break;
            case  420:
                id =   "Illaoi";break;
            case 60:
                id =  "Elise";break;
            case  106:
                id =  "Volibear";break;
            case 20:
                id = "Nunu";break;
            case 4:
                id =  "TwistedFate";break;
            case 24:
                id =  "Jax";break;
            case  102:
                id =  "Shyvana";break;
            case 429:
                id =  "Kalista";break;
            case 36:
                id =  "DrMundo";break;
            case 427:
                id = "Ivern";break;
            case  131:
                id = "Diana";break;
            case 63:
                id = "Brand";break;
            case 113:
                id = "Sejuani";break;
            case 8:
                id =  "Vladimir";break;
            case  154:
                id =  "Zac";break;
            case  421:
                id = "RekSai";break;
            case  133:
                id = "Quinn";break;
            case  84:
                id =  "Akali";break;
            case  163:
                id =  "Taliyah";break;
            case  18:
                id =  "Tristana";break;
            case  120:
                id =  "Hecarim";break;
            case  15:
                id = "Sivir";break;
            case  236:
                id =  "Lucian";break;
            case   107:
                id = "Rengar";break;
            case  19:
                id = "Warwick";break;
            case  72:
                id =  "Skarner";break;
            case  54:
                id = "Malphite";break;
            case  157:
                id =  "Yasuo";break;
            case  101:
                id = "Xerath";break;
            case   17:
                id = "Teemo";break;
            case  75:
                id =  "Nasus";break;
            case  58:
                id =  "Renekton";break;
            case   119:
                id =  "Draven";break;
            case  35:
                id =  "Shaco";break;
            case  50:
                id =  "Swain";break;
            case   91:
                id =  "Talon";break;
            case  40:
                id = "Janna";break;
            case   115:
                id =  "Ziggs";break;
            case   245:
                id =  "Ekko";break;
            case   61:
                id =  "Orianna";break;
            case  114:
                id = "Fiora";break;
            case  9:
                id =  "Fiddlesticks";break;
            case  31:
                id =  "ChoGath";break;
            case  33:
                id =  "Rammus";break;
            case  7:
                id =  "Leblanc";break;
            case  16:
                id =  "Soraka";break;
            case  26:
                id =  "Zilean";break;
            case  56:
                id = "Nocturne";break;
            case  222:
                id =  "Jinx";break;
            case  83:
                id = "Yorick";break;
            case  6:
                id = "Urgot";break;
            case  203:
                id =  "Kindred";break;
            case  21:
                id =  "MissFortune";break;
            case  62:
                id =  "MonkeyKing";break;
            case  53:
                id = "Blitzcrank";break;
            case   98:
                id =  "Shen";break;
            case  201:
                id =   "Braum";break;
            case  5:
                id = "XinZhao";break;
            case  29:
                id = "Twitch";break;
            case  11:
                id = "MasterYi";break;
            case  44:
                id = "Taric";break;
            case  32:
                id = "Amumu";break;
            case 41:
                id =  "Gangplank";break;
            case  48:
                id =  "Trundle";break;
            case   38:
                id = "Kassadin";break;
            case   161:
                id = "Velkoz";break;
            case   143:
                id =  "Zyra";break;
            case  267:
                id =  "Nami";break;
            case  59:
                id =  "JarvanIV";break;
            case  81:
                id =   "Ezreal";break;
            case    350:
                id =   "Yuumi";break;
            case  145:
                id =  "Kaisa";break;
            case   518:
                id = "Neeko";break;
            case   142:
                id =  "Zoe";break;
            case   498:
                id =  "Xayah";break;
            case  517:
                id =  "Sylas";break;
            case  141:
                id =   "Kayn";break;
            case   516:
                id =  "Ornn";break;
            case   555:
                id =   "Pyke";break;
            case  164:
                id =   "Camille";break;
            case   246:
                id = "Qiyana";break;
            case   497:
                id = "Rakan";break;
            case 777:
                id =  "Yone";break;
            case 876:
                id = "Lillia";break;
            case 235:
                id = "Senna";break;
            case 875:
                id = "Sett";break;
            case 523:
                id= "Aphelios";break;

            case 223:
                id = "TahmKench";break;

            case 360:
                id = "Samira";break;


        }


        return id;
    }



    String changeEnglishToKoreanName(int ChampCode){ // 매개변수: 챔피언 id
        String $a = null;
        switch (ChampCode) {
            case 266:
                $a = "아트록스";break; // 챔피언 한글 이름
            case 412:
                $a ="쓰레쉬";break;
            case 23:
                $a = "트린다미어";break;
            case 79:
                $a = "그라가스";break;
            case 69:
                $a = "카시오페아";break;
            case  136:
                $a = "아우렐리온 솔";break;
            case   13:
                $a = "라이즈";break;
            case   78:
                $a = "뽀삐";break;
            case  14:
                $a = "사이온";break;
            case  1:
                $a = "애니";break;
            case  202:
                $a = "진";break;
            case 43:
                $a = "카르마";break;
            case  111:
                $a = "노틸러스";break;
            case 240:
                $a = "클레드";break;
            case   99:
                $a = "럭스";break;
            case  103:
                $a =  "아리";break;
            case   2:
                $a =  "올라프";break;
            case   112:
                $a =  "빅토르";break;
            case  34:
                $a =  "애니비아";break;
            case   27:
                $a = "신지드";break;
            case   86:
                $a =        "가렌";break;
            case   127:
                $a =         "리산드라";break;
            case    57:
                $a =    "마오카이";break;
            case     25:
                $a =  "모르가나";break;
            case    28:
                $a =  "이블린";break;
            case   105:
                $a =  "피즈";break;
            case   74:
                $a =  "하이머딩거";break;
            case   238:
                $a =  "제드";break;
            case   68:
                $a =  "럼블";break;
            case  82:
                $a =  "모데카이저";break;
            case  37:
                $a =  "소나";break;
            case  96:
                $a =  "코그모";break;
            case  55:
                $a =  "카타리나";break;
            case  117:
                $a =  "룰루";break;
            case  22:
                $a =  "애쉬";break;
            case  30:
                $a =  "카서스";break;
            case  12:
                $a =  "알리스타";break;
            case  122:
                $a =  "다리우스";break;
            case   67:
                $a = "베인";break;
            case  110:
                $a = "바루스";break;
            case  77:
                $a =  "우디르";break;
            case  89:
                $a =  "레오나";break;
            case   126:
                $a = "제이스";break;
            case   134:
                $a = "신드라";break;
            case   80:
                $a =  "판테온";break;
            case  92:
                $a = "리븐";break;
            case  121:
                $a = "카직스";break;
            case  42:
                $a =  "코르키";break;
            case  268:
                $a =   "아지르";break;
            case 51:
                $a =   "케이틀린";break;
            case   76:
                $a =  "니달리";break;
            case 85:
                $a =  "케인";break;
            case 3:
                $a =  "갈리오";break;
            case 45:
                $a =  "베이가";break;
            case 432:
                $a =  "바드";break;
            case 150:
                $a = "나르";break;
            case 90:
                $a =   "말자하";break;
            case   104:
                $a =  "그레이브즈";break;
            case  254:
                $a =  "바이";break;
            case  10:
                $a =  "케일";break;
            case  39:
                $a =  "이렐리아";break;
            case  64:
                $a = "리 신";break;
            case  420:
                $a =   "일라오이";break;
            case 60:
                $a =  "엘리스";break;
            case  106:
                $a =  "볼리베어";break;
            case 20:
                $a = "누누";break;
            case 4:
                $a =  "트위스티드 페이트";break;
            case 24:
                $a =  "잭스";break;
            case  102:
                $a =  "쉬바나";break;
            case 429:
                $a =  "칼리스타";break;
            case 36:
                $a =  "문도 박사";break;
            case 427:
                $a = "아이번";break;
            case  131:
                $a = "다이애나";break;
            case 63:
                $a = "브랜드";break;
            case 113:
                $a = "세주아니";break;
            case 8:
                $a =  "블라디미르";break;
            case  154:
                $a =  "자크";break;
            case  421:
                $a = "렉사이";break;
            case  133:
                $a = "퀸";break;
            case  84:
                $a =  "아칼리";break;
            case  163:
                $a =  "탈리아";break;
            case  18:
                $a =  "트리스타나";break;
            case  120:
                $a =  "헤카림";break;
            case  15:
                $a = "시비르";break;
            case  236:
                $a =  "루시안";break;
            case   107:
                $a = "렝가";break;
            case  19:
                $a = "워윅";break;
            case  72:
                $a =  "스카너";break;
            case  54:
                $a = "말파이트";break;
            case  157:
                $a =  "야스오";break;
            case  101:
                $a = "제라스";break;
            case   17:
                $a = "티모";break;
            case  75:
                $a =  "나서스";break;
            case  58:
                $a =  "레넥톤";break;
            case   119:
                $a =  "드레이븐";break;
            case  35:
                $a =  "샤코";break;
            case  50:
                $a =  "스웨인";break;
            case   91:
                $a =  "탈론";break;
            case  40:
                $a = "잔나";break;
            case   115:
                $a =  "직스";break;
            case   245:
                $a =  "에코";break;
            case   61:
                $a =  "오리아나";break;
            case  114:
                $a = "피오라";break;
            case  9:
                $a =  "피들스틱";break;
            case  31:
                $a =  "초가스";break;
            case  33:
                $a =  "람머스";break;
            case  7:
                $a =  "르블랑";break;
            case  16:
                $a =  "소라카";break;
            case  26:
                $a =  "질리언";break;
            case  56:
                $a = "녹턴";break;
            case  222:
                $a =  "징크스";break;
            case  83:
                $a = "요릭";break;
            case  6:
                $a = "우르곳";break;
            case  203:
                $a =  "킨드레드";break;
            case  21:
                $a =  "미스 포츈";break;
            case  62:
                $a =  "오공";break;
            case  53:
                $a = "블리츠크랭크";break;
            case   98:
                $a =  "쉔";break;
            case  201:
                $a =   "브라움";break;
            case  5:
                $a = "신 짜오";break;
            case  29:
                $a = "트위치";break;
            case  11:
                $a = "마스터 이";break;
            case  44:
                $a = "타릭";break;
            case  32:
                $a = "아무무";break;
            case 41:
                $a =  "갱플랭";break;
            case  48:
                $a =  "트런들";break;
            case   38:
                $a = "카사딘";break;
            case   161:
                $a = "벨코즈";break;
            case   143:
                $a =  "자이라";break;
            case  267:
                $a =  "나미";break;
            case  59:
                $a =  "자르반 4세";break;
            case  81:
                $a =   "이즈리얼";break;
            case    350:
                $a =   "유미";break;
            case  145:
                $a =  "카이사";break;
            case   518:
                $a = "니코";break;
            case   142:
                $a =  "조이";break;
            case   498:
                $a =  "자야";break;
            case  517:
                $a =  "사일러스";break;
            case  141:
                $a =   "케인"; break;
            case   516:
                $a =  "오른";break;
            case   555:
                $a =   "파이크";break;
            case  164:
                $a =   "카멜";break;
            case   246:
                $a = "키아나";break;
            case   497:
                $a = "라칸";break;
            case 777:
                $a =  "요네";break;
            case 876:
                $a = "릴리아";break;
            case 235:
                $a = "세나";break;
            case 875:
                $a = "세트";break;
            case 523:
                $a = "아펠리오스";break;

            case 223:
                $a = "탐 켄치";break;

            case 360:
                $a = "사미라";break;


        }


        return $a;
    }
    String ChangeTiertoKoreanandimg(String tier,ImageView view)
    {

        switch(tier)
        {
            case "IRON":
                tier="아이언";
                view.setImageResource(R.drawable.emblem_iron);
                break;
            case "BRONZE":
                tier="브론즈";
                view.setImageResource(R.drawable.emblem_bronze);
                break;
            case "SILVER":
                tier="실버";
                view.setImageResource(R.drawable.emblem_silver);
                break;
            case "GOLD":
                tier="골드";
                view.setImageResource(R.drawable.emblem_gold);
                break;
            case "PLATINUM":
                tier="플래티넘";
                view.setImageResource(R.drawable.emblem_platinum);
                break;
            case "DIAMOND":
                tier="다이아몬드";
                view.setImageResource(R.drawable.emblem_diamond);
                break;
            case "마스터":
                tier="iron.png";
                view.setImageResource(R.drawable.emblem_master);
                break;
            case "그랜드마스터":
                tier="grandmaster.png";
                view.setImageResource(R.drawable.emblem_grandmaster);
                break;
            case "CHALLENGER":
                tier="챌린저";
                view.setImageResource(R.drawable.emblem_challenger);
                break;
        }
        return tier;
    }


}