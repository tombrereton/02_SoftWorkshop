public String toString() {
    return String.format("%s, salary: %d",
        super.toString(),                         
        getPaymentAmount());
}