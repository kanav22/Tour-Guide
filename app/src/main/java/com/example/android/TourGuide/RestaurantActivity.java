package com.example.android.TourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location(getString(R.string.Knight), getString(R.string.sector_56), R.drawable.knight, getString(R.string.fast), 1200));
        locations.add(new location(getString(R.string.indian), getString(R.string.sector_56), R.drawable.indian_grill, getString(R.string.north), 1000));
        locations.add(new location(getString(R.string.imprompto), getString(R.string.sector_54), R.drawable.imprompto, getString(R.string.chinese), 800));
        locations.add(new location(getString(R.string.ark),getString(R.string.new_delhi), R.drawable.food, getString(R.string.chinese1), 800));
        locations.add(new location(getString(R.string.kfc), getString(R.string.sector_56), R.drawable.food1, getString(R.string.north1), 9000));
        locations.add(new location(getString(R.string.barbeque), getString(R.string.sector_56), R.drawable.food2, "Fast Food", 2000));
        locations.add(new location(getString(R.string.hyatt), getString(R.string.sector_54), R.drawable.food3, getString(R.string.chinese2), 300));
        locations.add(new location(getString(R.string.ark), getString(R.string.new_delhi), R.drawable.food1, getString(R.string.fast), 3400));
        locations.add(new location(getString(R.string.Knight), getString(R.string.sector_47), R.drawable.food2, getString(R.string.fast), 1200));
        locations.add(new location(getString(R.string.indian), getString(R.string.new_delhi), R.drawable.indian_grill, getString(R.string.north1), 1000));
        locations.add(new location(getString(R.string.imprompto), getString(R.string.sector_54), R.drawable.imprompto, getString(R.string.chinese1), 900));
        locations.add(new location(getString(R.string.ark), getString(R.string.new_delhi), R.drawable.food, getString(R.string.asain), 1000));
        locationAdapter itemsAdapter = new locationAdapter(this, locations);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
