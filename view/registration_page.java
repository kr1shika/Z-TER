package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Toolkit;
import model.User;
import java.sql.*;
import javax.swing.JOptionPane;
import junit.framework.Assert;
public class registration_page extends javax.swing.JFrame {

    Statement stmt;
    Connection conn;
    public registration_page() {
        initComponents();
        setTitle("Register Account");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/movie-projector 2.png")));
        setLocationRelativeTo(null);  //use to center the frame. 
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        confirm_password_field = new javax.swing.JPasswordField();
        password_field = new javax.swing.JPasswordField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sec_2_field = new javax.swing.JTextField();
        sec_1_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        username_field1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(565, 688));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirm_password_field.setText("CONFIRM PASSWORD");
        getContentPane().add(confirm_password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 340, 30));

        password_field.setText("PASSWORD");
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 340, 30));

        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("SHOW");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("SHOW ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Already have an account?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("What is your favourite ice-cream flavour?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("What city were you born in?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        sec_2_field.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        sec_2_field.setText("ANS");
        sec_2_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_2_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(sec_2_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 260, -1));

        sec_1_field.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        sec_1_field.setText("ANS");
        sec_1_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_1_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(sec_1_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 260, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CREATE A Z-TER ACCOUNT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        username_field.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        username_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_field.setText("Username");
        username_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 350, 30));

        email_field.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        email_field.setForeground(new java.awt.Color(0, 51, 51));
        email_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_field.setText("Email");
        email_field.setSelectionColor(new java.awt.Color(0, 51, 51));
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 350, 30));

        register_button.setBackground(new java.awt.Color(51, 51, 51));
        register_button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        register_button.setForeground(new java.awt.Color(255, 255, 255));
        register_button.setText("REGISTER");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(register_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 110, 30));

        username_field1.setBackground(new java.awt.Color(46, 74, 81));
        username_field1.setForeground(new java.awt.Color(255, 255, 255));
        username_field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_field1.setText("USERNAME");
        username_field1.setBorder(null);
        username_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_field1ActionPerformed(evt);
            }
        });
        getContentPane().add(username_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 350, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Group 48.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 340, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed

    if ("EMAIL".equals(email_field.getText())) {
        JOptionPane.showMessageDialog(rootPane, "NO FIELD CAN BE EMPTY!");
    } else {
        String username = username_field.getText();
        String password = password_field.getText();
        String email = email_field.getText();
        String confirm_password = confirm_password_field.getText();
        String sec_1=sec_1_field.getText();
        String sec_2=sec_2_field.getText();
//        Assert.assertEquals(false, username_field.getText().length()==0); // Assert that username is not  empty
//        Assert.assertEquals(false, password_field.getText().length()==0); // Assert that password is not  empty
//        Assert.assertEquals(false, confirm_password_field.getText().length()==0); // Assert that confirm password is not  empty
//        Assert.assertEquals(false, email_field.getText().length()==0); // Assert that emial is not  empty
//        Assert.assertEquals(false, sec_1_field.getText().length()==0); // Assert that security 1 is not  empty
//        Assert.assertEquals(false, sec_2_field.getText().length()==0); // Assert that security 2 is not  empty
        User user = new User(username, password, email, confirm_password,sec_1,sec_2);
        
        user.registerUser(); // Call the registerUser() method in the User class
    }

    }//GEN-LAST:event_register_buttonActionPerformed

    private void username_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_field1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        login l1= new login();
        l1.show();
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void sec_2_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_2_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec_2_fieldActionPerformed

    private void sec_1_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_1_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec_1_fieldActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            confirm_password_field.setEchoChar((char) 0);
        } else {
            confirm_password_field.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            password_field.setEchoChar((char) 0);
        } else {
            password_field.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirm_password_field;
    private javax.swing.JTextField email_field;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JButton register_button;
    private javax.swing.JTextField sec_1_field;
    private javax.swing.JTextField sec_2_field;
    private javax.swing.JTextField username_field;
    private javax.swing.JTextField username_field1;
    // End of variables declaration//GEN-END:variables
}
