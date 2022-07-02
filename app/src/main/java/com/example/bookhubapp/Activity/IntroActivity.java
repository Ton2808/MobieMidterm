package com.example.bookhubapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.bookhubapp.Adapter.CategoryAdapter;
import com.example.bookhubapp.Adapter.PopularAdapter;
import com.example.bookhubapp.Domain.CategoryDomain;
import com.example.bookhubapp.Domain.FoodDomain;
import com.example.bookhubapp.R;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPolularList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager LinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza", "cat_1"));
        category.add(new CategoryDomain("Burger", "cat_2"));
        category.add(new CategoryDomain("Hotdog", "cat_3"));
        category.add(new CategoryDomain("Drink", "cat_4"));
        category.add(new CategoryDomain("Donut", "cat_5"));

        adapter = new CategoryAdapter(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPolularList = findViewById(R.id.recyclerView2);
        recyclerViewPolularList.setLayoutManager(LinearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Hoang-Chau Luong", "pizza1", "Dep trai hoc gioi", 9.76));
        foodList.add(new FoodDomain("Nham-Tan Nguyeb", "burger", "Dep trai hoc gioi", 9.76));
        foodList.add(new FoodDomain("Tuan-An To", "book", "Dep trai hoc gioi", 9.76));

        adapter2 = new PopularAdapter(foodList);
        recyclerViewCategoryList.setAdapter(adapter2);
    }
}