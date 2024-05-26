package com.ecommerce.project.controller;

import com.ecommerce.project.entities.Cart;
import com.ecommerce.project.errors.ProductErrors;
import com.ecommerce.project.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cart")
public class CartRestController {
    @Autowired
    CartService cartService;

    @PostMapping("newcart")
    public Cart addToCart(@RequestParam int productId, @RequestParam int customerId) throws ProductErrors {
        return cartService.addCart(productId, customerId);
    }
}
