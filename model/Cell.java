package model;

public class Cell {

    private String piece;
    private boolean ocupated;
    private int row, col;

    public Cell(int row, int col) {
        this.ocupated = false;
        this.piece = "⬜";
    }


    // GETTERS AND SETTERS
    public boolean isOcupated() {
        return this.ocupated;
    }

    public void setOcupated(boolean ocupated) {
        this.ocupated = ocupated;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }
}
