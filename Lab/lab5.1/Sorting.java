/**
 * 
 * @author Alex Evangelidis and Manfred Kerber
 * @version 2016-10-27
 *
 * The class contains implementations of two sorting algorithms,
 * selectionSort and quickSort. Furthermore we have a method to check
 * whether a given array of type double[] is sorted.
 *
 */
public class Sorting {
    /**
     *  @param a An array for which it is to be checked whether it is sorted.
     *  @return true if and only if the array sorted in increasing order.
     */
    public static boolean isSorted(double[] a) {
    }

    /**
     *  An algorithm for sorting arrays (of type double[]). The idea is
     *  to consider the array consisting of two parts: the initial
     *  part (from the left) which is sorted (and initially empty) and
     *  the rest which is unsorted (and initially the whole array). In
     *  each iteration the smallest element from the unsorted part is
     *  selected and put at the end of the sorted part by
     *  swapping. That is, in the first round the smallest element in
     *  the whole array is selected and swapped with the element at
     *  position 0. In the next round the smallest element in the
     *  unsorted part of the array (from position 1 on) is determined
     *  and swapped with the element in position 1 and so on until the
     *  whole array is sorted.
     *
     *  @param a An array to be sorted.
     *  @return The sorted array.
     */
    public static double[] selectionSort(double[] a) {
        double tmp;
        int minIndex;
        /*
         *  The loop invariant for the outer loop is that after going
         *  through the loop ....
         */
        for (int i=0; i < a.length; i++){
            ....
            /*
             *  The loop invariant for the inner loop is that after
             *  going through the loop minIndex is the index of the
             *  smallest element in the array in the range between i
             *  and j (both included).
             */
            for (int j = i + 1; j< a.length; j++){
                ...

            }
            /*
             *  After the inner loop terminated, the minimal element
             *  of the range i (inclusively) and a.length
             *  (exclusively) is ..... This element is swapped
             *  with a[i].
             */
            ...
        }
        return a;
    }

    /**
     * Helper method to call quickSort.
     * @param a The array to be sorted
     * @return The sorted array.
     */
    public static double[] quickSort(double[] a) {
        if (a.length == 0) {
            return a;
        }
        return quickSort(a, 0, a.length - 1);
    }

    /**
     *   @param a The array to be sorted in a range.
     *   @param start The smallest index in the range of the array to be sorted.
     *   @param end The largest index in the range of the array to be sorted.
     *   @return The value of the pivot.
     */
    public static double determinePivot(double[] a, int start, int end) {
        // first get the pivot index (middle index of the array)
        int pivot_index = start + (end - start) / 2;

        // Use pivot to store the middle element of the array
        return a[pivot_index];
    }

    /**
     *   Performs in-place quicksort over the provided array,
     *   @param a The array to be sorted in a range.
     *   @param start The smallest index in the range of the array to be sorted.
     *   @param end The largest index in the range of the array to be sorted.
     *   @return The array in which the specified range is sorted.
     */
    public static double[] quickSort(double[] a, int start, int end) {
        double temp;
        int i = start;
        int j = end;

        double pivot = determinePivot(a, start, end);
        
        // As long as i and j do not cross
        while (i <= j) {

            // Scan the array from left to right as long as the
            // value is less than the pivot
            while (a[i] < pivot) {
                i++;
            }   

            // Scan the array from right to left as long as
            // the value is greater than the pivot
            while (a[j] > pivot) {
                j--;
            }

            // In the case where the ith element
            // is greater than the pivot
            // or in the case where the jth element
            // is less than the pivot
            // Swap i with j and increment and decrement
            // i and j, respectively.

            if (i <= j) {
                ....
            }
        }

        // At this point the partitioning phase
        // has been completed because i and j cross
        // Now call the same method recursively
        // for the two sub arrays("left" and "right")
        if (start < j)
            quickSort(....);
        if (i < end)
            quickSort(....);
        return a;
    }
}
