package controller;

import java.util.List;
import java.sql.Connection;
import database.DbConnection;
import dao.DashboardDAO;

public class dashboard_controller {
    private Connection conn;

    public dashboard_controller() {
        conn = DbConnection.dbConnect();
    }


    public List<Integer> getImgIds() {
        DashboardDAO dd= new DashboardDAO();
        return dd.getImageIds();
    }
    public List<Integer> getMovieIds() {
    DashboardDAO dd= new DashboardDAO();
    return dd.getMovieIds();
}
}
