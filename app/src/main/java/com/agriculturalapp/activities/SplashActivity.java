package com.agriculturalapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.agriculturalapp.R;


public class SplashActivity extends AppCompatActivity {

    private int SPLASH_LENGTH=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                //Intent i = new Intent(SplashActivity.this, CropYieldPrediction.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_LENGTH);
    }
}
