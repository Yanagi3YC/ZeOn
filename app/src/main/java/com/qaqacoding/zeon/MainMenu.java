package com.qaqacoding.zeon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 가로모드
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // 전체화면
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mainmenu);
    }

    public void toGame(View view) {
        // GameScreen 액티비티로 인텐트(전환)
        startActivity(new Intent(this, GameScreen.class));
        // 액티비티 전환 효과를 없애줌
        overridePendingTransition(0,0);
    }
}