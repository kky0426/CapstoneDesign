package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class IngameRateActivity extends AppCompatActivity {
    TextView textView;
    Button btn_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ingame_rate);
        viewBinding();
        Intent intent = getIntent();
        String rate=intent.getStringExtra("data");
        String Strrate=getStringrate(rate);

        textView.setText(getPrintString(Strrate));

        btn_close.setOnClickListener(view -> {
            finish();
        });



    }
    void viewBinding(){
        textView=findViewById(R.id.textView_winrate);
        btn_close=findViewById(R.id.button_rate_close);
    }
    String getStringrate(String rate){
        String intrate=rate.replaceAll("[a-zA-Z]", "");
        intrate=intrate.replaceAll("\\(","");
        intrate=intrate.replaceAll("\\)","");
        intrate=intrate.replaceAll("\\=","");
        double Winrate=Double.valueOf(intrate);
        Winrate=Math.floor((Winrate*100));
        String Strrate=String.valueOf(Winrate);
        return Strrate;
    }
    String getPrintString(String winrate){
        return "Blue팀의 승리확률은"+winrate+"% 입니다.";
    }
}