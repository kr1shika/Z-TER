package model;

public class edit_screening_model {
    private String title;
    private String genre;
    private String duration;
    private String showingStatus;

    public edit_screening_model(String title, String genre, String duration, String showingStatus) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showingStatus = showingStatus;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getShowingStatus() {
        return showingStatus;
    }

    public void setShowingStatus(String showingStatus) {
        this.showingStatus = showingStatus;
    }
}