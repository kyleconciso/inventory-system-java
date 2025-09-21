
package app;

import libs.core.*;
import libs.errors.*;
import app.*;
import app.forms.CheckoutAdd;

import java.util.*;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author psalm
 */
public class CheckoutPanel extends javax.swing.JFrame {
    // Data states
    Inventory inventory = AppStateManager.loadInventory();
    Accounts accounts = AppStateManager.loadAccounts();
    Session session = AppStateManager.loadSession();
    Cart cart = AppStateManager.loadCart();

    // Constants
    Product selectedProduct;
 
    public CheckoutPanel() {
        initComponents();
        
        // Update profile indicator
        this.profileLabel.setText("Hello, " + session.getUser().getName());
        
        // Update table
        this.updateTable();
        
        // MANAGEMENT
        // Action listener for cells
        this.managementTable.addMouseListener(
            new MouseAdapter() {
                CheckoutPanel checkoutPanel;
                private MouseAdapter init (CheckoutPanel um) {
                    this.checkoutPanel = um;
                    return this;
                }
                @Override
                public void mouseClicked(MouseEvent e){
                    Product product = (Product) managementTable.getValueAt(managementTable.getSelectedRow(), 5);
                    checkoutPanel.updateInfo(product);
                }
            }.init(this)
        );
    }
    
    public void addToCart(Product product, int quantity) {
        cart.add(product, quantity);
        this.updateTable();
    }
    
    public void updateInfo(Product product){
        this.selectedProduct = product;
        this.deleteSelectedButton.setEnabled(true);
    }
    
    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) this.managementTable.getModel();
        
        // Clear rows
        model.setRowCount(0);
            
        // Iterate product-quantity pairs
        for (Map.Entry<Product, Integer> entry : this.cart.getCart().entrySet()) {
            Product p = entry.getKey();
            Integer v = entry.getValue();
            
            // Enable control
            this.initiateButton.setEnabled(true);
            this.clearButton.setEnabled(true);

            // Generate rows
            model.addRow(new Object[]{
                p.getName(),
                p.getBrand(),
                v,
                "P"+p.getPrice(),
                "P"+(p.getPrice()*v),
                p
            });
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        profileLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managementTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        deleteSelectedButton = new javax.swing.JButton();
        initiateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        signoutButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("App-Based Inventory System");

        jLabel4.setText("Checkout Panel");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        profileLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        profileLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profileLabel.setText("Hello, User A. Name!");

        managementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Brand", "Quantity", "Unit Price", "Total Price", "Product"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managementTable);

        jButton2.setText("Add Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deleteSelectedButton.setText("Delete Selected");
        deleteSelectedButton.setEnabled(false);
        deleteSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedButtonActionPerformed(evt);
            }
        });

        initiateButton.setText("Initiate Transaction");
        initiateButton.setEnabled(false);
        initiateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initiateButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setEnabled(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        signoutButton.setText("Sign Out");
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        jButton7.setText("Inventory >>");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSelectedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(initiateButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signoutButton))
                            .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profileLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(signoutButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(deleteSelectedButton)
                    .addComponent(initiateButton)
                    .addComponent(clearButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Dispose
        this.dispose();
        CheckoutAdd.main(null); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedButtonActionPerformed

        // Remove to cart, restock to inventory
        this.inventory.stock(this.selectedProduct, this.cart.getCart().get(this.selectedProduct));
        this.cart.remove(this.selectedProduct);
        
        // Disable seperate control
        this.deleteSelectedButton.setEnabled(false);

        // Data states
        AppStateManager.saveInventory(this.inventory);
        AppStateManager.saveCart(this.cart);
        
        // Update table
        this.updateTable();
    }//GEN-LAST:event_deleteSelectedButtonActionPerformed

    private void initiateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initiateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.managementTable.getModel();
        
        // Clear cart
        this.cart.getCart().clear();

        // Clear rows
        model.setRowCount(0);
        
        // Disable controls
        this.initiateButton.setEnabled(false);
        this.clearButton.setEnabled(false);
        this.deleteSelectedButton.setEnabled(false);
        
        // Data states
        AppStateManager.saveInventory(this.inventory);
        AppStateManager.saveCart(this.cart);

        // Notification
        JOptionPane.showMessageDialog(null, "The transaction has been successfully completed..", "Checkout Panel", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_initiateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.managementTable.getModel();

        // Iterate product-quantity pairs, add back to inventory, clear cart
        for (Map.Entry<Product, Integer> entry : this.cart.getCart().entrySet()) {
            Product p = entry.getKey();
            Integer v = entry.getValue();
            inventory.stock(p, v);
        }
        this.cart.getCart().clear();

        // Clear rows
        model.setRowCount(0);
        
        // Disable controls
        this.initiateButton.setEnabled(false);
        this.clearButton.setEnabled(false);
        this.deleteSelectedButton.setEnabled(false);
        
        // Data states
        AppStateManager.saveInventory(this.inventory);
        AppStateManager.saveCart(this.cart);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        // Data states
        AppStateManager.saveAccounts(this.accounts);
        AppStateManager.saveInventory(this.inventory);
        AppStateManager.saveSession(new Session(null));
        
        // Dispose
        this.dispose();
        Login.main(null);
    }//GEN-LAST:event_signoutButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Data states
        AppStateManager.saveAccounts(this.accounts);
        AppStateManager.saveInventory(this.inventory);
        
        // Dispose
        this.dispose();
        InventoryManagement.main(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        FlatMacLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CheckoutPanel app = new CheckoutPanel();
                app.setVisible(true);
                app.setDefaultCloseOperation(EXIT_ON_CLOSE);
                app.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteSelectedButton;
    private javax.swing.JButton initiateButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managementTable;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton signoutButton;
    // End of variables declaration//GEN-END:variables
}
