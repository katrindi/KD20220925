package com.example.kd20220925;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onBtnChangeTextColor(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tv_main_label);
        tv.setTextColor(Color.parseColor("#00FFEF"));
    }

}