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
     * of each row, column, and 3x3 grid. False indicates it
     * is incorrect or not full.
     */
    public static boolean[][] check(Sudoku sudoku) {
        boolean[][] b = new boolean[3][9];

        int[][] a = sudoku.getArray();
        int numberOfColumns = a[0].length;
        int numberOfRows = a.length;
        int sumRow = 0;
        int sumCol = 0;




        // CHECK ROWS

        // We start from the 'top' and  loop over the rows
        // and store each row in a temporary array
        for (int i = 0; i < numberOfRows; i++) {
            int[] tempArray = new int[9];

            // We loop over the ith row and store it in tempArray
            for (int j = 0; j < numberOfColumns; j++) {
                tempArray[j] = a[i][j];
            }

            // If the ith row is full and contains 1 to 9 once,
            // we assign b[0][i] as true, false if not
            b[0][i] = checkNumberOfNumbers(tempArray);

        }

        // CHECK COLUMNS

        // We start from the 'left' and  loop over the columns
        // and store each column in a temporary array
        for (int j = 0; j < numberOfColumns; j++) {
            int[] tempArray = new int[9];


            // We loop over the jth column and store it in tempArray
            for (int i = 0; i < numberOfRows; i++) {
                tempArray[i] = a[i][j];
            }

            // If the jth column is full and contains 1 to 9 once,
            // we assign b[1][j] as true, false if not
            b[1][j] = checkNumberOfNumbers(tempArray);

        }

        // CHECK 3x3 GRIDS

        // check each 3x3 grid if it contains 1 though 9 once, or not
        // loop over the 9 grids
        for (int i = 0; i < 9; i++) {
            int[] tempArray = new int[9];

            // loop over 3 rows of the ith grid
            for (int j = 0; j < 3; j++) {

                // loop over 3 columns of the ith grid
                for (int k = 0; k < 3; k++) {

                    // We each element of the ith 3x3 grid in tempArray
                    tempArray[j * 3 + k] = a[(i / 3 * 3 + j)][(i * 3 % 9) + k];
                }
            }

            // If the ith 3x3 grid is full and contains 1 to 9 once,
            // we assign b[2][j] as true, false if not
            b[2][i] = checkNumberOfNumbers(tempArray);
        }


        return b;
    }

    public static boolean checkNumberOfNumbers(int[] array1) {
        for (int i = 0; i < 9; i++){
            if ( array1[i] > 9) {
                array1[i] = array1[i] - 10;
            }
        }

        Arrays.sort(array1);



        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        return Arrays.equals(array1, array2);

    }

    public static boolean isCompletedArray(Sudoku sudoku) {
        boolean[][] temp = check(sudoku);

        for (boolean[] row : temp){
            for(boolean element : row){
                if(!element){
                    return false;
                }
            }
        }
        return true;
    }
}
