/**
 * This program calcualtes the sum and product
 * of 2 fractions.
 */

public class ExerciseFour{
    public static void main(String[] args){
        // We declare the exponent and denominator
        // as separate variables to perform the
        // calculations
        int e1, d1, e2, d2;

        // We define the values
        e1 = 1;
        d1 = 2;
        e2 = 1;
        d2 = 3;

        // We calculate the sum and product
        // of the exponent and denominator separately
        int es = e1 * d2 + e2 * d1;
        int ds = d1 * d2;

        int ep = e1 * e2;
        int dp = d1 * d2;

        // We print out the results 
        System.out.println("es: " + es);
        System.out.println("ds: " + ds);
        System.out.println("es/ds: " + es + "/" + ds);
        System.out.println("ep: " + ep);
        System.out.println("dp: " + dp);
        System.out.println("ep/dp: " + ep + "/" + dp);
    }
}
