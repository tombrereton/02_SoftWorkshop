import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/** JUnit tests for BankAccount.java 
 * Some tests about gender and password for the BankAccount example
 * @author  Manfred Kerber
 * @version 2016-10-25
 */

public class BankAccountTest {
    private Customer john, mary, sam;
    private BankAccount bankAccountJohn, bankAccountMary, bankAccountSam;

    @Before
    public void setUp() {
        john = new Customer ("John Smith", "M", "CS", "01214144789");
        mary = new Customer ("Mary Jones", "F", "CS", "01214144788");
        sam = new Customer ("Sam Smith", "X", "CS", "01214144787");
        bankAccountJohn = new BankAccount(john, "sesameJohn");
        bankAccountMary = new BankAccount(mary, "sesameMary");
        bankAccountSam = new BankAccount(sam, "sesameSam");
    }
    
    @Test
    public void test1() {
        assertEquals("Error in getGender()", "M", john.getGender());
        assertEquals("Error in getGender()", "F", mary.getGender());
        assertEquals("Error in getGender()", "X", sam.getGender());
        
        assertTrue("Error in checkPassword()", bankAccountJohn.checkPassword("sesameJohn"));
        assertFalse("Error in checkPassword()", bankAccountJohn.checkPassword("sesameMary"));
    }

@Rule public ExpectedException exception =
             ExpectedException.none();
    @Test public void test2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Gender must be \"M\", \"F\", or \"X\"");
        Customer acme = new Customer ("ACME", "NN", "CS", "01214144789");
    }
}
