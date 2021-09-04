package com.example.covid_19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Carrier> {
    private Context context;
    private List<Carrier> CList;

    public Adapter(Context context, List<Carrier> CList) {
        super(context, R.layout.testing, CList);

        this.context = context;
        this.CList = CList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.testing, null,true);

        // Hooks
        TextView state = v.findViewById(R.id.cityname);
        TextView active = v.findViewById(R.id.active);
        TextView confirmed = v.findViewById(R.id.confirm);
        TextView deceased = v.findViewById(R.id.deceased);
        TextView recovered = v.findViewById(R.id.recovered);

        TextView dconfirmed = v.findViewById(R.id.dconfirm);
        TextView ddeceased = v.findViewById(R.id.ddeceased);
        TextView drecovered = v.findViewById(R.id.drecovered);

        // Adding Data to CList
        state.setText(CList.get(position).getName());
        active.setText(CList.get(position).getActive());
        confirmed.setText(CList.get(position).getConfirmed());
        deceased.setText(CList.get(position).getDeceased());
        recovered.setText(CList.get(position).getRecovered());

        dconfirmed.setText(CList.get(position).getDconfirmed());
        ddeceased.setText(CList.get(position).getDdeceased());
        drecovered.setText(CList.get(position).getDrecovered());

        return v;
    }
}