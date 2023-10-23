package model;

import java.util.Scanner;


/*
    - The idea isto keep "board.getBoard()" on a variable and reduce the sentences

    · THINGS TO DO:
    - Control indexArrayOutOfBounds with try/catch
    - Control winner, when row, col or diag is full counts as winner
    - ¿REFACTORING?
 */



public class Game {

    Board board = new Board();
    Turn turn = new Turn();

    public void placePiece(int row, int col) {
        if (!board.getBoard()[row][col].isOcupated()) {
            if (turn.getTurn() == 2) {
                board.getBoard()[row][col].setPiece("❌");
                board.getBoard()[row][col].setOcupated(true);
                turn.setTurn(1);
            } else {
                board.getBoard()[row][col].setPiece("⭕");
                board.getBoard()[row][col].setOcupated(true);
                turn.setTurn(2);
            }
        }
    }

    boolean winner = false;

    public void playGame() {

        Scanner sc = new Scanner(System.in);

        while (!winner) {

            System.out.println("Choose position to place a piece: ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            placePiece(row, col);

            board.printBoard();

            if (checkCols() || checkRows() || checkDiags()) {
               winner = true;
            }
        }

    }

    // Check if there's a winner
    public boolean checkCols() {
        if (board.getBoard()[0][0].isOcupated() && board.getBoard()[1][0].isOcupated() && board.getBoard()[2][0].isOcupated()) {
            return true;
        } else if (board.getBoard()[0][1].isOcupated() && board.getBoard()[1][1].isOcupated() && board.getBoard()[2][1].isOcupated()) {
            return true;
        } else return board.getBoard()[2][2].isOcupated() && board.getBoard()[1][2].isOcupated() && board.getBoard()[0][2].isOcupated();
    }

    public boolean checkRows() {
        if (board.getBoard()[0][0].isOcupated() && board.getBoard()[0][1].isOcupated() && board.getBoard()[0][2].isOcupated()) {
            return true;
        } else if (board.getBoard()[1][0].isOcupated() && board.getBoard()[1][1].isOcupated() && board.getBoard()[1][2].isOcupated()) {
            return true;
        } else return board.getBoard()[2][0].isOcupated() && board.getBoard()[2][1].isOcupated() && board.getBoard()[2][2].isOcupated();
    }

    public boolean checkDiags() {
        if (board.getBoard()[0][0].isOcupated() && board.getBoard()[1][1].isOcupated() && board.getBoard()[2][2].isOcupated()) {
            return true;
        } else return board.getBoard()[0][2].isOcupated() && board.getBoard()[1][1].isOcupated() && board.getBoard()[2][0].isOcupated();
    }

}
