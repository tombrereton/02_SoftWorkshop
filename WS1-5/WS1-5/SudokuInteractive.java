import java.io.IOException;
import java.util.Scanner;

/**
 * This is a class called SodokuInteractive.
 * It has a 2 dimensional array to represent
 * a Sudoku puzzle. Note, a zero in the array
 * represents an unfilled field.
 * Refer here for more information
 * on Sudoku puzzles:
 * https://en.wikipedia.org/wiki/Sudoku
 * <p>
 * Additionally, as it is a subclass of Sudoku
 * it has all the methods of Sudoku as well as
 * methods to interact (play) with a Sudoku puzzle.
 *
 * @author Thomas Brereton
 * @version 2016.11.28
 */
public class SudokuInteractive extends Sudoku {


    /**
     * We use a constructor to create an object of the class
     * which is made up of the 2d array representing
     * a soduko puzzle.
     *
     * @param array 2D array of type integer.
     */
    public SudokuInteractive(int[][] array) {
        super(array);
    }

    /**
     * We use a method to "play" a soduko puzzle
     * It parses and displays user input to a
     * Sudoku object.
     *
     * @param file the location of the soduko.txt file.
     */
    public static void play(String file) throws IOException, IllegalArgumentException {

        SudokuRead sudokuRead = new SudokuRead();

        // read in sudoku.txt
        Sudoku sudoku = sudokuRead.readSudoku(file);

        // We create a SudokuInteractive object using a Sudoku object
        SudokuInteractive sudokuInteractive = new SudokuInteractive(sudoku.getArray());

        // print to screen with *%d*
        System.out.println(sudokuInteractive);

        // create scanner object to prompt user for command
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // Print out instructions for user
        System.out.println("Welcome to Sudoku!\nTry to fill in the Suduko puzzle above.");
        System.out.println("\nTo enter a number type:\n   rowcolumn:number\n   For example, d4:5\n");
        System.out.println("Other commands: 'exit' and 'reset'");

        // Loop until userInput equals "exit"
        while (!userInput.equals("exit")) {

            // We take user input
            userInput = scanner.next();

            // We check if user input matches format of "a1:1"
            // i.e. rowcolumn:number
            boolean match = userInput.matches("[a-i][1-9]:[1-9]");

            // We exit if user input = "exit"
            if (userInput.equals("exit")) {

                System.out.println("Exiting program...");
                break;

                // We reset the program if user input = "reset"
            } else if (userInput.equals("reset")) {

                System.out.println("Resetting program...");

                // Reset with original array by reading in text file
                sudokuInteractive.setArray(sudokuRead.readSudoku(file).getArray());
                System.out.println(sudokuInteractive);

                // We change the array if it matches "a1:1"
            } else if (match) {

                // We parse user input to userlocation and userNumber
                String userLocation = userInput.split(":")[0];
                int userNumber = Integer.parseInt(userInput.split(":")[1]);

                // We change the values in the array according to userLocation and userInput
                sudokuInteractive.setArray(userInputToSudoku(userLocation, userNumber, sudokuInteractive));
                System.out.println(sudokuInteractive);

            } else {
                System.out.println("Enter input in the format:\n   rowcolumn:number\n   For example, d4:5");
            }

            if(SudokuCheck.isCompletedArray(sudokuInteractive)){
                System.out.println("\nSudoku correct! Well done.");
                break;
            }

            if (isFilled(sudokuInteractive.getArray())) {
                System.out.println("\nSudoku incorrect. Please try entering new value or type 'reset' or 'exit'");
            }

        }
    }

    /**
     * We use a method to build the string
     * for human readable format
     *
     * @param a 2d array
     * @return a string in a soduko format
     */
    @Override
    public String stringBuilder(int[][] a) {
        int numberOfRows = a.length;
        int numberOfColumns = a[0].length;

        String numberCoordinates = "      1   2   3    4   5   6    7   8   9\n";
        String bigSeparatorLine = "   ++===+===+===++===+===+===++===+===+===++";
        String smallSeparatorLine = "   ++---+---+---++---+---+---++---+---+---++";
        String sudokuString = numberCoordinates;

        String[] letterCoordinates = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};

