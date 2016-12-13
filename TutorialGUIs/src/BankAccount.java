public class BankAccount {
    
    private Customer customer;
    private String   number;
    private String   password;
    private long     balance;
    
    
    
    
    //constructor
    /**
     * This constructor creates a bank account from the three parts, customer, accountNumber and password.
     *
     * @param customer The customer of the BankAccount.
     * @param accountNumber The accountNumber of the BankAccount.
     * @param password The password to access the BankAccount.
     */
    public BankAccount (Customer customer,
                        String   accountNumber,
                        String   password) {
        
        this.customer = customer;
        this.number   = accountNumber;
        this.password = password;
        this.balance  = 0;
    }
    
    
    
    
    //getters
    /**
     *  Getter for the balance
     *  @return The balance of the account.
     */
    public long getBalance(){
        return balance;
    }
    
    /**
     * Getter method to return the password.
     *
     * @return The password of the BankAccount.
     */
    private String getPassword(){
        return password;
    }
    
    
    
    
    /**
     * Method to compare the password with a given password.
     *
     * @param password The password to which the password of the this object is compared.
     * @return if the password of the BankAccount agrees or not
     */
    public boolean checkPassword(String password){
        return this.getPassword().equals(password);
    }
    
    
    
    
    //setters
    /**
     *  Setter for the password, protected by making it private.
     *  @param password The new password for the account.
     */
    private void setPassword(String password){
        this.password = password;
    }
    
    /**
     *  Getter for the customer
     *  @return The customer of the account.
     */
    public Customer getCustomer() {
        return customer;
    }
    
    /**
     *  Getter for the account number
     *  @return The number of the account.
     */
    public String getNumber() {
        return number;
    }
    
    
    
    /**
     *  Setter for the balance.
     *
     *  @param amount The new amount in the account
     */
    public void setBalance(long amount) {
        balance = amount;
    }
    
    
    
    
    // methods
    /**
     *   Method that adds amount to the current balance.
     *   @param amount The amount to be added to the current balance.
     */
    public void deposit(long amount) {
        
        setBalance( getBalance() + amount );
        
        System.out.printf("The deposit was successful.\n");
    }
    
    
    /**
     *  This method is to withdraw an amount from the current balance.
     *
     *  @param amount The amount to be withdrawn.
     *  @param password The password of the account
     */
    public void withdraw(long amount,
                         String password) {
        
        if (checkPassword(password) &&
            getBalance() >= amount){
            
            setBalance(getBalance() - amount);
            
            System.out.printf("The withdrawal of %s %d for %s was successful.\n",
                              amount,
                              customer.getCustomerName());
            
        } else {
            
            System.out.println("Withdrawal rejected. \n" +
                               "Insufficient funds or wrong password");
        }
    }
    
    /**
     * Changes the password from old to new if the old password is correct
     *
     * @param oldPassword The current password
     * @param newPassword The updated password
     */
    public void changePassword(String oldPassword,
                               String newPassword) {
        
        if (checkPassword(oldPassword)) {
            
            setPassword(newPassword);
            
            System.out.printf("Change of password for %s was successful.\n",
                              customer.getCustomerName());
            
        } else {
            
            System.out.printf("The password you entered for %s was incorrect.\n",
                              customer.getCustomerName());
            
        }
    }
    
    /**
     *  returns the name of a BankAccount's holder
     *  @return The customer name
     */
    public String holder() {
        return customer.getCustomerName();
    }
    
    /**
     *  transferMoney transfers money from the current account.
     *
     *  @param account The account to which which the money is transferred.
     *  @param amount The amount to be transferred.
     *  @param password The password of the account.
     */
    public void transferMoney(BankAccount account,
                              long        amount,
                              String      password){
        
        if (checkPassword(password) &&
            getBalance() >= amount) {
            
            System.out.printf("The transfer of %s %d for %s was successful.\n",
                              amount,
                              customer.getCustomerName());
            
            setBalance(getBalance() - amount);
            account.deposit(amount);
            
        } else {
            System.out.println("Transfer rejected.\n" +
                               "Insufficient funds or wrong password");
        }
    }
    
    
    
    
    /**
     *  toString method for an account
     *  @return A String representation of the account
     */
    public String toString() {
        return "Account number: " + number + " balance:"
        + balance;
    }
    
}