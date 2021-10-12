package com.example.capstona_a;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class IngameRateActivity extends AppCompatActivity {
    TextView textView_blue_win_rate;
    TextView textView_red_win_rate;
    Button btn_close;
    private static String Winrate_red;
    private static String Winrate_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE); //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ingame_rate);

        viewBinding();
        Intent intent = getIntent();
        String rate=intent.getStringExtra("data");
        getStringrate(rate);
        setStringrate(Winrate_red,Winrate_blue);


        btn_close.setOnClickListener(view -> {
            finish();
        });



    }

    void viewBinding(){
        textView_blue_win_rate=findViewById(R.id.textView_winrate_blue);
        textView_red_win_rate=findViewById(R.id.textView_winrate_red);
        btn_close=findViewById(R.id.button_rate_close);
    }

    void getStringrate(String rate){
        String intrate=rate.replaceAll("[a-zA-Z]", "");
        intrate=intrate.replaceAll("\\(","");
        intrate=intrate.replaceAll("\\)","");
        intrate=intrate.replaceAll("\\=","");
        double Winrate=Double.valueOf(intrate);
        Winrate=Math.floor((Winrate*100));
        Winrate_blue=String.valueOf(Winrate);
        Winrate_red=String.valueOf(100.0-Winrate);
    }

    void setStringrate(String Winrate_red, String Winrate_blue){
        textView_blue_win_rate.setText("Blue팀의 예상 승률은 "+Winrate_blue+"% 입니다.");
        textView_blue_win_rate.setTextColor(0xAA1e6de0);
        textView_red_win_rate.setText("Red팀의 예상 승률은 "+Winrate_red+"% 입니다.");
        textView_red_win_rate.setTextColor(0xAAeF484a);
    }

}