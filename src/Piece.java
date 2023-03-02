public abstract class Piece {

    private String color;
    private Square currentSquare;

    public Piece (String color, Square currentSquare) {
        this.color = color;
        this.currentSquare = currentSquare;
    }

    public String getColor() {
        return color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square square) {
        this.currentSquare = square;
    }

    public abstract boolean isValidMove (Square destinationSquare, Board board);
}
