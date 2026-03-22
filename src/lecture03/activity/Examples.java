package lecture03.activity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class Examples {
    /* Students will be able to:
     * - define classes to describe compound data
     *   - declare fields (data members) on the class
     *   - define a constructor to initialize the fields
     * - instantiate a class to make a new object
     * - describe the field relationship between classes as a UML diagram
     *   - "has a" relationship <>----
     */

    /* Problem:
     * Recall a problem like HW1 from CS1101 (Nested Structs)
     * Define a class called Date which has the following fields:
     * - year which is a 4-digit integer
     * - month which is a byte 1-9, 10, 11, or 12
     *   - don't do 09, that is octal :(
     * - day which is a byte 1-31
     * Define a class Movie which has the following fields:
     * - title which is a String
     * - runningTime which is in minutes
     * - rating which is a String like "PG", "R"
     * - openingDate which is a Date
     */

    /* Design a function, literallyForBabies() that
         consumes nothing
         produces true if the rating is "G" and the
                  runningTime is under 90 minutes
         produces false otherwise
     */

    /* Design a function, openedEarlier(Movie otherMovie) which:
         consumes a movie to compare to
         produces the title of this movie if this movie's date is before
                  the other movie's date
         produces other movie's title if this movie's date is after
                  the other movie's date
         produces "Twinsies" if they both have the same opening date

         Hint: You may want to define a date comparison helper function
               On the Date class
     */

    @Test
    public void TestMovieLiterallyForBabiesTrue(){
        Movie babyMovie =
                new Movie("Barney's Great Adventure", 78, "G", new Date(1998,4,3));
        assertTrue(babyMovie.literallyForBabies());
    }


    @Test
    public void TestMovieOpenedEarlier(){
        Movie babyMovie = new Movie("Barney's Great Adventure", 78, "G", new Date(1998,4,3));
        Movie pokemon1 =
                new Movie("Pokemon: The First Movie", 96, "G", new Date(1998,7,18));
        assertEquals("Barney's Great Adventure", babyMovie.openedEarlier(pokemon1));
        assertEquals("Barney's Great Adventure", pokemon1.openedEarlier(babyMovie));
    }
}
