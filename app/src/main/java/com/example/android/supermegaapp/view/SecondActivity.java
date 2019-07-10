package com.example.android.supermegaapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android.supermegaapp.R;

public class SecondActivity extends AppCompatActivity {

    private final String SECOND_ACTIVITY = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(SECOND_ACTIVITY, "onCreate");
    }
}
