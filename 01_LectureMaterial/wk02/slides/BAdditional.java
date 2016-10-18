    /** the amount will be taken from the balance
     *  @param  amount the amount to be withdrawn
     */
    public void withdraw(int amount){
	setBalance(getBalance() - amount);
    }

    /** the amount will be added to the balance
     *  @param  amount the amount to be paid in.
     */
    public void payIn(int amount){
	setBalance(getBalance() + amount);
    }
}
