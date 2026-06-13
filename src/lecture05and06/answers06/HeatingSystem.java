package lecture05and06.answers06;

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

        double amountOfWaterToHeat = this.waterTank.currentKg();
        double deltaDegrees = this.waterTank.deltaTempTo(60);
        double kgOfFuelToBurn = this.fuelTank.kgOfFuelToBurn(amountOfWaterToHeat, deltaDegrees);
        return this.furnace.secondsToBurnFuel(kgOfFuelToBurn);

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
        double kgOfFuelToBurn = this.furnace.kgBurnedAfter(seconds);

        this.fuelTank.spendKgOfFuel(kgOfFuelToBurn);
        // (C * L / kg) * kg -> C * L
        double celsiusLiters = this.fuelTank.celsius1LiterRaisedAfterBurning(kgOfFuelToBurn);
        // (C * L) / L -> C
        double deltaTemperature = celsiusLiters / this.waterTank.currentKg();
        this.waterTank.raiseBy(deltaTemperature);
    }

    public String toString(){
        return String.format("HS {%s | %s | %s}", this.furnace.toString(),
                this.fuelTank.toString(),
                this.waterTank.toString());
    }

    public boolean equals(Object o){
     if (o instanceof HeatingSystem hs){
         return this.furnace.equals(hs.furnace)&& this.fuelTank.equals(hs.fuelTank) && this.waterTank.equals(hs.waterTank);
     }
     else {
         return false;

     }  }
}
