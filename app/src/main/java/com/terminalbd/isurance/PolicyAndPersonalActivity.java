package com.terminalbd.isurance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PolicyAndPersonalActivity extends AppCompatActivity {

    Button policyCancle;
    Button policyRenew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy_and_personal);
    }

    public void onClickPolicyCancle(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        policyCancle = findViewById(R.id.canclePolicyPersonalBtn);
        startActivity(intent);

    }

    public void onCLickPolicyRenew(View view) {
        Intent intent = new Intent(this, RegisLogActivity.class);
        policyRenew = findViewById(R.id.renewPolicyPersonalBtn);
        startActivity(intent);
    }
}
