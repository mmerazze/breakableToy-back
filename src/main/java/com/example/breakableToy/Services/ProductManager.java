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
    public boolean updateName(int id, String newName){
        boolean resp=false;
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editName(newName);
                resp = true;
                break;
            }
        }
        return resp;
    }
    public boolean updateCategory(int id, String newCategory){
        boolean resp = false;
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editCategory(newCategory);
                resp=true;
                break;
            }
        }
        return resp;
    }
    public boolean updatePrice(int id, double newPrice){
        boolean resp = false;
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editPrice(newPrice);
                resp = true;
                break;
            }
        }
        return resp;
    }
    public boolean updateStock(int id, long newStock){
        boolean resp = false;
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editStock(newStock);
                resp = true;
                break;
            }
        }
        return resp;
    }
    public boolean updateExpirationDate(int id, LocalDate newExpiration){
        boolean resp = false;
        for(Product prod : products){
            if(prod.getId() == id) {
                prod.editExpirationDate(newExpiration);
                resp = true;
                break;
            }
        }
        return resp;
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
