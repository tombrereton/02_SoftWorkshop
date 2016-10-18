package Ex2;

/**
 * We import the JUnit library
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * STUDENT TEST CLASS
 */

/**
 * This contains JUnit tests to determine if the
 * Student class is running correctly.
 * Assert methods will be used to validate the
 * Student class methods.
 *
 * @author Thomas Brereton
 * @version 2016.10.07
 */
public class StudentTest {


    /**
     * We instantiate the objects s1 and s2 in the top
     * level of scope so they are available in the tests
     */

    private Student s1;
    private Student s2;

    /**
     * SET UP
     */

    /**
     * We construct (set up) the objects so we can test them
     * DO THESE NEED TO BE PRIVATE? I WOULD SAY NO
     */
    @Before
    public void setUp() {
        s1 = new Student("John Smith", "5 October 1993", "1111111", "MSc Computer Science");
        s2 = new Student("Nikola Tesla", "10 July 1856", "1111111", "MSc Spelunking");

    }

    /**
     * TESTS
     */

    /**
     * We test s1 and s2 with the following methods.
     * We are verbose with the method and variables names
     * to minimise descriptive comments
     */

    @Test
    public void getNameTest() {
        String expectedName = "John Smith";

        assertEquals("The expected name does not match the actual: ", expectedName, s1.getName());
    }

    @Test
    public void getDateOfBirthTest() {
        String expectedDateOfBirth= "5 October 1993";

        assertEquals("The expected date of birth does not match the actual:", expectedDateOfBirth, s1.getDateOfBirth());
    }

    @Test
    public void assertEqualsStudentID() {
        String expectedStudentID = "1111111";

        assertEquals("The expected student ID does not match the actual: ", expectedStudentID, s1.getStudentID());
    }

    @Test
    public void getDegreeProgrammeTest() {
        String expectedDegreeProgramme = "MSc Computer Science";

        assertEquals("The expected degree programme does not match the actual: ", expectedDegreeProgramme, s1.getDegreeProgramme());
    }

    @Test
    public void setNameTest() {
        String expectedNewName = "Neville Longbottom";
        s1.setName(expectedNewName);

        assertEquals("The expected name after setting a new name does not match the actual: ", expectedNewName, s1.getName());
    }

    @Test
    public void setDateOfBirthTest() {
        String exptectedNewDateOfBirth = "24 November 1988";
        s1.setDateOfBirth(exptectedNewDateOfBirth);

        assertEquals("The expected date of birth after setting a new date of birth does not match the actual: ", exptectedNewDateOfBirth, s1.getDateOfBirth());
    }

    @Test
    public void setStudentIDTest() {
        String expectedNewStudentID = "2222222";
        s1.setStudentID(expectedNewStudentID);

        assertEquals("The expected student ID after setting a new ID does not match the actual: ", expectedNewStudentID, s1.getStudentID());
    }

    @Test
    public void setDegreeProgrammeTest() {
        String expectedNewDegreeProgramme = "MSc Wandmaking";
        s1.setDegreeProgramme(expectedNewDegreeProgramme);

        assertEquals("The expected degree programme after setting a new ID does not match the actual: ", expectedNewDegreeProgramme, s1.getDegreeProgramme());
    }

    @Test
    public void toStringTest() {
        String expectedToString = "[John Smith, 5 October 1993, ID: 1111111, MSc Computer Science]";

        assertEquals("The expected toString output does not match the actual: " , expectedToString, s1.toString());
    }

    @Test
    public void equalsDifferentObjectsTest() {
        assertEquals("The equals test for comparing s1 and s2 is expected to be false: " , false, s1.equals(s2));
    }

    @Test
    public void equalsIdenticalObjectsTest() {
        s2 = new Student("John Smith", "5 October 1993", "1111111", "MSc Computer Science");

        assertEquals("The equals test for comparing e1 and e2 is expected to be true: " , true, s1.equals(s2));
    }
}