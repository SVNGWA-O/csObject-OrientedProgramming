package lecture03.activity;

/** Compound data and some functionality for a film of some sort */
public class Movie {
    /** the title of the movie */
    public String title;
    /** the running time in minutes */
    public int runningTime;
    /**the rating like "G" "R" etc.*/
    public String rating;
    /** the opening date in a yyyymmdd like object*/
    public Date openingDate;

    /**
     * The constructor for a movie with no default assumptions
     * @param title the title of the movie
     * @param runningTime the running time in minutes
     * @param rating the rating like "G" "R" etc.
     * @param openingDate the opening date in a yyyymmdd like object
     */
    public Movie(String title, int runningTime, String rating, Date openingDate){
        this.title = title;
        this.runningTime = runningTime;
        this.rating = rating;
        this.openingDate = openingDate;
    }

    /**
     * Determines if a movie is a baby movie for literal babies
     * @return true if the movie has baby friendly properties
     */
    public boolean literallyForBabies(){
        throw new RuntimeException("TODO: Replace Me");
    }

    /**
     * Produces the title of the earlier of two movies
     * @param otherMovie a movie to compare this movie to
     * @return the title of the earlier movie OR "Twinsies!" if same date
     */
    public String openedEarlier(Movie otherMovie){

        if(this.openingDate.compareTo(otherMovie.openingDate)<0){
            return this.title;
        } else if (this.openingDate.compareTo(otherMovie.openingDate)>0) {
            return otherMovie.title;
        }
        else{
           return "Twinsies!!";
        }


    }

}
