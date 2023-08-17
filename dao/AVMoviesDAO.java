package dao;

import database.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

public class AVMoviesDAO {
    private final Connection conn;
    private Statement stmt;

    public AVMoviesDAO() {
        conn = DbConnection.dbConnect();
    }

    public Set<String> getMoviesData() {
        Set<String> stringSet = new LinkedHashSet<>();

        try {
            stmt = conn.createStatement();
            String sql = "SELECT title, genre, showing_date FROM movies";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String title = rs.getString("title");
                String genre = rs.getString("genre");
                String showingDate = rs.getString("showing_date");

                String movieData = title + "," + genre + "," + showingDate;
                stringSet.add(movieData);
            }

            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return stringSet;
    }

    public String getMovieInfo(String title) {
        StringBuilder infoBuilder = new StringBuilder();

        try {
            stmt = conn.createStatement();
            String sql = "SELECT title, genre, showing_date, rate_sp, rate_np FROM movies WHERE title = '" + title + "';";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String genre = rs.getString("genre");
                String showingDate = rs.getString("showing_date");
                int rateSP = rs.getInt("rate_np");
                int rateNP = rs.getInt("rate_sp");

                String info = title + "," + genre + "," + showingDate + ", " + String.valueOf(rateSP) + ", " + String.valueOf(rateNP);

                infoBuilder.append(info).append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return infoBuilder.toString();
    }

    public void insertReceipt(int receiptId) {
        try {
            stmt = conn.createStatement();
            String sql = "INSERT INTO receipt VALUES (" + receiptId + ")";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
