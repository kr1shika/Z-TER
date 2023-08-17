package dao;

import database.DbConnection;
import model.UserModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
    public UserModel getUserByUsername(String username) {
        try {
            Connection conn = DbConnection.dbConnect();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM admin WHERE username='" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String storedPassword = rs.getString("password");

                // Create and return the UserModel object
                UserModel user = new UserModel();
                user.setUsername(username);
                user.setPassword(storedPassword);
                return user;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null; // User not found
    }
}
