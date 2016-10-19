package Ex1;

/**
 * EMPLOYEE CLASS
 */

/**
 * Employee is a class for a an employee
 * at a company. The class objects are created with
 * the employee's names and start date.
 * @author Thomas Brereton
 * @version 2016.10.06
 */

// NOTE I wrote the assignment in IntelliJ IDEA not Eclipse but it should work anyway.
// Please let me know if it doesn't

public class Employee{

    /**
     * FIELD VARIABLES
     */

    // we declare the field variables
    private String firstName;
    private String surname;
    private int yearOfJoining;

    /**
     * CONSTRUCTOR
     */

    /**
     * When instantiating a new object we use
     * the constructor Fraction to initialise the variables
     * @param firstName Employee's first name
     * @param surname Employee's last name
     * @param yearOfJoining Employee's start date
     */
    public Employee(String firstName,
                    String surname,
                    int yearOfJoining){
        this.firstName      = firstName;
        this.surname        = surname;
        this.yearOfJoining  = yearOfJoining;
    }

    /**
     * GETTERS
     */

    /**
     * We use getter methods to safely return variables
     * The three methods below return the employees first name,
     * surname, and the year the employee joined, respectively
     */

    /**
     * @return the first name of the employee
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * @return the surname of the employee
     */
    public String getSurname(){
        return this.surname;
    }

    /**
     * @return the year the employee joined the company
     */
    public int getYearOfJoining(){
        return this.yearOfJoining;
    }

    /**
     * SETTERS
     */

    /**
     * We use setter methods to safely give the variables a
     * new value.
     */

    /**
     * Sets the first name of an employee with a new string
     *
     * @param newFirstname the new first name of the employee
     */
    public void setFirstName(String newFirstname){
        this.firstName = newFirstname;
    }

    /**
     * Sets the surname of an employee with a new string
     *
     * @param newSurname the surname of the employee
     */
    public void setSurname(String newSurname){
        this.surname = newSurname;
    }

    /**
     * Sets the year of joining of an employee with a new integer
     *
     * @param newYearOfJoining the new year of joining of the employee
     */
    public void setYearOfJoining(int newYearOfJoining){
        this.yearOfJoining = newYearOfJoining;
    }

    /**
     * IS EQUALS
     */

    /**
     * Compares if two objects have identical values
     *
     * @return boolean if it is true (identical) or false (different)
     * @param other another employee object to compare with
     */
    public boolean equals(Employee other){
        return (this.firstName      == other.firstName     &&
                this.surname        == other.surname        &&
                this.yearOfJoining  == other.yearOfJoining);
    }

    /**
     * TO STRING
     */

    /**
     * We use a toString method to return the variables of an employee
     * as a string in a human friendly format
     *
     * @return the employee's first and last name, and the year they joined
     */
    public String toString(){
        return this.getFirstName() + " " + this.getSurname() +
                " " + "joined in the year, " + this.getYearOfJoining();
    }

}
