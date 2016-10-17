/** BankAccount is a class for a very simple bank account created
 *  from a bank account and the name of the account holder.
 *  @author   Manfred Kerber
 *  @version  3 October 2012
 */
public class BankAccount
{
    private int     accountNumber;
    private String  accountName;
    private int     balance;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  aNumber is the account number as int
     *  @param  aName the account name as String
     */
    public BankAccount(int     aNumber, 
		       String  aName)

    {
    accountNumber      = aNumber;
    accountName        = aName;
    balance            = 0;
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /** 
     *  @return the account number of a BankAccount as int
     */
    public int getAccountNumber()
    {
     return accountNumber;
    }

    /** 
     *  @return the accountName as a String
     */
    public String getAccountName()
    {
	return accountName;
    }

    /** 
     *  @return the balance of a BankAccount 
     */
    public int getBalance()
    {
     return balance;
    }

    /** toString defines how to print a BankAccount
     *  
     *  @return  the print type of an account
     */
    public String toString()
    {
	return "Account number: " + accountNumber + 
  	       " Account name: "  + accountName   +
               " Balance: "       + balance;   
    }

    /* Now we write methods to set the parts of a bank account,
     * so called setters.
     */

    /** 
     *  sets the account number of a BankAccount 
      * @param newAccountNumber for the changed account number
      */
    public void setAccountNumber(int newAccountNumber)
    {
     accountNumber = newAccountNumber;
    }

    /**
     *  sets the balance of a BankAccount 
     *  @param  newBalance the new balance on the account
     */
    public void setBalance(int newBalance)
    {
     balance = newBalance;
    }

    /** the amount will be taken from the balance
     *  @param  amount the amount to be withdrawn
     */
    public void withdraw(int amount)
    {
	setBalance(getBalance() - amount);
    }
}

