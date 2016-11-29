import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.net.URL;

import java.util.*;
import java.util.regex.Pattern;


/**
 *  In this class we show how to display a chess board with figures on
 *  it and use inputs from the command line to update the
 *  configuration. Note, no checks are made whether the moves are rule
 *  conform. 
 *
 *  version 2016-11-19
 *  author Manfred Kerber
 */
public class Chess extends JPanel {
    /**
     *   We use the following pattern to describe either moves or the
     *   quit action
     */
    public static final Pattern move = Pattern.compile("[a-h][1-8][a-h][1-8]|q");

    public static int smallSize = 50; 
    public static int xOffset = 50; 
    public static int yOffset = 50; 
    public static int dist = 20;
    public static int smallOff = 5;

    
    /**
     *  The constructor does not take any arguments.
     */
    public Chess() {}

    /**
     *  A chessboard is represented by a 8x8 matrix.
     */
    private String[][] chessBoard = new String[8][8];

    /**
     *  The initial chess board is represented by Strings for the
     *  different figures such as "towerB" for the black tower.
     *  The method changes the chessBoard array.
     */
    public void initializeChessBoard() {
        for (int i = 2; i<6; i++)
            for (int j = 0; j<8;j++)
                chessBoard[i][j] = "";
 	chessBoard[0][0] = "towerB" ;   // Black Tower
	chessBoard[0][1] = "knightB" ;  // Black Knight
	chessBoard[0][2] = "bishopB" ;  // Black Bishop
	chessBoard[0][3] = "queenB" ;   // Black Queen
	chessBoard[0][4] = "kingB" ;    // Black Knight
	chessBoard[0][5] = "bishopB" ;  // Black Bishop
	chessBoard[0][6] = "knightB" ;  // Black Knight
	chessBoard[0][7] = "towerB" ;   // Black Tower
	
	chessBoard[7][0] = "towerW" ;   // White Tower
	chessBoard[7][1] = "knightW" ;  // White Knight
	chessBoard[7][2] = "bishopW" ;  // White Bishop
	chessBoard[7][3] = "queenW" ;   // White Queen
	chessBoard[7][4] = "kingW" ;    // White Knight
	chessBoard[7][5] = "bishopW" ;  // White Bishop
	chessBoard[7][6] = "knightW" ;  // White Knight
	chessBoard[7][7] = "towerW" ;   // White Tower
	
	for (int i = 0; i<8; i++){
	    chessBoard[1][i] = "pawnB" ;   // Black Pawn
	}
	for (int i = 0; i<8; i++){
	    chessBoard[6][i] = "pawnW" ;   // White Pawn
	}   
    }

    /**
     *  The empty chessboard is drawn on the panel.
     *  @param g The graphics object used to make the drawing.
     */
    public void drawEmptyChessBoard(Graphics g){
        // outline rectangle in black
	g.setColor(new Color(0,0,0));
	g.drawRect(xOffset,yOffset,8*smallSize,8*smallSize);

        // filled rectangle in mid grey.
	g.setColor(new Color(100,100,100));
	g.fillRect(xOffset,yOffset,8*smallSize,8*smallSize);

	// 32 bright grey fields on top of the mid grey single rectangle
	for (int j=0; j<4; j++){
	    for (int i=0; i<4; i++){
		g.setColor(new Color(200,200,200));
		g.fillRect(xOffset+ 2*i*smallSize,yOffset+2*j*smallSize,
                           smallSize,smallSize);
		g.fillRect(xOffset+ smallSize*(2*i+1),yOffset+smallSize*(2*j+1),
                           smallSize,smallSize);
	    }
	}

        // write in black in a particular font the coordinates a-h and 1-8.
	g.setColor(new Color(0,0,0));
        setFont(new Font("Dialog",1,24));

        for (int i = 0; i < 8; i++){
            g.drawString(String.format("%c",(char) ((int) 'a' + i)),
                         i*smallSize+xOffset+dist, dist);
            g.drawString(String.format("%c",(char) ((int) 'a' + i)),
                         i*smallSize+xOffset+dist,9*smallSize+yOffset);
            g.drawString(String.format("%c",(char) ((int) '8' - i)),
                         dist, (i+1)*smallSize+yOffset);
            g.drawString(String.format("%c",(char) ((int) '8' - i)),
                         8*smallSize + xOffset + dist, (i+1)*smallSize+yOffset);
        }
    } // end drawEmptyChessBoard();

    /**
     *  The chessboard figures are put on the chessboard.
     *  @param g The graphics object used to make the drawing.
     */
    public void drawfigures(Graphics g){
	for (int i=0; i<8; i++){
	    for (int j=0; j<8; j++){
		drawFigure(g,chessBoard[i][j], j, i);
            }
	}
    }

