import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.initializeBoard();


        Scanner scanner = new Scanner(System.in);
        while (!board.isGameOver()) {
            System.out.println(board);

            System.out.print("Insira o quadrado original: ");
            String source = scanner.nextLine();
            System.out.print("Insira o quadrado de destino: ");
            String destination = scanner.nextLine();

            try{
                Square sourceSquare = board.getSquare(source);
                Square destinationSquare = board.getSquare(destination);

                Piece piece = sourceSquare.getPiece();
                if (piece == null) {
                    throw new InvalidMoveException("Não há nenhuma peça no quadrado de origem!");
                }

                if (!piece.isValidMove(destinationSquare, board)) {
                    throw new InvalidMoveException("Movimento inválido!");
                }

                board.movePiece(sourceSquare, destinationSquare);
            } catch (IinvalidMoveException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}