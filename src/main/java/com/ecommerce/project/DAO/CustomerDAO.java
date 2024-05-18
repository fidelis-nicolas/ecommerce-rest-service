package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer getCustomerById(int id);
    Customer login(String email, String password);
    Customer register(Customer customer);
    List<Customer> getAllCustomer();
    List<Customer> searchCustomer(String customerName);
    void deleteCustomer(int id);
    Customer updateCustomer(int id);

}
