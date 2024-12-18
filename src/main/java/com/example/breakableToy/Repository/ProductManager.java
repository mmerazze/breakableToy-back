package com.example.breakableToy.Repository;
import com.example.breakableToy.Model.Product;

import java.time.LocalDate;
import java.util.*;

public class ProductManager implements ProductManagerInterface{
    public ArrayList<Product> products;
    public ProductManager(){
        this.products = new ArrayList<Product>();
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    public void addProduct(String name, String category, double price, long stock) {
        Product newProduct = new Product(name, category, price, stock);
        this.products.add(newProduct);
    }
    public void updateName(int id, String newName){
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editName(newName);
                break;
            }
        }
    }
    public void updateCategory(int id, String newCategory){
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editCategory(newCategory);
                break;
            }
        }
    }
    public void updatePrice(int id, double newPrice){
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editPrice(newPrice);
                break;
            }
        }
    }
    public void updateStock(int id, long newStock){
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editStock(newStock);
                break;
            }
        }
    }
    public void updateExpirationDate(int id, LocalDate newExpiration){
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editExpirationDate(newExpiration);
                break;
            }
        }
    }

}
