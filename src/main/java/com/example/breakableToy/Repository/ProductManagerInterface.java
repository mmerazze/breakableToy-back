package com.example.breakableToy.Repository;

import com.example.breakableToy.Model.Product;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public interface ProductManagerInterface {
    ArrayList<Product> getProducts();
    boolean addProduct(String name, String category, double price, long stock);
    boolean updateName(int id, String newName);
    boolean updateCategory(int id, String newCategory);
    boolean updatePrice(int id, double newPrice);
    boolean updateStock(int id, long newStock);
    boolean updateExpirationDate(int id, LocalDate newExpiration);
    ArrayList<String> getNames();
    ArrayList<String> getCategories();
    ArrayList<Double> getPrice();
    ArrayList<Long> getStock();
    String getCategory(int id);
}
