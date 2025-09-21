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
public class Session implements Serializable {
    User user;
    public Session (User user) {
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
    }
}
