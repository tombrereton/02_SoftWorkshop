/**
 * Created by TomBrereton on 18/11/2016.
 */
public class FridayLab {

    /**
     * A method which reverses the order of an integer array
     *
     * @param a a 1D array
     * @return a reversed array
     * @throws ArrayIndexOutOfBoundsException
     */
    public static int[] reverse(int[] a) throws ArrayIndexOutOfBoundsException {
        int[] newA = new int[a.length];


        for (int i = 0; i < a.length; i++) {
            newA[i] = a[a.length - 1 - i];
        }
        return newA;
    }

    public static double min(double[][] a) throws ArrayIndexOutOfBoundsException {
        if(a.length == 0){
            throw new IllegalArgumentException("Use a proper double array you pleb head");
        }
        double min = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) min = a[i][j];
            }
        }
        return min;
    }


//    public static void main(String[] args) {
//        try {
//            int[] testArray1 = {};
//            reverse(testArray1);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array must be of length greater than 0");
//        }
//    }
}
