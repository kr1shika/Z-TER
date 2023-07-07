package controller;

import dao.AVMoviesDAO;

import java.util.Set;

public class av_movies_controller {
    private final AVMoviesDAO avMoviesDAO;

    public av_movies_controller() {
        this.avMoviesDAO = new AVMoviesDAO();
    }

    public Set<String> movie_data() {
        return avMoviesDAO.getMoviesData();
    }

    public String get_info(String title) {
        return avMoviesDAO.getMovieInfo(title);
    }

    public void set_to_db(int recieptid) {
        avMoviesDAO.insertReceipt(recieptid);
    }
}
