package com.ecommerce.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "name")
    private String productName;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "quantity")
    private int quantity;

    public Product() {
    }

    public Product(String productName, double price, String description, int quantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    //Getters and setters
    public int getId() {return id;}

    public void setId(int id){
        this.id = id;
    }

    public String getProductName() {return productName;}

    public void setProductName(String productName){
        this.productName = productName;
    }

    public double getPrice(){return price;}

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription(){return description;}

    public void setDescription(String description){
        this.description = description;
    }

    public int getQuantity(){return quantity;}

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //To string

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
