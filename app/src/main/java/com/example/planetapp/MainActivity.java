package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<Planet> planetArrayList;
private static CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.listView);

        planetArrayList = new ArrayList<>();

        Planet planet1 = new Planet("Mercury","0 Moons",R.drawable.mercury);
        Planet planet2 = new Planet("Venus","0 Moons",R.drawable.venus);
        Planet planet3 = new Planet("Earth","1 Moons",R.drawable.earth);
        Planet planet4 = new Planet("Mars","2 Moons",R.drawable.mars);
        Planet planet5 = new Planet("Jupiter","79 Moons",R.drawable.jupiter);
        Planet planet6 = new Planet("Saturn","89 Moons",R.drawable.saturn);
        Planet planet7 = new Planet("Uranus","27 Moons",R.drawable.uranus);
        Planet planet8 = new Planet("Neptune","14 Moons",R.drawable.neptune);

        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);

        adapter = new CustomAdapter(planetArrayList, getApplicationContext());
        listView.setAdapter(adapter);
    }
}