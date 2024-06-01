package com.ecommerce.project.controller;

import com.ecommerce.project.entities.Order;
import com.ecommerce.project.errors.CustomerErrors;
import com.ecommerce.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderRestController {

    @Autowired
    OrderService orderService;
    @PostMapping("addorder")
    public Order addNewOrder(@RequestParam int customerId) throws CustomerErrors {
        return orderService.createOrder(customerId);
    }
}
