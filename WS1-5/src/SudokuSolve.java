import java.util.ArrayList;

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


    public void superSolve() {

        boolean isSolved = false;
        int count=0;

        while (!isSolved) {
            solveTrial();

            solve();

            isSolved = SudokuCheck.isCompletedArray(this);


            // if isFilled doesn't change
                // break loop

            if (count > 10) {
               break;
            }

            count++;
        }
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
     * We use a method to get a the missing number 1d array for a certain row
     * in a 2d array.
     *
     * @param a         the 2d array we get the 1d row array from
     * @param rowNumber the row we want from the array
     * @return the row array we want from the 2d array
     */
    public ArrayList<Integer> getMissingInRow(int[][] a, int rowNumber) {
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
        ArrayList<Integer> compareArrayList = new ArrayList<Integer>();
        int numberOfColumns = a[0].length;

        for (int i = 1; i <= a.length; i++) {
            compareArrayList.add(i);
        }

        for (int i = 0; i < numberOfColumns; i++) {
            tempArrayList.add(a[rowNumber][i]);
        }

        compareArrayList.removeAll(tempArrayList);

        return compareArrayList;
    }

    /**
     * We use a method to get a the missing number 1d array for a certain row
     * in a 2d array.
     *
     * @param a            the 2d array we get the 1d row array from
     * @param columnNumber the row we want from the array
     * @return the row array we want from the 2d array
     */
    public ArrayList<Integer> getMissingInColumn(int[][] a, int columnNumber) {
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
        ArrayList<Integer> compareArrayList = new ArrayList<Integer>();
        int numberOfRows = a.length;

        for (int i = 1; i <= 9; i++) {
            compareArrayList.add(i);
        }

        for (int i = 0; i < numberOfRows; i++) {
            tempArrayList.add(a[i][columnNumber]);
        }

        compareArrayList.removeAll(tempArrayList);

        return compareArrayList;
    }


    /**
     * We use a method to get a the missing number 1d array for a certain row
     * in a 2d array.
     *
     * @param a          the 2d array we get the 1d row array from
     * @param gridNumber the row we want from the array
     * @return the row array we want from the 2d array
     */
    public ArrayList<Integer> getMissingInGrid(int[][] a, int gridNumber) {
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
        ArrayList<Integer> compareArrayList = new ArrayList<Integer>();

        for (int i = 1; i <= 9; i++) {
            compareArrayList.add(i);
        }

        // loop over 3 rows of the ith grid
        for (int j = 0; j < 3; j++) {

            // loop over 3 columns of the ith grid
            for (int k = 0; k < 3; k++) {

                // get indexes
                int rowIndex = gridNumber / 3 * 3 + j;
                int colIndex = (gridNumber * 3 % 9) + k;

                // We each element of the ith 3x3 grid in tempArray
                tempArrayList.add(a[rowIndex][colIndex]);
            }
        }

        compareArrayList.removeAll(tempArrayList);

        return compareArrayList;

    }

    public ArrayList<Integer> getCommonMissingValues(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        a.retainAll(b);
        a.retainAll(c);

        return a;
    }

    /**
     * We use a method to get a 1d array for a certain row
     * in a 2d array.
     *
     * @param a         the 2d array we get the 1d row array from
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
     * @param a            the 2d array we get the 1d column array from
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
     * @param a          the 2d array we get the 1d grid array from
     * @param gridNumber the grid we want from the array
     * @return a 1d array representing a grid we want from the 2d array
     */
    public int[] getGrid(int[][] a, int gridNumber) {
        int[] tempArray = new int[9];

        // loop over 3 rows of the ith grid
        for (int j = 0; j < 3; j++) {

            // loop over 3 columns of the ith grid
            for (int k = 0; k < 3; k++) {

                // get indexes
                int tempArrayIndex = j * 3 + k;
                int rowIndex = gridNumber / 3 * 3 + j;
                int colIndex = (gridNumber * 3 % 9) + k;

                // We each element of the ith 3x3 grid in tempArray
                tempArray[tempArrayIndex] = a[rowIndex][colIndex];
            }
        }

        return tempArray;
    }

    /**
     * We use a method to check if a 1d dimensional array contains a number
     *
     * @param array  The array we want to check if it contains a number
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


    public void solveTrial() {

        int[][] arrayToSolve = this.getArray();
        boolean[][] checkBoolean = SudokuCheck.check(this);

        int i = 0;
        while (i < 9) {
            for (int j = 0; j < 9; j++) {

                if (arrayToSolve[i][j] == 0) {
                    ArrayList<Integer> rowList = getMissingInRow(arrayToSolve, i);
                    ArrayList<Integer> colList = getMissingInColumn(arrayToSolve, j);
                    ArrayList<Integer> gridList = getMissingInGrid(arrayToSolve, (i / 3) * 3 + j / 3);

                    ArrayList<Integer> commonMissingValuesList = getCommonMissingValues(rowList, colList, gridList);

                    if (commonMissingValuesList.size() == 1) {
                        arrayToSolve[i][j] = commonMissingValuesList.get(0);
                        i = -1;
                        break;
                    }
                }
            }
            i++;
        }


    }

}
