public class Bishop extends Piece {
    public Bishop(Color colorInput) {
        super(colorInput, "Bishop");

        if(colorInput == Color.white){
            symbol = "wBishop";
        }
        else{
            symbol = "bBishop";
        }
    }

}
