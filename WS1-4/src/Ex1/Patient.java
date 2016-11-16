package Ex1;

/**
 * This is a class called Invoice which
 * implements the interface, Measurable.
 *
 * @author Thomas Brereton
 * @version 2016.11.14
 */
public class Patient implements Measurable {

    private String name;
    private int age;
    private double weight;

    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * We use a getMeasure method from the Measureable interface
     * to return Patient's weight
     *
     * @return weight of type double
     */
    public double getMeasure() {
        return this.weight;
    }
}
