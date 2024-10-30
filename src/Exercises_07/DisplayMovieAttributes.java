package Exercises_07;

public class DisplayMovieAttributes {
    public static void main(String[] args) {
        Movie displayFirstMovie = new Movie("The Godfather", "crime", 9.2);
        System.out.println("First movie");
        displayFirstMovie.printAttributes();

        Movie displaySecondMovie = new Movie("Fight Club", "drama", 8.8);
        System.out.println("\nSecond movie");
        displaySecondMovie.printAttributes();

        Movie displayThirdMovie = new Movie("The Matrix", "action", 8.7);
        System.out.println("\nThird movie");
        displayThirdMovie.printAttributes();

        Movie defaultMovie = new Movie();
        System.out.println("\nDefault movie");
        defaultMovie.printAttributes();
    }
}