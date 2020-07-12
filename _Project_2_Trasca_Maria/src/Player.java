import java.util.Scanner;

public class Player {
    private String name;
    private Color color;
    private final Scanner scanner = new Scanner(System.in);

    Player(String nameInput, Color colorInput) {
        name = nameInput;
        color = colorInput;
    }
    public void movePiece(int fromRowInput, int fromColumnInput, Color color){
        Color color1;
        if(Board.board[fromRowInput+1][fromColumnInput].getClass().equals(Pawn.class))
        {
            color1=Board.board[fromRowInput+1][fromColumnInput].getColor();

            Board.board[fromRowInput+1][fromColumnInput]=Board.board[fromRowInput][fromColumnInput];
            Board.board[fromRowInput][fromColumnInput]=new EmptySquare();
            if(color1!=color && color.equals(Color.black))
                Board.scorBlack++;
            else if(color1!=color && color.equals(Color.white))
                Board.scorWhite++;
        }
        if(Board.board[fromRowInput+1][fromColumnInput].getClass().equals(EmptySquare.class))
        {
            Board.board[fromRowInput+1][fromColumnInput]= Board.board[fromRowInput][fromColumnInput];
            Board.board[fromRowInput][fromColumnInput]=new EmptySquare();
        }
    }

}

