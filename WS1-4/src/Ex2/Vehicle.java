package Ex2;

/**
 * This is a class called WebCrawler.
 * It contains methods to extract hyperlinks
 * from URLs
 *
 * @author Thomas Brereton
 * @version 2016.11.15
 */
public class Vehicle {

    private double maxSpeed;
    private int maxPassengers;

    public Vehicle(double maxSpeed, int maxPassengers) {
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public boolean checkMaxPassengers(int maxPassengers) {
        return maxPassengers > 0;
    }

    @Override
    public String toString() {
        return String.format("The vehicle has a maximal speed of %.1f km/h.\n" +
                        "It carries %d %s.",
                this.getMaxSpeed(),
                this.getMaxPassengers(),
                this.getMaxPassengers() != 1 ? "passengers" : "passenger");
    }
}
