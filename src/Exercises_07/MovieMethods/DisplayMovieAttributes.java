package Exercises_07.MovieMethods;

public class DisplayMovieAttributes {
    public static void main(String[] args) {
        Movie displayFirstMovie = new Movie("The Godfather", "crime", 9.2F);
        Movie displaySecondMovie = new Movie("Fight Club", "drama", 8.8F);
        Movie displayThirdMovie = new Movie("The Matrix", "action", 8.7F);

        System.out.println("First movie");
        displayFirstMovie.printAttributes();

        System.out.println("Second movie");
        displaySecondMovie.printAttributes();

        System.out.println("Third movie");
        displayThirdMovie.printAttributes();
    }
}