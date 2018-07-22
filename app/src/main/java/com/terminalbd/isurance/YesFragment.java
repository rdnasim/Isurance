package com.terminalbd.isurance;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
;


public class YesFragment extends Fragment {
    Activity context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       context=getActivity();

       return inflater.inflate(R.layout.fragment_yes, container, false);

    }

    public void onStart(){
        super.onStart();
        Button freeQuota = context.findViewById(R.id.freeQuota);

        freeQuota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(context, RegisLogActivity.class);
                startActivity(intent);
            }
        });
    }
}
