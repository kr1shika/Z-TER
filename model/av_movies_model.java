package model;

public class av_movies_model {
    private String title;
    private String genre;
    private String showingDate;
    private int rateSP;
    private int rateNP;

    public av_movies_model() {
    }

    public av_movies_model(String title, String genre, String showingDate, int rateSP, int rateNP) {
        this.title = title;
        this.genre = genre;
        this.showingDate = showingDate;
        this.rateSP = rateSP;
        this.rateNP = rateNP;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(String showingDate) {
        this.showingDate = showingDate;
    }

    public int getRateSP() {
        return rateSP;
    }

    public void setRateSP(int rateSP) {
        this.rateSP = rateSP;
    }

    public int getRateNP() {
        return rateNP;
    }

    public void setRateNP(int rateNP) {
        this.rateNP = rateNP;
    }
}
