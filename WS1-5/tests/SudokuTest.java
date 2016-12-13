import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a class called SudokuTest
 * which tests all the Sudoku related classes
 * and their methdods
 *
 * @author Thomas Brereton
 * @version 2016.11.26
 */
public class SudokuTest {

    // SET UP

    // Sudoku arrays
    int[][] sudokuArray = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
            ,};

    int[][] sudokuArray2 = {
            {1, 2, 3, 4, 5, 6, 7, 0, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
            ,};

    int[][] sudokuArray3 = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 0, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 0, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
            ,};

    int[][] sudokuArray4 = {{}};

    int[][] sudokuArray5 = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 9}
            ,};

    int[][] sudokuArray6_incorrect = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {8, 1, 2, 3, 4, 5, 6, 7, 8}
            ,};


    // Sudoku objects
    Sudoku s1 = new Sudoku(sudokuArray);
    Sudoku s2 = new Sudoku(sudokuArray2);
    Sudoku s3 = new Sudoku(sudokuArray4);
    Sudoku s4 = new Sudoku(sudokuArray5);
    Sudoku s5 = new Sudoku(sudokuArray6_incorrect);


    // Reading in files
    SudokuRead sr1 = new SudokuRead();


    // TESTS

    /**
     * Testing the toString for a completed sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void Sudoku_toString_1() throws Exception {
        String expected =
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 4 | 5 | 6 || 7 | 8 | 9 || 1 | 2 | 3 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 7 | 8 | 9 || 1 | 2 | 3 || 4 | 5 | 6 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 2 | 3 | 4 || 5 | 6 | 7 || 8 | 9 | 1 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 5 | 6 | 7 || 8 | 9 | 1 || 2 | 3 | 4 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 8 | 9 | 1 || 2 | 3 | 4 || 5 | 6 | 7 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 3 | 4 | 5 || 6 | 7 | 8 || 9 | 1 | 2 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 6 | 7 | 8 || 9 | 1 | 2 || 3 | 4 | 5 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 9 | 1 | 2 || 3 | 4 | 5 || 6 | 7 | 8 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++";

        assertEquals("Should return string matching sudoku puzzle ", expected, s1.toString());

    }

    /**
     * Testing toString for an incomplete sudoku puzle
     *
     * @throws Exception
     */
    @Test
    public void Sudoku_toString_2() throws Exception {
        String expected =
                "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 1 | 2 | 3 || 4 | 5 | 6 || 7 |   | 9 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 4 | 5 | 6 || 7 | 8 | 9 || 1 | 2 | 3 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 7 | 8 | 9 || 1 | 2 | 3 || 4 | 5 | 6 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 2 | 3 | 4 || 5 | 6 | 7 || 8 | 9 | 1 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 5 | 6 | 7 || 8 | 9 | 1 || 2 | 3 | 4 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 8 | 9 | 1 || 2 | 3 | 4 || 5 | 6 | 7 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 3 | 4 | 5 || 6 | 7 | 8 || 9 | 1 | 2 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 6 | 7 | 8 || 9 | 1 | 2 || 3 | 4 | 5 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 9 | 1 | 2 || 3 | 4 | 5 || 6 | 7 | 8 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++";

        assertEquals("Should return string matching sudoku puzzle ", expected, s2.toString());

    }

    /**
     * Testing isFilled method which checks
     * whether the sudoku puzzle is filled
     *
     * @throws Exception
     */
    @Test
    public void Sudoku_isFilled_1() throws Exception {
        boolean expected = false;

        assertEquals("Should return false as not filled ", expected, s2.isFilled(sudokuArray2));

    }

    /**
     * Testing isFilled method which checks
     * whether the sudoku puzzle is filled
     *
     * @throws Exception
     */
    @Test
    public void Sudoku_isFilled_2() throws Exception {
        boolean expected = false;

        assertEquals("Should return false as not filled ", expected, s2.isFilled(sudokuArray3));

    }

    /**
     * Testing isFilled method which checks
     * whether the sudoku puzzle is filled
     *
     * @throws Exception
     */
    @Test
    public void Sudoku_isFilled_3() throws Exception {
        boolean expected = true;

        assertEquals("Should return true as filled ", expected, s2.isFilled(sudokuArray));

    }

    /**
     * Testing isFilled method for when
     * the array is empty
     *
     * @throws Exception
     */
    @Test
    public void Sudoku_isFilled_4_empty_array() throws Exception {
        String expected = "Use non empty arrays";

        try{
            Sudoku.isFilled(sudokuArray4);
        } catch (IllegalArgumentException e){
            assertEquals("Exception message should match expected ", expected, e.getMessage());
        }
    }

    /**
     * Testing for reading in text file
     * which represents a sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void SudokoRead_read_legal_1() throws Exception {
        String expected =
                "++===+===+===++===+===+===++===+===+===++\n" +
                        "||   | 2 | 3 || 4 | 5 | 6 || 7 |   | 9 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 4 | 5 | 6 || 7 | 8 | 9 || 1 | 2 |   ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 7 | 8 | 9 || 1 | 2 | 3 || 4 | 5 |   ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 2 | 3 | 4 ||   | 6 | 7 || 8 | 9 | 1 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 5 | 6 | 7 || 8 | 9 | 1 ||   | 3 | 4 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 8 | 9 | 1 || 2 |   | 4 || 5 | 6 | 7 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 3 | 4 |   || 6 | 7 | 8 || 9 | 1 | 2 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 6 |   | 8 || 9 | 1 | 2 || 3 | 4 | 5 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 |   ||\n" +
                        "++===+===+===++===+===+===++===+===+===++";
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku1.txt";

        SudokuRead sr1 = new SudokuRead();

        Sudoku sudoku = sr1.readSudoku(textDirectory);

        assertEquals("Should print sudoku in human readable format ", expected, sudoku.toString());

    }

    /**
     * Testing for reading in text file
     * which represents a sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void SudokoRead_read_legal_2() throws Exception {
        String expected =
                "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 4 | 5 | 6 || 7 | 8 | 9 || 1 | 2 | 3 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 7 | 8 | 9 || 1 | 2 | 3 || 4 | 5 | 6 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 2 | 3 | 4 || 5 | 6 | 7 || 8 | 9 | 1 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 5 | 6 | 7 || 8 | 9 | 1 || 2 | 3 | 4 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 8 | 9 | 1 || 2 | 3 | 4 || 5 | 6 | 7 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 3 | 4 | 5 || 6 | 7 | 8 || 9 | 1 | 2 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 6 | 7 | 8 || 9 | 1 | 2 || 3 | 4 | 5 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 9 | 1 | 2 || 3 | 4 | 5 || 6 | 7 | 8 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++";

        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-extra.txt";

        SudokuRead sr1 = new SudokuRead();

        Sudoku sudoku = sr1.readSudoku(textDirectory);

        assertEquals("Should print sudoku in human readable format ", expected, sudoku.toString());

    }

    /**
     * Testing for reading in text file
     * which represents a sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void SudokuRead_read_illegal_1() throws Exception {
        String expected = "For input string: \"a\"";

        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-illegal1.txt";

        SudokuRead sr1 = new SudokuRead();

        try {
            Sudoku sudoku = sr1.readSudoku(textDirectory);
        } catch (IllegalArgumentException e) {
            assertEquals("Exception message should match expected", expected, e.getMessage());
        }
    }

    /**
     * Testing for reading in text file
     * which represents a sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void SudokuRead_read_illegal_2() throws Exception {
        String expected = "For input string: \"a\"";

        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-illegal2.txt";


        SudokuRead sr1 = new SudokuRead();


        try {
            Sudoku sudoku = sr1.readSudoku(textDirectory);
        } catch (IllegalArgumentException e) {
            assertEquals("Exception message should match expected", expected, e.getMessage());
        }
    }

    /**
     * Testing for reading in text file
     * which represents a sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void SudokuRead_read_illegal_3() throws Exception {
        String expected = "For input string: \"a\"";

        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-illegal3.txt";


        SudokuRead sr1 = new SudokuRead();


        try {
            Sudoku sudoku = sr1.readSudoku(textDirectory);
        } catch (IllegalArgumentException e) {
            assertEquals("Exception message should match expected", expected, e.getMessage());
        }
    }

    /**
     * Testing SodokuCheck.check for a correct array
     *
     * @throws Exception
     */
    @Test
    public void SudokuCheck_check_1() throws Exception {
        boolean[][] expected = {
                {true, true, true, true, true, true, true, true, true,},
                {true, true, true, true, true, true, true, true, true,},
                {true, true, true, true, true, true, true, true, true,}
        };

        SudokuCheck sc1 = new SudokuCheck();
        assertArrayEquals("All elements should return true ", expected, sc1.check(s1));

    }




    /**
     * Testing SodokuCheck.check for a incorrect array
     *
     * @throws Exception
     */
    @Test
    public void SudokuCheck_check_2() throws Exception {
        boolean[][] expected = {
                {true, true, true, true, true, true, true, true, false,},
                {true, true, true, true, true, true, true, true, false,},
                {true, true, true, true, true, true, true, true, false,}
        };

        SudokuCheck sc1 = new SudokuCheck();
        assertArrayEquals("All elements should return true ", expected, sc1.check(s4));

    }

    /**
     * Testing SodokuCheck.check for a incorrect array
     *
     * @throws Exception
     */
    @Test
    public void SudokuCheck_check_3() throws Exception {
        boolean[][] expected = {
                {true, true, true, true, true, true, true, true, false,},
                {false, true, true, true, true, true, true, true, true,},
                {true, true, true, true, true, true, false, true, true,}
        };

        SudokuCheck sc2 = new SudokuCheck();
        assertArrayEquals("All elements should return true ", expected, sc2.check(s5));

    }

    /**
     * Testing SudokuSolve, should solve a Sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_1_minus2values() throws Exception {
        String expected =
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 4 | 5 | 6 || 7 | 8 | 9 || 1 | 2 | 3 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 7 | 8 | 9 || 1 | 2 | 3 || 4 | 5 | 6 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 2 | 3 | 4 || 5 | 6 | 7 || 8 | 9 | 1 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 5 | 6 | 7 || 8 | 9 | 1 || 2 | 3 | 4 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 8 | 9 | 1 || 2 | 3 | 4 || 5 | 6 | 7 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 3 | 4 | 5 || 6 | 7 | 8 || 9 | 1 | 2 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 6 | 7 | 8 || 9 | 1 | 2 || 3 | 4 | 5 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 9 | 1 | 2 || 3 | 4 | 5 || 6 | 7 | 8 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++";


        // retutn those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-full-minus2values.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.solve();

        assertEquals("Array should match solved array ", expected, ss1.toString());

    }

    /**
     * Testing the SudokoInteractive toString method.
     * The method should have grid coordinates and asterisks
     * next to orignal numbers read in.
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_2_suduko1() throws Exception {
        String expected =

                "      1   2   3    4   5   6    7   8   9\n" +
                        "   ++===+===+===++===+===+===++===+===+===++\n" +
                        "a  ||   |*2*|*3*||*4*|*5*|*6*||*7*|   |*9*||\n" +
                        "   ++---+---+---++---+---+---++---+---+---++\n" +
                        "b  ||*4*|*5*|*6*||*7*|*8*|*9*||*1*|*2*|   ||\n" +
                        "   ++---+---+---++---+---+---++---+---+---++\n" +
                        "c  ||*7*|*8*|*9*||*1*|*2*|*3*||*4*|*5*|   ||\n" +
                        "   ++===+===+===++===+===+===++===+===+===++\n" +
                        "d  ||*2*|*3*|*4*||   |*6*|*7*||*8*|*9*|*1*||\n" +
                        "   ++---+---+---++---+---+---++---+---+---++\n" +
                        "e  ||*5*|*6*|*7*||*8*|*9*|*1*||   |*3*|*4*||\n" +
                        "   ++---+---+---++---+---+---++---+---+---++\n" +
                        "f  ||*8*|*9*|*1*||*2*|   |*4*||*5*|*6*|*7*||\n" +
                        "   ++===+===+===++===+===+===++===+===+===++\n" +
                        "g  ||*3*|*4*|   ||*6*|*7*|*8*||*9*|*1*|*2*||\n" +
                        "   ++---+---+---++---+---+---++---+---+---++\n" +
                        "h  ||*6*|   |*8*||*9*|*1*|*2*||*3*|*4*|*5*||\n" +
                        "   ++---+---+---++---+---+---++---+---+---++\n" +
                        "i  ||*1*|*2*|*3*||*4*|*5*|*6*||*7*|*8*|   ||\n" +
                        "   ++===+===+===++===+===+===++===+===+===++";


        // retutn those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku1.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuInteractive si1 = new SudokuInteractive(sudoku.getArray());

        assertEquals("String should match expected ", expected, si1.toString());

    }

    /**
     * Testing SudokuSolve, should solve a Sudoku puzzle for ex 1
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_3_suduko_ex1() throws Exception {
        String expected =
                "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 5 | 7 | 1 || 9 | 3 | 2 || 6 | 8 | 4 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 6 | 4 | 2 || 8 | 5 | 1 || 7 | 9 | 3 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 8 | 3 | 9 || 6 | 4 | 7 || 5 | 1 | 2 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 4 | 9 | 7 || 1 | 6 | 5 || 2 | 3 | 8 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 2 | 1 | 8 || 7 | 9 | 3 || 4 | 6 | 5 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 3 | 6 | 5 || 4 | 2 | 8 || 1 | 7 | 9 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++\n" +
                        "|| 1 | 5 | 4 || 3 | 7 | 9 || 8 | 2 | 6 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 9 | 8 | 6 || 2 | 1 | 4 || 3 | 5 | 7 ||\n" +
                        "++---+---+---++---+---+---++---+---+---++\n" +
                        "|| 7 | 2 | 3 || 5 | 8 | 6 || 9 | 4 | 1 ||\n" +
                        "++===+===+===++===+===+===++===+===+===++";


        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-ex1.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.superSolve();

        assertEquals("Array should match solved array ", expected, ss1.toString());

    }

    /**
     * Testing SudokuSolve, should solve a Sudoku puzzle for ex 2
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_3_suduko_ex2() throws Exception {

        // return those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-ex2.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.solve();

        // Polymorphism!!!
        assertTrue(SudokuCheck.isCompletedArray(ss1));

    }

    /**
     * Testing SudokuSolve, should solve a Sudoku puzzle for ex 3
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_3_suduko_ex3() throws Exception {

        // return those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-ex3.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.solve();

        // Polymorphism!!!
        assertTrue(SudokuCheck.isCompletedArray(ss1));

    }

    /**
     * Testing SudokuSolve, should solve a Sudoku puzzle for ex 4
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_4_suduko_ex4() throws Exception {

        // return those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-ex4.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.solve();

        assertTrue(SudokuCheck.isCompletedArray(ss1));

    }

    /**
     * Testing SudokuSolve, should solve a Sudoku puzzle for ex 5
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_5_suduko_ex5() throws Exception {

        // return those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-ex5.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.solve();

        assertTrue(SudokuCheck.isCompletedArray(ss1));

    }

    /**
     * Testing SudokuSolve, should fail to solve a Sudoku puzzle for ex 6
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_6_suduko_ex6() throws Exception {

        // return those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-ex6.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.superSolve();

        assertTrue(SudokuCheck.isCompletedArray(ss1));

    }

    /**
     * Testing SudokuSolve, should fail to solve a Sudoku puzzle for 'difficult'
     *
     * @throws Exception
     */
    @Test
    public void SudokuSolve_solve_7_suduko_difficult() throws Exception {

        // return those bits
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-difficult.txt";
        SudokuRead sr1 = new SudokuRead();
        Sudoku sudoku = sr1.readSudoku(textDirectory);

        SudokuSolve ss1 = new SudokuSolve(sudoku.getArray());

        ss1.superSolve();

        assertTrue(SudokuCheck.isCompletedArray(ss1));

    }
}