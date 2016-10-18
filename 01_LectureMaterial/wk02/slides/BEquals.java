public boolean equals(Account a){
   return
     (this.getAccountNumber() == a.getAccountNumber()) &&
     (this.getAccountName().equals(a.getAccountName)) &&
     (this.getBalance() == a.getBalance());
}
