package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Cart;
import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.entities.Product;
import com.ecommerce.project.errors.ProductErrors;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO{
    private EntityManager entityManager;
    @Autowired
    public CartDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public Cart addCart(int productId, int customerId) throws ProductErrors {
        Customer customer1 = entityManager.find(Customer.class, customerId);
        Product product= entityManager.find(Product.class, productId);

        if(customer1 == null && product == null){
            throw  new ProductErrors("Customer or product id does not exist!!");
        }

        Cart cart = new Cart(customer1, product);


        return entityManager.merge(cart);
    }

    @Override
    public Cart findById(int id) {
        return null;
    }
}
