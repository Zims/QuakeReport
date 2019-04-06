package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthqake_list_item, parent, false);
        }

        Earthquake currentEartquake = getItem(position);

        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEartquake.getMagnitude());

        TextView locationView = listItemView.findViewById(R.id.location);
        locationView.setText(currentEartquake.getLocation());

        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(currentEartquake.getDate());

        return listItemView;


    }
}
