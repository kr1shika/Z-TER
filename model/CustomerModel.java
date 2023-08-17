package model;

import java.util.ArrayList;
import java.util.List;
import controller.customer_controller;

public class CustomerModel {
    private int movieId;
    private int receiptId;
    private double totalPayment;
    private int quantity;

    public CustomerModel() {
    }

    public CustomerModel(int movieId, int receiptId, double totalPayment, int quantity) {
        this.movieId = movieId;
        this.receiptId = receiptId;
        this.totalPayment = totalPayment;
        this.quantity = quantity;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delete_record(int receiptId){
        customer_controller cc1=new customer_controller();
        cc1.cancel(receiptId);
}
}
