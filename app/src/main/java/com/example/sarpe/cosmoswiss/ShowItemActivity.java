package com.example.sarpe.cosmoswiss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowItemActivity extends AppCompatActivity {

    Button toCartButton;
    Button plusButton;
    Button minusButton;

    ImageView showImage;

    TextView showQuantity;
    TextView showItemName;

    EditText enterQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);

        toCartButton = findViewById(R.id.toCartButton);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);

        showImage = findViewById(R.id.showItemImageView);

        showQuantity = findViewById(R.id.showQuantityTextView);
        showItemName = findViewById(R.id.showItemNameTextView);

        enterQuantity = findViewById(R.id.enterQuantityEditText);
    }

    public void plus(View view){

    }

    public void minus(View view){

    }

    public void buy(View view){

    }
}
