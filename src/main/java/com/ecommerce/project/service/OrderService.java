package com.ecommerce.project.service;

import com.ecommerce.project.entities.Order;
import com.ecommerce.project.errors.CustomerErrors;

public interface OrderService {
    Order createOrder(int customerID) throws CustomerErrors;
}
