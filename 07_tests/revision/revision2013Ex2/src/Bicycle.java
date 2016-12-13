/**
 * Created by TomBrereton on 1/12/2016.
 */
public class Bicycle extends Vehicle {
    private final int numberOfWheels = 2;

    public Bicycle(double speed, double weight) {
        super(speed, weight, 1);
    }

    public String toString(){
        return super.toString() + "\nIt has " +
                this.numberOfWheels + " wheels.";
    }

    public String toString2(){
        return getSpeed() + getWeight() + "\nIt has " +
                this.numberOfWheels + " wheels.";
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle(40,18);

        System.out.println(b);
    }
}
