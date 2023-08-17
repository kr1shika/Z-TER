package controller;

import dao.ReceiptDAO;

public class reciept_controller {
    private ReceiptDAO receiptDAO;

    public reciept_controller() {
        receiptDAO = new ReceiptDAO();
    }

    public void insertData(String movie, int npNum, int spNum, int priceNP, int priceSP, int total, int receiptId) {
        receiptDAO.insertData(movie, npNum, spNum, priceNP, priceSP, total, receiptId);
    }
}
