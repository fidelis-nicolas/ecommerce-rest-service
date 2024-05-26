package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{


    @Autowired
    private EntityManager entityManager;//Attribute inject is not the best


    @Override
    public Product getProductById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public Product upload(Product product) {
        Product newProduct = entityManager.merge(product);
        return newProduct;
    }

    @Override
    public List<Product> getAllProducts() {
        TypedQuery<Product> allProducts = entityManager.createQuery("FROM Product", Product.class);
        List<Product> productList = allProducts.getResultList();
        return productList;
    }

    @Override // needs to mirror admin
    public Product updateProduct(int id) {
        return null;
    }

    @Override
    public List<Product> searchProduct(String productName) {
        return null;
    }

    @Override
    public void deleteProduct(int id) {
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
    }




}
