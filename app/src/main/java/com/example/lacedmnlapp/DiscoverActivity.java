package com.example.lacedmnlapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lacedmnlapp.Domain.CategoryDomain;

import java.util.ArrayList;

public class DiscoverActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discoverpage);

        recyclerViewCategory();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategory = findViewById(R.id.recyclerView);
        recyclerViewCategory.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Shoes 1", "adidas_1" ));
        category.add(new CategoryDomain("Shoes 2", "nike_1"));
        category.add(new CategoryDomain("Shoes 3", "adidas_2"));
        category.add(new CategoryDomain("Shoes 4", "nike_2"));
        category.add(new CategoryDomain("Shoes 5", "adidas_3"));

    }


}
