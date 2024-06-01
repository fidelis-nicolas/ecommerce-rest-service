package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Cart;
import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.entities.Order;
import com.ecommerce.project.errors.CustomerErrors;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    CartDAO cartDAO;
    @Override
    public Order createOrder(int customerID) throws CustomerErrors {
        Customer customer = customerDAO.getCustomerById(customerID);
        if(customer == null){
            throw new CustomerErrors("Customer not found");
        }

        String query = "SELECT c FROM Cart c WHERE c.customer.id = :customerId";

        List<Cart> carts = entityManager.createQuery(query, Cart.class).setParameter("customerId", customerID).getResultList();
        if(carts.isEmpty()){
            throw new CustomerErrors("Cart is empty");
        }
        Order order  = new Order();
        Date date = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        order.setCustomer(customer);
        order.setCarts(carts);
        order.setDate(date);


        return  entityManager.merge(order);
    }
}
