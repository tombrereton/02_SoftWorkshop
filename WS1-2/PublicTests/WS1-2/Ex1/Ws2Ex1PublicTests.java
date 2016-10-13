import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Public tests for Ex1.
 *
 * @author Alexandros Evangelidis
 * 
 */

public class Ws2Ex1PublicTests {

	private Employee e1;
	@Before
	public void setUp() {
	 e1 = new Employee("John","Smith",5);	
	}
	
	@Test
	public void test1() {
	
		e1.setFirstName("Nick");
	
		assertEquals("Nick",e1.getFirstName());
		assertEquals("Smith",e1.getSurname());
		assertEquals(5,e1.getYearOfJoining());
	}

	@Test
	public void test2() {
		
		e1.setSurname("Jones");
		
		assertEquals("John",e1.getFirstName());
		assertEquals("Jones",e1.getSurname());
		assertEquals(5,e1.getYearOfJoining());
	}

	@Test
	public void test3() {
		
		e1.setYearOfJoining(10);
		
		assertEquals("John",e1.getFirstName());
		assertEquals("Smith",e1.getSurname());
		assertEquals(10,e1.getYearOfJoining());
	}
	
	@Test
	public void test4() {
		e1.setFirstName("Nick");
		e1.setSurname("Jones");
		e1.setYearOfJoining(30);
		
		assertEquals("Nick",e1.getFirstName());
		assertEquals("Jones",e1.getSurname());
		assertEquals(30,e1.getYearOfJoining());
	}


}
