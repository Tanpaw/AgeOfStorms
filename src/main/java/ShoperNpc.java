public class ShoperNpc extends Npc {
    public ShoperNpc(String name, int health, int level, boolean alignment){
        super(name, health, level, alignment);
    }

    @Override
    public void action(Player player) {
        System.out.println(getName() + " wants to trade.");
        System.out.println("Level UP!!!");
        player.setLevel(player.getLevel() + 1);
        System.out.println("Level " + player.getLevel());
    }
}
