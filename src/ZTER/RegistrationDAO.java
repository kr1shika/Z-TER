package dao;

import database.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationDAO {
    public boolean registerUser(String username, String password, String email, String sec_1, String sec_2) {
        try {
            Connection conn = DbConnection.dbConnect();
            String checkEmailSql = "SELECT * FROM admin WHERE email=?";
            PreparedStatement checkEmailStmt = conn.prepareStatement(checkEmailSql);
            checkEmailStmt.setString(1, email);
            ResultSet emailResult = checkEmailStmt.executeQuery();

            if (emailResult.next()) {
                // User already registered with the given email
                return false;
            } else {
                String checkUsernameSql = "SELECT * FROM admin WHERE username=?";
                PreparedStatement checkUsernameStmt = conn.prepareStatement(checkUsernameSql);
                checkUsernameStmt.setString(1, username);
                ResultSet usernameResult = checkUsernameStmt.executeQuery();

                if (usernameResult.next()) {
                    // Username already taken
                    return false;
                } else {
                    String insertSql = "INSERT INTO admin (username, password, email, security_1, security_2) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement insertStmt = conn.prepareStatement(insertSql);
                    insertStmt.setString(1, username);
                    insertStmt.setString(2, password);
                    insertStmt.setString(3, email);
                    insertStmt.setString(4, sec_1);
                    insertStmt.setString(5, sec_2);

                    insertStmt.executeUpdate();
                    return true; // User registration successful
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false; // User registration failed
    }
}
