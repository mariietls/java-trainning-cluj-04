public class Rook extends Piece {
    public Rook(Color colorInput) {
        super(colorInput, "Rook");

        if (colorInput == Color.white) {
            symbol = "wRook";
        } else {
            symbol = "bRook";
        }
    }

}

