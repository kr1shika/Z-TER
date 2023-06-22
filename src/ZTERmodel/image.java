package ZTERmodel;

import java.sql.*;
import javax.swing.ImageIcon;

public class image{
    public static ImageIcon retrieveImageFromDatabase(int imageId) {
        String url = "jdbc:mysql://localhost:3306/database_name";
        String username = "root";
        String password = "0212hk";

 

        String sql = "SELECT image FROM image WHERE img_id = ?";

 

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

 

            pstmt.setInt(1, imageId);
            ResultSet rs = pstmt.executeQuery();

 

            if (rs.next()) {
                Blob blob = rs.getBlob("image_data");
                byte[] imageData = blob.getBytes(1, (int) blob.length());

 

                // Create and return an ImageIcon from the image data
                return new ImageIcon(imageData);
            } else {
                System.out.println("No image found with ID: " + imageId);
            }

 

        } catch (SQLException e) {
            System.out.println("Error retrieving the image: " + e.getMessage());
        }

 

        return null; // Return null if the image retrieval fails
    }
}