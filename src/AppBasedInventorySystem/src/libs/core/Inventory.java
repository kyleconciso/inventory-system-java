
package libs.core;

import libs.errors.*;

import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author psalm
 */
public class Inventory implements Serializable {
    ArrayList<Product> products = new ArrayList<>();
    
    public Inventory() {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }
    
    public void setQuantity(Product product, int quantity) {
        product.quantity = quantity;
        if (quantity <= 0) {
            this.products.remove(product);
        }
    }
    
    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public void take(Product product, int quantity) throws OverdrawError {
        if (quantity>product.getQuantity()) {
            throw new OverdrawError();
        } else {
            int result = product.getQuantity() - quantity;
            product.setQuantity(result);
            if (result==0) {
                this.remove(product);
            }
        }
    }
    
    public void stock(Product product, int quantity) {
        for (Product p : this.products) {
            if (p.getSku().equals(product.getSku())) {
                p.quantity = p.quantity + quantity;
                return;
            }
        }
        product.setQuantity(quantity);
        this.addProduct(product);
    }
    
    public void remove(Product product) {
        this.products.remove(product);
    }
    
    public void removeBySku(String sku) {
        for (Product p : this.products) {
            if (p.getSku().equals(sku)) {
                this.products.remove(p);
                break;
            }
        }
    }
    
    public Product findBySku(String sku) {
        for (Product p : this.products) {
            if (p.getSku().equals(sku)) {
                return p;
            }
        }
        return null;
    }
    
}
