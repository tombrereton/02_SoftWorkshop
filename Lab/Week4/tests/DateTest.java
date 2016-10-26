import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TomBrereton on 21/10/2016.
 */
public class DateTest {


    @Test
    public void dateTest1() {
        assertTrue(Date.admissible(21,"January", 2016));

    }

    @Test
    public void dateTest2() {
        assertTrue(Date.admissible(31,"October", 2016));

    }

    @Test
    public void dateTest3() {
        assertFalse(Date.admissible(32,"October", 2016));

    }
    @Test
    public void dateTest4() {
        assertFalse(Date.admissible(29,"Monday", 2015));

    }
    @Test
    public void dateTest5() {
        assertFalse(Date.admissible(29,"February", -1));

    }
    @Test
    public void dateTest6() {
        assertTrue(Date.admissible(21,"October", 2016));

    }

    @Test
    public void dateTest7() {
        assertTrue(Date.admissible(21,"October", 2016));

    }

    @Test
    public void dateTest8() {
        assertFalse(Date.admissible(29,"February", 2016));

    }

    @Test
    public void dateTest9() {
        assertFalse(Date.admissible(31,"April", 2016));

    }

}