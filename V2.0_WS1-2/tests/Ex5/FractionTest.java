package Ex5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TomBrereton on 13/10/2016.
 */
public class FractionTest {

    Fraction f1;
    Fraction f2;

    @Before
    public void setUp() throws Exception {
        f1 = new Fraction(1,2);
        f2 = new Fraction(1,4);

    }

//    @Test
//    public void getNumerator() throws Exception {
//
//    }
//
//    @Test
//    public void getDenominator() throws Exception {
//
//    }
//
//    @Test
//    public void setNumerator() throws Exception {
//
//    }
//
//    @Test
//    public void setDenominator() throws Exception {
//
//    }
//
//    @Test
//    public void equals() throws Exception {
//
//    }
//
//    @Test
//    public void toString() throws Exception {
//
//    }
//
//    @Test
//    public void add() throws Exception {
//
//    }
//
//    @Test
//    public void multiply() throws Exception {
//
//    }

    @Test
    public void lessTestFalse() {
        boolean expected = false;

        assertEquals("The expected value for the less than test is not the actual",
                expected, f1.less(f2));

    }

    @Test
    public void lessTestTrue() {
        // We give give f1 new values and
        // expect it to be less than f2
        f1.setDenominator(10);

        boolean expected = true;

        assertEquals("The expected value for the less than test is not the actual",
                expected, f1.less(f2));

    }

}