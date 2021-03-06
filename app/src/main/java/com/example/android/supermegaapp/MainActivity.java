package com.example.android.supermegaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.supermegaapp.participants.AlexTarasyuk;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names;
    HorpenkoDan Dan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ValadimirHaiba haiba = new ValadimirHaiba("Vladimir","Ivanovich");
        Katerina katerina = new Katerina("Oblakevich");
        Ihor ihor = new Ihor();
        Cherevatenko dmitry = new Cherevatenko("something");
        Jane jane=new Jane();
        Igor igor = new Igor();
        Oleg oleg = new Oleg("managed");
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Snackbar.make(view, "Hello world!", 10)
                                               .setAction("Action", null).show();
                                   }
                               }

        );

        names = new ArrayList<>();

        names.add("Jake");
        names.add("Michael");
        names.add("Michael");
        names.add("Michael");
        names.add("Michael");
        names.add(new AlexTarasyuk().getName());

        Maxim maxim = new Maxim();
        Dan = new HorpenkoDan(23);

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
