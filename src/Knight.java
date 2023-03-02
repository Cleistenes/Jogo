public class Knight extends Piece {

    public Knight(String color, Square currentSquare) {
        super (color, currentSquare);
    }

    @Override
    public boolean isValidMove(Square destinationSquare, Board board) {
        int currentRow = getCurrentSquare().getRow();
        int currentSquare = getCurrentSquare().getColumn();
        int destRow = destinationSquare.getRow();
        int destColumn = destinationSquare.getColumn();

        if (destinationSquare.getPiece() != null && destinationSquare.getPiece().getColor().equals(getColor())) {
            return false;
        }

        int rowDiff = Math.abs(destRow - currentRow);
        int colDiff = Math.abs(destColumn - destColumn);
        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            return true;
        }

        return false;
    }
}
