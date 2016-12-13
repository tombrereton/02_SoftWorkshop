public class Transaction {

	private int dayOfYear;
    private String typeOfTransaction; //"initial balance", "deposit", or "withdrawal"
    private long amount;
    private long balance; // balance after transaction
	public Transaction(int dayOfYear, String typeOfTransaction, long amount, long balance) {
		super();
		this.dayOfYear = dayOfYear;
		this.typeOfTransaction = typeOfTransaction;
		this.amount = amount;
		this.balance = balance;
	}
	public int getDayOfYear() {
		return dayOfYear;
	}
	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}
	public long getAmount() {
		return amount;
	}
	public long getBalance() {
		return balance;
	}
    
    
    
}