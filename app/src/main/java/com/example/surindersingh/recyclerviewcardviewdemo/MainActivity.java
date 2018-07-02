package com.example.surindersingh.recyclerviewcardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product>  productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);


        // LinearLayoutManager()---to display the recycler view vertically
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "  3 Bedroom House for rent, 1800 sqft",
                        " Markham/Ellsmere",
                        4.3,
                        1500,
                        R.drawable.hom));

        productList.add(
                new Product(
                        1,
                        " 2 Bedroom House for rent, 1800 sqft",
                        "Birchmount/Ellsmere",
                        4.3,
                        1600,
                        R.drawable.hom));

        productList.add(
                new Product(
                        1,
                        "2 bedroom Condo, 1 bath,1300 sqft",
                        "Victoria park/ Sheppard",
                        4.2,
                        60000,
                        R.drawable.h));


        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);


    }
}
