import java.io.IOException;

/**
 * Created by TomBrereton on 7/12/16.
 */
public class Main {

    public static void main(String[] args) {
        String fileLocation = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/WS1-5/sudoku-ex2tom.txt";

        SudokuRead sr = new SudokuRead();


        try {
            Sudoku s = sr.readSudoku(fileLocation);
            SudokuInteractive.play(fileLocation);
        } catch (IOException e) {
            System.out.println("File location not valid");
        }
    }
}
