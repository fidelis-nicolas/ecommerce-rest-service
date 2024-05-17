package com.ecommerce.project.entities;

import java.util.Date;

public class Order {
    private int id;
    private Product product;
    private Customer customer;
    private Date date;
    private String status;

    public Order() {
    }

    public Order(Product product, Customer customer, Date date, String status) {
        this.product = product;
        this.customer = customer;
        this.date = date;
        this.status = status;
    }
}
