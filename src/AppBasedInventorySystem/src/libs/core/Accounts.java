
package libs.core;

import libs.errors.*;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author psalm
 */


public class Accounts implements Serializable {
    ArrayList<User> accounts = new ArrayList<>();
    
    public User login(String username, String password) throws InvalidUserPassword, NonexistentUser {
        for (User u : accounts) {
            if (u.username.equals(username) && u.comparePassword(password)) {
                return u;
            } else if (u.username.equals(username)) {
                throw new InvalidUserPassword();
            }
        }
        throw new NonexistentUser();
    }
    
    public void register(User user) throws UserAlreadyExists {
        for (User u : accounts) {
            if (u.getUsername().equals(user.username)) {
                throw new UserAlreadyExists(user.username);
            }
        }
        accounts.add(user);
    }
    
    public void remove(User user) {
        this.accounts.remove(user);
    }
    
    public void removeByUsername(String username) {
        for (User u : accounts) {
            if (u.username.equals(username)) {
                this.accounts.remove(u);
                break;
            }
        }
    }
    
    public ArrayList<User> getAccounts() {
        return accounts;
    }
}
