public class King extends Piece {
    public King(Color colorInput) {
        super(colorInput, "King");

        if (colorInput == Color.white) {
            symbol = "wKing";
        } else {
            symbol = "bKing";
        }
    }


}
