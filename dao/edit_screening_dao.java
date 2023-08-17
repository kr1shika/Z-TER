package dao;

import database.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class edit_screening_dao {
    private Connection conn = DbConnection.dbConnect();
    private Statement stmt;

    public Set<String> getMoviesData() {
        Set<String> stringSet = new LinkedHashSet<>();

        try {
            stmt = conn.createStatement();
            String sql = "SELECT title, genre, duration, showing_status FROM movies";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String title = rs.getString("title");
                String genre = rs.getString("genre");
                String showing_status = rs.getString("showing_status");

                String movieData = title + "," + genre + "," + showing_status;
                stringSet.add(movieData);
            }

            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return stringSet;
    }

    public void updateStatus(String to_status, String movie) {
        try {
            stmt = conn.createStatement();
            String sql = "UPDATE movies SET showing_status='" + to_status + "' WHERE title='" + movie + "';";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(edit_screening_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
