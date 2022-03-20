package com.example.item;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items> Items=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items donuts= new Items("Donuts",R.drawable.donut,2);
        Items chocolate= new Items("Chocolate",R.drawable.chocolate,1.5);
        Items coffee= new Items("Coffee",R.drawable.coffee,2.5);
        Items cheese= new Items("Coffee",R.drawable.cheese,1);
        Items fries= new Items("Coffee",R.drawable.fries,1);
        Items honey= new Items("Coffee",R.drawable.honey,1.5);

        Items.add(donuts);
        Items.add(chocolate);
        Items.add(coffee);
        Items.add(cheese);
        Items.add(fries);
        Items.add(honey);


        ItemAdapter itemAdapter=new ItemAdapter(this,0,Items);

        ListView Listview= findViewById(R.id.listview);
        Listview.setAdapter(itemAdapter);

    }
}