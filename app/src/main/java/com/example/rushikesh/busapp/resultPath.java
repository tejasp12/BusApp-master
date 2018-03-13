package com.example.rushikesh.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class resultPath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_path);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String userSource = intent.getStringExtra(MainActivity.SOURCE_TEXT);
        String userDestination = intent.getStringExtra(MainActivity.DESTINATION_TEXT);

        getSupportActionBar().setTitle(message);

        //Create an ArrayList that stores all the stops.
        ArrayList<String> stops = new ArrayList<String>();
        stops.add("Rajwada");
        stops.add("Devi Chowk");
        stops.add("Kamani houd");
        stops.add("Juna Davakhana");
        stops.add("Datta Mandir");
        stops.add("Bagade Hospital");
        stops.add("Powai Naka");
        stops.add("Bus station");
        stops.add("Bhuvikas Bank");
        stops.add("Karanje Naka");
        stops.add("Mahanubhav Math");
        stops.add("Molacha Odha");
        stops.add("Saidapur phata");
        stops.add("Varye");
        stops.add("Nele");
        stops.add("Kidgoan");
        stops.add("Kanol");
        stops.add("Ganesh Mandir");
        stops.add("Dattanagar");
        stops.add("Pimple wadi");
        stops.add("Khande Mala");
        stops.add("Hanuman Mandir");
        stops.add("Dhavadshi");

        for(int i = 0;i<stops.size();i++){
            if(stops.get(i).equals(userSource)){
                userSource =  userSource  + "-: Your SOURCE";
                stops.set(i, (userSource));
            }else if(stops.get(i).equals(userDestination)){
                userDestination = userDestination + "-: Your DESTINATION";
                stops.set(i,(userDestination));
            }
        }
        //Use ArrayAdapter to bind the data in ArrayList into ListItemViews.
        ArrayAdapter<String> busStopAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,stops);
        ListView listView = findViewById(R.id.List);
        listView.setAdapter(busStopAdapter);
    }
}
