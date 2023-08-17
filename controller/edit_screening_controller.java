package controller;

import dao.edit_screening_dao;
import java.util.Set;
import javax.swing.JOptionPane;

public class edit_screening_controller {
    private edit_screening_dao dao = new edit_screening_dao();

    public void updateMovieStatus(String to_status, String movie) {
        dao.updateStatus(to_status, movie);
        JOptionPane.showMessageDialog(null, "Updated status successfully!");
    }

    public Set<String> getMoviesData() {
        return dao.getMoviesData();
    }
}
