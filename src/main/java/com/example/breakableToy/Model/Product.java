package com.example.breakableToy.Model;

import java.time.LocalDate;

public class Product {
    private int id=0;
    private long stock;
    private String name, category;
    private double price;
    private LocalDate expirationDate, creationDate, updateDate;
    public Product(){
        this.id += id;
        id++;
        this.creationDate = LocalDate.now();
        this.updateDate = LocalDate.now();
    }
    public Product(String name, String category, double price, long stock){
        this.id += id;
        id++;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.creationDate = LocalDate.now();
        this.updateDate = LocalDate.now();
    }
    public Product(String name, String category, double price, long stock, LocalDate expiration){
        this.id += id;
        id++;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.expirationDate = expiration;
        this.creationDate = LocalDate.now();
        this.updateDate = LocalDate.now();
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public long getStock(){
        return stock;
    }
    public LocalDate getExpirationDate(){
        return expirationDate;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public LocalDate getUpdateDate() {
        return updateDate;
    }
    public void editName(String newName){
        this.name = newName;
        this.updateDate = LocalDate.now();
    }
    public void editCategory(String newCategory){
        this.category = newCategory;
        this.updateDate = LocalDate.now();
    }
    public void editPrice(double newPrice){
        this.price = newPrice;
        this.updateDate = LocalDate.now();
    }
    public void editStock(long newStock){
        this.stock = newStock;
        this.updateDate = LocalDate.now();
    }
    public void editExpirationDate(LocalDate newExpirationDate){
        this.expirationDate = newExpirationDate;
        this.updateDate = LocalDate.now();
    }


}
