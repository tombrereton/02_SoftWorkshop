import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a class called SodukoTest
 * which tests all the Soduko related classes
 * and their methdods
 *
 * @author Thomas Brereton
 * @version 2016.11.26
 */
public class SodukoTest {

    // SET UP

    // Soduko arrays
    int[][] sodukoArray = {
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

    int[][] sodukoArray2 = {
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

    int[][] sodukoArray3 = {
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

    int[][] sodukoArray4 = {{}};

    int[][] sodukoArray5 = {
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


    // Soduko objects
    Soduko s1 = new Soduko(sodukoArray);
    Soduko s2 = new Soduko(sodukoArray2);
    Soduko s3 = new Soduko(sodukoArray4);
    Soduko s4 = new Soduko(sodukoArray5);


    // Reading in files
    SodukoRead sr1 = new SodukoRead();


    // TESTS

    /**
     * Testing the toString for a completed soduko puzzle
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

        assertEquals("Should return string matching soduko puzzle ", expected, s1.toString());

    }

    /**
     * Testing toString for an incomplete soduko puzle
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

        assertEquals("Should return string matching soduko puzzle ", expected, s2.toString());

    }

    /**
     * Testing isFilled method which checks
     * whether the soduko puzzle is filled
     *
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {
        boolean expected = false;

        assertEquals("Should return false as not filled ", expected, s2.isFilled(sodukoArray2));

    }

    /**
     * Testing isFilled method which checks
     * whether the soduko puzzle is filled
     *
     * @throws Exception
     */
    @Test
    public void test4() throws Exception {
        boolean expected = false;

        assertEquals("Should return false as not filled ", expected, s2.isFilled(sodukoArray3));

    }

    /**
     * Testing isFilled method which checks
     * whether the soduko puzzle is filled
     *
     * @throws Exception
     */
    @Test
    public void test5() throws Exception {
        boolean expected = true;

        assertEquals("Should return true as filled ", expected, s2.isFilled(sodukoArray));

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

        assertEquals("Should return true ", expected, Soduko.isFilled(sodukoArray4));

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
     * which represents a soduko puzzle
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
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/soduko1.txt";

        SodukoRead sr1 = new SodukoRead();

        Soduko soduko = sr1.readSoduko(textDirectory);

        assertEquals("Should print soduko in human readable format ", expected, soduko.toString());

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

        SodukoCheck sc1 = new SodukoCheck();
        assertArrayEquals("All elements should return true ", expected, sc1.check(s1));

    }


}