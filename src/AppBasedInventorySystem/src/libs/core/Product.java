/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.core;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author psalm
 */
public class Product implements Serializable {
    String name;
    String brand;
    String description;
    String sku;
    int quantity;
    double price;
    
    public Product(String name, String brand, String description, int quantity, double price){
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.sku = UUID.randomUUID().toString().replace("-","").substring(0,8);
    }
    
    public Product(String name, String brand, String description, int quantity, double price, String sku){
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.sku = sku;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getSku() {
        return this.sku;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public double getPrice() {
        return this.price;
    }
}
