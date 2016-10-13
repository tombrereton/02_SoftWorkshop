/**
 * This program calculates the balance of some 
 * funds after a fixed interest rate is applied.
 */

public class ExerciseThree{
    public static void main(String[] args){
        // We define the capital and the interest rate
        double CapitalPounds = 100;    
        double InterestRate = 2.3;

        // We calculate the total balance for the first 5 years
        for(int i=1; i<6; i++){
            double total = CapitalPounds  * Math.pow(1 + 0.01 * InterestRate, i);
            System.out.println(String.format("%.2f", total));
        }

        // We calculate the total balance after 500 years
        double total = CapitalPounds  * Math.pow(1 + 0.01 * InterestRate, 500);
        System.out.format("%.2f", total);
    }
}
