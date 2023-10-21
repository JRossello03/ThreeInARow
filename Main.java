import model.Board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean winner = false;

        Board board = new Board();


        // I would like to add a try/catch to handle errors
        while (!winner) {

            System.out.println("Choose position to place a piece: ");

            int row = sc.nextInt();
            int col = sc.nextInt();

           board.placePiece(row, col);

            board.printBoard();

            if (board.checkCols() || board.checkRows() || board.checkDiags()) {
                winner = true;
            }
        }
    }
}