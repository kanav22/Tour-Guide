package com.example.android.TourGuide;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by kanav on 19/09/17.
 */

public class locationAdapter extends ArrayAdapter<location> {

    public locationAdapter(Activity context, ArrayList<location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        location currentlocationAdapter = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentlocationAdapter.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place_location);
        numberTextView.setText(currentlocationAdapter.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.place_image);
        iconView.setImageResource(currentlocationAdapter.getImage());

        TextView description = (TextView) listItemView.findViewById(R.id.place_description);
        description.setText(currentlocationAdapter.getDescription());
        TextView budget = (TextView) listItemView.findViewById(R.id.place_budget);
        budget.setText("Budget :  \u20B9 " + currentlocationAdapter.getbudget() + " for two ");
        return listItemView;
    }
}
