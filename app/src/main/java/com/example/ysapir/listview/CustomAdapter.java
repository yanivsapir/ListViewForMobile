package com.example.ysapir.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ysapir on 07/11/2015.
 */
public class CustomAdapter extends ArrayAdapter<String>{

    CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.costum_row ,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater yanivInFlater = LayoutInflater.from(getContext());
        View customView = yanivInFlater.inflate(R.layout.costum_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView yanivText = (TextView)customView.findViewById(R.id.yanivText);

        yanivText.setText(singleFoodItem);
        return customView;
    }
}