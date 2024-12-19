package com.example.breakableToy.Controller;

import com.example.breakableToy.Model.Product;
import com.example.breakableToy.Repository.ProductManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/api")
public class Controller {
    ProductManager productManager = new ProductManager();
    @PostMapping("/createProduct")
    public String newProduct(@RequestBody String name, String category, double price, long stock){
        productManager.addProduct(name, category, price, stock);
        return "Added";
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
