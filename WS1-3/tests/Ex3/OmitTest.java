package Ex3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * OmitTest is class to test the performance
 * of the Omit class
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class OmitTest {

    // SET UP


    // TESTS

    /**
     * we are verbose with variable and method names to minisise comments
     */
    @Test
    public void omitTest1() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10));
        int from = 1;
        int to = 10;
        int omit = 9;

        assertEquals("actual arraylist does not match expected", expected, Omit.allIntegersWithout(from, to, omit));
    }

    @Test
    public void omitTest2() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(20, 21, 22, 24, 25, 26, 27, 28, 29, 40, 41, 42, 44, 45));
        int from = 20;
        int to = 45;
        int omit = 3;

        assertEquals("actual arraylist does not match expected", expected, Omit.allIntegersWithout(from, to, omit));
    }

    @Test
    public void omitTest3() {
        int number = 30;
        int contains = 3;

        assertTrue("The method does return not true", Omit.containsDigit(number, contains));
    }

    @Test
    public void omitTest4() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(311, 312, 313, 314, 315, 316, 317, 318, 319, 321, 322, 323));
        int from = 300;
        int to = 323;
        int omit = 0;

        assertEquals("actual arraylist does not match expected", expected, Omit.allIntegersWithout(from, to, omit));
    }

    @Test
    public void omitTest5() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList());
        int from = 0;
        int to = 0;
        int omit = 0;

        assertEquals("actual arraylist does not match expected", expected, Omit.allIntegersWithout(from, to, omit));
    }

    @Test
    public void omitTest6() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));
        int from = 0;
        int to = 1;
        int omit = 1;

        assertEquals("actual arraylist does not match expected", expected, Omit.allIntegersWithout(from, to, omit));
    }
}