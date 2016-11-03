package Ex3;

import java.util.ArrayList;

/**
 * A class which generates an arrayList but omits
 * all integers which contain a certain specified digit
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class Omit {

    /**
     * We use a method to check if an integer contains a digit
     * and return true if it does
     *
     * @param toCheck  the integer to check
     * @param contains the digit (of integer type) which might be contained in the toCheck integer
     * @return boolean, true if integer contains digit
     */
    public static boolean containsDigit(int toCheck, int contains) {
        String containString = Integer.toString(contains);
        return (String.valueOf(toCheck).contains(containString));
    }

    /**
     * We use a method to generate an arrayList which omits
     * all integers that contain a certain digit
     * e.g. omittedDigit = 3, arrayList = [1,2,4,5]
     * Note, the 3 is not in the list.
     * <p>
     * The loop invariant:
     * At iteration i, if i does not contain digit, n, then add
     * i to tempArrayList. The iteration starts at value 'from'
     * and terminates when i < 'to'
     *
     * @param from          the first integer of the list
     * @param to            the last integer of the list
     * @param ommittedDigit the digit which determines the integers to be omitted
     * @return allIntegersWithout, an arraList ranging from 'from' to 'to' but
     * omits any integer containing 'ommittedDigit'
     */
    public static ArrayList<Integer> allIntegersWithout(int from, int to, int ommittedDigit) {
        // We instantiate an arrayList of integer type
        ArrayList<Integer> tempArrayList = new ArrayList<>();

        // We loop over the range 'from' to 'to' and add it
        // to the arrayList if it matches the boolean condition
        for (int i = from; i <= to; i++) {

            // We check if the integer does NOT contain the digit
            // and add it if so
            if (!containsDigit(i, ommittedDigit)) {
                tempArrayList.add(i);
            }
        }
        return tempArrayList;
    }
}
