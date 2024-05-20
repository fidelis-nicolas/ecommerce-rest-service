package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{


    @Autowired
    private EntityManager entityManager;//Attribute inject is not the best


    @Override
    public Customer getCustomerById(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        return customer;
    }

    @Override
    public Customer login(String email, String password) {
        Customer customer1 = (Customer) entityManager.createQuery("SELECT c FROM Customer c WHERE c.customerEmail = :email and c.customerPassword = :password")
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();
        return customer1;

    }

    @Override
    public Customer register(Customer customer) {
        Customer newCustomer = entityManager.merge(customer);
        return newCustomer;
    }

    @Override
    public List<Customer> getAllCustomer() {
        TypedQuery<Customer> allCustomers = entityManager.createQuery("FROM Customer", Customer.class);
        List<Customer> customerList = allCustomers.getResultList();
        return customerList;
    }

    @Override
    public List<Customer> searchCustomer(String customerName) {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        entityManager.remove(customer);
    }

    @Override
    public Customer updateCustomer(int id) {
        return null;
    }


}
