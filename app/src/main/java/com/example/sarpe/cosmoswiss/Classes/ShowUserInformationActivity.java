package com.example.sarpe.cosmoswiss.Classes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sarpe.cosmoswiss.R;
import com.example.sarpe.cosmoswiss.UserProfileActivity;

public class ShowUserInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user_information);
    }

    public void changeUserInfo(View view){
        Intent intent = new Intent(getApplicationContext(), UserProfileActivity.class);
        startActivity(intent);
    }
}
