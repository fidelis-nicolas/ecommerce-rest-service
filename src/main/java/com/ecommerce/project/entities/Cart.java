package com.ecommerce.project.entities;

public class Cart {
    private int id;
    private Customer customer;
    private Product product;

    public Cart() {
    }

    public Cart(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }
}
