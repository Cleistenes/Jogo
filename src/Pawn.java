public class Pawn extends Piece {

    public Pawn(String color, Square currentSquare) {
        super(color, currentSquare);
    }

    @Override
    public boolean isValidMove(Square destinationSquare, Board board) {
        int currentRow = getCurrentSquare().getRow();
        int currentColumn = getCurrentSquare().getColumn();
        int destRow = destinationSquare.getRow();
        int destColumn = destinationSquare.getColumn();

        // Check if destination square is occupied by a piece of the same color
        if (destinationSquare.getPiece() != null && destinationSquare.getPiece().getColor().equals(getColor())) {
            return false;
        }

        // Check if pawn is moving forward one or two squares
        if (destColumn != currentColumn) {
            return false;
        }
        if (getColor().equals("white")) {
            if (destRow == currentRow - 1 || (destRow == currentRow - 2 && currentRow == 6)) {
                return true;
            }
        } else {
            if (destRow == currentRow + 1 || (destRow == currentRow + 2 && currentRow == 1)) {
                return true;
            }
        }

        return false;
    }
}