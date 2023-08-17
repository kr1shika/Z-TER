package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import dao.MoviesDAO;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.text.ParseException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class add_movies_controller {
    private MoviesDAO moviesDAO;

    public add_movies_controller() {
        moviesDAO = new MoviesDAO();
    }

    public ResultSet fetch_data() {
        return moviesDAO.fetchAllMovies();
    }

    public void importImage(File selectedFile) {
        try {
            byte[] imageBytes = Files.readAllBytes(selectedFile.toPath());
            moviesDAO.insertImage(imageBytes);
            System.out.println("Image imported and stored in the database successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteMovie(String movieTitle) {
        moviesDAO.deleteMovie(movieTitle);
    }

    public int insertMovie(String movieTitle, String genre, String duration, String publishDate, byte[] imageBytes) {
        return moviesDAO.insertMovie(movieTitle, genre, duration, publishDate, imageBytes);
    }
        public byte[] getImageBytesForMovieTitle(String movieTitle) {
        return moviesDAO.getImageBytesForMovieTitle(movieTitle);
    }
    public boolean updateMovie(int movieId, String updatedMovieTitle, String updatedGenre, String updatedDuration, String updatedPublishDate, Icon updatedImageIcon) throws  ParseException, IOException {
        byte[] updatedImageBytes = null;

        if (updatedImageIcon != null && updatedImageIcon instanceof ImageIcon) {
            Image updatedImage = ((ImageIcon) updatedImageIcon).getImage();
            BufferedImage bufferedImage = new BufferedImage(updatedImage.getWidth(null), updatedImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = bufferedImage.createGraphics();
            graphics.drawImage(updatedImage, 0, 0, null);
            graphics.dispose();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", baos);
            updatedImageBytes = baos.toByteArray();
        } else {
            JOptionPane.showMessageDialog(null, "Image missing");
            return false;
        }

        return moviesDAO.updateMovie(movieId, updatedMovieTitle, updatedGenre, updatedDuration, updatedPublishDate, updatedImageBytes);
    }
}
