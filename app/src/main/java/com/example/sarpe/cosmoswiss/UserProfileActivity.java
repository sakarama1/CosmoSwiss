package com.example.sarpe.cosmoswiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class UserProfileActivity extends AppCompatActivity {

    EditText name;
    EditText surname;
    EditText username;
    EditText password;
    EditText phoneNumber;
    EditText adress;

    Button submitButton;

    RadioButton herr;
    RadioButton frau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        name = findViewById(R.id.vornameEditText);
        surname = findViewById(R.id.nachnameEditText);
        username = findViewById(R.id.benutzernameEditText);
        password = findViewById(R.id.kennwortEditText);
        phoneNumber = findViewById(R.id.handynummerEditText);
        adress = findViewById(R.id.adresseEditText);

        submitButton = findViewById(R.id.submitButton);

        herr = findViewById(R.id.herrRadioButton);
        frau = findViewById(R.id.frauRadioButton);
    }

    public void submit(View view){

        //define for logged in or out later or coming from control panel

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
