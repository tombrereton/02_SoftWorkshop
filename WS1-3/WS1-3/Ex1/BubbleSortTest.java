package Ex1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * BubbleSortTest is class to test the performance
 * of the BubbleSort class
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class BubbleSortTest {

    // SET UP

    /**
     * We create an object to call the bubble sort method.
     * We instantiate 3 arrays to test on
     */
    //BubbleSort bs = new BubbleSort();

    int[] testArray1 = new int[4];
    int[] testArray2 = new int[4];
    int[] testArray3 = new int[4];
    int[] testArray4 = new int[9];
    int[] testArray5 = new int[5];
    int[] testArray6 = new int[5];
    int[] testArray7 = new int[5];


    /**
     * We initialise the arrays with some integers to test on
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        testArray1 = new int[]{4, 3, 2, 1};
        testArray2 = new int[]{3, 4, 2, 2};
        testArray3 = new int[]{3, 4, 0, 2};
        testArray4 = new int[]{3, 4, 0, 2, 10, 42, 104, 17, 200};
        testArray5 = new int[]{-1, 0, -10, -20, -99};
        testArray6 = new int[]{-1, -100, -56, -100000, -23};
        testArray7 = new int[]{-1, 0, 99, -20, -31};


    }

    // TESTS

    @Test
    public void bubbleSortTest1() throws Exception {
        int[] expected = {1, 2, 3, 4};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray1));
    }

    @Test
    public void bubbleSortTest2() throws Exception {
        int[] expected = {2, 2, 3, 4};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray2));
    }

    @Test
    public void bubbleSortTest3() throws Exception {
        int[] expected = {0, 2, 3, 4};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray3));
    }

    @Test
    public void bubbleSortTest4() throws Exception {
        int[] expected = {0, 2, 3, 4, 10, 17, 42, 104, 200};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray4));
    }

    @Test
    public void bubbleSortTest5() throws Exception {
        int[] expected = {-99, -20, -10, -1, 0};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray5));
    }

    @Test
    public void bubbleSortTest6() throws Exception {
        int[] expected = {-100000, -100, -56, -23, -1};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray6));
    }

    @Test
    public void bubbleSortTest7() throws Exception {
        int[] expected = {-31, -20, -1, 0, 99};

        assertArrayEquals("array should be sorted", expected, BubbleSort.bubbleSort(testArray7));
    }
}