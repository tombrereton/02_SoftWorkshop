package Ex1;

/**
 * This is a class called Invoice which
 * implements the interface, Measurable.
 *
 * @author Thomas Brereton
 * @version 2016.11.14
 */
public class Invoice implements Measurable{
    private String accountNumber;
    private String sortCode;
    private double amount;

    public Invoice(String accountNumber, String sortCode, double amount) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.amount = amount;
    }

    /**
     * We use a getMeasure method from the Measureable interface
     * to return Invoice's amount
     * @return amount of type double
     */
    public double getMeasure(){
        return this.amount;
    }
}
