package Ex3;

/**
 * We import the JUnit library
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * WEIGHT TEST CLASS
 */

/**
 * This contains JUnit tests to determine if the
 * Weight class is running correctly.
 * Assert methods will be used to validate the
 * Weight class methods.
 *
 * @author Thomas Brereton
 * @version 2016.10.12
 */
public class WeightTest {

    /**
     * We instantiate the objects s1 and s2 in the top
     * level of scope so they are available in the tests
     */

    private Weight w1;
    private Weight w2;

    /**
     * SET UP
     */

    /**
     * We construct (set up) the objects so we can test themgg
     */
    @Before
    public void setUp() {
        w1 = new Weight(80);
        w2 = new Weight(63.512);
    }

    /**
     * TESTS
     */

    /**
     * We test w1 and w2 with the following methods.
     * We are verbose with the method and variables names
     * to minimise descriptive comments
     */

    @Test
    public void getKilogramsTest() {
        double expectedKg = 80.0;

        assertEquals("The expected kg does not match the actual: ", expectedKg, w1.getKilograms(), 0.00001);
    }

    @Test
    public void getKilogramsToPoundsTest() {
        // expected kg to pound conversion rate
        double expected = 2.20463;

        assertEquals("The expected kg to pound does not match the actual: ", expected, w1.getKgToPound(), 0.00001);
    }

    @Test
    public void getPoundToOuncesTest() {
        // expected pound to ounce conversion rate
        double expected = 16.0;

        assertEquals("The expected pound to ounce conversion rate does not match the actual: ", expected, w1.getPoundToOunce(), 0.00001);
    }

    @Test
    public void getPoundsTest() {
        // expected weight in pounds
        double expected = 176.3699;

        assertEquals("The expected weight in pounds does not match the actual: ", expected, w1.getPounds(), 0.0001);
    }

    @Test
    public void getOuncesTest() {
        // expected weight in ounces
        double expected = 2821.91695;

        assertEquals("The expected ounce does not match the actual: ", expected, w1.getOunces(), 0.0001);
    }

    @Test
    public void setKilogramsTest() {
        // sets the the kgs to a new weight and then tests
        // if the weights are correct
        w1.setKilograms(43);

        double expectedKg = 43;
        double expectedPound = 94.7987;
        double expectedOunce = 1516.7803;

        assertEquals("The expected weight in kg does not match the actual: ", expectedKg, w1.getKilograms(), 0.0001);
        assertEquals("The expected weight in pounds does not match the actual: ", expectedPound, w1.getPounds(), 0.0001);
        assertEquals("The expected weight in ounces does not match the actual: ", expectedOunce, w1.getOunces(), 0.0001);
    }

    @Test
    public void setKilogramsTest2() {
        // sets the the kgs to a new weight and then tests
        // if the weights are correct
        w1.setKilograms(0);

        double expectedKg = 0;
        double expectedPound = 0;
        double expectedOunce = 0;

        assertEquals("The expected weight in kg does not match the actual: ", expectedKg, w1.getKilograms(), 0.0001);
        assertEquals("The expected weight in pounds does not match the actual: ", expectedPound, w1.getPounds(), 0.0001);
        assertEquals("The expected weight in ounces does not match the actual: ", expectedOunce, w1.getOunces(), 0.0001);
    }

    @Test
    public void equalsDifferentObjectsTest() {
        boolean expected = false;

        assertEquals("w1 is not identical to w2 therefore it should return false", expected, w1.equals(w2));
    }

    @Test
    public void equalsIdenticalObjectsTest() {
        w1.setKilograms(63.512);
        boolean expected = true;

        assertEquals("w1 is identical to w2 therefore it should return true", expected, w1.equals(w2));
    }

    @Test
    public void toStringTest() {
        String expected =
                "The original weight in kilograms is: 80.00, " +
                "The weight converted to pounds is: 176.37, " +
                "The weight converted to ounces is: 2821.92";

        assertEquals("The expected string output does now match the actual", expected, w1.toString());
    }
}