package com.example.daniel.latinamericanbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}

/*
Reference:
    - https://www.youtube.com/watch?v=ND6a4V-xdjI
    - https://www.bignerdranch.com/blog/splash-screens-the-right-way/
 */