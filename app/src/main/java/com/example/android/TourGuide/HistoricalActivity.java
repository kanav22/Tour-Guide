package com.example.android.TourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);

        ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location(getString(R.string.taj_mahal), getString(R.string.agra), R.drawable.taj_mahal, getString(R.string.architectural), 1200));
        locations.add(new location(getString(R.string.akshardham),getString(R.string.new_delhi), R.drawable.akshardham, getString(R.string.sacred), 1000));
        locations.add(new location(getString(R.string.india_gate),getString(R.string.new_delhi) , R.drawable.india_gate, getString(R.string.historic), 800));
        locations.add(new location(getString(R.string.lotus), getString(R.string.new_delhi) , R.drawable.lotus_temple, getString(R.string.sacred), 800));
        locations.add(new location(getString(R.string.rashtrapati), getString(R.string.new_delhi), R.drawable.rashtrapati, getString(R.string.architectural), 300));
        locations.add(new location(getString(R.string.connaught),getString(R.string.new_delhi), R.drawable.connaught, getString(R.string.points), 2000));
        locationAdapter itemsAdapter = new locationAdapter(this, locations);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);

    }
}
