package lecture05and06.activity;
/** A water boiler that consumes some amount of fuel */
public class Furnace {
    /** The rate at which this furnace consumes fuel while running (kilogram of fuel per second) */
    public double fuelConsumption;

    /**
     * Instantiates the furnace to a particular thoroughput
     * @param fuelConsumption (kg fuel/s)
     */
    public Furnace(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }


    public double howLong(double KgOfFuel){
            return KgOfFuel/this.fuelConsumption;
    }

    public double burnFuel(double seconds) {
    return fuelConsumption * seconds;
    }
}
