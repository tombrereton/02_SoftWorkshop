package Ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a class called VehicleTest which
 * test the Vehicle and its child classes
 *
 * @author Thomas Brereton
 * @version 2016.11.15
 */
public class VehicleTest {

    // SET UP

    Vehicle v1 = new Vehicle(100,2);
    Vehicle v2 = new Vehicle(50,4);
    Vehicle v3 = new Vehicle(200,1);
    Car c1 = new Car(100,2,4.5);

    // TESTS

    @Test
    public void test1() throws Exception {
        String expected = "The vehicle has a maximal speed of 100.0 km/h. It carries 2 passengers.";

        assertEquals("Should return string equal to expected variable", expected, v1.toString());

    }

    @Test
    public void test2() throws Exception {
        String expected = "The vehicle has a maximal speed of 50.0 km/h. It carries 4 passengers.";

        assertEquals("Should return string equal to expected variable", expected, v2.toString());

    }

    @Test
    public void test3() throws Exception {
        String expected = "The vehicle has a maximal speed of 200.0 km/h. It carries 1 passenger.";

        assertEquals("Should return string equal to expected variable", expected, v3.toString());

    }

    @Test
    public void test4() throws Exception {
        String expected = "The vehicle has a maximal speed of 100.0 km/h. It carries 2 passengers. Its fuel consumption is 4.5 l/100km.";

        assertEquals("Should return string equal to expected variable", expected, c1.toString());

    }

    @Test
    public void test5() throws Exception {
        c1.setMaxPassengers(3);
        String expected = "The vehicle has a maximal speed of 100.0 km/h. It carries 3 passengers. Its fuel consumption is 4.5 l/100km.";


        assertEquals("Should return string equal to expected variable", expected, c1.toString());

    }

    @Test
    public void test6() throws Exception {
        c1.setMaxSpeed(0);
        c1.setFuelConsumption(0);
        c1.setMaxPassengers(0);
        String expected = "The vehicle has a maximal speed of 0.0 km/h. It carries 0 passengers. Its fuel consumption is 0.0 l/100km.";


        assertEquals("Should return string equal to expected variable", expected, c1.toString());

    }
}