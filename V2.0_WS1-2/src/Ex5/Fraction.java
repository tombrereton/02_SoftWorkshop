package Ex5;

/**
 * FRACTION CLASS
 */

/**
 * Fraction is a class for that is constructed with 2
 * integers and creates a 'fraction' object
 * @author Thomas Brereton
 * @version 2016.10.13
 */

public class Fraction{

    /**
     * FIELD VARIABLES
     */

    // we declare the field variables
    private int numerator;
    private int denominator;

    /**
     * CONSTRUCTOR
     */

    /**
     * When instantiating a new object we use
     * the constructor Fraction to initialise the variables
     * @param numerator Fraction's numerator
     * @param denominator Fraction's denominator
     */
    public Fraction(int numerator,
                    int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * GETTERS
     */

    /**
     * We use getter methods to safely return variables
     * The methods below return the fractions numerator and
     * denominator
     */

    /**
     * @return the numerator of the fraction
     */
    public int getNumerator(){
        return this.numerator;
    }

    /**
     * @return the denominator of the fraction
     */
    public int getDenominator(){
        return this.denominator;
    }

    /**
     * SETTERS
     */

    /**
     * We use setter methods to safely give the variables a
     * new value.
     */

    /**
     * Sets the numerator of the fraction with a new value
     *
     * @param numerator the new numerator of the fraction
     */
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    /**
     * Sets the denominator of the fraction with a new value
     *
     * @param denominator the denominator of the employee
     */
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    /**
     * IS EQUALS
     */

    /**
     * Compares if two objects have identical values
     *
     * @return boolean if it is true (identical) or false (different)
     */
    public boolean equals(Fraction other){
        return (this.numerator ==  other.numerator &&
                this.denominator == other.denominator);
    }

    /**
     * TO STRING
     */

    /**
     * We use a toString method to return the variables of an employee
     * as a string in a human friendly format
     *
     * @return the employee's numerator, hourly salary, and monthly hours worked
     */
    public String toString(){
        return String.format("%d/%d",
                this.getNumerator(), this.getDenominator());
    }

    /**
     * ADDITION, MULTIPLY, LESS THAN
     */

    /**
     * We use a add method to perform the
     * summation of two fractions
     */
    public Fraction add(Fraction summand) {
        int numeratorSum = this.getNumerator() * summand.getDenominator() +
                summand.getNumerator() * this.getDenominator();
        int denominatorSum = this.getDenominator() * summand.getDenominator();

        return new Fraction(numeratorSum, denominatorSum);
    }

    public Fraction multiply(Fraction factor) {
        int numeratorProduct = this.getNumerator() * factor.getNumerator();
        int denominatorProduct = this.getDenominator() * factor.getDenominator();

        return new Fraction(numeratorProduct, denominatorProduct);
    }

    public boolean less(Fraction comp) {
        int thisNumeratorProduct = this.getNumerator() * comp.getDenominator();
        int compNumeratorProduct = comp.getNumerator() * this.getDenominator();

        return thisNumeratorProduct < compNumeratorProduct;
    }

}
