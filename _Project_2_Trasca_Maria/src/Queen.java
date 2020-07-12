 public class Queen extends Piece {
        public Queen(Color colorInput) {
            super(colorInput, "Queen");

            if (colorInput == Color.white) {
                symbol = "wQueen";
            } else {
                symbol = "bQueen";
            }
        }


 }
