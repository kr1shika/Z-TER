/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author acer
 */
public class av_movies_controller {
    private Connection conn;
    private Statement stmt;

    public av_movies_controller() {
        conn = DbConnection.dbConnect();
    }
    
    public static Set<String> movie_data(){
    Set<String> stringSet = new LinkedHashSet<>();
    try {
        Connection conn = DbConnection.dbConnect();
        Statement stmt = conn.createStatement();
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
        stmt.close();
        conn.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return stringSet;
    }
    
    public String get_info(String title) {
    StringBuilder infoBuilder = new StringBuilder();

    try {
        stmt = conn.createStatement();
        String sql = "SELECT title, genre, showing_date, rate_sp, rate_np FROM movies WHERE title = " + "'"+title+"'" + ";";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String genre = rs.getString("genre");
            String showingDate = rs.getString("showing_date");
            int rateSP = rs.getInt("rate_sp");
            int rateNP = rs.getInt("rate_np");

            String info = title + "," + genre +","+showingDate+ ", " + String.valueOf(rateSP) + ", " + String.valueOf(rateNP);

            infoBuilder.append(info).append("\n");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return infoBuilder.toString();
}
//    public String title_getter(int id)
    
}
    
  
