package controller;

import ZTERmodel.AddMovies;
import model.addmovie;
import model.addmovie;

public class addmoviecontroller {
    private addmovie model;

    public addmoviecontroller(AddMovies aThis) {
        model = new addmovie();
    }

    public void insertMovie(String movieTitle, String genre, String duration, String publishDate) {
        try {
            model.connectToDatabase();
            model.insertMovie(movieTitle.
