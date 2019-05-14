package com.example.sarpe.cosmoswiss.Classes;

import java.util.ArrayList;

public class User {

    //Ask in login screen
    private String userName;
    private String password;
    private ContactPerson person;

    private ArrayList<String> adress;

    //afterwards
    private ArrayList<Product> shoppingCart;
    private ArrayList<Product> favorites;

    private ArrayList<Order> allOrders;


    public User(String userName, String password, ContactPerson person, ArrayList<String> adress, ArrayList<Product> shoppingCart, ArrayList<Product> favorites) {
        this.userName = userName;
        this.password = password;
        this.person = person;
        this.adress = adress;
        this.shoppingCart = shoppingCart;
        this.favorites = favorites;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ContactPerson getPerson() {
        return person;
    }

    public void setPerson(ContactPerson person) {
        this.person = person;
    }

    public ArrayList<String> getAdress() {
        return adress;
    }

    public void setAdress(ArrayList<String> adress) {
        this.adress = adress;
    }

    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ArrayList<Product> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Product> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                '}';
    }
}
