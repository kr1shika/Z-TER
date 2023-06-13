/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZTER;

/**
 *
 * @author haseena
 */
import java.sql.*;
public class database {
    public static Connection dbConn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","0212hk");
            System.out.println("Database connectd");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
