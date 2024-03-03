package Strategy.game;

public class GameArena {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();

        Character king = new King();
        king.fight();

        Character prince = new Prince();
        prince.fight();
    }
}
