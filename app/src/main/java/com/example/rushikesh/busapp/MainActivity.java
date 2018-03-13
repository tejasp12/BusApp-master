package com.example.rushikesh.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView ss2,ss3;
    public static final String EXTRA_MESSAGE = "com.example.rushikesh.busapp.MESSAGE";
    public static final String SOURCE_TEXT = "com.example.rushikesh.busapp.SOURCE_TEXT";
    public static final String DESTINATION_TEXT = "com.example.rushikesh.busapp.DESTINATION_TEXT";
    public String sourceText, destinationText;
    String totalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Plz Enter any stop between Rajwada to Dhavadshi",
                Toast.LENGTH_LONG).show();

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

        ss2 = findViewById ( R.id.ss1 );
        ss3 = findViewById ( R.id.auto2);

        ArrayAdapter<String> adapter = new ArrayAdapter <String> ( this,
                android.R.layout.simple_list_item_1,stops );
        ss2.setAdapter ( adapter );
        ss3.setAdapter ( adapter );

    }
    public void onClickEC(View view)
    {
        Intent i = new Intent(this, EmergencyContacts.class);
        startActivity(i);
    }
    public void Search(View view)
    {
        sourceText = ss2.getText().toString();
        destinationText = ss3.getText().toString();

        if ((sourceText.isEmpty() && destinationText.isEmpty()) || sourceText.isEmpty() ||
                destinationText.isEmpty()) {
            Toast.makeText(MainActivity.this, "Plz enter source or destination data",
                    Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(MainActivity.this,resultPath.class);

            totalText = sourceText + "-" + destinationText;
            intent.putExtra(EXTRA_MESSAGE,totalText);
            intent.putExtra(SOURCE_TEXT,sourceText);
            intent.putExtra(DESTINATION_TEXT,destinationText);

            startActivity(intent);
        }

    }
}
