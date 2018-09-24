public class Starter {
    public static void main(String[] args) {
        Game game = new Game();

        game.setPlayer(new Player("Alexis", 50, 1));
        game.addNpc(new ShoperNpc("John", 40, 10, true));
        game.addNpc(new ShoperNpc("Charlie", 30, 10, false));
        game.addNpc(new ShoperNpc("Bob", 25, 10, true));

        game.addNpc(new AttackNpc("Evil Gnome", 50, 5, false));
        game.addNpc(new AttackNpc("Good Gnome", 50, 5, true));

        game.addNpc(new EliteNpc("Elite Gnome", 60, 7, false));
        game.addNpc(new EliteNpc("Elite Gnome Warrior ", 80, 9, false));
        game.addNpc(new EliteNpc("Gnome Champion", 120, 12, false));


        game.start();

    }
}
