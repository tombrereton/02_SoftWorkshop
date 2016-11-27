/**
 * Created by TomBrereton on 27/11/2016.
 */
public class SodukoCheck {

    /**
     * We use a method to check each row, column, and
     * 3x3 grid, of a Soduko object contains numbers
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
     * @param soduko a Soduko object which will be checked
     *               for correctness
     * @return a 2d boolean array representing the correctness
     * of each row, column, and 3x3 grid
     */
    public static boolean[][] check(Soduko soduko) {
        boolean[][] b = new boolean[3][9];

        // check each row if it contains 1 through 9 once, or not
        // check each column if it contains 1 through 9 once, or not
        // check each 3x3 grid if it contains 1 though 9 once, or not

        return b;
    }
}
