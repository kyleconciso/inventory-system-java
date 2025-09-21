
package app;

import libs.core.*;
import libs.errors.*;
import app.*;
import app.forms.*;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import libs.core.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
/**
 *
 * @author psalm
 */
public class UserManagement extends javax.swing.JFrame {
    // Data states
    Accounts accounts = AppStateManager.loadAccounts();
    Inventory inventory = AppStateManager.loadInventory();
    Session session = AppStateManager.loadSession();
    
    
    // Management
    User selectedUser;

    public UserManagement() {
        initComponents();
        
        // Update profile indicator
        System.out.println(session.getUser());
        this.profileLabel.setText("Hello, " + session.getUser().getName());
        
        // MANAGEMENT
        // Action listener for cells
        this.managementTable.addMouseListener(
            new MouseAdapter() {
                UserManagement userManagement;
                private MouseAdapter init (UserManagement um) {
                    this.userManagement = um;
                    return this;
                }
                @Override
                public void mouseClicked(MouseEvent e){
                    User user = (User) managementTable.getValueAt(managementTable.getSelectedRow(), 3);
                    userManagement.updateInfo(user);
                }
            }.init(this)
        );
        
        // Update table
        this.updateTable();
    }
    
    // MANAGEMENT
    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) this.managementTable.getModel();
        // Clear rows
        model.setRowCount(0);
        // Generate rows
        for (User u : accounts.getAccounts()) {
            model.addRow(new Object[]{
                u.getName(),
                u.getUsername(),
                u.getRoleName(),
                u
            });
            System.out.println("pass");
        }
    }
    
    private void updateInfo(User user) {
        // Update variables
        this.selectedUser = user;
        
        // Update selected info labels
        this.selectedNameLabel.setText(user.getName());
        this.selectedUsernameLabel.setText(user.getUsername());
        this.selectedRoleLabel.setText(user.getRoleName());
        
        // Enable controls
        this.editInformationButton.setEnabled(true);
        this.removeUserButton.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        managementTable = new javax.swing.JTable();
        editInformationButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signoutButton = new javax.swing.JButton();
        profileLabel = new javax.swing.JLabel();
        selectedNameLabel = new javax.swing.JLabel();
        selectedUsernameLabel = new javax.swing.JLabel();
        selectedRoleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        managementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Role", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managementTable);
        if (managementTable.getColumnModel().getColumnCount() > 0) {
            managementTable.getColumnModel().getColumn(3).setResizable(false);
            managementTable.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        editInformationButton.setText("Edit Information");
        editInformationButton.setEnabled(false);
        editInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInformationButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Username:");

        jLabel8.setText("Role:");

        jButton6.setText("Register New User");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        removeUserButton.setText("Remove User");
        removeUserButton.setEnabled(false);
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Selected User");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("App-Based Inventory System");

        jLabel4.setText("User Mangement Panel");

        signoutButton.setText("Sign Out");
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        profileLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        profileLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profileLabel.setText("Hello, User A. Name!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signoutButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectedNameLabel)
                                    .addComponent(selectedUsernameLabel)
                                    .addComponent(selectedRoleLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editInformationButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(profileLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(signoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(selectedNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(selectedUsernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(selectedRoleLabel))
                        .addGap(38, 38, 38)
                        .addComponent(editInformationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeUserButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInformationButtonActionPerformed
        this.dispose();
        UserEdit.main(selectedUser);
    }//GEN-LAST:event_editInformationButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AppStateManager.saveAccounts(accounts);
        this.dispose();
        UserRegistration.main(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        // TODO add your handling code here:
        accounts.remove(this.selectedUser);
        this.updateTable();
        
        // Notification
        JOptionPane.showMessageDialog(null, "User has been removed successfully.", "User Management Panel", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_removeUserButtonActionPerformed

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        // Data states
        AppStateManager.saveAccounts(this.accounts);
        AppStateManager.saveInventory(this.inventory);
        AppStateManager.saveSession(new Session(null));
        
        // Dispose
        this.dispose();
        Login.main(null);
    }//GEN-LAST:event_signoutButtonActionPerformed


    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        FlatMacLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserManagement app = new UserManagement();
                app.setVisible(true);
                app.setDefaultCloseOperation(EXIT_ON_CLOSE);
                app.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editInformationButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managementTable;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JLabel selectedNameLabel;
    private javax.swing.JLabel selectedRoleLabel;
    private javax.swing.JLabel selectedUsernameLabel;
    private javax.swing.JButton signoutButton;
    // End of variables declaration//GEN-END:variables
}
