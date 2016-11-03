package Ex4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ParityTest is class to test the performance
 * of the Parity class
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class ParityTest {

    // SET UP

    /**
     * We instanstiate the Parity class so we can test the
     */
    int[][] testArray1 = {
            {0, 0, 0, 0},
            {1, 1, 1, 1}
    };
    int[][] testArray2 = {
            {0, 1, 1, 1, 0},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1}
    };
    int[][] testArray3 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };
    int[][] testArray4 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    int[][] testCorrectArray1 = {
            {0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 1, 0, 1, 1},
            {0, 1, 0, 1, 0, 0}
    };

    // TESTS

    @Test
    public void parityTest1() {
        int[][] expected = {
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 0}
        };

        assertArrayEquals(expected, Parity.addParity(testArray1));
    }

    @Test
    public void parityTest2() {
        int[][] expected = {
                {0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {0, 1, 0, 1, 0, 0}
        };

        assertArrayEquals(expected, Parity.addParity(testArray2));
    }

    @Test
    public void parityTest3() {
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertArrayEquals(expected, Parity.addParity(testArray3));
    }

    @Test
    public void parityTest4() {
        int[][] expected = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };

        assertArrayEquals(expected, Parity.addParity(testArray4));
    }

    @Test
    public void parityTest5() {

        assertTrue("The checkparity method should return true", Parity.checkParity(testArray3));
    }

    @Test
    public void parityTest6() {

        assertTrue("The checkparity method should return true", Parity.checkParity(testCorrectArray1));
    }

    @Test
    public void parityTest7() {

        assertEquals("Should return -1", -1, Parity.findColumn(testCorrectArray1));

    }

    @Test
    public void parityTest8() {

        assertEquals("Should return -1", -1, Parity.findRow(testCorrectArray1));
    }
}