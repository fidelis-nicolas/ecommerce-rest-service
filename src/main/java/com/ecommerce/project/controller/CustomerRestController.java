package com.ecommerce.project.controller;

import com.ecommerce.project.DAO.CustomerDAO;
import com.ecommerce.project.DAO.CustomerDAOImpl;
import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/customer")
public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("register")
    public Customer registerCustomer(@RequestBody Customer customer){
        return customerService.register(customer);
    }

    @GetMapping("customer/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        return customerService.getCustomerById(customerId);
    }
    @GetMapping("customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }
    @PostMapping("login")
    public Customer login(@RequestBody Customer customer){
        String email = customer.getCustomerEmail();
        String passwrod = customer.getCutomerPassword();
        return customerService.login(email, passwrod);
    }
    @DeleteMapping("delete/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }


    // Search, update

}
