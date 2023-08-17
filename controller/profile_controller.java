package controller;
import database.DbConnection;
import java.awt.Color;
import java.sql.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.*;
import org.jfree.data.general.*;
import dao.ProfileDAO;

public class profile_controller {
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/zter", "root", "ba10cha4112");
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }

    public int getTotalPaymentSum() {
        ProfileDAO pd= new ProfileDAO();
        return pd.getTotalPaymentSum();
    }

    public int getRowCount(String tablename) {
        ProfileDAO pd= new ProfileDAO();
        return pd.getRowCount("movies");
    }

    public DefaultCategoryDataset createDataset(String sql, String valueColumn, String categoryColumn) throws SQLException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ResultSet resultSet = executeQuery(sql);
        while (resultSet.next()) {
            String category = resultSet.getString(categoryColumn);
            double value = resultSet.getDouble(valueColumn);
            dataset.addValue(value, valueColumn, category);
        }
        resultSet.close();
        return dataset;
    }

    public JFreeChart createBarChart(String title, String xAxisLabel, String yAxisLabel, DefaultCategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(title, xAxisLabel, yAxisLabel, dataset);
        CategoryPlot plot = barChart.getCategoryPlot();
        ((BarRenderer) plot.getRenderer()).setMaximumBarWidth(0.05);
        plot.setBackgroundPaint(Color.BLACK);
        return barChart;
    }

    public ResultSet fetchData() throws SQLException {
        ProfileDAO pd= new ProfileDAO();
        return pd.fetchData();
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
        ProfileDAO pc= new ProfileDAO();
        return pc.getMovieQuantityDataset();
        
   }
   
}
