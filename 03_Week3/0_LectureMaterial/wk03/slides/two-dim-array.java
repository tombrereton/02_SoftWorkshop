int rows = 3;
int columns = 3;
String[][] board = new String[rows][columns];

/*  board[0][0] board[0][1] board[0][2]
    board[1][0] board[1][1] board[1][2]
    board[2][0] board[2][1] board[3][2] */

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
        board[i][j] = " ";
    }
}
board[1][1] = "x";
board[2][1] = "o";
