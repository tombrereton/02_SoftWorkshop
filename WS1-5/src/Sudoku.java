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

        for (int row = 0; row <= numberOfRows * 2; row++) {
            for (int column = 0; column <= numberOfColumns * 2; column++) {
                if (row % 6 == 0 || row == 18) {
                    sudokuString += bigSeparatorLine;
                    break;
                } else if (row % 2 == 0) {
                    sudokuString += smallSeparatorLine;
                    break;
                } else if (row % 2 == 1 && column % 6 == 0 || column == 18) {
                    sudokuString = sudokuString + "||";
                } else if (row % 2 == 1 && column % 2 == 0) {
                    sudokuString = sudokuString + "|";
                } else if (row % 2 == 1 && column % 2 == 1) {
                    if (arrayValue(row, column, a) == 0){ //((a[row - (row / 2 + 1)][column - (column / 2 + 1)]) == 0) {
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

    public int arrayValue(int row, int column, int[][] a){
        return a[row - (row / 2 + 1)][column - (column / 2 + 1)];

    }

    /**
     * We use a method to build the string
     * for human readable format
     *
     * @param a 2d array
     * @return a string in a soduko format
     */
    public String stringBuilder2(int[][] a) {
        String sudokuString = "";

        sudokuString = String.format(
                "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| %d | %d | %d || %d | %d | %d || %d | %d | %d ||\n" +
                        "++===+===+===++===+===+===++===+===+===++",
                a[0][0], a[0][1], a[0][2], a[0][3], a[0][4], a[0][5], a[0][6], a[0][7], a[0][8],
                a[1][0], a[1][1], a[1][2], a[1][3], a[1][4], a[1][5], a[1][6], a[1][7], a[1][8],
                a[2][0], a[2][1], a[2][2], a[2][3], a[2][4], a[2][5], a[2][6], a[2][7], a[2][8],
                a[3][0], a[3][1], a[3][2], a[3][3], a[3][4], a[3][5], a[3][6], a[3][7], a[3][8],
                a[4][0], a[4][1], a[4][2], a[4][3], a[4][4], a[4][5], a[4][6], a[4][7], a[4][8],
                a[5][0], a[5][1], a[5][2], a[5][3], a[5][4], a[5][5], a[5][6], a[5][7], a[5][8],
                a[6][0], a[6][1], a[6][2], a[6][3], a[6][4], a[6][5], a[6][6], a[6][7], a[6][8],
                a[7][0], a[7][1], a[7][2], a[7][3], a[7][4], a[7][5], a[7][6], a[7][7], a[7][8],
                a[8][0], a[8][1], a[8][2], a[8][3], a[8][4], a[8][5], a[8][6], a[8][7], a[8][8]);

        return sudokuString;
    }

    public static boolean isFilled(int[][] a) throws NullPointerException, IllegalArgumentException {
        if (a == null){
            throw new NullPointerException("Can't handle null arrays");
        } else if (a.length == 0){
            throw new IllegalArgumentException("Use non empty arrays");
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {

        return stringBuilder(this.getArray());

    }
}
