package Ex1;

/**
 * BubbleSort is a class for sorting arrays
 * The static method bubblesort will sort and
 * return an array of type int
 *
 * Further explanation is found in line comments
 *
 * @author Thomas Brereton
 * @version 2016.10.26
 */
public class BubbleSort {

    /**
     * We create a method which sorts an array of integers
     * into ascending order.
     * <p>
     * The loop invariant is:
     * At iteration, i, the sub array, numbers[1 to i], is sorted and
     * the remaining sub array, numbers[i+1 to numbers.length] contains elements
     * greater in value than all elements in numbers[1 to i]
     *
     * @param numbers an array to be sorted
     * @return numbers the same array now sorted in ascending order
     */
    public static int[] bubbleSort(int[] numbers) {

        // temp is automatically initialised to 0, therefore we do NOT write temp = 0
        int temp = 0;

        // We loop from the 1st to the second to last element
        for (int i = 0; i < numbers.length - 1; i++) {

            // We loop from the last element to the ith element
            // i.e. from last to first element when i = 0
            for (int j = numbers.length - 1; j > i; j--) {

                // If the jth element is smaller than the j-1 element, we swap the 2 values
                if (numbers[j] < numbers[j - 1]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
