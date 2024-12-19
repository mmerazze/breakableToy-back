package com.example.breakableToy.Repository;

import com.example.breakableToy.Model.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ProductManagerInterface {
    public ArrayList<Product> getProducts();
    public void addProduct(String name, String category, double price, long stock);
    public void updateName(int id, String newName);
    public void updateCategory(int id, String newCategory);
    public void updatePrice(int id, double newPrice);
    public void updateStock(int id, long newStock);
    public void updateExpirationDate(int id, LocalDate newExpiration);
    public ArrayList<String> getNames();
    public ArrayList<String> getCategories();
    public ArrayList<Double> getPrice();
    public ArrayList<Long> getStock();
    public String getCategory(int id);
}
