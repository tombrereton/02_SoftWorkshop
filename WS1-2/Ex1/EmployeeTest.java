
/**
 * We import files in the Ex1 directory
 */
package Ex1;

/**
 * We import the JUnit library
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * EMPLOYEE TEST CLASS
 */

/**
 * This contains JUnit tests to determine if the
 * Fraction class is running correctly.
 * Assert methods will be used to validate the
 * output of the Fraction class methods.
 *
 * @author Thomas Brereton
 * @version 2016.10.06
 */
public class EmployeeTest {


    /**
     * We instantiate the objects e1 and e2 in the top
     * level of scope so they are available in all the tests
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
        e1 = new Employee("Joe", "Bloggs", 1999);
        e2 = new Employee("Joe", "Dangerfield", 1999);
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
    public void getFirstNameTest() {
        String expectedFirstName = "Joe";

        assertEquals("The expected first name does not match the actual: ", expectedFirstName, e1.getFirstName());
    }

    @Test
    public void getSurnameTest() {
        String expectedSurname = "Bloggs";

        assertEquals("The expected surname does not match the actual surname:", expectedSurname, e1.getSurname());
    }

    @Test
    public void getYearOfJoiningTest() {
        int expectedYearOfJoining = 1999;

        assertEquals("The expected year of joining does not match the actual: ", expectedYearOfJoining, e1.getYearOfJoining());
    }

    @Test
    public void setFirstNameTest() {
        String expectedNewFirstName = "Roger";
        e1.setFirstName(expectedNewFirstName);

        assertEquals("The expected first name after setting a new surname does not match the actual: ", expectedNewFirstName, e1.getFirstName());
    }

    @Test
    public void setSurnameTest() {
        String exptectedNewSurname = "Hamface";
        e1.setSurname(exptectedNewSurname);

        assertEquals("The expected surname after setting a new surname does not match the actual: ", exptectedNewSurname, e1.getSurname());
    }

    @Test
    public void setFirstNameTest2() {
        String expectedNewFirstName = "A";
        e1.setFirstName(expectedNewFirstName);

        assertEquals("The expected first name after setting a new surname does not match the actual: ", expectedNewFirstName, e1.getFirstName());
    }

    @Test
    public void setSurnameTest2() {
        String exptectedNewSurname = "C";
        e1.setSurname(exptectedNewSurname);

        assertEquals("The expected surname after setting a new surname does not match the actual: ", exptectedNewSurname, e1.getSurname());
    }

    @Test
    public void setYearOfJoiningTest() {
        int expectedNewYearOfJoining = 2015;
        e1.setYearOfJoining(expectedNewYearOfJoining);

        assertEquals("The expected year of joining after setting a new surname does not match the actual: ", expectedNewYearOfJoining, e1.getYearOfJoining());
    }

    @Test
    public void setYearOfJoiningTest2() {
        int expectedNewYearOfJoining = 0;
        e1.setYearOfJoining(expectedNewYearOfJoining);

        assertEquals("The expected year of joining after setting a new surname does not match the actual: ", expectedNewYearOfJoining, e1.getYearOfJoining());
    }

    @Test
    public void toStringTest() {
        String expectedToString = "Joe Bloggs joined in the year, 1999";

        assertEquals("The expected toString output does not match the actual: " , expectedToString, e1.toString());
    }

    @Test
    public void equalsDifferentObjectsTest() {
        assertEquals("The expected equals test for comparing e1 and e2 is expected to be false: " , false, e1.equals(e2));
    }

    @Test
    public void equalsIdenticalObjectsTest() {
        e2 = new Employee("Joe", "Bloggs", 1999);

        assertEquals("The expected equals test for comparing e1 and e2 is expected to be true: " , true, e1.equals(e2));
    }
}