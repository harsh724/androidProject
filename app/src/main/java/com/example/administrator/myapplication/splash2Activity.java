package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash2Activity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent=new Intent(splash2Activity.this,Fingerprint.class);
                splash2Activity.this.startActivity(mainIntent);
                splash2Activity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
}
