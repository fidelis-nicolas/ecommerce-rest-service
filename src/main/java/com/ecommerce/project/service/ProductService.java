package com.ecommerce.project.service;

import com.ecommerce.project.entities.Product;
import com.ecommerce.project.errors.ProductErrors;

import java.util.List;

public interface ProductService {
    Product getProductById(int id) throws ProductErrors;

    Product upload(Product product);
    List<Product> getAllProducts();

    Product updateProduct(Product product);
    List<Product> searchProduct(String productName);
    void deleteProduct(int id);
}
