package com.example.breakableToy.Controller;
import com.example.breakableToy.Model.Product;
import com.example.breakableToy.Services.ProductManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/products")
public class Controller {
    @Autowired
    ProductManager productManager;
    @GetMapping("/hello/{name}")
    public String sayHello(@RequestParam(name = "param1",required = true) int hola, int param2, @PathVariable(name = "name") String name) {
        System.out.println(name+" "+hola+" "+param2);
        return "Hello, World!";
    }
    @GetMapping("/getProducts")
    public ArrayList<Product> getProducts(){
        return productManager.getProducts();
    }
    @PostMapping()
    public boolean addProduct(@RequestBody Product product){
        System.out.println(product);
        return productManager.addProduct(product.getName(),product.getCategory(),product.getPrice(),product.getStock());
    }

}
