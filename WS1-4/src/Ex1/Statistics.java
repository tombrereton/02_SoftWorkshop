package Ex1;

import java.util.ArrayList;

/**
 * This is a class called Statictics which
 * has 2 methods to calculate the mean and
 * standard deviation of some ArrayList.
 *
 * @author Thomas Brereton
 * @version 2016.11.14
 */
public class Statistics {


    /**
     * We use a method to calculate the mean
     * of an ArrayList of type Measurable
     *
     * @param list, of type measurable
     * @return The mean of the values of type double
     */
    public static double mean(ArrayList<Measurable> list) {
        double sum = 0;

        // We loop over the ArrayList and sum all the elements
        // Loop invariant: The variable, sum[i], is equal to the sum
        // of list[0] to list[i]
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getMeasure();
        }

        return sum / list.size();

    }

    /**
     * We use a method to calculate the standard deviation of
     * an an ArrayList of type Measurable
     *
     * @param list, of type Measurable
     * @return The standard deviation of type double
     */
    public static double standardDeviation(ArrayList<Measurable> list) {
        double tempMean = mean(list);
        double tempSquaredDifference = 0;

        // We loop over the ArrayList and find the sum of the
        // squared difference of all the elements
        // Loop invariant: The variable, tempSquaredDifference[i],
        // is equal to the sum of (list[i] - mean)^2
        for (int i = 0; i < list.size(); i++) {
            tempSquaredDifference += Math.pow(list.get(i).getMeasure() - tempMean, 2);
        }

        return Math.sqrt(tempSquaredDifference / list.size());
    }
//
//    public static double getMeasure(){
//        return
//    }
}
