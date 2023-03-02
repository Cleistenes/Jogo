public class Board {

           private Square[][] squares;

        public Board() {
            this.squares = new Square[8][8];
            for (int row = 0; row < 8; row++) {
                for (int column = 0; column < 8; column++) {
                    this.squares[row][column] = new Square(row, column);
                }
            }
        }
    public Square getSquare(int row, int column) {
        return this.squares[row][column];
   }

    public void initializeBoard() {
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
