package com.ecommerce.project.service;

import com.ecommerce.project.DAO.OrderDAO;
import com.ecommerce.project.entities.Order;
import com.ecommerce.project.errors.CustomerErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements  OrderService{
    @Autowired
    OrderDAO orderDAO;
    @Override
    @Transactional
    public Order createOrder(int customerID) throws CustomerErrors {
        return orderDAO.createOrder(customerID);
    }
}
