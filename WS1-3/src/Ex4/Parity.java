package Ex4;

/**
 * Parity is a class which add parity to the array
 * in an additional row and column
 * <p>
 * To add parity means:
 * <p>
 * If the sum of the row or column is divisible by 2,
 * add 0 to the last column in the same row or
 * to the last row in the same column respectively.
 * Add 1 otherwise.
 * <p>
 * We assume all arrays are rectangular
 *
 * @author Thomas Brereton
 * @version 2016.10.27
 */
public class Parity {

    /**
     * TODO: insert method to check if array is rectangular
     */

    /**
     * We use a method to check the parity of the rows and columns of an m x n array
     * i.e. if the sum of the row or column is even, add 0, and if odd, add 1 to a new
     * integer in the same row or column
     * <p>
     * We assume that the arrays are rectangular
     *
     * @param array2d 2 dimensional array of integer type with dimensions m x n
     * @return new array2d, 2 dimensional array of integer type with dimensions m+1 x n+1
     */
    public static int[][] addParity(int[][] array2d) {
        int numberOfColumns = array2d[0].length;
        int numberOfRows = array2d.length;
        int sumRow = 0;
        int sumCol = 0;

        int[][] temp2dArray = new int[numberOfRows + 1][numberOfColumns + 1];

        // We start from the 'top' and  loop over the rows
        // to add the parity bit at the end
        for (int i = 0; i < numberOfRows; i++) {
            sumRow = 0;

            // We loop over the column for each row and sum the numbers
            // in the row. We also copy the current row of array2d to
            // temp2dArray which we return at the end of the method.
            for (int j = 0; j < array2d[i].length; j++) {
                sumRow += array2d[i][j];
                temp2dArray[i][j] = array2d[i][j];
            }
            // We assign the last bit (int) of each row to the remainder
            // of the sumRow when divided by 2
            temp2dArray[i][numberOfColumns] = sumRow % 2;
        }

        // We loop over the columns starting from the 'left and add the parity bit
        for (int j = 0; j < numberOfColumns; j++) {
            sumCol = 0;

            // We loop over the rows for each column and sum the numbers
            // in the column.
            for (int i = 0; i < numberOfRows; i++) {
                sumCol += array2d[i][j];
            }

            // We assign the last bit (int) of each column to the remainder
            // of the sumCol when divided by 2
            temp2dArray[numberOfRows][j] = sumCol % 2;
        }
        return temp2dArray;
    }

    /**
     * We use the checkParity method to check if any bit are incorrect
     *
     * @param array2d a rectangular array of type int
     * @return a boolean which is true if bits are correct, false if not
     */
    public static boolean checkParity(int[][] array2d) {
        return findRow(array2d) == -1 && findColumn(array2d) == -1;
    }

    /**
     * We use a method to check the rows of the 2D array.
     * We return the index of the incorrect row or -1 if all the rows are correct
     *
     * @param Array2D, a rectangular integer array that will have its rows checked for parity
     * @return an integer which is the index of the incorrect row, or -1 if correct
     */
    public static int findRow(int[][] Array2D) {
        int numberOfRows = Array2D.length;
        int numberOfColumns = Array2D[0].length;
        int sumRow;
        int lastRowBit;

        // We loop over the rows, where i is the row.
        // we set sumRow to 0 at the start of each loop
        // so we can sum the row and then compare the sum
        // with the lastRowBit for each row.
        for (int i = 0; i < numberOfRows; i++) {
            sumRow = 0;
            lastRowBit = Array2D[i][numberOfColumns - 1];

            // We are at ith row and sum its elements
            // except the final element
            // Loop invariant: For j, sumRow = sumRow + (row i, column element j, of Array2D)
            for (int j = 0; j < numberOfColumns - 1; j++) {
                sumRow += Array2D[i][j];
            }

            // We return the row index if the sum of the row
            // does not equal the last row bit
            if (sumRow % 2 != lastRowBit) {
                return i;
            }
        }
        return -1;
    }

    /**
     * We use a method to check the columns of a 2D array.
     * We return the index of the incorrect column or -1 if all the columns are correct
     *
     * @param Array2D, a rectangular integer array that will have its rows checked for parity
     * @return an integer which is the index of the incorrect column, or -1 if correct
     */
    public static int findColumn(int[][] Array2D) {
        int numberOfRows = Array2D.length;
        int numberOfColumns = Array2D[0].length;
        int sumCol;
        int lastColBit;

        // We loop over the columns, where j is the column.
        // we set sumCol to 0 at the start of each loop
        // so we can sum the column and then compare the sum
        // with the lastColBit for each column.
        // Loop invariant:
        for (int j = 0; j < numberOfColumns; j++) {
            sumCol = 0;
            lastColBit = Array2D[numberOfRows - 1][j];

            // We are at jth column and sum its elements
            // except the final element
            // Loop invariant: For i, sumCol = sumCol + (column j, row element i, of Array2D)
            for (int i = 0; i < numberOfRows - 1; i++) {
                sumCol += Array2D[i][j];
            }

            // We return the column index if the sum of the column
            // does not equal the last column bit
            if (sumCol % 2 != lastColBit) {
                return j;
            }
        }
        return -1;
    }
}



