package com.ecommerce.project.service;

import com.ecommerce.project.DAO.CartDAO;
import com.ecommerce.project.entities.Cart;
import com.ecommerce.project.errors.ProductErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CartServiceImpl implements  CartService{
    @Autowired
    private CartDAO cartDAO;
    @Override
    @Transactional
    public Cart addCart(int productID, int customerID) throws ProductErrors {
        return  cartDAO.addCart(productID, customerID);
    }

    @Override
    public Cart findById(int id) {
        return null;
    }
}
