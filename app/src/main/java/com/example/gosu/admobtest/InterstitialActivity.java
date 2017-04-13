package com.example.gosu.admobtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialActivity extends AppCompatActivity {
    private Button displayInterstitial;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        displayInterstitial = (Button) findViewById(R.id.displayInterstitial);
    }

    // Load Interstitial button clicked
    public void loadInterstitial(View view) {
        displayInterstitial.setText(R.string.loading_interstitial);

        // Set Interstitial
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));

        // Set listeners
        interstitial.setAdListener(new ToastListener(this) {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                displayInterstitial.setText(R.string.show_interstitial);
                displayInterstitial.setEnabled(true);
            }

        });

        // Set request
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest);
    }

    // Display Interstitial button clicked
    public void displayInterstitial(View view) {
        if (interstitial.isLoaded())
            interstitial.show();

        displayInterstitial.setEnabled(false);
        displayInterstitial.setText(R.string.interstitial_not_ready);
    }
}
