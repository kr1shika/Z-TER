/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.forgot_password_model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class forgot_password_controller {
    private Connection conn;
    private Statement stmt;

    public forgot_password_controller() {
        conn = DbConnection.dbConnect();
    }
    
public void authenticate_user(String email, String sec_1, String sec_2, String password, String confirm_password) {
    if (!password.equals(confirm_password)) {
        JOptionPane.showMessageDialog(null, "Passwords do not match");
        return;
    }
    
    String query = "SELECT * FROM admin WHERE email = '" + email + "'";
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            String securityQuestion1 = rs.getString("security_1");
            String securityQuestion2 = rs.getString("security_2");
            
            if (securityQuestion1.equals(sec_1) && securityQuestion2.equals(sec_2)) {
                // Update the password in the database
                String updateQuery = "UPDATE admin SET password = '" + password + "' WHERE email = '" + email + "'";
                stmt.executeUpdate(updateQuery);
                
                JOptionPane.showMessageDialog(null, "Password successfully changed");
            } else {
                
                JOptionPane.showMessageDialog(null, "answer the security quesitons correctly!");
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Email not found");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}


}