        // Loop over the number of rows * 2 to account for the division lines
        for (int row = 0; row <= numberOfRows * 2; row++) {

            // Loop over the number of columns * 2 to account for the division lines
            for (int column = 0; column <= numberOfColumns * 2; column++) {

                // We insert bigSeparatorLine at relevant rows
                if (row % 6 == 0 || row == 18) {
                    sudokuString += bigSeparatorLine;
                    break;

                // We insert smallSeparatorLine at relevant rows
                } else if (row % 2 == 0) {
                    sudokuString += smallSeparatorLine;
                    break;

                // We insert the letter coordinates and the double pipe at the start of the respective rows
                } else if (row % 2 == 1 && column == 0) {
                    sudokuString = sudokuString + String.format("%s  ||", letterCoordinates[row / 2]);

                // We insert the double pipe at the respective columns
                } else if (row % 2 == 1 && column % 6 == 0 || column == 18) {
                    sudokuString = sudokuString + "||";

                // We insert the single pipe at the respective columns
                } else if (row % 2 == 1 && column % 2 == 0) {
                    sudokuString = sudokuString + "|";

                // We print the array values
                // If the value is 0, we print out a blank space
                } else if (row % 2 == 1 && column % 2 == 1) {
                    if (arrayValue(row, column, a) == 0) {
                        sudokuString = sudokuString + "   ";

                    // If the number is part of the original array, we print it with surrounding *
                    } else if (arrayValue(row, column, a) / 10 == 0) {
                        sudokuString = sudokuString + String.format("*%d*", (arrayValue(row, column, a)));

                    // If the number is user input, we print it as normal
                    } else if (arrayValue(row, column, a) / 10 > 0) {
                        sudokuString = sudokuString + String.format(" %d ", (arrayValue(row, column, a)) % 10);
                    }
                }
            }
            if (row != numberOfRows * 2) {
                sudokuString = sudokuString + "\n";
            }
        }
        return sudokuString;
    }

    /**
     * We use a method to parse user input into the Sudoku array. We only
     * allow user input if it is NOT part of the original array.
     *
     * @param userLocation A row and column location of the Sudoku number to be entered.
     * @param userNumber   A Sudoku number to be entered
     * @param sudoku       We get the array from this Sudoku object that we change with the userNumber
     * @return A 2d array of type int which stores the new userNumber
     */
    public static int[][] userInputToSudoku(String userLocation, int userNumber, Sudoku sudoku) {
        // We take the first character of userLocation and parse it to a number (a becomes 0)
        int userRow = userLocation.charAt(0) - 'a';

        // We take the second character of userLocation and parse it to a number indexed at 0 (1 becomes 0)
        int userColumn = Integer.parseInt(userLocation.substring(1)) - 1;

        int[][] tempArray = sudoku.getArray();


        // If it is NOT an original number, we change the number at the userLocation in the array
        // And store it as the value of user input + 10 so we can differentiate between the 2 later
        if (tempArray[userRow][userColumn] == 0 || tempArray[userRow][userColumn] / 10 > 0) {
            tempArray[userRow][userColumn] = userNumber + 10;
        }

        return tempArray;
    }

    /**
     * We create a main method to run and interact with the Sudoku object.
     *
     * @param args No arugments are needed
     */
    public static void main(String[] args) {
        String textDirectory = "/Users/TomBrereton/Documents/BhamCS/02_SoftWorkshop/WS1-5/src/sudoku-one-missing.txt";


        try {
            play(textDirectory);

        } catch (IOException e1) {
            System.out.println("Cannot find file at specified location. Please enter a new directory");
        } catch (IllegalArgumentException e2) {
            System.out.println("File contains illegal characters. Ensure all characters are 1 to 9, or a space (' ')");
        }
    }
}
