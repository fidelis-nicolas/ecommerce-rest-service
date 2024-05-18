package com.ecommerce.project.service;

import com.ecommerce.project.DAO.CustomerDAO;
import com.ecommerce.project.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerDAO customerDAO;

    @Autowired
    CustomerServiceImpl(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }
    @Override
    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }

    @Override
    public Customer login(String email, String password) {
        return customerDAO.login(email, password);
    }

    @Override
    @Transactional
    public Customer register(Customer customer) {
        return customerDAO.register(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }

    @Override
    public List<Customer> searchCustomer(String customerName) {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public Customer updateCustomer(int id) {
        return null;
    }
}
