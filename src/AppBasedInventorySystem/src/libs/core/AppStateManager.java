/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.core;

import java.io.*;

/**
 *
 * @author psalm
 */
public final class AppStateManager {
    
    public static Inventory loadInventory(){
        Inventory inventory;
        try {
            FileInputStream fileIn = new FileInputStream("src/data/inventory.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            inventory = (Inventory) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            inventory = new Inventory();
        } catch (ClassNotFoundException c) {
            inventory = new Inventory();
        }
        return inventory;
    }
    
    public static Accounts loadAccounts(){
        Accounts accounts;
        try {
            FileInputStream fileIn = new FileInputStream("src/data/accounts.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accounts = (Accounts) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            accounts = new Accounts();
        } catch (ClassNotFoundException c) {
            accounts = new Accounts();
        }
        return accounts;
    }
    
    public static Session loadSession(){
        Session session;
        try {
            FileInputStream fileIn = new FileInputStream("src/data/session.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            session = (Session) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            session = new Session(null);
        } catch (ClassNotFoundException c) {
            session = new Session(null);
        }
        return session;
    }
    
    public static Cart loadCart(){
        Cart cart;
        try {
            FileInputStream fileIn = new FileInputStream("src/data/cart.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cart = (Cart) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            cart = new Cart();
        } catch (ClassNotFoundException c) {
            cart = new Cart();
        }
        return cart;
    }
    
    public static void saveInventory(Inventory inventory){
        try {
            FileOutputStream fileOut = new FileOutputStream("src/data/inventory.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(inventory);
            out.close();
            fileOut.close();
            
        } catch (IOException i){}
    }
    
    public static void saveAccounts(Accounts accounts){
        try {
            FileOutputStream fileOut = new FileOutputStream("src/data/accounts.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(accounts);
            out.close();
            fileOut.close();
            
        } catch (IOException i){}
    }
    
    public static void saveSession(Session session){
        try {
            FileOutputStream fileOut = new FileOutputStream("src/data/session.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(session);
            out.close();
            fileOut.close();
            
        } catch (IOException i){}
    }
    
    
    public static void saveCart(Cart cart){
        try {
            FileOutputStream fileOut = new FileOutputStream("src/data/cart.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cart);
            out.close();
            fileOut.close();
            
        } catch (IOException i){}
    }
    
    
    
    public static void save(Inventory inventory, Accounts accounts){
        saveInventory(inventory);
        saveAccounts(accounts);
    }
}
