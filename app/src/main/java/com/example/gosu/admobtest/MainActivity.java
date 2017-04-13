package com.example.gosu.admobtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Banner ad Button clicked
    public void openBannerActivity(View view) {
        Intent intent = new Intent(this, BannerActivity.class);
        startActivity(intent);
    }

    // Interstitial ad Button clicked
    public void openInterstitial(View view) {
        Intent intent = new Intent(this, InterstitialActivity.class);
        startActivity(intent);
    }
}
