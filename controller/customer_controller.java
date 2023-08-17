package controller;

import dao.CustomerDAO;
import java.sql.ResultSet;

public class customer_controller {
    private final CustomerDAO customerDao;

    public customer_controller() {
        this.customerDao = new CustomerDAO();
    }

    public ResultSet fetchDataFromDatabase() {
        ResultSet rs = null;
        try {
            rs = customerDao.fetchData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public int cancel(int selectedRowIndex) {
        int rowsAffected = 0;
        try {
            rowsAffected = customerDao.cancelPurchase(selectedRowIndex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rowsAffected;
    }
}
