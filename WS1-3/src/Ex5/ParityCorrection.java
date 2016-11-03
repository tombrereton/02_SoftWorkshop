package Ex5;

/**
 * This class checks if the parity of a
 * 2D array of type integer is incorrect
 * and corrects it if not.
 * <p>
 * We assume all arrays are rectangular
 *
 * @author Thomas Brereton
 * @version 2016.10.30
 */
public class ParityCorrection {

    /**
     * We use a method to check the parity of a rectangular 2D array.
     * If it is incorrect, we flip the bits and then return the corrected array
     *
     * @param Array2D, a rectangular integer array that will be checked for correct parity
     * @return corrected integer Array2D (if wrong), input Array2D if correct
     */
    public static int[][] correctMatrix(int[][] Array2D) {
        int row = findRow(Array2D);
        int col = findColumn(Array2D);

        // If a row or column is incorrect
        // we flip the incorrect bit
        if (row != -1 || col != -1) {
            flipBit(row, col, Array2D);
        }

        return Array2D;
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
            lastColBit = Array2D[numberOfRows-1][j];

            // We are at jth column and sum its elements
            // except the final element
            // Loop invariant: For i, sumCol = sumCol + (column j, row element i, of Array2D)
            for (int i = 0; i < numberOfRows-1; i++) {
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

    /**
     * We use a method to flip the incorrect bit in the 2D array
     * This method only manipulates the input array, hence it returns nothing
     *
     * @param row     the index of the incorrect row
     * @param col     the index of the incorrect column
     * @param array2D the array that will have the incorrect bit flipped
     */
    public static void flipBit(int row, int col, int[][] array2D) {
        if (array2D[row][col] == 0) {
            array2D[row][col] = 1;
        } else {
            array2D[row][col] = 0;
        }
    }
}
