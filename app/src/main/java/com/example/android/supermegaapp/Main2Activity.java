package com.example.android.supermegaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView=findViewById(R.id.textViewActivity2);
        Intent intent=getIntent();
        MyObjectNameAge myObjectNameAge=intent.getParcelableExtra("Data");
        Log.d("activity2", String.valueOf(myObjectNameAge.age));
        textView.setText(myObjectNameAge.lastName+" "+myObjectNameAge.name+" "+myObjectNameAge.age);
        Button button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
