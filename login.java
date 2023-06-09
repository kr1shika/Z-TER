package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.sql.*;
import model.DbConnection;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        have_an_account_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        password_field = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1529, 1087));
        setSize(new java.awt.Dimension(1529, 1020));
        getContentPane().setLayout(null);

        have_an_account_button.setBackground(new java.awt.Color(46, 74, 81));
        have_an_account_button.setForeground(new java.awt.Color(255, 255, 255));
        have_an_account_button.setText("CREATE AN ACCOUNT?");
        have_an_account_button.setBorder(null);
        have_an_account_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                have_an_account_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(have_an_account_button);
        have_an_account_button.setBounds(830, 660, 210, 40);

        jLabel1.setBackground(new java.awt.Color(46, 74, 81));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN-IN");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 220, 80, 30);

        username_field.setBackground(new java.awt.Color(46, 74, 81));
        username_field.setForeground(new java.awt.Color(255, 255, 255));
        username_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_field.setText("USERNAME");
        username_field.setBorder(null);
        getContentPane().add(username_field);
        username_field.setBounds(460, 380, 570, 30);

        password_field.setBackground(new java.awt.Color(46, 74, 81));
        password_field.setForeground(new java.awt.Color(255, 255, 255));
        password_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_field.setText("PASSWORD");
        password_field.setBorder(null);
        getContentPane().add(password_field);
        password_field.setBounds(460, 510, 580, 30);

        login_button.setBackground(new java.awt.Color(51, 51, 51));
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Log-in");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button);
        login_button.setBounds(640, 660, 140, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1550, 1020));
        jLabel3.setMinimumSize(new java.awt.Dimension(1550, 1020));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 1500, 1030);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 920, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        System.out.println("login attempt");
        if("USERNAME".equals(username_field.getText())){
            JOptionPane.showMessageDialog(rootPane, "ENTER THE USERNAME");
        }
        else{
            try {
    Connection conn = DbConnection.dbConnect();
    Statement stmt = conn.createStatement();
    String username = username_field.getText();
    String password = password_field.getText();

    String sql = "SELECT * FROM admin WHERE username='" + username + "'";
    ResultSet rs = stmt.executeQuery(sql);

    if (rs.next()) {
        String storedPassword = rs.getString("password");
        if (password.equals(storedPassword)) {
            // Login successful
            JOptionPane.showMessageDialog(rootPane, "Login successful");
            // Add your code for the actions to perform after successful login
        } 
        else {
            // Incorrect password
            JOptionPane.showMessageDialog(rootPane, "Incorrect password");
        }
    } 
    else {
        // User does not exist
        JOptionPane.showMessageDialog(rootPane, "User does not exist");
    }
} catch (Exception e) {
    System.out.println(e.getMessage());
}
        }
        

    }//GEN-LAST:event_login_buttonActionPerformed

    private void have_an_account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_have_an_account_buttonActionPerformed
        // TODO add your handling code here:
        registration_page p1= new registration_page();
        p1.show();
        dispose();
    }//GEN-LAST:event_have_an_account_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton have_an_account_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField password_field;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}