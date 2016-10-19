package Ex4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * EMPLOYEE TEST CLASS
 */

/**
 * This contains JUnit tests to determine if the
 * Employee (Ex4) class is running correctly.
 * Assert methods will be used to validate the
 * output of the Fraction class methods.
 * Note, this is a different Fraction class to
 * the class in "Ex1"
 *
 * @author Thomas Brereton
 * @version 2016.10.13
 */
public class EmployeeTest {

    /**
     * We instantiate the objects e1 and e2 in the top
     * level of scope so they are available in the tests
     */

    private Employee e1;
    private Employee e2;

    /**
     * SET UP
     */

    /**
     * We construct (set up) the objects so we can test them
     */

    @Before
    public void setUp() {
        e1 = new Employee("Pepper Potts", 16.0, 152);
        e2 = new Employee("Nancy Clementine", 22.0, 140);

    }

    /**
     * TESTS
     */

    /**
     * We test e1 and e2 with the following methods.
     * We are verbose with the method and variables names
     * to minimise descriptive comments
     */

    @Test
    public void getNameTest() {
        // expected name for e1
        String expected = "Pepper Potts";

        assertEquals("The expected value of name does not match the actual: "
                , expected, e1.getName());
    }

    @Test
    public void getHourlySalaryTest() {
        // expected hourly salary for e1
        double expected = 16.0;

        assertEquals("The expected value of the hourly salary does not match the actual: "
                , expected, e1.getHourlySalary(), .01);
    }

    @Test
    public void getNumberOfHoursTest() {
        // expected number of hours worked for e1
        int expected = 152;

        assertEquals("The expected value of hours worked does not match the actual: "
                , expected, e1.getNumberOfHours());

    }

    @Test
    public void setNameTest() {
        // set the name to a new string and test
        // it by using the getNumerator method
        e1.setName("Pepper Stark");
        String expected = "Pepper Stark";

        assertEquals("The expected new name does not match the actual: "
                , expected, e1.getName());
    }

    @Test
    public void setHourlySalaryTest() {
        // set the hourly salary to a new value and test
        // it by using the getDenominator method
        e1.setHourlySalary(5.0);
        double expected = 5.0;

        assertEquals("The expected new hourly salary does not match the actual: "
                , expected, e1.getHourlySalary(), 0.001);
    }

    @Test
    public void setNumberOfHoursTest() {
        // set the number of hours to a new value and test
        // it by using the getNumberOfHours method
        e1.setNumberOfHours(200);
        int expected = 200;

        assertEquals("The expected new number of hours does not match the actual: "
                , expected, e1.getNumberOfHours());
    }

    @Test
    public void equalsTest() {
        // e1 and e2 are different therefore we expect false
        boolean expected = false;

        assertEquals("The equals test for comparing e1 and e2 is expected to be false",
                expected, e1.equals(e2));

    }

    @Test
    public void toStringTest() {
        // expected string output from the toString method
        String expected = "Pepper Potts has an hourly salary of 16.00 and has worked 152 this month";

        assertEquals("The expected string output does not match the actual",
                expected, e1.toString());

    }

    @Test
    public void monthlySalaryTest() {
        // expected output for monthly salary method
        double expected = 2432.00;

        assertEquals("The expected value for the monthly salary does not match the actual",
                expected, e1.monthlySalary(), 0.001);
    }

    @Test
    public void increaseSalaryTest() {
        // we use the increaseSalary method to increase
        // the salary then test it using the monthlySalary method
        e1.increaseSalary(15);
        double expected = 2796.80;

        assertEquals("The expected monthly salary after increasing the salary does not match the actual",
                expected, e1.monthlySalary(), 0.001);
    }

    @Test
    public void increaseSalaryTest2() {
        // we use the increaseSalary method to increase
        // the salary then test it using the monthlySalary method
        e1.increaseSalary(0);
        double expected = 2432.00;

        assertEquals("The expected monthly salary after increasing the salary does not match the actual",
                expected, e1.monthlySalary(), 0.001);
    }
}