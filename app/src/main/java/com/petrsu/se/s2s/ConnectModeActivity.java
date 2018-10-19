package com.petrsu.se.s2s;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ConnectModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_mode);
    }

    public void goToMain(View view) {
        Intent intent = new Intent(ConnectModeActivity.this, MainMenu.class);
        startActivity(intent);
    }

    public void goToIP(View view) {
        Intent intent = new Intent(ConnectModeActivity.this, EnterIP_Activity.class);
        startActivity(intent);
    }
}
