package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import database.DbConnection;

// Import other necessary packages

public class DashboardDAO {
    // Other methods and functionalities here

    public List<Integer> getMovieIds() {
        List<Integer> movieIds = new ArrayList<>();

        try {
            // Connect to the database
            Connection conn = DbConnection.dbConnect();

            // Prepare the SQL statement to retrieve the movieIds
            String sql = "SELECT movieId FROM movies";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Execute the query
            ResultSet rs = pstmt.executeQuery();

            // Add the movieIds to the list
            while (rs.next()) {
                int movieId = rs.getInt("movieId");
                movieIds.add(movieId);
            }

            // Close the database connections
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return movieIds;
    }

    public List<Integer> getImageIds() {
        List<Integer> imageIds = new ArrayList<>();

        try {
            // Connect to the database
            Connection conn = DbConnection.dbConnect();

            // Prepare the SQL statement to retrieve the imageIds
            String sql = "SELECT imageId FROM images";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Execute the query
            ResultSet rs = pstmt.executeQuery();

            // Add the imageIds to the list
            while (rs.next()) {
                int imageId = rs.getInt("imageId");
                imageIds.add(imageId);
            }

            // Close the database connections
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imageIds;
    }
}
