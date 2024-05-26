package com.ecommerce.project.controller;

import com.ecommerce.project.entities.Product;
import com.ecommerce.project.errors.ProductErrors;
import com.ecommerce.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/product")
public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("upload")
    public Product uploadProduct(@RequestBody Product product){
        return productService.upload(product);
    }

    @GetMapping("product/{productId}")
    public Product getProductById(@PathVariable int productId) throws ProductErrors {
        return productService.getProductById(productId);
    }
    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PutMapping("productupdate")
    public Product productUpdate(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("delete/{productId}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }



}
