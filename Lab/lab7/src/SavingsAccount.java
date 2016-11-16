import java.util.ArrayList;

/**
 * Created by TomBrereton on 11/11/2016.
 */
public class SavingsAccount extends BankAccount{

    private double interestRate;
    private ArrayList<Transaction> transactions;

    public SavingsAccount(Customer customer, String accountNumber, String password, double interestRate, ArrayList<Transaction> transactions) {
        super(customer, accountNumber, password);
        this.interestRate = interestRate;
        this.transactions = transactions;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", transactions=" + transactions +
                '}';
    }

    // assumes
    public int annualInterest() {
        double sum = 0;
        ArrayList<Transaction> tr = getTransactions();

        for (int i = 1; i < tr.size(); i++){
            sum += (tr.get(i).getDay() - tr.get(i-1).getDay()) / //numberOfDaysBetween i -1 and i
            365 *
            tr.get(i-1).getAmount() *//amountOn i-1
            getInterestRate();
        }

        return sum;
    }
}
