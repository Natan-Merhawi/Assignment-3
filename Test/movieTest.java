package Test;

import movie.Movie;
import movie.MovieItem;

public class movieTest extends MovieItem{

   public movieTest(String title, String author) {
        super(title, author);
    }

public static void main(String[] args) {

    Movie movie1= new Movie();
    MovieItem i1 = new movieTest("Suits", "Aaron Korsh");
    MovieItem i2 = new movieTest("Money Heist", "Alex Pina");


    movie1.addMovieItem(i1);
    movie1.addMovieItem(i2);

    movie1.printMovieDetails();
    

   }
    
}