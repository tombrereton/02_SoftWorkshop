import java.util.Arrays;

/**
 * Created by TomBrereton on 27/11/2016.
 */
public class SudokuCheck {

    /**
     * We use a method to check each row, column, and
     * 3x3 grid, of a Sudoku object contains numbers
     * 1 to 9 exactly once, or not.
     * <p>
     * b[0] is a 1x9 array representing the correctness of
     * each row from top to bottom
     * <p>
     * b[1] is a 1x9 array representing the correctness of
     * each column from left to right
     * <p>
     * b[2] is a 1x9 array representing the correctness of
     * each 3x3 grid from left to right, top to bottom
     *
     * @param sudoku a Sudoku object which will be checked
     *               for correctness
     * @return a 2d boolean array representing the correctness
     * of each row, column, and 3x3 grid
     */
    public static boolean[][] check(Sudoku sudoku) {
        boolean[][] b = new boolean[3][9];

        int[][] a = sudoku.getArray();
        int numberOfColumns = a[0].length;
        int numberOfRows = a.length;
        int sumRow = 0;
        int sumCol = 0;


        // TODO: 1. Change it checks single occurances of 1-9 when not a full row (it sum != 45)
        // TODO: 1. Try Arrays.equals(array1, array2)
        // TODO: 1. only has to check full array... dont do above??
        // TODO: 2. Change to 1 outer loop so more efficient? Or leave as 3 outer loops for readability?


        // We start from the 'top' and  loop over the rows
        // to check if the row sums to 45
        for (int i = 0; i < numberOfRows; i++) {
            sumRow = 0;

            // We loop over the columns for each row and sum the numbers
            // in the row.
            for (int j = 0; j < numberOfColumns; j++) {
                sumRow += a[i][j];
            }

            // checkNumberOfNumbers(sumRow[i]);

            // If the sum of the row is equal to 45 we assign
            // the respective element in the boolean array, b,
            // to true, false if not
            if (sumRow == 45) {
                b[0][i] = true;
            } else {
                b[0][i] = false;
            }
        }

        // We start from the 'left' and  loop over the columns
        // to check if the column sums to 45
        for (int j = 0; j < numberOfColumns; j++) {
            sumCol = 0;

            // We loop over the rows for each column and sum the numbers
            // in the column.
            for (int i = 0; i < numberOfRows; i++) {
                sumCol += a[i][j];
            }

            // If the sum of the row is equal to 45 we assign
            // the respective element in the boolean array, b,
            // to true, false if not
            if (sumCol == 45) {
                b[1][j] = true;
            } else {
                b[1][j] = false;
            }
        }

        // check each 3x3 grid if it contains 1 though 9 once, or not
        // loop over the 9 grids
        for (int i = 0; i < 9; i++) {
            int sumGrid = 0;

            // loop over 3 rows
            for (int j = 0; j < 3; j++) {

                // loop over 3 columns
                for (int k = 0; k < 3; k++) {
                    sumGrid += a[(i / 3 * 3 + j)][(i * 3 % 9) + k];
                }
            }

            if (sumGrid == 45) {
                b[2][i] = true;
            } else {
                b[2][i] = false;
            }
        }



        return b;
    }

    public static boolean checkNumberOfNumbers(int[] array1) {
        Arrays.sort(array1);

        int[] array2 = {1,2,3,4,5,6,7,8,9};

        Arrays.equals(array1, array2);

        String arrayJoin = Arrays.toString(array1);

        System.out.println(arrayJoin);

        return true;
    }
}
