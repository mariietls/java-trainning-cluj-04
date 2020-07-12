public class Knight extends Piece{
    public  Knight(Color colorInput) {
        super(colorInput, "Knight");

        if(colorInput == Color.white){
            symbol = "wKnight";
        }
        else{
            symbol = "bKnight";
        }
    }

}
