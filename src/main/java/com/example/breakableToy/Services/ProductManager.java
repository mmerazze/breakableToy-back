package com.example.breakableToy.Services;
import com.example.breakableToy.Model.Product;
import com.example.breakableToy.Repository.ProductManagerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class ProductManager implements ProductManagerInterface {
    public ArrayList<Product> products;
    public ProductManager(){
        this.products = new ArrayList<Product>();
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    public boolean addProduct(String name, String category, double price, long stock) {
        Product newProduct = new Product(name, category, price, stock);
        this.products.add(newProduct);
        return true;
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
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        for(Product prod : products){
            names.add(prod.getName());
        }
        return names;
    }
    public ArrayList<String> getCategories(){
        ArrayList<String> categories = new ArrayList<>();
        for(Product prod : products){
            categories.add(prod.getCategory());
        }
        return categories;
    }
    public ArrayList<Double> getPrice(){
        ArrayList<Double> prices = new ArrayList<>();
        for(Product prod : products){
            prices.add(prod.getPrice());
        }
        return prices;
    }
    public ArrayList<Long> getStock(){
        ArrayList<Long> stock = new ArrayList<>();
        for(Product prod : products){
            stock.add(prod.getStock());
        }
        return stock;
    }
    public String getCategory(int id){
        String resp = "";
        for(Product prod : products){
            if(prod.getId() == id)
                resp = prod.getCategory();
        }
        return resp;
    }
}
