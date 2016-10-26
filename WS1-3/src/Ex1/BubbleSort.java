package Ex1;

/**
 * Created by TomBrereton on 25/10/2016.
 */
public class BubbleSort {

    /**
     * We create a method which sorts an arry of integers
     * into ascending order
     * @param numbers an array to be sorted
     * @return numbers the same array now sorted in ascending order
     */
    public static int[] bubbleSort(int[] numbers){

        // temp is automatically initialised to 0, therefore we do NOT write temp = 0
        int temp;

        // We loop from the 1st to the second to last element
        // i.e. this moves the last element to the beginning of the list
        // until the next element in front is smaller than the element
        // being moved
        for(int i = 0; i < numbers.length-1;i++) {

            // We loop from the last element to the ith element
            // i.e. from last to first element when i = 0
            for(int j = numbers.length-1; j > i; j--){

                // If the jth element is smaller than the j-1 element, we swap the 2 values
                if(numbers[j] < numbers[j-1]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
