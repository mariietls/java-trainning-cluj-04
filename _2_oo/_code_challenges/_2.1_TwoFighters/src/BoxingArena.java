public class BoxingArena {

    public static void main(String[] args) {

        Fighter fighterOne = new Fighter("Jimin",100,50);
        Fighter fighterTwo = new Fighter("Taehyung",100,70);

        BoxingMatch match = new BoxingMatch(fighterOne,fighterTwo);
        System.out.println("The winner is " + match.fight(fighterOne,fighterTwo));
    }
}