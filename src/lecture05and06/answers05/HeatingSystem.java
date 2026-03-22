package lecture05and06.answers05;

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
        // in Liters
        double amountOfWaterToHeat = this.waterTank.capacity * this.waterTank.percentFull / 100.0;
        // Degrees C
        double deltaDegrees = 60 - this.waterTank.temperature;
        if(deltaDegrees < 0){
            return 0;
        }
        // (C * L) / (C*L/kg) -> kg
        double kgOfFuelToBurn = (amountOfWaterToHeat * deltaDegrees) / this.fuelTank.kcalPotential;
        // kg / (kg/s) -> s
        double timeToBurnFuel = kgOfFuelToBurn / this.furnace.fuelConsumption;
        return timeToBurnFuel;

    }

    /**
     * Run the heating system for some unit of seconds
     * @param seconds
     * Side effects:
     * - raises the temperature of the hot water tank
     * - consumes fuel
     */
    public void runFor(double seconds){
        // (kg / s) * s -> kg
        double kgOfFuelToBurn = this.furnace.fuelConsumption * seconds;

        this.fuelTank.amount -= kgOfFuelToBurn;
        if(this.fuelTank.amount < 0) {
            this.fuelTank.amount = 0.0;
        }
        // (C * L / kg) * kg -> C * L
        double celsiusLiters = this.fuelTank.kcalPotential * kgOfFuelToBurn;
        // (C * L) / L -> C
        double deltaTemperature = celsiusLiters / (this.waterTank.capacity * (this.waterTank.percentFull / 100.0));
        this.waterTank.temperature += deltaTemperature;
    }
}
