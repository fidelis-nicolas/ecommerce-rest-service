package com.ecommerce.project.service;

import com.ecommerce.project.entities.Cart;
import com.ecommerce.project.errors.ProductErrors;

public interface CartService {
    Cart addCart(int productID, int customerID) throws ProductErrors;
    Cart findById(int id);
}
