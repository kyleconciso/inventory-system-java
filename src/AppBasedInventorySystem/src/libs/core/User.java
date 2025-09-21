/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.core;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author psalm
 */
public class User implements Serializable {
    int id;
    int role; 
    String name;
    String username;
    String password;
    
    public User(int id, int role, String name, String username, String password) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername (String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    public boolean comparePassword(String password) {
        return this.password.equals(password);
    }
    
    public int getRole() {
        return this.role;
    }
    
    public String getRoleName() {
        HashMap<Integer, String> roleNames = new HashMap<>();
        roleNames.put(0, "Admin");
        roleNames.put(1, "User");
        return roleNames.get(this.role);
    }
}
