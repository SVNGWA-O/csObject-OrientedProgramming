package lecture08.activity;

// Functional Programming:
//  - define your data itemization up-front
//  - make infinite functions as you need to

// Object Oriented Programming:
//  - define your functions (on a super type) up front.
//  - make infinite data (subtypes / implementing classes) as you need to
public interface Cageable {

    /**
     * Computes whether this animal can fit in a cage
     * @param exhibitSideLength with a square side length in feet
     * @return true if the animal fits
     */
    public boolean fitInExhibit(int exhibitSideLength);

    /**
     * @return the name of the animal
     */
    public String name();
}
