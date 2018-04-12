package com.jnakshansh.the_lost_treasure;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;


public class splashscreen extends AppCompatActivity {


    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);


        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {

                int a = (int) PrefsHelper.getPrefsHelper(splashscreen.this).getPref(PrefsHelper.PREF_JOURNEY, 0);
                int b = (int) PrefsHelper.getPrefsHelper(splashscreen.this).getPref(PrefsHelper.PREF_AUTH, 0);
                if (a != 0) {
                    if (b == 0) {
                        Intent i = new Intent(splashscreen.this, startjourney.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    } else {
                        int check = (int) PrefsHelper.getPrefsHelper(splashscreen.this).getPref(PrefsHelper.PREF_CHECK, -1);
                        Log.e("checkinss ", check + "");
                        if (check != 7) {
                            Intent i = new Intent(splashscreen.this, journey.class);
                            startActivity(i);
                            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        } else {
                            Intent i = new Intent(splashscreen.this, finalpoint.class);
                            startActivity(i);
                            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        }
                    }
                } else {
                    Intent i = new Intent(splashscreen.this, startplay.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
