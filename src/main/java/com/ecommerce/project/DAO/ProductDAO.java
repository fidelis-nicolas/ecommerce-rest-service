package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.entities.Product;

import java.util.List;

public interface ProductDAO {
    Product getProductById(int id);
    Product upload(Product product);

    List<Product> getAllProducts();

    Product updateProduct(int id);
    List<Product> searchProduct(String productName);
    void deleteProduct(int id);

}
