package lecture05and06.answers06;

/** A passive "Hot Water Heater" tank*/
public class WaterTank {
    /** capacity in Liters */
    public double capacity;

    /** temperature in Celsius */
    public double temperature;

    /** percent full of hot water (0.0% - 100.0%) */
    public double percentFull;

    /**
     * Construct a water tank object
     * @param capacity the capacity of the tank to hold hot water in Liters (L)
     * @param temperature the temperature of the hot water in Celsius (C)
     * @param percentFull the percentage of the capacity currently filled with hot water.
     */
    public WaterTank(double capacity, double temperature, double percentFull){
        this.capacity = capacity;
        this.temperature = temperature;
        this.percentFull = percentFull;
    }


    public double currentKg(){
        return this.capacity * this.percentFull / 100.0;
    }

    public double deltaTempTo(double targetTemp){
        double delta = targetTemp - this.temperature;
        return delta< 0 ? 0.0 : delta;
    }

    public void raiseBy(double deltaCelsius){
        this.temperature += deltaCelsius;
    }

}
