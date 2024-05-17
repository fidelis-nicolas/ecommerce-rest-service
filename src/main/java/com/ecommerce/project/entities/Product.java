package com.ecommerce.project.entities;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String description;
    private int quantity;

    public Product() {
    }

    public Product(String productName, double price, String description, int quantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }
}