    /**
     *  The method looks up the different files in which the chess
     *  figures are stored.
     *  @param figureName The name of the figure such as "towerB" for
     *  the black tower.
     *  @return The file where the figure is stored,
     *  e.g. "towerBlack.gif";
     */        
    public static String lookupFile(String figureName) {
        switch(figureName) {
        case "towerB"  : return "towerBlack.gif";
        case "towerW"  : return "towerWhite.gif";
        case "knightB" : return "knightBlack.gif";
	case "knightW" : return "knightWhite.gif";
	case "bishopB" : return "bishopBlack.gif";
	case "bishopW" : return "bishopWhite.gif";
        case "queenB"  : return "queenBlack.gif";
        case "queenW"  : return "queenWhite.gif";
        case "kingB"   : return "kingBlack.gif";
        case "kingW"   : return "kingWhite.gif";
        case "pawnB"   : return "pawnBlack.gif";
        case "pawnW"   : return "pawnWhite.gif";
        default        : return "";
        }
    }

    /**
     *  Auxiliary function to draw a single figure onto the chess board.
     *  @param g The graphics object used to make the drawing.
     *  @param figureName The name of the figure such as "towerB" for
     *  the black tower.
     *  @param xPos The horizontal position on the chessboard from 0-7
     *  with 0 for the leftmost column.
     *  @param yPos The vertical position on the chessboard from 0-7
     *  with 0 for the upmost row.
     */
    public void drawFigure(Graphics g, String figureName, int xPos, int yPos){
        g.drawImage(loadImage(lookupFile(figureName)),
                    xOffset+xPos*smallSize, yOffset+yPos*smallSize + smallOff, null);
    }

    /**
     *  Method to load an image file from a file. Note that the images
     *  are put in the directory "images" and we follow the Unix/Linux
     *  directory structure.
     *  @param name The file name in the directory images.
     *  @return A buffered image found in the file.
     */
    private BufferedImage loadImage(String name){
	String imgFileName = "images/"+name;
	URL url =  Chess.class.getResource(imgFileName);
	BufferedImage img = null;
	try {
	    img = ImageIO.read(url);
	}
	catch (Exception e) {
	}
	return img;
    }

    /**
     *    Override the paintComponent method from the JPanel class.
     *    First we call the super method, then draw an empty
     *    chessboard, then the figures.
     *    @param g The graphics component used for painting.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent (g);
	drawEmptyChessBoard(g);
        drawfigures(g);
    }

    /**
     *  A conversion from character 'a'-'h' to 0-7.
     *  @param input A character 'a' through 'h' for the horizontal coordinate.
     *  @return A corresponding integer used internally 0-7.
     */
    public static int xToInt(char input) {
        return (int) input - (int) 'a';
    }
    /**
     *  A conversion from character '1'-'8' to 7-0.
     *  @param input A character '1' through '8' for the vertical coordinate.
     *  @return A corresponding integer used internally,
     *  1 goes to 7, 2 goes to 6, ..., 8 goes 0.
     */
    public static int yToInt(char input) {
        return 7 - (int) input + (int) '1';
    }

    /**
     *  We create a frame with a panel on which the chessboard is
     *  drawn.  The board is initialized, then input is scanned in
     *  until a 'q' is read and corresponding moves are done, e.g.,
     *  the input "a2a4" means to draw from a2 to a4 on the
     *  chessboard. If the field is empty nothing happens. There is no
     *  checking of chess rules.
     */
    public static void playChess() {
        
	JFrame application = new JFrame();
	
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//creates a window of size 600 x 600 pixels
	application.setSize(600,600); 
       	
	Chess panel = new Chess();
        panel.initializeChessBoard();
	application.add(panel);   
	application.setVisible(true); // makes the application visible.

        Scanner s = new Scanner(System.in);

        int fromX,fromY,toX,toY;
        String choice = "";
        while (!choice.equals("q")) {
            try {
                choice = s.next(move);
                if (choice.equals("q")){
                    break;
                } else {
                    fromX = xToInt(choice.charAt(0));
                    fromY = yToInt(choice.charAt(1));
                    toX   = xToInt(choice.charAt(2));
                    toY   = yToInt(choice.charAt(3));

                    panel.chessBoard[toY][toX] = 	panel.chessBoard[fromY][fromX];
                    panel.chessBoard[fromY][fromX] = "";
                    panel.repaint();
                }
            }
            
            catch (InputMismatchException e2) {
                System.out.println("Unexpected input.");
                s = new Scanner(System.in);
            }
        }
        application.dispose(); 
    }


    /*
     * Main method to start a game of chess. No rule checks, just graphics.
     */
    public static void main(String[] args) {
        playChess();
    }
}
