public interface Payable {
    int getPaymentAmount();
    // no implementation, only head of method
}
public class Invoice implements Payable{
    // implementation of getPaymentAmount()
    public int getPaymentAmount(){
        ...
        return ...;
    }
}
public class Employee implements Payable{
    // implementation of getPaymentAmount()
    public int getPaymentAmount(){
    ...
    return ...;
    }
}
