package lecture08.activity;

public class Tiger implements Cageable {
    public double id;
    public double length;

    public Tiger(double id, double length){
        this.id = id;
        this.length = length;
    }

    /**
     * Computes whether this animal can fit in a cage
     *
     * @param exhibitSideLength with a square side length in feet
     * @return true if the animal fits
     */
    @Override
    public boolean fitInExhibit(int exhibitSideLength) {
        return (this.length<exhibitSideLength);
    }

    /**
     * @return the name of the animal
     */
    @Override
    public String name() {
        return "#Tiger no: "+ this.id;
    }
}
