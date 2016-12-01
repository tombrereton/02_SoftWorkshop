import java.util.Arrays;

/**
 * This is a class called Sodoku.
 * It has a 2 dimensional array to represent
 * a Sudoku puzzle. Note, a zero in the array
 * represents an unfilled field.
 * Refer here for more information
 * on Sudoku puzzles:
 * https://en.wikipedia.org/wiki/Sudoku
 *
 * @author Thomas Brereton
 * @version 2016.11.26i
 */

public class Sudoku {
    private int[][] array;


    /**
     * We use a constructor to create an object of the class
     * which is made up of the 2d array representing
     * a soduko puzzle
     *
     * @param array 2D array of type integer
     */
    public Sudoku(int[][] array) {
        this.array = array;
    }

    /**
     * Getter for 2d array representing Sudoku puzzle
     *
     * @return 2d array of type int
     */
    public int[][] getArray() {
        return this.array;
    }


    /**
     * Setter for 2d Sodoku array
     *
     * @param array of type int (2d array)
     */
    public void setArray(int[][] array) {
        this.array = array;
    }

    /**
     * We use a method to build the string
     * for human readable format
     *
     * @param a 2d array
     * @return a string in a soduko format
     */
    public String stringBuilder(int[][] a) {
        int numberOfRows = a.length;
        int numberOfColumns = a[0].length;

        String bigSeparatorLine = "++===+===+===++===+===+===++===+===+===++";
        String smallSeparatorLine = "++---+---+---++---+---+---++---+---+---++";
        String sudokuString = "";

        // Loop over the number of rows * 2 to account for the division lines
        for (int row = 0; row <= numberOfRows * 2; row++) {

            // Loop over the number of columns * 2 to account for the division lines
            for (int column = 0; column <= numberOfColumns * 2; column++) {

                // We insert bigSeparatorLine at relevant rows
                if (row % 6 == 0 || row == 18) {
                    sudokuString += bigSeparatorLine;
                    break;

                // We insert smallSeparatorLine at relevant rows
                } else if (row % 2 == 0) {
                    sudokuString += smallSeparatorLine;
                    break;

                // We insert the double pipe at the respective columns
                } else if (row % 2 == 1 && column % 6 == 0 || column == 18) {
                    sudokuString = sudokuString + "||";

                // We insert the single pipe at the respective columns
                } else if (row % 2 == 1 && column % 2 == 0) {
                    sudokuString = sudokuString + "|";

                // We print the array values
                // If the value is 0, we print out a blank space
                // If it is not 0, we print the number
                } else if (row % 2 == 1 && column % 2 == 1) {
                    if (arrayValue(row, column, a) == 0) {
                        sudokuString = sudokuString + "   ";
                    } else {
                        sudokuString = sudokuString + String.format(" %d ", (arrayValue(row, column, a)));
                    }
                }
            }
            if (row != numberOfRows * 2) {
                sudokuString = sudokuString + "\n";
            }
        }
        return sudokuString;
    }

    /**
     * We use a method to return the correct value of the array
     *
     * @param row    the current row
     * @param column the current column
     * @param a      the array we index into
     * @return the desired value in array a
     */
    public int arrayValue(int row, int column, int[][] a) {
        return a[row - (row / 2 + 1)][column - (column / 2 + 1)];

    }


    /**
     * We use a method to return true if an array is filled,
     * False if not, or contains zeros
     *
     * @param a the 2d array that we check if filled
     * @return a boolean, true for filled, false for not
     * @throws NullPointerException     when the array is null
     * @throws IllegalArgumentException when the array is empty
     */
    public static boolean isFilled(int[][] a) throws NullPointerException, IllegalArgumentException {

        int[][] emptyArray = new int[a.length][a[0].length];
        boolean isEmpty = Arrays.deepEquals(a, emptyArray);

        // We throw expected exceptions
        if (a == null) {
            throw new NullPointerException("Can't handle null arrays");
        } else if (isEmpty) {
            throw new IllegalArgumentException("Use non empty arrays");
        }

        // We loop over the input array and check if any value equals 0
        // If it equals 0, we return false, true otherwise
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * We use a to string method to print in human readeable format.
     * It uses the method stringBuilder to build the string.
     * @return A string of a sudoku puzzle in human readable format
     */
    @Override
    public String toString() {
        return stringBuilder(this.getArray());

    }
}
