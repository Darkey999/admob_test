package com.example.gosu.admobtest;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

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
    public void onAdFailedToLoad(int errorCode) {
        super.onAdFailedToLoad(errorCode);
        Toast.makeText(context, R.string.on_ad_failed_to_load, Toast.LENGTH_SHORT).show();
        Log.e("Ad_failed_to_load", errorMessage(errorCode));
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

    // Return error String
    private String errorMessage(int errorCode) {
        String errorString = null;

        switch (errorCode) {
            case AdRequest.ERROR_CODE_INTERNAL_ERROR:
                errorString = context.getString(R.string.internal_error);
                break;
            case AdRequest.ERROR_CODE_INVALID_REQUEST:
                errorString = context.getString(R.string.invalid_request);
                break;
            case AdRequest.ERROR_CODE_NETWORK_ERROR:
                errorString = context.getString(R.string.network_error);
                break;
            case AdRequest.ERROR_CODE_NO_FILL:
                errorString = context.getString(R.string.no_fill);
                break;
        }

        return errorString;
    }
}
