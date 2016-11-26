import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by TomBrereton on 18/11/2016.
 */
public class FridayLabTest {

    int[] testArray1 = {1, 2, 3, 4};
    int[] testArray2 = {};
    double[][] testArray3 = {
            {4.0, 2.0, 6.0, 7.0},
            {7.0, 9.0, 5.0, 7.0},
            {0.0, 1.0, -5.0, 2.0}};
    double[][] testArray4 = {{}};

    @Rule
    public ExpectedException thrower = ExpectedException.none();

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void test1() throws Exception {
        int[] expected = {4, 3, 2, 1};

        assertArrayEquals("Reverse should return expected", expected, FridayLab.reverse(testArray1));
    }

    @org.junit.Test
    public void test2() throws Exception {
        int[] expected = {};

        assertArrayEquals("Reverse should return expected", expected, FridayLab.reverse(testArray2));
    }

    @org.junit.Test
    public void test3() throws Exception {
        double expected = -5.0;

        assertEquals("min should return expected", expected, FridayLab.min(testArray3), .001);
    }

    @org.junit.Test
    public void test4() throws Exception {
        double expected = -5.0;

        assertEquals("min should return expected", expected, FridayLab.min(testArray4), .001);
    }

    @Test
    public void test5() {

        FridayLab.min(testArray4);
    }

    @Test
    public void verifiesTypeAndMessage() {
        thrown.expect(FridayLab.min(testArray4));
        thrown.expectMessage("My custom runtime exception");

        FridayLab.min.throwsRuntime();
    }
}