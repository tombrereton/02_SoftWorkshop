/**
 * Employee is a class for a an employee
 * at a company. The class is created with
 * the employee's names and start date.
 * @author Thomas Brereton
 * @version 2016.10.06
 */

public class Employee{
    // we declare the field variables
    String firstName;
    String surname;
    int yearOfJoining;

    /**
     * when instaintiating a new object we use
     * a constructer to initialise the variables
     * @param firstName Employee's firstname
     * @param surname Employee's last name
     * @param yearOfJoining Employee's start date
     */
    public Employee(String firstName,
                    String surname,
                    int yearOfJoining){
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfJoining = yearOfJoining;
    }

    // we use getter methods to safely return variables
    // the three methods below return the employees first name,
    // surname, and the year the employee joined, respectively
    
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
     * We use setter methods to give the variable a
     * new value.
     */

    /**
     * Sets the surname of an employee with a new sting
     * 
     * @param surname the surname of the employee
     */
    public void setSurname(String newSurname){
        this.surname = newSurname;
    }

    /**
     * We use a toString method to return an employee
     * as a string in a human friendly format
     *
     * @return the employee's first and last name, and the year they joined
     */
    public String toString(){
        return this.getFirstName() + " " + this.getSurname() +
            " " + "joined in the year, " + this.getYearOfJoining();
    }
}
