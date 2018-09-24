public class EliteNpc extends Npc {
    public EliteNpc(String name, int health, int level, boolean alignment){
        super(name, health, level, alignment);
    }

    @Override
    public void action(Player player) {
            System.out.println("Prepare to die!!!");
            System.out.println(getName() + " attacks you for " + getLevel() + " damage!");
            player.setHealth(player.getHealth() - getLevel());
        System.out.println("You have " + player.getHealth() + " health.");
        }

}
