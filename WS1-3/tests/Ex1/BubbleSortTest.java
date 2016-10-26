package Ex1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TomBrereton on 25/10/2016.
 */
public class BubbleSortTest {

    // SET UP

    /**
     * We create an object to call the bubble sort method.
     * We instantiate 3 arrays to test on
     */
    BubbleSort bs = new BubbleSort();

    int [] testArray1 = new int[4];
    int [] testArray2 = new int[4];
    int [] testArray3 = new int[4];
    int [] testArray4 = new int[9];
    double [] testArray5 = new double[3];

    /**
     * We initialise the arrays with some integers to test on
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        testArray1 = new int[]{4, 3, 2, 1};
        testArray2 = new int[]{3, 4, 2, 2};
        testArray3 = new int[]{3, 4, 0, 2};
        testArray4 = new int[]{3, 4, 0, 2, 10, 42, 104, 17, 200};
        testArray5 = new double[]{10.2, 12.434, 5.2};

    }

    @Test
    public void bubbleSortTest1() throws Exception {
        int [] expected = {1,2,3,4};

        assertArrayEquals("array should be sorted", expected,bs.bubbleSort(testArray1));
    }

    @Test
    public void bubbleSortTest2() throws Exception {
        int [] expected = {2,2,3,4};

        assertArrayEquals("array should be sorted", expected,bs.bubbleSort(testArray2));
    }

    @Test
    public void bubbleSortTest3() throws Exception {
        int [] expected = {0,2,3,4};

        assertArrayEquals("array should be sorted", expected,bs.bubbleSort(testArray3));
    }

    @Test
    public void bubbleSortTest4() throws Exception {
        int [] expected = {0,2,3,4};

        assertArrayEquals("array should be sorted", expected,bs.bubbleSort(testArray3));
    }

    @Test
    public void bubbleSortTest3() throws Exception {
        Exception expected = Exception;

        assertEquals("array should be sorted", expected,bs.bubbleSort(testArray5));
    }
}