package com.example.sarpe.cosmoswiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.sarpe.cosmoswiss.Classes.Order;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    //delete button i salip yerine onClick le de yapabilirsin ki oyle yapicam glb
    Button buyButton;

    ListView listView;

    ArrayList<Order> allOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        buyButton = findViewById(R.id.buyButton);

        listView = findViewById(R.id.cartListView);

        allOrders = new ArrayList<Order>();

        //clickListener lar la edit ve silmeyi hallet
        //https://www.android-examples.com/remove-selected-listview-item-in-android-on-long-click-listener/

    }

    //ListView icin Adapter ozel class i vs
    //degistirme algoritmasi

    //implement buttons

    public  void buy(View view){
        Intent intent = new Intent(getApplicationContext(), HistoryActivity.class);
        startActivity(intent);
    }
}
