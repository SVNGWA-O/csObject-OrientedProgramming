package lecture08.answers;

/** describes a boa constrictor animal that lives in a zoo */
public class Boa implements Cageable {
    /** The boa's name */
    public String name;
    /** The boa's length in feet */
    public int length;
    /** The boa's favorite food */
    public String favFood;
    /** Whether or not the boa is huggable */
    public boolean isHuggable;

    /**
     * A constructor that populates each field
     * @param name
     * @param length
     * @param favFood
     * @param isHuggable
     */
    public Boa(String name, int length, String favFood, boolean isHuggable){
        this.name = name;
        this.length = length;
        this.favFood = favFood;
        this.isHuggable = isHuggable;
    }


    public boolean fitInExhibit(int exhibitSideLength){
        return this.length < 4 * exhibitSideLength;
    }

    @Override
    public String name() {
        return this.name;
    }
}
