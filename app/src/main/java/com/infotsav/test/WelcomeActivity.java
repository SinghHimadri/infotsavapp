package com.infotsav.test;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.infotsav.test.MainMenuUtils.MainActivity;

public class WelcomeActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    LinearLayout line1,line3;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the MainActivity. */
                Intent mainIntent = new Intent(WelcomeActivity.this,MainActivity.class);
                WelcomeActivity.this.startActivity(mainIntent);
                WelcomeActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
        line1 = (LinearLayout) findViewById(R.id.line1);
        line3 = (LinearLayout) findViewById(R.id.line3);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        line1.setAnimation(uptodown);
        line3.setAnimation(downtoup);
    }
}
