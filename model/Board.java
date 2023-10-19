package model;

public class Board {
    // The width and height of the board doesn't change
    private static final int row = 3;
    private static final int col = 3;
    private final Cell[][] board = new Cell[row][col];

    public Board() {
        initializeBoard();
        printBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Cell(i,j);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j].getPiece());
            }
            System.out.println();
        }
    }

    public void placePiece(int row, int col) {
        if (!this.board[row][col].isOcupated()) {
            this.board[row][col].setOcupated(true);
            this.board[row][col].setPiece("❌");
        }
    }

    /*public boolean checkCol() {
        return this.board[row][0].isOcupated() || this.board[row][1].isOcupated() || this.board[row][2].isOcupated();
    }*/

}
