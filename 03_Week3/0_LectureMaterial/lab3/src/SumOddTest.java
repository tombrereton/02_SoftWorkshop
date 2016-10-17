import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TomBrereton on 14/10/2016.
 */
public class SumOddTest {

    @Test
    public void sumOddTest() {
        // exptected value of 4 if n = 4
        int expected = 4;

        int testSumOdd = SumOdd.sumOdd(4);

        assertEquals("The expected sum does not match the actual", expected, testSumOdd);

    }
    @Test
    public void sumOddTest2() {
        // exptected value of 25 if n = 10
        int expected = 25;

        int testSumOdd = SumOdd.sumOdd(10);

        assertEquals("The expected sum does not match the actual", expected, testSumOdd);

    }
}