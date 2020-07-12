public class Pawn extends Piece {
    public Pawn(Color colorInput) {
        super(colorInput, "Pawn");

        if (colorInput == Color.white) {
            symbol = "wPawn";
        } else {
            symbol = "bPawn";
        }
    }

}