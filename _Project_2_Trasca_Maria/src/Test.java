public class Test {
    public static void main(String[] args){
        Board board= new Board();
        Board.MakeBoard();
        Player player=new Player("Maria", Color.black);
        Player player1=new Player("Jimin", Color.white);
        player.movePiece(2,1,Color.black);
        player1.movePiece(6,6, Color.white);
        player.movePiece(1,1,Color.black);
        player1.movePiece(5,2, Color.white);
        player.movePiece(3,4,Color.black);
        player1.movePiece(5,2, Color.white);
        player.movePiece(1,5,Color.black);
        if (Board.scorWhite>Board.scorBlack) System.out.println("Castigatorul este jucatorul cu alb");
        else System.out.println("Castigatorul este jucatorul cu negru");
    }
}
