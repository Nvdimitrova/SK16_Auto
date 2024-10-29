package Exercises_07;

public class DisplayMovieAttributes {
    public static void main(String[] args) {
        Movie displayMovie = new Movie();

        displayMovie.title = "The Godfather";
        displayMovie.genre = "crime";
        displayMovie.rating = 9.2;

        System.out.println("First movie");
        System.out.println("Title: " + displayMovie.title);
        System.out.println("Genre: " + displayMovie.genre);
        System.out.println("Rating: " + displayMovie.rating);

        displayMovie.title = "Fight Club";
        displayMovie.genre = "drama";
        displayMovie.rating = 8.8;

        System.out.println("\nSecond movie");
        System.out.println("Title: " + displayMovie.title);
        System.out.println("Genre: " + displayMovie.genre);
        System.out.println("Rating: " + displayMovie.rating);

        displayMovie.title = "The Matrix";
        displayMovie.genre = "action";
        displayMovie.rating = 8.7;

        System.out.println("\nThird movie");
        System.out.println("Title: " + displayMovie.title);
        System.out.println("Genre: " + displayMovie.genre);
        System.out.println("Rating: " + displayMovie.rating);

        Movie defaultMovie = new Movie();
        System.out.println("\nDefault movie");
        defaultMovie.printAttributes();
    }
}
