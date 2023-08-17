package dao;

import database.DbConnection;
import model.reciept_model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReceiptDAO {
    private Connection conn;
    private Statement stmt;

    public ReceiptDAO() {
        conn = DbConnection.dbConnect();
    }

    private int getMovieId(String movieTitle) throws SQLException {
        stmt = conn.createStatement();
        String sql = "SELECT movieid FROM movies WHERE title = '" + movieTitle + "'";

        ResultSet resultSet = stmt.executeQuery(sql);
        if (resultSet.next()) {
            return resultSet.getInt("movieid");
        }

        return -1;
    }

    public void insertData(String movie, int npNum, int spNum, int priceNP, int priceSP, int total, int receiptId) {
        try {
            int quantity = npNum + spNum;
            stmt = conn.createStatement();
            int movieId = getMovieId(movie);
            String sql = "INSERT INTO purchased_tickets VALUES(" + receiptId + "," + total + "," + quantity + ",'" + movieId + "')";

            int rowsAffected = stmt.executeUpdate(sql);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Failed to insert data");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
