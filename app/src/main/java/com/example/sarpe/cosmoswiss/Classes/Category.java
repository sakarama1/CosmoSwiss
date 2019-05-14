package com.example.sarpe.cosmoswiss.Classes;

import java.util.ArrayList;

public class Category {

    private String name;
    private Category parent;
    private ArrayList<Category> subCategories;

    public Category(String name, Category parent, ArrayList<Category> subCategories) {
        this.name = name;
        this.parent = parent;
        this.subCategories = subCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public ArrayList<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(ArrayList<Category> subCategories) {
        this.subCategories = subCategories;
    }
}
