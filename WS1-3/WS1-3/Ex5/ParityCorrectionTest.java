package Ex5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ParityCorrectionTest is class to test the performance
 * of the ParityCorrection class
 *
 * @author Thomas Brereton
 * @version 2016.10.30
 */
public class ParityCorrectionTest {

    // SET UP

    int[][] testArray1 = {
            {0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 1},
            {0, 1, 0, 1, 0, 0}
    };
    int[][] testArray2 = {
            {1, 0, 1, 0},
            {0, 1, 1, 1},
            {1, 1, 0, 0}
    };
    int[][] testArray3 = {
            {0, 0, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 0, 1}
    };
    int[][] testCorrectArray1 = {
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {1, 0, 1, 0}
    };

    @Test
    public void parityCorrectionTest1() {
        int[][] expected = {
                {0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {0, 1, 0, 1, 0, 0}
        };

        assertArrayEquals(expected, ParityCorrection.correctMatrix(testArray1));
    }

    @Test
    public void parityCorrectionTest2() {
        int[][] expected = {
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {1, 1, 0, 0}
        };

        assertArrayEquals(expected, ParityCorrection.correctMatrix(testArray2));
    }

    @Test
    public void parityCorrectionTest3() {
        int[][] expected = {
                {0, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1}
        };

        assertArrayEquals(expected, ParityCorrection.correctMatrix(testArray3));
    }

    @Test
    public void parityCorrectionTest4() {
        int expected = -1;

        assertEquals("Should return -1", expected, ParityCorrection.findColumn(testCorrectArray1));
    }

    @Test
    public void parityCorrectionTest5() {
        int expected = -1;

        assertEquals("Should return -1", expected, ParityCorrection.findRow(testCorrectArray1));
    }

    @Test
    public void parityCorrectionTest6() {
        int expected = 2;

        assertEquals("Should return 2", expected, ParityCorrection.findColumn(testArray1));
    }

    @Test
    public void parityCorrectionTest7() {
        int expected = 1;

        assertEquals("Should return 1", expected, ParityCorrection.findRow(testArray1));
    }

    @Test
    public void parityCorrectionTest8() {
        int[][] expected = {
                {0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {0, 1, 0, 1, 0, 0}
        };

        int row = 1;
        int col = 2;

        ParityCorrection.flipBit(row, col, testArray1);

        assertEquals("Should return 1", expected, testArray1);
    }

}