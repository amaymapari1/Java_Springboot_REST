package com.amay.myWebApp.controller;

import com.amay.myWebApp.model.Product;
import com.amay.myWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodID}")
    public Product getProductById(@PathVariable int prodID){
        return service.getProductById(prodID);

    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod ){
         service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteProduct(@PathVariable int prodID){
        service.deleteProduct(prodID);
    }
}
