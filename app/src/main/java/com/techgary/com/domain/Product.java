package com.techgary.com.domain;

/**
 * Created by Gary on 10/5/2014.
 */
public class Product {
    private int ProductId;
    private String Name;
    private String Description;
    private double Price;

    public Product(int id, String name, String description, double price) {
        ProductId = id;
        Name = name;
        Description = description;
        Price = price;
    }

    public int getProductId() {
        return ProductId;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
