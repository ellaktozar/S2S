package com.petrsu.se.s2s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
    }

    public void goToMain(View view) {
        Intent intent = new Intent(ManualActivity.this, MainMenu.class);
        startActivity(intent);
    }
}
