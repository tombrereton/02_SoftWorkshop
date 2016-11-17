package Ex2;

/**
 * This is a class called Vehicle.
 * It contains the max speed and
 * max passengers
 *
 * @author Thomas Brereton
 * @version 2016.11.15
 */
public class Vehicle {
    private double maxSpeed;
    private int maxPassengers;

    /**
     * We use a constructor to create an object the class
     * which is made up of maxSpeed and maxPassengers.
     *
     * @param maxSpeed the maximum speed the car can travel
     * @param maxPassengers the maximum passengers the car can carry.
     *                      The minimum of which is 0 (autonomous car).
     */
    public Vehicle(double maxSpeed, int maxPassengers) {
        this.maxSpeed = maxSpeed;
        this.maxPassengers = Math.max(maxPassengers,0);
    }

    /**
     * Getter for max speed
     * @return max speed of car
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Getter for max passengers
     * @return max passenger of car
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * Setter for max speed
     * @param maxSpeed max speed of car
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Setter for maximum passengers
     * @param maxPassengers the maximum passengers of the car
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * ToString method which includes the max speed and
     * maximum passenger in human readable format
     *
     * @return a human readable string
     */
    @Override
    public String toString() {
        return String.format("The vehicle has a maximal speed of %.1f km/h." +
                        " It carries %d %s.",
                this.getMaxSpeed(),
                this.getMaxPassengers(),
                this.getMaxPassengers() != 1 ? "passengers" : "passenger");
    }
}
