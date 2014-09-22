

/**
 * the car class models a car with a constant fuel efficiency and tracks how much fuel is 
 * left in its tank
 * 
 * @author mefrey 
 * @version 9,12,14
 */
public class Car
{
    /** the fuel efficiency of this car measured in miles per gallon(mph) */
    private double fuelEfficiency;
    
    /**the fuel measured in gallons left in tank*/
    private double fuelInTank;

    /**
     * constructor for car that specifies fuel efficiency
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency=efficiency;
        fuelInTank=0;
    }

    /**
     * adds specified number of gallons of fuel to this cars tank
     *
     * @pre        the specified number of gallons will not exceed this car's tank capacity
     * @param    gallons    number of gallons of fuel to add to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank=this.fuelInTank+gallons;
    }
    /**
     * reduces fuel in this car's tank based of this car's fuel efficiency and the
     * specified number of miles driven
     *
     * @pre     the specified number of miles will not consume more than the amount of fuel
     *          in this car's tank
     * @param   miles   the number of miles driven
     */
    public void drive(double miles)
    {
        double gasBurned=miles/this.fuelEfficiency;
        this.fuelInTank=this.fuelInTank-gasBurned;
    }


    /**
     * returns the number of gallons of gas remaining in this car's tank
     *
     * @return  number of gallons remaining in this car's tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}
