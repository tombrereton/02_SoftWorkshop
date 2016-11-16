/**
 * Created by TomBrereton on 11/11/2016.
 */
public class IslamicMortgageAccount extends BankAccount {

    private int months;
    private long payout;
    private long fee;

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     *
     * @param customer      The customer of the BankAccount.
     * @param accountNumber The accountNumber of the BankAccount.
     * @param password      The password to access the BankAccount.
     */
    public IslamicMortgageAccount(Customer customer, String accountNumber, String password, int months, long payout, long fee) {
        super(customer, accountNumber, password);
        this.months = months;
        this.payout = payout;
        this.fee = fee;
        setBalance(-(payout + fee));
    }

    public int getMonths() {
        return months;
    }

    public long getPayout() {
        return payout;
    }

    public long getFee() {
        return fee;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void setPayout(long payout) {
        this.payout = payout;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public int initialPayment() {
        return ((int)getPayout() + (int)getFee()) % (getMonths() - 1);
    }

    public int followUpPayment() {
        return ((int)getPayout() + (int)getFee()) / (getMonths() - 1) ;
    }

    @Override
    public String toString() {
        return super.toString() + " months=" + months;
    }

    @Override
    public boolean fundsAvailable(long amount) {
        return false;
    }

    public static void main(String[] args) {

        Customer jill = new Customer("Jill Miller", "SoCS", "07492234400");
        IslamicMortgageAccount jillsMortgage = new IslamicMortgageAccount(jill, "111111", "sesame", 240, 203000, 21459);

        System.out.println(jillsMortgage);

        jillsMortgage.withdraw(20, "sesame");

        System.out.println("Initial payment for Jill: " + jillsMortgage.initialPayment());

        System.out.println("Follow payment for Jill: " + jillsMortgage.followUpPayment());
    }
}



