import java.util.Scanner;

public class Board {

    static final int Numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
    public static Square board[][] = new Square[8][8];
    public static int scorBlack=0;
    public static int scorWhite=0;
    public static final Scanner scanner = new Scanner(System.in);

    public static void MakeBoard() {
        board[0][0] = new Rook(Color.black);
        board[0][1] = new Knight(Color.black);
        board[0][2] = new Bishop(Color.black);
        board[0][3] = new Queen(Color.black);
        board[0][4] = new King(Color.black);
        board[0][5] = new Bishop(Color.black);
        board[0][6] = new Knight(Color.black);
        board[0][7] = new Rook(Color.black);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(Color.black);
        }

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new EmptySquare();
            }
        }
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(Color.white);
        }

        board[7][0] = new Rook(Color.white);
        board[7][1] = new Knight(Color.white);
        board[7][2] = new Bishop(Color.white);
        board[7][3] = new Queen(Color.white);
        board[7][4] = new King(Color.white);
        board[7][5] = new Bishop(Color.white);
        board[7][6] = new Knight(Color.white);
        board[7][7] = new Rook(Color.white);

    }
}