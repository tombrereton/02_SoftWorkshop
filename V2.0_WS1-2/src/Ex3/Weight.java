package Ex3;

/**
 * WEIGHT CLASS
 */

/**
 * Weight is a class for converting kilograms into
 * imperial measurements
 * @author Thomas Brereton
 * @version 2016.10.12
 */

public class Weight{

    /**
     * FIELD VARIABLES
     */

    private double kilograms;
    private double pound;
    private double ounce;
    private double kgToPound;
    private double poundToOunce;

    /**
     * CONSTRUCTOR
     */

    /**
     * when instantiating a new object we use
     * a constructor to initialise the variables
     * @param kilograms the weight in kilograms
     * @param pound weight in pounds
     * @param ounce weight in ounces
     * @param kgToPound conversion factor from kilograms to pounds
     * @param poundToOunce conversion factor from pounds to ounces
     */
    public Weight(double kilograms){
        this.kilograms = kilograms;
        this.pound = 0;
        this.ounce = 0;
        this.kgToPound = 1/0.45359237;
        this.poundToOunce = 1/0.0625;
    }

    /**
     * GETTERS
     */

    /**
     * We use getter methods to safely return variables
     * We declare the methods of all the variables so we have a
     * safe level of abstraction which will help if we were to
     * alter and expand the class in the future
     */

    /**
     * @return the kilograms of the Weight
     */
    public double getKilograms() {
        return this.kilograms;
    }

    /**
     * @return the kilogram to pounds conversion
     */
    public double getKgToPound() {
        return this.kgToPound;
    }

    /**
     * @return the pound to ounces conversion
     */
    public double getPoundToOunce() {
        return this.poundToOunce;
    }

    /**
     * @return the pounds of the Weight
     */
    public double getPound() {
        this.pound = this.getKilograms() * this.getKgToPound();
        return this.pound;
    }
    /**
     * @return the ounces of the Weight
     */
    public double getOunce() {
        this.ounce = this.getKilograms() * this.getKgToPound() * this.getPoundToOunce();
        return this.ounce;
    }



    /**
     * SETTERS
     */

    /**
     * We use a setter method to safely give kilograms a
     * new value. We declare the methods void as we do not
     * wish to return anything. Only kilograms can be can be changed
     * as the remaining variables are dependent on it.
     */

    /**
     * Sets the kilograms of a student with a new double
     *
     * @param kilograms the new first kilograms of the employee
     */
    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    /**
     * IS EQUALS
     */

    /**
     * Compares if two objects variables have the value
     *
     * @return boolean if it is true (identical) or false (different)
     */
    public boolean equals(Weight other){
        return (this.kilograms ==  other.kilograms &&
                this.pound == other.pound &&
                this.ounce == other.ounce);
    }

    /**
     * TO STRING
     */

    /**
     * We use a toString method to return the variables of a student
     * as a string in a human friendly format
     *
     * @return the students's kilograms, date of birth, ID, and programme
     */
    public String toString() {
        return String.format(
                "The original weight in kilograms is: %.2f, " +
                "The weight converted to pounds is: %.2f, " +
                "The weight converted to ounces is: %.2f",
                this.getKilograms(), this.getPound(), this.getOunce());
    }
}

