import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a class called SodokuRead.
 * It has a method readSoduko which
 * parses a text file of numbers
 * into a 2d array. The 2d array
 * represents a soduko puzzle.
 *
 * on Soduko puzzles:
 * https://en.wikipedia.org/wiki/Sudoku
 *
 * @author Thomas Brereton
 * @version 2016.11.27
 */
public class SodukoRead {

    /**
     * We use a method to parse a text file with
     * fixed width of 9 and max row of 9. Each
     * element to parse is an integer between 1 and 9.
     *
     * @param fileName The text file to parse
     * @return Return an object of type Soduko, which represents a Soduko puzzle
     * @throws IllegalArgumentException When it tries to parse anything except an integer
     * between 1 and 9, or a space
     * @throws IOException When it cannot find the file specified
     */
    public Soduko readSoduko(String fileName) throws IllegalArgumentException, IOException {

        // Initialise 2d array of zeros
        int[][] a = new int[9][9];

        // We create File object with path "fileName"
        File myfile = new File(fileName);

        // We create FileReader object to read myfile object
        FileReader fileReader = new FileReader(myfile);

        // We create a BufferedReader object to 'buffer' the
        // input from fileReader
        BufferedReader reader = new BufferedReader(fileReader);

        // Initialise line and row
        String line = null;
        int row = 0;

        // Loop over text file at directory "fileName" until
        // the line of text is null or row = 9
        while ((line = reader.readLine()) != null && row < 9) { // loop over 9 lines of text // read in line


            int lineLength = line.length();
            String[] lineArray = new String[lineLength];

            // loop over each character in "line"
            // and assign it to an element in lineArray
            for (int i = 0; i < Math.min(9, lineLength); i++) {

                // split line into 9 elements
                lineArray[i] = line.substring(i, i + 1);
            }

            // Loop over lineArray and copy it into the 2d
            // array "a"
            for (int i = 0; i < Math.min(9, lineLength); i++) {
                if (Character.isWhitespace(line.charAt(i)) || lineArray[i] == null) {
                    a[row][i] = 0;
                } else {
                    a[row][i] = Integer.parseInt(lineArray[i]);
                }
            }
            row++;



        }
        reader.close();

        // instantiate Soduko object with 2d array
        Soduko s = new Soduko(a);

        return s;
    }


}
