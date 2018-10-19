package com.petrsu.se.s2s;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class EnterIP_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_ip_);
    }

    public void goBack(View view) {
        Intent intent = new Intent(EnterIP_Activity.this, ConnectModeActivity.class);
        startActivity(intent);
    }

    public void goToMainMenu(View view) {
        Intent intent = new Intent(EnterIP_Activity.this, MainMenu.class);
        startActivity(intent);
    }
}
