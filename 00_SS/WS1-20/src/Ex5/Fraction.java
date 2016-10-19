package Ex5;

/**
 * FRACTION CLASS
 */

/**
 * Fraction is a class for that is constructed with 2
 * integers and creates a 'fraction' object which,
 * when printed, is in the format "n/d"
 * where n and d are numerator and denominator respectively
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
        this.numerator      = numerator;
        this.denominator    = denominator;
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
     * @param other A Fraction object to compare with
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
     * @return the Fraction's numerator and denominator in the format; n/d
     */
    public String toString(){
        return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    }

    /**
     * ADDITION, MULTIPLY, LESS THAN
     */

     /**
     * NOTE if the denominator is 0, it returns a fraction
     * on 0 i.e. "n/0" not undefined
     * Similarly if the numerator is 0, it returns "0/n"
     * not 0
     */

    /**
     * We use a add method to perform the
     * summation of two fractions
     * @param summand A Fraction object to add to the first Fraction
     * @return Fraction the summation of 2 fractions
     */
    public Fraction add(Fraction summand) {
        int numeratorSum = this.getNumerator() * summand.getDenominator() +
                summand.getNumerator() * this.getDenominator();

        int denominatorSum = this.getDenominator() * summand.getDenominator();

        return new Fraction(numeratorSum, denominatorSum);
    }

    /**
     * We use the Multiply method to multiply 2
     * fractions together
     * @param factor A fraction object to multiply to the first Fraction
     * @return Fraction the multiplication of 2 fractions
     */
    public Fraction multiply(Fraction factor) {
        int numeratorProduct = this.getNumerator() * factor.getNumerator();
        int denominatorProduct = this.getDenominator() * factor.getDenominator();

        return new Fraction(numeratorProduct, denominatorProduct);
    }

    /**
     * We use the less method to test if 1 fraction
     * is less than the other
     * @param comp A fraction object to compare with
     * @return boolean returns true if the 1st fraction (one method is called on)
     * is less than the 2nd fraction (the one passed as an argument)
     */
    public boolean less(Fraction comp) {
        int thisNumeratorProduct = this.getNumerator() * comp.getDenominator();
        int compNumeratorProduct = comp.getNumerator() * this.getDenominator();

        return thisNumeratorProduct < compNumeratorProduct;
    }

}
