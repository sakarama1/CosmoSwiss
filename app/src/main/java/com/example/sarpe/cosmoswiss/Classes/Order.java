package com.example.sarpe.cosmoswiss.Classes;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> products;
    private String date;
    private String orderNumber;
    private  String currentSituation;

    public Order(ArrayList<Product> products, String date, String orderNumber, String currentSituation) {
        this.products = products;
        this.date = date;
        this.orderNumber = orderNumber;
        this.currentSituation = currentSituation;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCurrentSituation() {
        return currentSituation;
    }

    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation;
    }
}
