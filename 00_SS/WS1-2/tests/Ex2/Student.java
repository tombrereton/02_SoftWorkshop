package Ex2;

/**
 * STUDENT CLASS
 */

/**
 * Student is a class for a student at an university
 * The class has variables to store information
 * deemed relevant to a student.
 * @author Thomas Brereton
 * @version 2016.10.06
 */

public class Student{

    /**
     * FIELD VARIABLES
     */

    private String name;
    private String dateOfBirth;
    private String studentID;
    private String degreeProgramme;

    /**
     * CONSTRUCTOR
     */

    /**
     * when instantiating a new object we use
     * a constructor to initialise the variables
     * @param name Fraction's first name
     * @param dateOfBirth Fraction's last name
     * @param studentID Fraction's start date
     * @param degreeProgramme Fraction's start date
     */
    public Student(String name,
                   String dateOfBirth,
                   String studentID,
                   String degreeProgramme){
        this.name               = name;
        this.dateOfBirth        = dateOfBirth;
        this.studentID          = studentID;
        this.degreeProgramme    = degreeProgramme;
    }

    /**
     * GETTERS
     */

    /**
     * We use getter methods to safely return variables
     * We declare the methods of the variable type we wish to return
     */

    /**
     * @return the first name of the student
     */
    public String getName() {
        return this.name;
    }
    /**
     * @return the date of birth of the student
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    /**
     * @return the student ID of the student
     */
    public String getStudentID() {
        return this.studentID;
    }

    /**
     * @return the degree program of the student
     */
    public String getDegreeProgramme() {
        return this.degreeProgramme;
    }

    /**
     * SETTERS
     */

    /**
     * We use setter methods to safely give the variables a
     * new value. We declare the methods void as we do not
     * wish to return anything.
     */

    /**
     * Sets the name of a student with a new string
     *
     * @param name the new first name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sets the date of birth of a student with a new string
     *
     * @param dateOfBirth the new first name of the employee
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Sets the student ID of a student with a new string
     *
     * @param studentID the new first name of the employee
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Sets the degree programme of a student with a new string
     *
     * @param degreeProgramme the new first name of the employee
     */
    public void setDegreeProgramme(String degreeProgramme) {
        this.degreeProgramme = degreeProgramme;
    }

    /**
     * IS EQUALS
     */

    /**
     * Compares if two objects variables have the value
     *
     * @return boolean if it is true (identical) or false (different)
     */
    public boolean equals(Student other){
        return (this.name               ==  other.name          &&
                this.dateOfBirth        == other.dateOfBirth    &&
                this.studentID          == other.studentID      &&
                this.degreeProgramme    == other.degreeProgramme);
    }

    /**
     * TO STRING
     */

    /**
     * We use a toString method to return the variables of a student
     * as a string in a human friendly format
     *
     * @return the students's name, date of birth, ID, and programme
     */
    public String toString() {
        return "[" + this.getName() + ", " + this.getDateOfBirth() +
                ", ID: " + this.getStudentID() + ", " + this.getDegreeProgramme() + "]";
    }
}
