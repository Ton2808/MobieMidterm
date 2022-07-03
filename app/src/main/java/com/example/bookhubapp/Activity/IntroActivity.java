package com.example.bookhubapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bookhubapp.Adapter.CategoryAdapter;
import com.example.bookhubapp.Adapter.PopularAdapter;
import com.example.bookhubapp.Domain.CategoryDomain;
import com.example.bookhubapp.Domain.FoodDomain;
import com.example.bookhubapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;
    private ImageView map;
    private FloatingActionButton cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        map = findViewById(R.id.imagemap);
        cart = findViewById(R.id.cart);

        recyclerViewCategory();
        recyclerViewPopular();

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext() , CartListActivity.class));
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext() , MapActivity.class));
            }
        });
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.CardList);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Romance", "hearts"));
        category.add(new CategoryDomain("Mystery", "clue"));
        category.add(new CategoryDomain("Thriller", "zombie"));
        category.add(new CategoryDomain("Fiction", "science_fiction"));
        category.add(new CategoryDomain("Historical", "coliseum"));

        adapter = new CategoryAdapter(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Adventures of Finn", "adventures_finn", "The novel's preeminence derives from its wonderfully imaginative re-creation of boyhood adventures along the Mississippi River, its inspired characterization, the author's remarkable ear for dialogue, and the book's understated development of serious underlying themes: \"natural\" man versus \"civilized\" society, the evils of slavery, the innate value and dignity of human beings, and other topics. Most of all, Huckleberry Finn is a wonderful story, filled with high adventure and unforgettable characters.", 8.76));
        foodList.add(new FoodDomain("Anna Karenina", "anna_kare", "Described by William Faulkner as the best novel ever written and by Fyodor Dostoevsky as “flawless,” Anna Karenina tells of the doomed love affair between the sensuous and rebellious Anna and the dashing officer, Count Vronsky. Tragedy unfolds as Anna rejects her passionless marriage and thereby exposes herself to the hypocrisies of society. Set against a vast and richly textured canvas of nineteenth-century Russia, the novel's seven major characters create a dynamic imbalance, playing out the contrasts of city and country life and all the variations on love and family happiness.", 7.96));
        foodList.add(new FoodDomain("The Great Gatsby", "great_gatsby", "The only authorized edition of the twentieth-century classic, featuring F. Scott Fitzgerald’s final revisions, a foreword by his granddaughter, and a new introduction by National Book Award winner Jesmyn Ward.", 9.76));

        adapter2 = new PopularAdapter(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }
}