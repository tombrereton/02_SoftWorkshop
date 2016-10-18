package Ex3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Public tests for Ex3.
 * 
 * @author Alexandros Evangelidis
 * 
 */

public class Ws2Ex3PublicTests {

	private Weight w1, w2;

	@Before
	public void setUp() {
		w1 = new Weight(5.3);
		w2 = new Weight(2.76);
	}

	@Test
	public void test1() {
		// expected weight in kilograms (for w1)
		double expected = 5.3;

		assertEquals(expected, w1.getKilograms(), 0.00000001);
	}

	@Test
	public void test2() {
		// expected weight in pounds (for w2)
		double expected = 6.084758436302621;

		assertEquals(expected, w2.getPounds(), 0.00000001);
	}

	@Test
	public void test3() {

		// expected weight in ounces (for w1)
		double expected = 186.95199833277618;
		
		assertEquals(expected, w1.getOunces(), 0.000001);
	}

	@Test
	public void test4() {

		// expected weight in ounces (for w2)
		double expected = 97.35613498084193;
		assertEquals(expected, w2.getOunces(),  0.000001);
	}

}
