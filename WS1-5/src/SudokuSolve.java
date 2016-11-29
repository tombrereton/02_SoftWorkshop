import java.util.Arrays;

/**
 * This is a class called SodokuSolve.
 * It has a 2 dimensional array to represent
 * a Sudoku puzzle. Note, a zero in the array
 * represents an unfilled field.
 * Refer here for more information
 * on Sudoku puzzles:
 * https://en.wikipedia.org/wiki/Sudoku
 * <p>
 * Also, this class has the method, solve,
 * which solves a sudoku puzzle.
 *
 * @author Thomas Brereton
 * @version 2016.11.26i
 */
public class SudokuSolve extends Sudoku {

    /**
     * We use a constructor to create an object of the class
     * which is made up of the 2d array representing
     * a soduko puzzle
     *
     * @param array 2D array of type integer
     */
    public SudokuSolve(int[][] array) {
        super(array);
    }

    public void solve(){

        int[][] arrayToSolve = this.getArray();
        boolean[][] checkBoolean = SudokuCheck.check(this);

        System.out.println(Arrays.deepToString(checkBoolean));

        // Check which rows are solved
        // Exclude solved rows

        // Check which columns are solved
        // Exclude solved columns

        // Check which grids are solved
        // Exclude solved grids


        for(int i = 0; i < 9; i++) {
            if (!checkBoolean[0][i]) {
                // check if row is missing one number, join array and count length?
                // if one missing
                    // solve it
                    // start from row again
                // else
                    // continue to next loop
            }
        }

        for(int i = 0; i < 9; i++) {
            if (!checkBoolean[1][i]) {
                // check if column is missing one number
                // if one missing
                    // solve it
                    // start from row again
                // else
                    // continue to next loop
            }
        }


        for(int i = 0; i < 9; i++) {
            if (!checkBoolean[1][i]) {
                // check if grid is missing one number
                // if one missing
                    // solve it
                    // start from row again
                // else
                    // continue to next loop
            }
        }
    }
}
