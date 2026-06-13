package lecture05and06.answers06;

/** A water boiler that consumes some amount of fuel */
public class Furnace {
    /** The rate at which this furnace consumes fuel while running (kilogram of fuel per second) */
    public double fuelConsumption;

    public String toString(){
        return String.format("F[%.1f]", this.fuelConsumption);
    }
    /**
     * Instantiates the furnace to a particular thoroughput
     * @param fuelConsumption (kg fuel/s)
     */
    public Furnace(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public double secondsToBurnFuel(double kgOfFuelToBurn){
        return kgOfFuelToBurn / this.fuelConsumption;
    }

    public double kgBurnedAfter(double seconds){
        return this.fuelConsumption * seconds;
    }


    public boolean equals(Object o){
        if(o instanceof Furnace furn){
            return Math.abs(this.fuelConsumption - furn.fuelConsumption) < 0.01;
        }
        else{
            return false;
        }
    }
}
