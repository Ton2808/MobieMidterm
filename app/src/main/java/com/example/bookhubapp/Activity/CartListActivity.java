package com.example.bookhubapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.bookhubapp.Adapter.CartListAdapter;
import com.example.bookhubapp.Helper.ManagementCart;
import com.example.bookhubapp.Interface.ChangeNumberItemsListener;
import com.example.bookhubapp.R;

public class CartListActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter;
private RecyclerView recyclerViewList;
private ManagementCart managementCart;
TextView totalFeeTxt, taxTxt, deliveryTxt, totalTxt, emptyTxt;
private double tax;
private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);

        managementCart = new ManagementCart(this);

        initView();
        initList();
        CalculateCart();
        //bottomNavigation();
    }

    /*private void bottomNavigation(){
        FloatingActionButton floatingActionButton=findViewById(R.id.cart);
        LinearLayout homeBtn=findViewById(R.id.homeBtn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartListActivity.this, CartListActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartListActivity.this, IntroActivity.class));
            }
        });
    }*/

    private void initView() {
        recyclerViewList = findViewById(R.id.CardList);
        totalFeeTxt = findViewById(R.id.totalFeeTxt);
        taxTxt = findViewById(R.id.totalTaxTxt);
        deliveryTxt = findViewById(R.id.totalDeliveryTxt);
        totalTxt=findViewById(R.id.totalTotalTxt);
        emptyTxt=findViewById(R.id.emptyTxt);
        scrollView=findViewById(R.id.scrollView2);
    }

    private void initList(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        adapter = new CartListAdapter(managementCart.getListCart(), this, new ChangeNumberItemsListener() {
            @Override
            public void changed() {
                CalculateCart();
            }
        });

        recyclerViewList.setAdapter(adapter);
        if(managementCart.getListCart().isEmpty()){
            emptyTxt.setVisibility(View.VISIBLE);
            scrollView.setVisibility(View.GONE);
        }else{
            emptyTxt.setVisibility(View.GONE);
            scrollView.setVisibility(View.VISIBLE);
        }
    }

    private void CalculateCart(){
        double percentTax = 0.02;
        double delivery = 10000;

        tax=Math.round((managementCart.getTotalFee()*percentTax)*100)/ 100;
        double total= Math.round((managementCart.getTotalFee()+tax+delivery)*100)/100;
        double itemTotal = Math.round(managementCart.getTotalFee()*100)/100;

        totalFeeTxt.setText((int)itemTotal/1000 + ",000đ");
        taxTxt.setText((int)tax/1000 + ",000đ");
        deliveryTxt.setText((int)delivery/1000 + ",000đ");
        totalTxt.setText((int)total/1000 + ",000đ");
    }
}