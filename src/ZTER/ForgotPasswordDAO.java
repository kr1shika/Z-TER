package dao;

import database.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ForgotPasswordDAO {
    private final Connection conn;
    private Statement stmt;

    public ForgotPasswordDAO() {
        conn = DbConnection.dbConnect();
    }

    public boolean authenticateUser(String email, String sec_1, String sec_2, String password) {
        try {
            String query = "SELECT * FROM admin WHERE email = '" + email + "'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String securityQuestion1 = rs.getString("security_1");
                String securityQuestion2 = rs.getString("security_2");

                if (securityQuestion1.equals(sec_1) && securityQuestion2.equals(sec_2)) {
                    // Update the password in the database
                    String updateQuery = "UPDATE admin SET password = '" + password + "' WHERE email = '" + email + "'";
                    stmt.executeUpdate(updateQuery);

                    return true; // Authentication successful
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false; // Authentication failed
    }

    public boolean checkEmailExists(String email) {
        try {
            String query = "SELECT email FROM admin WHERE email='" + email + "'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                // Email is registered
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return false; // Email not found
    }
}
