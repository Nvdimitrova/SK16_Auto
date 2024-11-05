package Exercises_07.MovieMethods;

public class Movie {
    String title;
    String genre;
    float rating;

    public Movie(String title, String genre, float rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void printAttributes() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println();
    }
}