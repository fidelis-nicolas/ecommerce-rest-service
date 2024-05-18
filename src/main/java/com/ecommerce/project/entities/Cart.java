package com.ecommerce.project.entities;

import jakarta.persistence.*;

//@Entity
//@Table(name = "cart")
public class Cart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int order_id;

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id")
    private Order order;

    public Cart() {
    }

    public Cart(Customer customer, Product product, Order order) {
        this.customer = customer;
        this.product = product;
        this.order = order;
    }

    public int getId() {
        return order_id;
    }

    public void setId(int id) {
        this.order_id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
                "id=" + order_id +
                ", customer=" + customer +
                ", product=" + product +
                '}';
    }
}
