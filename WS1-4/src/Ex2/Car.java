package Ex2;

/**
 * This is a class called Car which extends Vehicle.
 * It contains the max speed,
 * max passengers, and fuel consumption.
 *
 * @author Thomas Brereton
 * @version 2016.11.15
 */
public class Car extends Vehicle {

    private double fuelConsumption;

    /**
     * We use a constructor to create an object the class
     * which is made up of maxSpeed, maxPassengers, and fuelConsumption.
     *
     * @param maxSpeed the maximum speed the car can travel
     * @param maxPassengers the maximum passengers the car can carry.
     *                      The minimum of which is 0 (autonomous car).
     * @param fuelConsumption the rate at which the car consumes fuel
     */
    public Car(double maxSpeed, int maxPassengers, double fuelConsumption) {
        super(maxSpeed, maxPassengers);
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Getter for fuel consumption
     * @return the fuel consumption of the car
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Setter for fuel consumption
     * @param fuelConsumption the fuel consumption of the car
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    /**
     * ToString method which includes the max speed,
     * maximum passenger, and fuel consumption in human readable format
     *
     * @return a human readable string
     */
    @Override
    public String toString() {
        return  super.toString() +
                String.format(" Its fuel consumption is %.1f l/100km.",
                this.getFuelConsumption());
    }
}
