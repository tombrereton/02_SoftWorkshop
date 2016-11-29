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
    public void test1() throws Exception {
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
    public void test2() throws Exception {
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
    public void test3() throws Exception {
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
    public void test4() throws Exception {
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
    public void test5() throws Exception {
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
    public void test6() throws Exception {
        boolean expected = false;

        assertEquals("Should return true ", expected, Sudoku.isFilled(sudokuArray4));

    }

    /**
     * Testing toString for an empty array
     *
     * @throws Exception
     */
    @Test
    public void test7() throws Exception {
        String expected = "";

        assertEquals("Should throw exception ", expected, s3.toString());

    }

    /**
     * Testing for reading in text file
     * which represents a sudoku puzzle
     *
     * @throws Exception
     */
    @Test
    public void test8() throws Exception {
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
     * Testing SodokuCheck.check for a correct array
     *
     * @throws Exception
     */
    @Test
    public void test9() throws Exception {
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
    public void test10() throws Exception {
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
    public void test11() throws Exception {
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
    public void test12() throws Exception {
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

//    /**
//     * Testing SudokuInteractive.play and the reset function
//     * We read in sudoku.txt, dislpay it to screen,
//     * record user input, and display user input to screen
//     *
//     * @throws Exception
//     */
//    @Test
//    public void test12() throws Exception {
//                String expected =
//                "++===+===+===++===+===+===++===+===+===++\n";
//
//        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku1.txt";
//
//
////        SudokuRead sudokuRead1 = new SudokuRead();
////        Sudoku sudoku1 = sr1.readSudoku(textDirectory);
////
////        SudokuInteractive si1;
//
//        SudokuInteractive.play(textDirectory);
//        System.out.println("a1:1");
//        System.out.println("reset");
//
//        assertEquals("Should return original sudoku board", expected, SudokuInteractive.);
//
//    }


}