package com.terminalbd.isurance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisLogActivity extends AppCompatActivity {

    Button cancleBtn;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_log);
    }

    public void onClickSignUp(View view) {
        Intent intent = new Intent(this, PolicyAndPersonalActivity.class);
        signUpBtn = findViewById(R.id.regSignUpBtn);
        startActivity(intent);

    }

    public void onClickCancle(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        cancleBtn = findViewById(R.id.regCancelBtn);
        startActivity(intent);
    }
}
