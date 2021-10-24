package com.example.mc_02_ass;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onClckRedBtn(View view) {
        view.setBackgroundColor(Color.RED);
    }
    public void onClckGreenBtn(View view) {
        view.setBackgroundColor(Color.GREEN);
    }
    public void onClckBlackBtn(View view) {
        view.setBackgroundColor(Color.BLACK);
    }

}