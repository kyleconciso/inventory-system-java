/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.errors;

/**
 *
 * @author psalm
 */
public class NonexistentUser extends Exception
{
    public NonexistentUser() {
        super("User does not exist.");
    }
}