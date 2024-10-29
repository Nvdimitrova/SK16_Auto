package Exercises_07;

public class Movie {
    String title;
    String genre;
    double rating;

    public Movie() {
        this.title = "Titanic";
        this.genre = "drama";
        this.rating = 7.9;
    }

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void printAttributes() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}