
package app.forms;

import app.*;
import libs.core.*;
import libs.errors.*;
import app.*;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import libs.core.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import java.util.UUID;
/**
 *
 * @author psalm
 */
public class CheckoutAdd extends javax.swing.JFrame {
    // Data states
    Inventory inventory = AppStateManager.loadInventory();
    Accounts accounts = AppStateManager.loadAccounts();
    Cart cart = AppStateManager.loadCart();

    // Constants
    Product selectedProduct;
    
    public CheckoutAdd() {
        initComponents();
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerUserButton = new javax.swing.JButton();
        registerAdminButton = new javax.swing.JButton();
        quantityTextField = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        skuTextField = new javax.swing.JTextField();
        selectedNameLabel = new javax.swing.JLabel();
        selectedBrandLabel = new javax.swing.JLabel();
        selectedPriceLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        registerUserButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        selectedQuantityLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("App-Based Inventory System");

        jLabel4.setText("Add Product to Checkout");

        jLabel2.setText("Quantity");

        registerUserButton.setText("Add Product");
        registerUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserButtonActionPerformed(evt);
            }
        });

        registerAdminButton.setText("Cancel");
        registerAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAdminButtonActionPerformed(evt);
            }
        });

        quantityTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        quantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Input SKU");

        jLabel1.setText("Name:");

        jLabel5.setText("Brand:");

        jLabel13.setText("Price:");

        jLabel14.setText("Total Price");

        selectedNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        selectedBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        selectedPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        registerUserButton1.setText("Check");
        registerUserButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Quantity:");

        selectedQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(registerUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(skuTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerUserButton1))
                            .addComponent(registerAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectedNameLabel)
                                    .addComponent(selectedPriceLabel)
                                    .addComponent(selectedBrandLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalPriceLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectedQuantityLabel))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(skuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerUserButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)))
                        .addGap(4, 4, 4)
                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectedNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedBrandLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(selectedQuantityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedPriceLabel)
                            .addComponent(jLabel13))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(registerUserButton)
                            .addComponent(totalPriceLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerAdminButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserButtonActionPerformed
        int quantity = Integer.parseInt(this.quantityTextField.getText());
        if (this.selectedProduct != null) {
            try {
                // Take inventory, put cart
                inventory.take(selectedProduct, quantity);
                this.cart.add(selectedProduct, quantity);
                
                // Data states
                AppStateManager.saveInventory(this.inventory);
                AppStateManager.saveCart(this.cart);

                // Dispose
                this.dispose();
                CheckoutPanel.main(null);
                
            } catch (OverdrawError o) {
                // Notification
                JOptionPane.showMessageDialog(null, "Quantity requested exceeds available inventory.", "Add Product to Checkout", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        

    }//GEN-LAST:event_registerUserButtonActionPerformed

    private void registerAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAdminButtonActionPerformed
        // Dispose
        this.dispose();
        CheckoutPanel.main(null);
    }//GEN-LAST:event_registerAdminButtonActionPerformed

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldActionPerformed

    private void registerUserButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserButton1ActionPerformed
        Product product = inventory.findBySku(this.skuTextField.getText());
        this.selectedProduct = product;

        if (product != null) {
            // Update product info
            this.selectedNameLabel.setText(product.getName());
            this.selectedBrandLabel.setText(product.getBrand());
            this.selectedPriceLabel.setText(Double.toString(product.getPrice()));
            this.selectedNameLabel.setText(product.getName());
            this.selectedQuantityLabel.setText(Integer.toString(product.getQuantity()));
            
            if (!this.quantityTextField.getText().equals("")) {
                this.totalPriceLabel.setText(""+product.getPrice()*(Double.parseDouble(this.quantityTextField.getText())));
            }
        } else {
            this.selectedNameLabel.setText("");
            this.selectedBrandLabel.setText("");
            this.selectedPriceLabel.setText("");
            this.selectedNameLabel.setText("");
            this.selectedQuantityLabel.setText("");
        }
    }//GEN-LAST:event_registerUserButton1ActionPerformed


    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        FlatMacLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CheckoutAdd app = new CheckoutAdd();
                app.setVisible(true);
                app.setDefaultCloseOperation(EXIT_ON_CLOSE);
                app.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField quantityTextField;
    private javax.swing.JButton registerAdminButton;
    private javax.swing.JButton registerUserButton;
    private javax.swing.JButton registerUserButton1;
    private javax.swing.JLabel selectedBrandLabel;
    private javax.swing.JLabel selectedNameLabel;
    private javax.swing.JLabel selectedPriceLabel;
    private javax.swing.JLabel selectedQuantityLabel;
    private javax.swing.JTextField skuTextField;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
