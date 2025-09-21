/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.core;

import java.util.HashMap;
import java.io.*;
import java.util.Map;

/**
 *
 * @author psalm
 */
public class Cart implements Serializable {
    HashMap<Product, Integer> cart;
    
    public Cart() {
        this.cart = new HashMap<>();
    }
    
    public void add(Product product, int quantity){
        // Iterate product-quantity pairs, check if exists already
        for (Map.Entry<Product, Integer> entry : this.cart.entrySet()) {
            Product p = entry.getKey();
            Integer v = entry.getValue();
            if (product.getSku() == p.getSku()) {
                this.cart.put(p, v+quantity);
                return;
            }
        }
        this.cart.put(product, quantity);
    }
    
    public void remove(Product product){
        // Iterate product-quantity pairs, check if exists already
        this.cart.remove(product);
    }
    
    public HashMap<Product, Integer> getCart(){
        return this.cart;
    }
}
