package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Order;
import com.ecommerce.project.errors.CustomerErrors;

public interface OrderDAO {
    Order createOrder(int customerID) throws CustomerErrors;
}
