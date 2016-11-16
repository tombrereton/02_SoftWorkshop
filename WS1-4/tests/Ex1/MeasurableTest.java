package Ex1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * This is a class called Statictics which
 * has 2 methods to calculate the mean and
 * standard deviation of some ArrayList.
 *
 * @author Thomas Brereton
 * @version 2016.11.14
 */
public class MeasurableTest {


    // SET UP

    Invoice inv = new Invoice("123456", "8901", 100);
    Patient p = new Patient("Joe Bloggs", 21, 86);


    ArrayList<Measurable> invoiceList = new ArrayList<>();
    ArrayList<Measurable> patientList = new ArrayList<>();

    @Before
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            invoiceList.add(new Invoice("123", "456", 10 * (i+1)));
        }

        for (int i = 0; i < 10; i++) {
            patientList.add(new Patient("Sally Sanders", 1*i, 3 * (i+1)));
        }
    }


    // TESTS

    @Test
    public void getMeasureTest() {
        double expected = 100;

        assertEquals("Should return amount of invoice: ", expected, inv.getMeasure(), 0.1);

    }

    @Test
    public void getMeasureTest2() {
        double expected = 86.0;

        assertEquals("Should return amount of weight: ", expected, p.getMeasure(), 0.1);

    }

    @Test
    public void getMeasureTest3() {
        double expected = 55.0;

        assertEquals("Should return mean of invoiceList: ", expected, Statistics.mean(invoiceList),0.01);

    }

    @Test
    public void getMeasureTest4() {
        double expected = 28.7222813;

        assertEquals("Should return standard deviation of invoiceList: ", expected, Statistics.standardDeviation(invoiceList),0.01);

    }

    @Test
    public void getMeasureTest5() {
        double expected = 16.5;

        assertEquals("Should return mean of patientList: ", expected, Statistics.mean(patientList),0.01);

    }

    @Test
    public void getMeasureTest6() {
        double expected = 8.61684;

        assertEquals("Should return standard deviation of patientList: ", expected, Statistics.standardDeviation(patientList),0.01);

    }
}
