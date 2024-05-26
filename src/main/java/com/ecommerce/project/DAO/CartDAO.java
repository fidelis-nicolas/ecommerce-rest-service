package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Cart;
import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.entities.Product;
import com.ecommerce.project.errors.ProductErrors;

public interface CartDAO {
 Cart addCart(int productID, int customerID) throws ProductErrors;
 Cart findById(int id);
}
