package dao;

import database.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {
    private Connection conn;
    private Statement stmt;

    public ResultSet fetchData() throws SQLException {
        conn = DbConnection.dbConnect();
        stmt = conn.createStatement();
        String query = "SELECT movieId, recieptid, total_payment, quantity FROM purchased_tickets";
        return stmt.executeQuery(query);
    }

    public int cancelPurchase(int movieId) throws SQLException {
        conn = DbConnection.dbConnect();
        stmt = conn.createStatement();
        String query = "DELETE FROM purchased_tickets WHERE movieId = " + movieId;
        return stmt.executeUpdate(query);
    }
}
