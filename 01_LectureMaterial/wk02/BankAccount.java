/** BankAccount is a class for a very simple bank account created
 *  from a bank account and the name of the account holder.
 *  @author   Manfred Kerber
 *  @version  2015-10-06
 */
public class BankAccount{
    private int     accountNumber;
    private String  accountName;
    private int     balance;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  accountNumber is the account number as int
     *  @param  accountName the account name as String
     */
    public BankAccount(int     accountNumber, 
		       String  accountName){
    this.accountNumber      = accountNumber;
    this.accountName        = accountName;
    this.balance            = 0;
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /** 
     *  @return the account number of a BankAccount as int
     */
    public int getAccountNumber(){
     return accountNumber;
    }

    /** 
     *  @return the accountName as a String
     */
    public String getAccountName(){
	return accountName;
    }

    /** 
     *  @return the balance of a BankAccount 
     */
    public int getBalance(){
     return balance;
    }

    /** toString defines how to print a BankAccount
     *  
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account number: " + accountNumber + 
  	       " Account name: "  + accountName   +
               " Balance: "       + balance;   
    }

    /* Now we write methods to set the parts of a bank account,
     * so called setters.
     */

    /** 
     *  sets the account number of a BankAccount 
      * @param accountNumber for the changed account number
      */
    public void setAccountNumber(int accountNumber){
     this.accountNumber = accountNumber;
    }

    /**
     *  sets the balance of a BankAccount 
     *  @param balance the new balance on the account
     */
    public void setBalance(int balance){
     this.balance = balance;
    }

    /** the amount will be taken from the balance
     *  @param  amount The amount to be withdrawn.
     */
    public void withdraw(int amount){
	setBalance(getBalance() - amount);
    }

    /** the amount will be added the balance
     *  @param amount The amount to be paid in.
     */
    public void payIn(int amount){
	setBalance(getBalance() + amount);
    }
}

