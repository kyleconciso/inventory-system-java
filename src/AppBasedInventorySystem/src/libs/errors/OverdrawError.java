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
public class OverdrawError extends Exception
{
    public OverdrawError() {
        super("Withdrawal exceeds available inventory.");
    }
}