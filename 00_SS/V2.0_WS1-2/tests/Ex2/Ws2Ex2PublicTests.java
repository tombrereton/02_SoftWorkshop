package Ex2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Public tests for Ex2.
 * 
 * @author Alexandros Evangelidis
 * 
 */

public class Ws2Ex2PublicTests {

	private Student s1;
	
	@Before
	public void setUp() {
		
	s1 = new Student("John", "6 October 1993", "05721", "MSc Computer Science");
	}
	
	@Test
	public void test1() {

		assertEquals("John",s1.getName());
		assertEquals("05721",s1.getStudentID());
		assertEquals("MSc Computer Science",s1.getDegreeProgramme());
	}

	@Test
	public void test2() {
		
		assertEquals("6 October 1993",s1.getDateOfBirth());	
	}
	
	@Test
	public void test3() {
		
		String expected = "[John, 6 October 1993, ID: 05721, MSc Computer Science]";
		assertEquals(expected, s1.toString());
	}

}
