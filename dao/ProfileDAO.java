package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import database.DbConnection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProfileDAO {
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/zter", "root", "ba10cha4112");
    }
        public ResultSet executeQuery(String sql) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }
        public int getTotalPaymentSum() {
        int sum = 0;
        try {
            String sql = "SELECT SUM(total_payment) AS total_sum FROM purchased_tickets";
            ResultSet resultSet = executeQuery(sql);
            
            if (resultSet.next()) {
                sum = resultSet.getInt("total_sum");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public int getRowCount(String tablename) {
        int rowCount = 0;
        try {
            String sql = "SELECT COUNT(*) AS row_count FROM "+tablename;
            ResultSet resultSet = executeQuery(sql);
            if (resultSet.next()) {
                rowCount = resultSet.getInt("row_count");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowCount;
    }
        public DefaultPieDataset getMovieTitleDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {
            // Connect to the database
            Connection conn = DbConnection.dbConnect();

            // Prepare the SQL statement to retrieve movie titles and their counts
            String sql = "SELECT title, COUNT(*) AS movieCount FROM movies GROUP BY title";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Execute the query
            ResultSet rs = pstmt.executeQuery();

            // Populate the dataset with movie titles and counts
            while (rs.next()) {
                String movieTitle = rs.getString("title");
                int movieCount = rs.getInt("movieCount");
                dataset.setValue(movieTitle, movieCount);
            }

            // Close the database connections
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }
       public DefaultCategoryDataset getMovieQuantityDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            Connection conn = DbConnection.dbConnect();
            String sql = "SELECT movieId, quantity FROM purchased_tickets";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String movieId = rs.getString("movieId");
                double quantity = rs.getDouble("quantity");
                dataset.addValue(quantity, "Quantity", movieId);
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
   }
           public ResultSet fetchData() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zter", "root", "ba10cha4112");
        String sql = "SELECT movieId, total_payment FROM purchased_tickets";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
}
