package com.streetfriends.app;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.Window;
import android.widget.TextView;


public class Splash extends Activity {

    // Splash screen timer
    private static final int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_splash);

        Typeface Neo = Typeface.createFromAsset(getAssets(),
                "fonts/NeoSans.TTF");
        TextView tv0 = (TextView) findViewById(R.id.title_splash);
        tv0.setTypeface(Neo);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer to show app logo
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
