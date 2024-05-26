package com.ecommerce.project.service;

import com.ecommerce.project.DAO.ProductDAO;
import com.ecommerce.project.entities.Product;
import com.ecommerce.project.errors.ProductErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductDAO productDAO;

    @Autowired
    ProductServiceImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }
    @Override
    public Product getProductById(int id) throws ProductErrors {
        Product product = productDAO.getProductById(id);
        if (product == null){
            throw new ProductErrors("Product with " + id + " does not exist");
        }
        return product;
    }

    @Override
    @Transactional
    public Product upload(Product product) {
        return productDAO.upload(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public List<Product> searchProduct(String productName) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
