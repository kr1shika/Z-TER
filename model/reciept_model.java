/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class reciept_model {
    private String title,showing_date,showtime;
    private String movie;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }
    private int rate_sp,rate_np,quantity_sp,quantity_np;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShowing_date() {
        return showing_date;
    }

    public void setShowing_date(String showing_date) {
        this.showing_date = showing_date;
    }

    public int getRate_sp() {
        return rate_sp;
    }

    public void setRate_sp(int rate_sp) {
        this.rate_sp = rate_sp;
    }

    public int getRate_np() {
        return rate_np;
    }

    public void setRate_np(int rate_np) {
        this.rate_np = rate_np;
    }

    public int getQuantity_sp() {
        return quantity_sp;
    }

    public void setQuantity_sp(int quantity_sp) {
        this.quantity_sp = quantity_sp;
    }

    public int getQuantity_np() {
        return quantity_np;
    }

    public void setQuantity_np(int quantity_np) {
        this.quantity_np = quantity_np;
    }
    

}
