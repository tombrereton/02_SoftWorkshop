package Ex2;

/**
 * Created by TomBrereton on 15/11/2016.
 */
public class Car extends Vehicle {

    private double fuelConsumption;

    public Car(double maxSpeed, int maxPassengers, double fuelConsumption) {
        super(maxSpeed, maxPassengers);
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public String toString() {
        return super.toString() +
                String.format("\nIts fuel consumption is %.1f l/100km.",
                        this.getFuelConsumption());
    }
}
