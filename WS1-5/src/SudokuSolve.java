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

    /**
     * We use a method to solve an unsolved array. It acts
     * on the SudokuSolve object and returns nothing.
     * Refer to line comments for how it works.
     * <p>
     * Note, this method does not work on all Sudoku puzzles,
     * specifically the hard ones (as stated in the worksheet).
     */
    public void solve() {

        int[][] arrayToSolve = this.getArray();
        boolean[][] checkBoolean = SudokuCheck.check(this);

        boolean[] gridContainsNumber = new boolean[9];
        boolean[] rowContainsNumber = new boolean[9];
        boolean[] columnContainsNumber = new boolean[9];

        // We print out the sudoku in its unsolved state
        System.out.println(this);

        int rowInGrid = 0;
        int colInGrid = 0;
        int rowToEnter = 0;
        int colToEnter = 0;

        // We start trying number 1 in each grid
        int tryNumber = 1;

        // Loop over number to try in each grid
        // We loop and count the number of times 'tryNumber' can occur in each grid.
        // If the count is 1, we enter the value of 'tryNumber' into the correct
        // row and column of the grid.
        // Note, we store the row and column whenever the count is increased
        // Thus, allowing us the enter the 'tryNumber' into the grid at the right spot.
        while (tryNumber <= 9) {

            // We check if the grids contain the number, tryNumber, and get
            // a 1x9 boolean array where true indicates the grid does contain the number
            // and false indicates it does not contain the number
            gridContainsNumber = checkAllGridsForNumber(arrayToSolve, tryNumber);

            // We check if the rows contain the number, tryNumber, and get
            // a 1x9 boolean array where true indicates the row does contain the number
            // and false indicates it does not contain the number
            rowContainsNumber = checkAllRowsForNumber(arrayToSolve, tryNumber);

            // We check if the columns contain the number, tryNumber, and get
            // a 1x9 boolean array where true indicates the column does contain the number
            // and false indicates it does not contain the number
            columnContainsNumber = checkAllColumnsForNumber(arrayToSolve, tryNumber);

            // Loop over each grid
            for (int i = 0; i < 9; i++) {

                // We reset the count of tryNumber
                // occurrences for each grid
                int count = 0;

                // If grid doesn't contain number we loop over row in grid
                if (gridContainsNumber[i] == false) {
                    for (int j = 0; j < 3; j++) {

                        // We calculate the respective overall array row for each grid
                        rowInGrid = i / 3 * 3 + j;

                        // If the respective array row doesn't contain the
                        // number we loop over the columns
                        if (rowContainsNumber[rowInGrid] == false) {
                            for (int k = 0; k < 3; k++) {

                                // We calculate the respective overall array column for each grid
                                colInGrid = (i * 3 % 9) + k;

                                // If the respective array column doesn't contain the
                                // number and the current element of the grid is empty (0)
                                // we count the occurance and store the location
                                if (columnContainsNumber[colInGrid] == false) {
                                    if (arrayToSolve[rowInGrid][colInGrid] == 0) {
                                        count++;
                                        rowToEnter = rowInGrid;
                                        colToEnter = colInGrid;
                                    }
                                }
                            }
                        }
                    }

                }

                // If the count is 1 for the ith grid
                // We enter tryNumber into the stored location from before
                if (count == 1) {
                    arrayToSolve[rowToEnter][colToEnter] = tryNumber;

                    // We reset tryNumber to 0 so tries all the numbers again
                    // with a more solved sudoku
                    tryNumber = 0;
                }
            }
            tryNumber++;
        }

        // We print out the sudoku object in its solved state
        System.out.println(this);

    }

    /**
     * We use a method to check which grids contain a number. We return
     * a boolean array which has size equal to the number of grids.
     * <p>
     * If the ith element equals true it indicates the number exists in the
     * ith grid. False indicates it does not exist in the ith grid.
     *
     * @param a      the array we checking the grids of
     * @param number the number we are checking if the grids contain
     * @return a boolean array indicating which grids contain the number
     */
    public boolean[] checkAllGridsForNumber(int[][] a, int number) {
        boolean[] temp = new boolean[9];

        for (int i = 0; i < 9; i++) {
            int[] gridArray = getGrid(a, i);
            temp[i] = checkContains(gridArray, number);
        }
        return temp;
    }

    /**
     * We use a method to check which rows contain a number. We return
     * a boolean array which has size equal to the number of rows.
     * <p>
     * If the ith element equals true it indicates the number exists in the
     * ith row. False indicates it does not exist in the ith row.
     *
     * @param a      the array we checking the row of
     * @param number the number we are checking if the row contain
     * @return a boolean array indicating which rows contain the number
     */
    public boolean[] checkAllRowsForNumber(int[][] a, int number) {
        boolean[] temp = new boolean[9];

        for (int i = 0; i < 9; i++) {
            int[] rowArray = getRow(a, i);
            temp[i] = checkContains(rowArray, number);
        }
        return temp;
    }

    /**
     * We use a method to check which columns contain a number. We return
     * a boolean array which has size equal to the number of columns.
     * <p>
     * If the ith element equals true it indicates the number exists in the
     * ith column. False indicates it does not exist in the ith column.
     *
     * @param a      the array we checking the column of
     * @param number the number we are checking if the column contain
     * @return a boolean array indicating which columns contain the number
     */
    public boolean[] checkAllColumnsForNumber(int[][] a, int number) {
        boolean[] temp = new boolean[9];

        for (int i = 0; i < 9; i++) {
            int[] columnArray = getColumn(a, i);
            temp[i] = checkContains(columnArray, number);
        }
        return temp;
    }

    /**
     * We use a method to get a 1d array for a certain row
     * in a 2d array.
     *
     * @param a the 2d array we get the 1d row array from
     * @param rowNumber the row we want from the array
     * @return the row array we want from the 2d array
     */
    public int[] getRow(int[][] a, int rowNumber) {

        int numberOfColumns = a[0].length;
        int[] tempArray = new int[9];

        for (int i = 0; i < numberOfColumns; i++) {
            tempArray[i] = a[rowNumber][i];
        }
        return tempArray;
    }

    /**
     * We use a method to get a 1d array for a certain column
     * in a 2d array.
     *
     * @param a the 2d array we get the 1d column array from
     * @param columnNumber the column we want from the array
     * @return the column array we want from the 2d array
     */
    public int[] getColumn(int[][] a, int columnNumber) {

        int numberofRows = a.length;
        int[] tempArray = new int[9];

        for (int i = 0; i < numberofRows; i++) {
            tempArray[i] = a[i][columnNumber];
        }
        return tempArray;
    }

    /**
     * We use a method to get a 1d array for a certain grid
     * in a 2d array.
     *
     * @param a the 2d array we get the 1d grid array from
     * @param gridNumber the grid we want from the array
     * @return a 1d array representing a grid we want from the 2d array
     */
    public int[] getGrid(int[][] a, int gridNumber) {
        int[] tempArray = new int[9];

        // loop over 3 rows of the ith grid
        for (int j = 0; j < 3; j++) {

            // loop over 3 columns of the ith grid
            for (int k = 0; k < 3; k++) {

                // We each element of the ith 3x3 grid in tempArray
                tempArray[j * 3 + k] = a[(gridNumber / 3 * 3 + j)][(gridNumber * 3 % 9) + k];
            }
        }

        return tempArray;
    }

    /**
     * We use a method to check if a 1d dimensional array contains a number
     * @param array The array we want to check if it contains a number
     * @param number The number we want to check if it occurs in the array
     * @return A boolean which is true if the array conatins the number,
     * false if not
     */
    public boolean checkContains(int[] array, int number) {
        for (int i = 0; i < 9; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public void solveInitial() {

        int[][] arrayToSolve = this.getArray();
        boolean[][] checkBoolean = SudokuCheck.check(this);

        System.out.println(Arrays.deepToString(checkBoolean));


        // OUTLINE

        // Check which rows are solved
        // Exclude solved rows

        // Check which columns are solved
        // Exclude solved columns

        // Check which grids are solved
        // Exclude solved grids

        int unsolvedCount;
        int sum;
        int missingNumberRow = 0;
        int missingNumberColumn = 0;

        // Loop over the rows, from top to bottom
        for (int i = 0; i < 9; i++) {

            // TODO: 1 abstract this into a method which is the same as column
            // ROW SOLVER
            // We check if a row is unsolved, and see if we can solve it
            if (!checkBoolean[0][i]) {
                unsolvedCount = 0;
                sum = 0;

                // We loop over the columns for row i and fill
                // in the missing value, if only 1 number is missing
                for (int j = 0; j < 9; j++) {

                    // We count exiting numbers to find missing number
                    sum += arrayToSolve[i][j];

                    // We check if number is 0 (unfilled)
                    if (arrayToSolve[i][j] == 0) {

                        // We count the missing values and record the
                        // location of the last missing number
                        unsolvedCount++;
                        missingNumberColumn = j;
                    }
                }

                // If only 1 number is missing, we fill the row with the missing number
                if (unsolvedCount == 1) {

                    // find missing number from existingNumbers, 45 - sum of numbers
                    int missingNumber = 45 - sum;

                    // enter missing number into array
                    arrayToSolve[i][missingNumberColumn] = missingNumber;

                    // loop through every row, column, and grid again
                    i = 0;
                }
            }

            // COLUMN SOLVER
            // We check if the ith column is unsolved, and see if we can solve it
            if (!checkBoolean[1][i]) {
                unsolvedCount = 0;
                sum = 0;

                // We loop over the columns for row i and fill
                // in the missing value, if only 1 number is missing
                for (int j = 0; j < 9; j++) {

                    // We count exiting numbers to find missing number
                    sum += arrayToSolve[j][i];

                    // We check if number is 0 (unfilled)
                    if (arrayToSolve[j][i] == 0) {

                        // We count the missing values and record the
                        // location of the last missing number
                        unsolvedCount++;
                        missingNumberRow = i;
                    }
                }

                // If only 1 number is missing, we fill the row with the missing number
                if (unsolvedCount == 1) {

                    // find missing number from existingNumbers, 45 - sum of numbers
                    int missingNumber = 45 - sum;

                    // enter missing number into array
                    arrayToSolve[missingNumberRow][i] = missingNumber;

                    // loop through every row, column, and grid again
                    i = 0;
                }
            }

            // GRID SOLVER
            // TODO: abstract this into its own method

            // We check if the ith 3x3 grid is unsolved, and see if we can solve it
            if (!checkBoolean[2][i]) {
                unsolvedCount = 0;
                sum = 0;

                // We loop over the rows for grid i and fill
                // in the missing value, if only 1 number is missing
                for (int j = 0; j < 3; j++) {

                    // loop over the columns for grid i
                    for (int k = 0; k < 3; k++) {
                        // We count exiting numbers to find missing number
                        sum += arrayToSolve[(i / 3 * 3 + j)][(i * 3 % 9) + k];

                        // We check if number is 0 (unfilled)
                        if (arrayToSolve[(i / 3 * 3 + j)][(i * 3 % 9) + k] == 0) {

                            // We count the missing values and record the
                            // location of the last missing number
                            unsolvedCount++;
                            missingNumberRow = (i / 3 * 3 + j);
                            missingNumberColumn = (i * 3 % 9) + k;
                        }
                    }
                }

                // If only 1 number is missing, we fill the row with the missing number
                if (unsolvedCount == 1) {

                    // find missing number from existingNumbers, 45 - sum of numbers
                    int missingNumber = 45 - sum;

                    // enter missing number into array
                    arrayToSolve[missingNumberRow][missingNumberColumn] = missingNumber;

                    // loop through every row, column, and grid again
                    i = 0;
                }
            }
        }
    }

}
