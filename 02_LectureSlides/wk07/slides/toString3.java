public String toString(boolean verbose) {
    if (verbose) {
       return String.format("%s\nSalary: %d", 
           super.toString(),
           getPaymentAmount()); 
    } else {
       return this.toString();
    }
}