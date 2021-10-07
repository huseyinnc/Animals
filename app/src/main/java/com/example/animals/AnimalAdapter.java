package com.example.animals;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private List<Animal> animals;
    private LayoutInflater inflater;

    public AnimalAdapter(List<Animal> animals, Activity activity) {
        this.animals = animals;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView = inflater.inflate(R.layout.listview_row, null);
        TextView textView =
                (TextView) rowView.findViewById(R.id.label);
        textView.setText(animals.get(position).getType());

        ImageView imageView =
                (ImageView) rowView.findViewById(R.id.imageView);
        imageView.setImageResource(animals.get(position).getPicId());

        return rowView;
    }
}
