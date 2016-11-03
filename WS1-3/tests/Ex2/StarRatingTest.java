package Ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * StarRatingTest is class to test the performance
 * of the StarRating class
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class StarRatingTest {
    // SET UP

    /**
     * We create ratings as doubles to test on
     */
    double rating1;
    double rating2;
    double rating3;
    double rating4;
    double rating5;
    double rating6;
    double rating7;
    double rating8;
    double rating9;

    /**
     * We initialise the ratings with a decimal value to test on
     */
    @Before
    public void setUp()  {
        rating1 = 1;
        rating2 = 3.5;
        rating3 = 4;
        rating4 = 4.5;
        rating5 = 5;
        rating6 = 0;
        rating7 = 50.01;
        rating8 = -1.0;
        rating9 = 0.1;
    }

    // TESTS

    @Test
    public void starRatingTest1()  {
        String expected = "CRAP";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating1));
    }

    @Test
    public void starRatingTest2()  {
        String expected = "CRAP";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating2));
    }
    @Test
    public void starRatingTest3()  {
        String expected = "OK";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating3));
    }
    @Test
    public void starRatingTest4()  {
        String expected = "EXCELLENT";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating4));
    }
    @Test
    public void starRatingTest5()  {
        String expected = "[HAS ONLY ONE REVIEW]";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating5));
    }
    @Test
    public void starRatingTest6()  {
        String expected = "CRAP";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating6));
    }
    @Test
    public void starRatingTest7()  {
        String expected = "[HAS ONLY ONE REVIEW]";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating7));
    }

    @Test
    public void starRatingTest8()  {
        String expected = "not rated";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating8));
    }

    @Test
    public void starRatingTest9() {
        double number = 7.1;
        double lower = 5;
        double upper = 10000.03;

        assertTrue("Expected method to return true", StarRating.isInRange(number, lower, upper));
    }

    @Test
    public void starRatingTest10() {
        double number = -10;
        double lower = 1;
        double upper = 5;

        assertFalse("Expected method to return false", StarRating.isInRange(number, lower, upper));
    }

    @Test
    public void starRatingTest11()  {
        String expected = "CRAP";

        assertEquals("actual interpretation of rating does not equal expected", expected, StarRating.interpret(rating9));
    }



}