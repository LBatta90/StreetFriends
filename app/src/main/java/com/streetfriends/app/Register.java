package com.streetfriends.app;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_register);
        final Button ConfirmButton = (Button) findViewById(R.id.ButtonSubscribe);

        Typeface ColL = Typeface.createFromAsset(getAssets(),
                "fonts/ColabLig.otf");
        TextView tv1 = (TextView) findViewById(R.id.Instruction);
        TextView tv2 = (TextView) findViewById(R.id.ButtonSubscribe);
        tv1.setTypeface(ColL);
        tv2.setTypeface(ColL);

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
