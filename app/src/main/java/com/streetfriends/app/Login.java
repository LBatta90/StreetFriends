package com.streetfriends.app;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.graphics.Typeface;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Define Accedi Button onclick listener pippo
        final Button logButton = (Button) findViewById(R.id.ButtonLogin);
        final Button regButton = (Button) findViewById(R.id.ButtonRegister);
        final TextView username = (TextView) findViewById(R.id.editUsername);
        final TextView password = (TextView) findViewById(R.id.editPassword);



        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/NeoSans.TTF");
        TextView tv = (TextView) findViewById(R.id.TextBenvenuto2);
        tv.setTypeface(tf);
        username.setTypeface(tf);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Singin_click(view, username.toString(), password.toString());
            }
        });

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register_click(view);
            }
        });


    }

    private void Singin_click(View v, String Username, String Password)
    {
        /*Login button clicked, need to check ID & PSW before start MainActivity*/
        /*
        *
        * ADD HERE LOGIN INSTRUCTION
        *
        * */
        Intent i=new Intent(Login.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    private void Register_click(View v)
    {
        /*Register button clicked, start new activity
        * in which users can subscribe*/
        Intent i=new Intent(Login.this, Register.class);
        startActivity(i);
        finish();
    }



}
