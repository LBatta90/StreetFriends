package com.streetfriends.app;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Define Accedi Button onclick listener
        final Button LogButton = (Button) findViewById(R.id.ButtonLogin);
        final Button RegButton = (Button) findViewById(R.id.ButtonRegister);
        final TextView Username = (TextView) findViewById(R.id.editUsername);
        final TextView Password = (TextView) findViewById(R.id.editPassword);

        LogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Singin_click(view, Username.toString(),Password.toString());
            }
        });

        RegButton.setOnClickListener(new View.OnClickListener() {
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
