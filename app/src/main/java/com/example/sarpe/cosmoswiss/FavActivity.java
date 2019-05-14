package com.example.sarpe.cosmoswiss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sarpe.cosmoswiss.Classes.Product;

import java.util.ArrayList;

public class FavActivity extends AppCompatActivity {

    //similar to cardActivity without buying

    ListView listView;

    ArrayList<Product> allFavs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        listView = findViewById(R.id.favListView);
    }
}
