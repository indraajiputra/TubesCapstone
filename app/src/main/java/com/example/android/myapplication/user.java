package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void customer(View view) {
        startActivity(new Intent(user.this, SignupActivity.class));
    }



    public void seller(View view) {
        startActivity(new Intent(user.this, SignupActivity.class));
       finish();

    }}

