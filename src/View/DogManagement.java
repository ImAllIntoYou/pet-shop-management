package View;

import Controller.ItemController;
import Model.Pet;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class DogManagement extends javax.swing.JFrame {

    /**
     * Creates new form DogManagement
     */
    public DogManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textfield_id = new javax.swing.JTextField();
        textfield_name = new javax.swing.JTextField();
        textfield_breed = new javax.swing.JTextField();
        textfield_species = new javax.swing.JTextField();
        textfield_status = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textfield_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_dog = new javax.swing.JTable();
        edit_dog = new javax.swing.JButton();
        save_dog = new javax.swing.JButton();
        delete_dog = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        back_button_dog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textfield_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_idActionPerformed(evt);
            }
        });

        textfield_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_nameActionPerformed(evt);
            }
        });

        textfield_breed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_breedActionPerformed(evt);
            }
        });

        textfield_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_statusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Breed");

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 51));
        jLabel8.setText("Status");

        jLabel9.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Species");

        table_dog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Breed", "Species", "Status", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_dog.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_dogAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                table_dogAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table_dog);

        edit_dog.setText("Edit");
        edit_dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_dogActionPerformed(evt);
            }
        });

        save_dog.setText("Save");
        save_dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_dogActionPerformed(evt);
            }
        });

        delete_dog.setText("Delete");
        delete_dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_dogActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 51));
        jLabel10.setText("Dog List");

        back_button_dog.setText("Back");
        back_button_dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button_dogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(edit_dog)
                        .addGap(69, 69, 69)
                        .addComponent(save_dog)
                        .addGap(68, 68, 68)
                        .addComponent(delete_dog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(textfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_breed, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_species, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_status, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_price, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button_dog)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button_dog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_species, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textfield_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_dog)
                    .addComponent(save_dog)
                    .addComponent(delete_dog))
                .addGap(35, 35, 35)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_idActionPerformed

    private void textfield_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_nameActionPerformed

    private void textfield_breedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_breedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_breedActionPerformed

    private void edit_dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_dogActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_dog.getSelectedRow();  // Get the selected row
        if (selectedRow != -1) {  // Check if a row is selected
        // Get the values from the selected row and set them in the text fields
        textfield_id.setText(table_dog.getValueAt(selectedRow, 0).toString());
        textfield_name.setText(table_dog.getValueAt(selectedRow, 1).toString());
        textfield_breed.setText(table_dog.getValueAt(selectedRow, 2).toString());
        textfield_species.setText(table_dog.getValueAt(selectedRow, 3).toString());
        textfield_status.setText(table_dog.getValueAt(selectedRow, 4).toString());
        textfield_price.setText(table_dog.getValueAt(selectedRow, 5).toString());
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a dog to edit.", "Selection Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_edit_dogActionPerformed

    private void back_button_dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button_dogActionPerformed
        // TODO add your handling code here:
        Manage_product manage_product = new Manage_product(); // Replace with your next JFrame class name
        manage_product.setVisible(true);
        this.dispose(); // Closes the current JFrame
    }//GEN-LAST:event_back_button_dogActionPerformed

    private void textfield_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_statusActionPerformed

    private void save_dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_dogActionPerformed
            // TODO add your handling code here:
        String id = textfield_id.getText();
        String name = textfield_name.getText();
        String breed = textfield_breed.getText();
        String species = textfield_species.getText();
        String status = textfield_status.getText();
        String price = textfield_price.getText();

        // Validate that all fields are filled
        if (id.isEmpty() || name.isEmpty() || breed.isEmpty() || species.isEmpty() || status.isEmpty() || price.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate that the price is a valid number
        try {
            Double.valueOf(price);  // Try parsing the price as a double
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Price must be a valid number.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the table model
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table_dog.getModel();

        // Check if the ID already exists, but exclude the selected row
        int selectedRow = table_dog.getSelectedRow();
        for (int i = 0; i < model.getRowCount(); i++) {
            // Skip the row if it is the currently selected one (editing mode)
            if (i != selectedRow && model.getValueAt(i, 0).equals(id)) {
                javax.swing.JOptionPane.showMessageDialog(this, "ID already exists. Please choose a unique ID.", "Duplicate Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (selectedRow != -1) {
            // Update the existing row if a row is selected
            model.setValueAt(id, selectedRow, 0);
            model.setValueAt(name, selectedRow, 1);
            model.setValueAt(breed, selectedRow, 2);
            model.setValueAt(species, selectedRow, 3);
            model.setValueAt(status, selectedRow, 4);
            model.setValueAt(price, selectedRow, 5);
        } else {
            // Add a new row if no row is selected
            model.addRow(new Object[]{id, name, breed, species, status, price});
        }

        double priceFixed = Double.parseDouble(price); 
        Pet dog = new Pet(name, species, breed, priceFixed, status);
        ItemController.addDog(dog);
        
        // Clear the text fields after saving
        textfield_id.setText("");
        textfield_name.setText("");
        textfield_breed.setText("");
        textfield_species.setText("");
        textfield_status.setText("");
        textfield_price.setText("");

        // Clear the selection on the table
        table_dog.clearSelection();

        // Show success message
        javax.swing.JOptionPane.showMessageDialog(this, "Dog information saved successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_save_dogActionPerformed

    private void table_dogAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_dogAncestorAdded
        // TODO add your handling code here:
        // Retrieve the table model
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table_dog.getModel();

        // Check if the table is already populated to avoid duplicate rows
        if (model.getRowCount() > 0) {
            return;
        }
        model.addRow(new Object[]{"001", "Buddy", "Labrador", "Dog", "Available", "500"});
        model.addRow(new Object[]{"002", "Max", "Phu Quoc", "Dog", "Adopted", "600"});
        model.addRow(new Object[]{"003", "Bella", "cỏ", "Dog", "Available", "550"});
    }//GEN-LAST:event_table_dogAncestorAdded

    private void table_dogAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_dogAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_table_dogAncestorMoved

    private void delete_dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_dogActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_dog.getSelectedRow();
    
        if (selectedRow == -1) {
            // If no row is selected, show an error message
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Delete Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm deletion with the user
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this entry?", "Delete Confirmation", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            // Delete the selected row
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table_dog.getModel();
            model.removeRow(selectedRow);

            // Show success message
            javax.swing.JOptionPane.showMessageDialog(this, "Selected entry deleted successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_delete_dogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DogManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button_dog;
    private javax.swing.JButton delete_dog;
    private javax.swing.JButton edit_dog;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save_dog;
    private javax.swing.JTable table_dog;
    private javax.swing.JTextField textfield_breed;
    private javax.swing.JTextField textfield_id;
    private javax.swing.JTextField textfield_name;
    private javax.swing.JTextField textfield_price;
    private javax.swing.JTextField textfield_species;
    private javax.swing.JTextField textfield_status;
    // End of variables declaration//GEN-END:variables
}
