package Ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TomBrereton on 14/11/2016.
 */
public class VehicleTest {

    Vehicle v1 = new Vehicle(100,2);
    Vehicle v2 = new Vehicle(50,4);
    Vehicle v3 = new Vehicle(200,1);
    Car c1 = new Car(100,2,4.5);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test1() throws Exception {
        String expected = "The vehicle has a maximal speed of 100.0 km/h.\nIt carries 2 passengers.";

        assertEquals("Should return string equal to expected variable", expected, v1.toString());

    }

    @Test
    public void test2() throws Exception {
        String expected = "The vehicle has a maximal speed of 50.0 km/h.\nIt carries 4 passengers.";

        assertEquals("Should return string equal to expected variable", expected, v2.toString());

    }

    @Test
    public void test3() throws Exception {
        String expected = "The vehicle has a maximal speed of 200.0 km/h.\nIt carries 1 passenger.";

        assertEquals("Should return string equal to expected variable", expected, v3.toString());

    }

    @Test
    public void test4() throws Exception {
        String expected = "The vehicle has a maximal speed of 100.0 km/h.\nIt carries 2 passengers.\nIts fuel consumption is 4.5 l/100km.";

        assertEquals("Should return string equal to expected variable", expected, c1.toString());

    }

    @Test
    public void test5() throws Exception {
        c1.setMaxPassengers(3);
        String expected = "The vehicle has a maximal speed of 100.0 km/h.\nIt carries 3 passengers.\nIts fuel consumption is 4.5 l/100km.";


        assertEquals("Should return string equal to expected variable", expected, c1.toString());

    }

    @Test
    public void test6() throws Exception {
        c1.setMaxSpeed(0);
        c1.setFuelConsumption(0);
        c1.setMaxPassengers(0);
        String expected = "The vehicle has a maximal speed of 0.0 km/h.\nIt carries 0 passengers.\nIts fuel consumption is 0.0 l/100km.";


        assertEquals("Should return string equal to expected variable", expected, c1.toString());

    }
}