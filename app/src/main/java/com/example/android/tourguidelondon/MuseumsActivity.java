package com.example.android.tourguidelondon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.name_imperialwarmuseum, R.string.description_imperialwarmuseum, R.drawable.imperialwarmuseum));
        locations.add(new Location(R.string.name_naturalhistorymuseum, R.string.description_naturalhistorymuseum, R.drawable.naturalhistorymuseum));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
    }
}
