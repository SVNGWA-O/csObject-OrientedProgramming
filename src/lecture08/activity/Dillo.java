package lecture08.activity;

public class Dillo implements Cageable{
    public int id;
    public double length;
    public boolean rolledUp;

    public Dillo(int id, int length, boolean rolledUp){
        this.id = id;
        this.length = length;
        this.rolledUp = rolledUp;
    }

    /**
     * Computes whether this animal can fit in a cage
     *
     * @param exhibitSideLength with a square side length in feet
     * @return true if the animal fits
     */
    @Override
    public boolean fitInExhibit(int exhibitSideLength) {
        if(this.rolledUp){
            return (this.length/2)<exhibitSideLength;

        }
        else {
            return this.length < exhibitSideLength;
        }
    }

    /**
     * @return the name of the animal
     */
    @Override
    public String name() {
        return "Dillo#" +this.id;
    }
}
