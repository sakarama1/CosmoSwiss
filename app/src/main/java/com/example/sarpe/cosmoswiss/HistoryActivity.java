package com.example.sarpe.cosmoswiss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class HistoryActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        listView = findViewById(R.id.orderListView);

        //clickListener yap ve bu tum siparislerden secili olana gecsin
        //onbackclicked yap tam tersi olsun
    }
}
