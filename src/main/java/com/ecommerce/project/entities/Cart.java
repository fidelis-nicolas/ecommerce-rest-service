package com.ecommerce.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Customer customer;
    private Product product;

    public Cart() {
    }

    public Cart(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", customer=" + customer +
                ", product=" + product +
                '}';
    }
}
