package com.example.android.TourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location(getString(R.string.leela), getString(R.string.new_delhi), R.drawable.leela_palace, getString(R.string.diplomatic), 30000));
        locations.add(new location(getString(R.string.oberoi), getString(R.string.new_delhi), R.drawable.oberoi, getString(R.string.hussain), 10000));
        locations.add(new location(getString(R.string.roseate), getString(R.string.new_delhi), R.drawable.roseate, getString(R.string.gmr), 18000));
        locations.add(new location(getString(R.string.taj_diplomatic), getString(R.string.new_delhi), R.drawable.taj_diplomatic, getString(R.string.sardar), 8000));
        locations.add(new location(getString(R.string.lodhi), getString(R.string.new_delhi), R.drawable.lodhi, getString(R.string.lodhi_road), 19000));
        locations.add(new location(getString(R.string.pullman), getString(R.string.new_delhi), R.drawable.pullman, getString(R.string.norther), 17000));
        locations.add(new location(getString(R.string.taj_mahal_hotel), getString(R.string.new_delhi), R.drawable.taj_mahal_hotel, getString(R.string.mansingh), 25000));
        locationAdapter itemsAdapter = new locationAdapter(this, locations);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);

    }
}
