package com.terminalbd.isurance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisLogActivity extends AppCompatActivity {

    Button cancleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_log);
    }

    public void onClickSignUp(View view) {

    }

    /*public void onClickCancle(View view) {
        Intent intent = new Intent(this, YesFragment.class);
        cancleBtn = findViewById(R.id.regCancelBtn);
        startActivity(intent);
    }*/
}
