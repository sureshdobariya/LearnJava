package com.riontech.learnjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import Utils.Constants;

/**
 * Created by HalfBloodPrince(RIONTECH)
 * Riontech on 23/8/17.
 */

public class SplashActivity extends Activity {
    private Handler mhandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        final Animation animscale= AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.
                FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       ImageView img=(ImageView)findViewById(R.id.imgSplash);
        img.startAnimation(animscale);
        mhandler = new Handler();
        mhandler.postDelayed(runnable, Constants.SPLASH_SCREEN_TIME_OUT);

    }

    final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
}
