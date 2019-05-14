package com.example.sarpe.cosmoswiss;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.sarpe.cosmoswiss.Adapters.CategoryAdapter;
import com.example.sarpe.cosmoswiss.Adapters.ProductAdapter;
import com.example.sarpe.cosmoswiss.Classes.Product;
import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShowListsActivity extends AppCompatActivity {
    public ListView listview;
    CategoryAdapter adapter, adapter2;
    ProductAdapter adapter3;

    //ArrayList we will use for Listview
    private ArrayList<Product> allProducts;
    private ArrayList<String> allProductNames;
    private ArrayList<String> allProductPrices;
    private ArrayList<Bitmap> allProductPictures;
    private ArrayList<String> mainCategories;
    private ArrayList<String> subCategories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listView);

        //All arrayLists to show products
        allProducts  = new ArrayList<Product>();
        allProductNames  = new ArrayList<String>();
        allProductPrices  = new ArrayList<String>();
        allProductPictures  = new ArrayList<Bitmap>();

        //All arrayLists to show categories
        mainCategories  = new ArrayList<String>();
        subCategories  = new ArrayList<String>();
        Intent intent = getIntent();

        intent.getStringExtra("category");



        try {
            readData(); //Reads data from csv
        } catch (IOException e) {
            e.printStackTrace();
        }

        //just for test
        Bitmap picture = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cosmo);

        //dummy arrays
        ArrayList<Bitmap> dummypicturesMain = new ArrayList<Bitmap>();
        ArrayList<Bitmap> dummypicturesSub = new ArrayList<Bitmap>();
        for(int i = 0; i < mainCategories.size(); ++i){
            dummypicturesMain.add(picture);
        }
        for(int i = 0; i < subCategories.size(); ++i){
            dummypicturesSub.add(picture);
        }
        //////////////


        //all adapters available
        adapter = new CategoryAdapter(mainCategories, dummypicturesMain, this);
        adapter2 = new CategoryAdapter(subCategories, dummypicturesSub, this);
        adapter3 = new ProductAdapter(allProductNames, allProductPrices, allProductPictures, this);

        listview.setAdapter(adapter); //Start with first kategorie

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String main = mainCategories.get(position);
                String sub;
                //If we have first adapter we should set other adapter to navigate and we will need the button
                //save which category we chose
                if(listview.getAdapter().equals(adapter)){
                    listview.setAdapter(adapter2);
                }
                //we go to 3rd adapter
                else if(listview.getAdapter().equals(adapter2)){

                    sub = subCategories.get(position);
                    putItemsInRightCategories(main, sub, allProducts);
                    adapter3.setArrayLists(allProductNames, allProductPrices, allProductPictures);
                    listview.setAdapter(adapter3);

                }
                //selector method works here

                //implement going to card option
            }
        });
    }


    //read data from csv
    private void readData() throws IOException {
        InputStreamReader isr = new InputStreamReader(getResources().openRawResource(R.raw.testexcel)); //This is how you read an Inputstream csv file
        CSVReader reader = new CSVReader(isr); //as argument excel file
        String[] nextLine; //reading that

        reader.readNext(); //read the titles
        try{
            while ((nextLine = reader.readNext()) != null ){
                //read and add
                Product product = new Product(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6], nextLine[7], nextLine[8], "swiss", nextLine[9]);
                Log.d("my object", "object created");

                //create arraylists for product
                allProducts.add(product);
//                allProductNames.add(product.getNameGerman());
//                allProductPrices.add(product.getCostWeb());
//                allProductPictures.add(pictureControl(product.getPicture()));

                //create arraylist for main and sub categories
                createCategories(product); //get 2 categories from csv

                //implementation 'com.opencsv:opencsv:3.9' add to build gradles


            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    //to see if there is a picture to set or not
    private Bitmap pictureControl(String produkt){
        Bitmap picture = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cosmo);
        return picture;
    }

    //we want to create lists of categories
    //you can make it more generalized by making passing arrayList and making this arrayLists as dummy variable
    private void createCategories(Product product){
        if(!mainCategories.contains(product.getMainCategory())) mainCategories.add(product.getMainCategory());
        if(!subCategories.contains(product.getSubCategory())) subCategories.add(product.getSubCategory());
        //implement, if you have main category than add sub category just another if but not now
    }

    //selects items after you choose categories
    private void putItemsInRightCategories(String main, String sub, ArrayList<Product> arrayList){
        for (int i= 0; i < allProducts.size(); ++i){
            if(arrayList.get(i).getMainCategory() == main && arrayList.get(i).getSubCategory() == sub){
                allProductNames.add(arrayList.get(i).getNameGerman());
                allProductPrices.add(arrayList.get(i).getCostWeb());
                allProductPictures.add(pictureControl(arrayList.get(i).getPicture()));
            }
        }
    }

}


