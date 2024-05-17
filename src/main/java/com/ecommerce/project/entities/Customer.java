package com.ecommerce.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "name")
    private String customerName;
    @Column(name = "email")
    private String customerEmail;
    @Column(name = "address")
    private String customerAddress;
    @Column(name = "password")
    private String cutomerPassword;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCutomerPassword() {
        return cutomerPassword;
    }

    public void setCutomerPassword(String cutomerPassword) {
        this.cutomerPassword = cutomerPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", cutomerPassword='" + cutomerPassword + '\'' +
                '}';
    }
}
