package lecture05and06.answers06;

/** A Fuel Tank like for Diesel (Home Heating Oil) or Propane */
public class FuelTank {
    /** the amount of fuel in the tank in kilograms (kg) */
    public double amount;
    /** how many liters of water can be increased by 1 degree Celsius from 1kg of this fuel */
    public double kcalPotential;

    /**
     * Instantiates a fuel tank with a particular amount of fuel and potential of the specific fuel inside
     * @param amount (kg)
     * @param kcalPotential ex. diesel: 35028 C*L/kg; propane: 11900 C*L/kg
     */
    public FuelTank(double amount, double kcalPotential){
        this.amount = amount;
        this.kcalPotential = kcalPotential;
    }

    public double kgOfFuelToBurn(double amountOfWaterToHeat, double deltaDegrees){
        return (amountOfWaterToHeat * deltaDegrees) / this.kcalPotential;
    }

    public void spendKgOfFuel(double kg){
        this.amount -= kg;
        if(this.amount < 0.0) { this.amount = 0.0; }
    }

    /**
     *
     * @param kgBurned the amount of fuel to burn
     * @return C * L water raised by burning the fuel
     */
    public double celsius1LiterRaisedAfterBurning(double kgBurned){
        return this.kcalPotential * kgBurned;
    }
}
