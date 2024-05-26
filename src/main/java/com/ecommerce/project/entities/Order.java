package com.ecommerce.project.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer_order")
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private int id;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Cart> carts;
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart order;

    @ManyToOne
    private Customer customer;

    private Date date;
    private String status;

    public Order() {
    }

    public Order(List<Cart> carts, Customer customer, Date date, String status) {
        this.carts = carts;
        this.customer = customer;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", carts=" + carts +
                ", customer=" + customer +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
