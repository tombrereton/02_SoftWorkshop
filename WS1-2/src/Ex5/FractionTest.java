package Ex5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * FRACTION TEST CLASS
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
public class FractionTest {

    /**
     * We instantiate the objects e1 and e2 in the top
     * level of scope so they are available in the tests
     */

    Fraction f1;
    Fraction f2;

    /**
     * SET UP
     */

    /**
     * We construct (set up) the objects so we can test them
     */

    @Before
    public void setUp() throws Exception {
        f1 = new Fraction(1,2);
        f2 = new Fraction(1,4);
    }

    /**
     * TESTS
     */

    /**
     * We test f1 and f2 with the following methods.
     * We are verbose with the method and variables names
     * to minimise descriptive comments
     */

    @Test
    public void getNumeratorTest() {
        // expected value to be 1
        int expected = 1;
        assertEquals("The expected value of the numerator does not match the actual: ", expected, f1.getNumerator());
    }

    @Test
    public void getDenominatorTest() {
        // expected value to be 1
        int expected = 2;
        assertEquals("The expected value of the denominator does not match the actual: ", expected, f1.getDenominator());
    }

    @Test
    public void setNumeratorTest() {
        // set the numerator to and new value and test it with a getter
        f1.setNumerator(5);
        int expected = 5;
        assertEquals("The expected value of the numerator does not match the actual: ", expected, f1.getNumerator());
    }

    @Test
    public void setDenominatorTest() {
        // set the numerator to and new value and test it with a getter
        f1.setDenominator(10);
        int expected = 10;
        assertEquals("The expected value of the denominator does not match the actual: ", expected, f1.getDenominator());
    }

    @Test
    public void equalsTest() {
        // we use the assertFalse method to test if the equals method is returning correctly
        assertFalse("The expected boolean does not return true", f1.equals(f2));
    }

    @Test
    public void toStringTest() {
        // the expected value is to be some formatted string
        String expected = "1/2";
        assertEquals("The expected toString output does not match the actual", expected, f1.toString());

    }

    @Test
    public void addTest() {
        // expected value for fraction summation
        String expected = "6/8";

        assertEquals("The expected summation does not match the actual", expected, f1.add(f2).toString());
    }

    @Test
    public void multiplyTest() {
        // expected value for fraction multiply
        String expected = "1/8";

        assertEquals("The expected multiply does not match the actual", expected, f1.multiply(f2).toString());

    }

    @Test
    public void lessThanFalseTest() {
        boolean expected = false;

        assertEquals("The expected value for the less than test is not the actual",
                expected, f1.less(f2));

    }

    @Test
    public void lessThanTrueTest() {
        // We give give f1 new values and
        // expect it to be less than f2
        f1.setDenominator(10);

        boolean expected = true;

        assertEquals("The expected value for the less than test is not the actual",
                expected, f1.less(f2));

    }

    @Test
    public void lessThanEqualTest() {
        // We give give f1 new values and
        // expect it to be less than f2
        f1.setDenominator(4);

        boolean expected = false;

        assertEquals("The expected value for the less than test is not the actual",
                expected, f1.less(f2));

    }

    @Test
    public void multiplyZeroTest() {
        // expected value for fraction multiply
        f2.setDenominator(0);
        String expected = "1/0";

        assertEquals("The expected multiply does not match the actual", expected, f1.multiply(f2).toString());

    }

    @Test
    public void multiplyZeroTest2() {
        // expected value for fraction multiply
        f2.setNumerator(0);
        String expected = "0/8";

        assertEquals("The expected multiply does not match the actual", expected, f1.multiply(f2).toString());

    }

}