import java.util.Random;

public class AttackNpc extends Npc{
    public AttackNpc(String name, int health, int level, boolean alignment){
        super(name, health, level, alignment);
    }

    @Override
    public void action(Player player) {
        if (isAlignment()) {
            System.out.println(getName() + " heals you!");
            System.out.println(getName() + " heals you for " + (getLevel()*2) + " health!");
            player.setHealth(player.getHealth() + getLevel()*2);
            System.out.println("You have " + getHealth() + " health.");
        } else {
            System.out.println(getName() + " attacks you for " + getLevel() + " damage!");
            player.setHealth(player.getHealth() - getLevel());
            System.out.println("You have " + getHealth() + " health.");
        }
    }
}
