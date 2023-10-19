import model.Board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INTERACT WITH USER
        Scanner sc = new Scanner(System.in);

        boolean winner = false;

        Board board = new Board();

        while (!winner) {
            System.out.println("Choose position to place piece in the board: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            board.placePiece(row, col);


            board.printBoard();
        }
    }
}