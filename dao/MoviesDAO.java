package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DbConnection;

public class MoviesDAO {

    public ResultSet fetchAllMovies() {
        ResultSet resultSet = null;

        try {
            Connection conn = DbConnection.dbConnect();
            String selectSql = "SELECT * FROM movies";
            PreparedStatement selectStatement = conn.prepareStatement(selectSql);
            resultSet = selectStatement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultSet;
    }

    public void insertImage(byte[] imageBytes) {
        try (Connection conn = DbConnection.dbConnect()) {
            String sql = "INSERT INTO image (image) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setBytes(1, imageBytes);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMovie(String movieTitle) {
        try (Connection conn = DbConnection.dbConnect()) {
            String deleteSql = "DELETE FROM movies WHERE title=?";
            PreparedStatement deleteStatement = conn.prepareStatement(deleteSql);
            deleteStatement.setString(1, movieTitle);
            deleteStatement.executeUpdate();
            System.out.println("Movie deleted successfully.");
        } catch (SQLException ex) {
            System.out.println("Error deleting movie: " + ex.getMessage());
        }
    }

    public int insertMovie(String movieTitle, String genre, String duration, String publishDate, byte[] imageBytes) {
        int affectedRows = 0;

        try (Connection conn = DbConnection.dbConnect()) {
            String sql = "INSERT INTO movies (title, genre, duration, showing_date, image) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, movieTitle);
            statement.setString(2, genre);
            statement.setString(3, duration);
            statement.setDate(4, java.sql.Date.valueOf(publishDate));
            statement.setBytes(5, imageBytes);
            affectedRows = statement.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error inserting data: " + ex.getMessage());
        }

        return affectedRows;
    }
    public byte[] getImageBytesForMovieTitle(String movieTitle) {
        byte[] imageBytes = null;

        try (Connection conn = DbConnection.dbConnect()) {
            String query = "SELECT image_column FROM movies WHERE title = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, movieTitle);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    imageBytes = rs.getBytes("image_column");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return imageBytes;
    }
    public boolean updateMovie(int movieId, String updatedMovieTitle, String updatedGenre, String updatedDuration, String updatedPublishDate, byte[] updatedImageBytes) {
        try (Connection conn = DbConnection.dbConnect()) {
            String updateSql = "UPDATE movies SET title=?, genre=?, duration=?, showing_date=?, image=? WHERE movieId=?";
            PreparedStatement updateStatement = conn.prepareStatement(updateSql);
            updateStatement.setString(1, updatedMovieTitle);
            updateStatement.setString(2, updatedGenre);
            updateStatement.setString(3, updatedDuration);
            updateStatement.setDate(4, java.sql.Date.valueOf(updatedPublishDate));
            updateStatement.setBytes(5, updatedImageBytes);
            updateStatement.setInt(6, movieId);
            updateStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
