package com.ecommerce.project.entities;

public class Admin {
    private int id;
    private String userName;
    private String password;

    public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
