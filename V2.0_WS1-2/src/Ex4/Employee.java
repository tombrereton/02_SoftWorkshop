package Ex4;

/**
 * EMPLOYEE CLASS
 */

/**
 * Fraction is a class for an employee
 * at a company. The class objects are created with
 * the employee's name, salary and hours worked.
 * @author Thomas Brereton
 * @version 2016.10.13
 */

public class Employee{

    /**
     * FIELD VARIABLES
     */

    // we declare the field variables
    private String name;
    private double hourlySalary;
    private int numberOfHours;

    /**
     * CONSTRUCTOR
     */

    /**
     * When instantiating a new object we use
     * the constructor Fraction to initialise the variables
     * @param name Fraction's name
     * @param hourlySalary Fraction's hourly salary
     * @param numberOfHours Fraction's number of hours worked in a month
     */
    public Employee(String name,
                    double hourlySalary,
                    int numberOfHours){
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.numberOfHours = numberOfHours;
    }

    /**
     * GETTERS
     */

    /**
     * We use getter methods to safely return variables
     * The methods below return the employees name,
     * hourlySalary, and hours worked per month, respectively
     */

    /**
     * @return the name of the employee
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return the hourlySalary of the employee
     */
    public double getHourlySalary(){
        return this.hourlySalary;
    }

    /**
     * @return the number of hours the employee worked in a month
     */
    public int getNumberOfHours(){
        return this.numberOfHours;
    }

    /**
     * SETTERS
     */

    /**
     * We use setter methods to safely give the variables a
     * new value.
     */

    /**
     * Sets the name of an employee with a new string
     *
     * @param name the new first name of the employee
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the hourlySalary of an employee with a new string
     *
     * @param hourlySalary the hourlySalary of the employee
     */
    public void setHourlySalary(double hourlySalary){
        this.hourlySalary = hourlySalary;
    }

    /**
     * Sets the number of hours the employee worked in a month
     *
     * @param numberOfHours the new year of joining of the employee
     */
    public void setNumberOfHours(int numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    /**
     * IS EQUALS
     */

    /**
     * Compares if two objects have identical values
     *
     * @return boolean if it is true (identical) or false (different)
     */
    public boolean equals(Employee other){
        return (this.name ==  other.name &&
                this.hourlySalary == other.hourlySalary &&
                this.numberOfHours == other.numberOfHours);
    }

    /**
     * TO STRING
     */

    /**
     * We use a toString method to return the variables of an employee
     * as a string in a human friendly format
     *
     * @return the employee's name, hourly salary, and monthly hours worked
     */
    public String toString(){
        return String.format("%s has an hourly salary of %.2f and has worked %d this month",
                this.getName(), this.getHourlySalary(), this.getNumberOfHours());
    }

    /**
     *  We define a monthly salary method which returns the money
     *  earned per month
     *  @param hourlySalary
     *  @param numberOfHours
     *  @return monthlySalary
     */
    public double monthlySalary() {
        return this.getHourlySalary() * this.getNumberOfHours();
    }

    /**
     *  We define an increase salary method to increase the hourly
     *  salary by a percentage (not a decimal value)
     *  i.e. 15% = 15.0
     *  @param percentage
     *  @param numberOfHours
     *  @return monthlySalary
     */
    public double increaseSalary(double percentage) {
        return this.hourlySalary = this.hourlySalary * (1 + percentage/100);
    }
}

