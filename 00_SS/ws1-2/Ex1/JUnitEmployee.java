//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 * This contains JUnit tests to determine if the
 * Employee class is running correctly.
 * Assert methods will be used to validate the
 * output of the Employee class methods.
 *
 * @author Thomas Brereton
 * @version 2016.10.06
 */

public class JUnitEmployee{
    @Test
    public void assertEqualsFirstName(){

        Employee employeeTest = new Employee("Joe", "Blogs", 1999);

        assertEquals("failure in assertEqualsFirstName: " +
                "expected string not equal to given string",
                "Joe",
                employeeOne.getFirstName());
    }
}
