package com.example.gosu.admobtest;


import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;

// Class for AdView listeners
public class ToastListener extends AdListener {
    private Context context;

    public ToastListener(Context context) {
        super();
        this.context = context;
    }

    // User clicked ad
    @Override
    public void onAdOpened() {
        super.onAdOpened();
        Toast.makeText(context, R.string.on_ad_opened, Toast.LENGTH_SHORT).show();
    }

    // User came back from ad
    @Override
    public void onAdClosed() {
        super.onAdClosed();
        Toast.makeText(context, R.string.on_ad_closed, Toast.LENGTH_SHORT).show();
    }

    // Problem with loading ad
    @Override
    public void onAdFailedToLoad(int i) {
        super.onAdFailedToLoad(i);
        Toast.makeText(context, R.string.on_ad_failed_to_load, Toast.LENGTH_SHORT).show();
    }

    // Ad leaves the application
    @Override
    public void onAdLeftApplication() {
        super.onAdLeftApplication();
        Toast.makeText(context, R.string.on_ad_left_application, Toast.LENGTH_SHORT).show();
    }

    // Ad received
    @Override
    public void onAdLoaded() {
        super.onAdLoaded();
        Toast.makeText(context, R.string.on_ad_loaded, Toast.LENGTH_SHORT).show();
    }
}
