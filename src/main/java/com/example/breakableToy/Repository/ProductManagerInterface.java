package com.example.breakableToy.Repository;

import com.example.breakableToy.Model.Product;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public interface ProductManagerInterface {
    ArrayList<Product> getProducts();
    boolean addProduct(String name, String category, double price, long stock);
    void updateName(int id, String newName);
    void updateCategory(int id, String newCategory);
    void updatePrice(int id, double newPrice);
    void updateStock(int id, long newStock);
    void updateExpirationDate(int id, LocalDate newExpiration);
    ArrayList<String> getNames();
    ArrayList<String> getCategories();
    ArrayList<Double> getPrice();
    ArrayList<Long> getStock();
    String getCategory(int id);
}
