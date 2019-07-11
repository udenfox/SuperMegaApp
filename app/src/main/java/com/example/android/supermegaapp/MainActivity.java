package com.example.android.supermegaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        names = new ArrayList<>();
        JanePlatonova janePlatonova=new JanePlatonova();
        final EditText editTextLastname =findViewById(R.id.lname);
        final EditText editTextname =findViewById(R.id.name);
        final EditText editTextage=findViewById(R.id.age);
        Button button=findViewById(R.id.inputsent);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String sLastname,sName,sAge;
                                          sLastname=editTextLastname.getText().toString();
                                          sName=editTextname.getText().toString();
                                          sAge=String.valueOf(editTextage.getText());

                                          if (((sAge.length()>0)&(sLastname.length()>0))&(sName.length()>0)) {
                                              MyObjectNameAge myObjectNameAge = new MyObjectNameAge(sLastname, sName, new Integer(sAge));
                                              Log.d("main",sLastname+sName+sAge);
                                              Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                              intent.putExtra("Data", myObjectNameAge);
                                              startActivity(intent);
                                          }
                                      }
                                  }

        );



        names.add("Ivan");
        names.add("Michael");
        names.add("Jake");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
