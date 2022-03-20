package com.example.item;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {
    List<Items> itemsListAdapter;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsListAdapter=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.items_list,parent,false);
        Items currentitem=itemsListAdapter.get(position);

        ImageView image=view.findViewById(R.id.itemImage);
        TextView name=view.findViewById(R.id.itemName);
        TextView numberprice= view.findViewById(R.id.numberprice);

        image.setImageResource(currentitem.getItemImage());
        name.setText(currentitem.getItemName());
        numberprice.setText(currentitem.getItemPrice() + "");

        return view;
    }
}
