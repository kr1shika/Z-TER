package model;

public class dashboard_model {
    private String title;
    private String genre;
    private int duration;
    private String showingDate;
    private int rateSP;
    private int rateNP;

    public dashboard_model(String title, String genre, int duration, String showingDate, int rateSP, int rateNP) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showingDate = showingDate;
        this.rateSP = rateSP;
        this.rateNP = rateNP;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public String getShowingDate() {
        return showingDate;
    }

    public int getRateSP() {
        return rateSP;
    }

    public int getRateNP() {
        return rateNP;
    }
}
