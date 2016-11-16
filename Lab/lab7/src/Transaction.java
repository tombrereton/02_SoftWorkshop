/**
 * Created by TomBrereton on 11/11/2016.
 */
public class Transaction {
    private int day;
    private String transactionType;
    private long amount;
    private long balance;

    public Transaction(int day, String transactionType, long amount, long balance) {
        this.day = day;
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
