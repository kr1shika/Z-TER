package model;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ProfileModel {
    private int totalPaymentSum;
    private int rowCount;
    private DefaultPieDataset movieTitleDataset;
    private DefaultCategoryDataset movieQuantityDataset;

    public ProfileModel() {
        // Default constructor
    }

    public ProfileModel(int totalPaymentSum, int rowCount, DefaultPieDataset movieTitleDataset, DefaultCategoryDataset movieQuantityDataset) {
        this.totalPaymentSum = totalPaymentSum;
        this.rowCount = rowCount;
        this.movieTitleDataset = movieTitleDataset;
        this.movieQuantityDataset = movieQuantityDataset;
    }

    public int getTotalPaymentSum() {
        return totalPaymentSum;
    }

    public void setTotalPaymentSum(int totalPaymentSum) {
        this.totalPaymentSum = totalPaymentSum;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public DefaultPieDataset getMovieTitleDataset() {
        return movieTitleDataset;
    }

    public void setMovieTitleDataset(DefaultPieDataset movieTitleDataset) {
        this.movieTitleDataset = movieTitleDataset;
    }

    public DefaultCategoryDataset getMovieQuantityDataset() {
        return movieQuantityDataset;
    }

    public void setMovieQuantityDataset(DefaultCategoryDataset movieQuantityDataset) {
        this.movieQuantityDataset = movieQuantityDataset;
    }
}
