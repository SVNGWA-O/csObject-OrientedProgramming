package lecture05and06.activity;

/** A Complete heating system with multiple subcomponents */
public class HeatingSystem {
    public Furnace furnace;
    public WaterTank waterTank;
    public FuelTank fuelTank;

    public HeatingSystem(Furnace furnace, WaterTank waterTank, FuelTank fuelTank){
        this.furnace = furnace;
        this.waterTank = waterTank;
        this.fuelTank = fuelTank;
    }

    /**
     * Uses the current fuel and water to get to 60 degrees
     * @return the time to get to 60 degrees Celsius in seconds
     */
    public double secondsUntil60Degrees(){
        return 0.0; //stub
    }

    /**
     * Run the heating system for some unit of seconds
     * @param seconds
     * Side effects:
     * - raises the temperature of the hot water tank
     * - consumes fuel
     */
    public void runFor(double seconds){
        //stub
    }
}
