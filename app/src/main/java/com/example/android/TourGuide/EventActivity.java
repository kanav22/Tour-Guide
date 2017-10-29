package com.example.android.TourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

import static com.example.android.TourGuide.R.string.new_delhi;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location(getString(R.string.coldplay), getString(new_delhi), R.drawable.coldplay, getString(R.string.fifth_oct), 12000));
        locations.add(new location(getString(R.string.sunburn),getString(R.string.new_delhi2), R.drawable.sunburn, getString(R.string.tenth_october), 10000));
        locations.add(new location(getString(R.string.yoga_day), getString(R.string.new_delhi1), R.drawable.yoga_day, getString(R.string.fifteen_oct), 0));
        locations.add(new location(getString(R.string.navratri), getString(R.string.new_delhi2), R.drawable.navratri, getString(R.string.september), 800));
        locations.add(new location(getString(R.string.david) ,getString(R.string.new_delhi2), R.drawable.david, getString(R.string.september1), 30000));
        locationAdapter itemsAdapter = new locationAdapter(this, locations);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);

    }
}
