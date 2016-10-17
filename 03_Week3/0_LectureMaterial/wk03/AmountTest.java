import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Some tests for the add method in the Amount class.
 */
public class AmountTest {
    private Amount a = new Amount(3,14);
    private Amount b = new Amount(2,15);
    private Amount c = a.add(b);
    
    @Test public void addTest1(){
	assertEquals(5, c.getPounds());
    }

    @Test public void addTest2(){
	assertEquals(29, c.getPence());
    }

    @Test public void addTest3(){
	assertEquals(529, c.getFullpence());
    }

    @Test public void addTest4(){
	assertTrue(c.equals(new Amount(5,29)));
    }
}
