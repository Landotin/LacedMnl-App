package com.example.lacedmnlapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lacedmnlapp.Domain.ShoeItem;

import java.util.ArrayList;

public class ShoesDomain extends AppCompatActivity {
    private RecyclerView recyclerShoesDomain;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discoverpage);

        recyclerViewShoesDomain();
    }

    private void recyclerViewShoesDomain() {
        // Set up the RecyclerView with horizontal layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerShoesDomain = findViewById(R.id.recyclerView);
        recyclerShoesDomain.setLayoutManager(linearLayoutManager);

        // Create a list of ShoeItem objects
        ArrayList<ShoeItem> trends = new ArrayList<>();
        trends.add(new ShoeItem("Shoes 1", "adidas_1"));
        trends.add(new ShoeItem("Shoes 2", "nike_1"));
        trends.add(new ShoeItem("Shoes 3", "adidas_2"));
        trends.add(new ShoeItem("Shoes 4", "nike_2"));
        trends.add(new ShoeItem("Shoes 5", "adidas_3"));

    }
}