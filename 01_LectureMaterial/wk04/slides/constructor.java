public BankAccount(int accountNumber, String  accountName) {
    this.accountNumber      = accountNumber;
    this.accountName        = accountName;
    this.balance            = 0;
}

public BankAccount(int accountNumber, 
                   String  accountName, 
                   int balance) {
    this.accountNumber      = accountNumber;
    this.accountName        = accountName;
    this.balance            = balance;
}
