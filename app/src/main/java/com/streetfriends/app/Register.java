package com.streetfriends.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Button ConfirmButton = (Button) findViewById(R.id.ButtonSubscribe);

        ConfirmButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Confirm_click(view);
            }

        });
    }

    private void Confirm_click(View v)
    {
        /*Declaration of the EditText component*/
        /*
        * The text wrote by user is reachable by function .getText() Example -> Nome.getText()
        */
        EditText nome= (EditText) findViewById(R.id.EdTextNome);
        EditText cognome= (EditText) findViewById(R.id.EdTextCognome);
        EditText email= (EditText) findViewById(R.id.EdTextEmail);
        EditText data_nascita = (EditText) findViewById(R.id.EdTextDate);
        EditText psw= (EditText) findViewById(R.id.EdTextPassword);
        /*
        * INSERT HERE THE COMMUNICATION FUNCTION
        * */
    }

}
