import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Npc> npcList;
    private Player player;

    public Game() {
        npcList = new ArrayList<Npc>();
    }

    public void start() {
        while (player.getHealth() > 0 && player.getLevel() <= 50) {
            System.out.println("[Hero]" + player.getName() + "(HP: " + player.getHealth() + ", Lv: " + player.getLevel() + ")");
            RandomNPCEncounter();
            System.out.println("========================================");
        }
        System.out.println("†††††††††††††††††††††††††††");
        System.out.println("††>>You have died!!!<<††");
        System.out.println("†††††††††††††††††††††††††††");
        System.out.println();
        System.out.println("===============");
        System.out.println("!!!Game Over!!!");
        System.out.println("===============");

    }

    public void addNpc(Npc npc) {

        npcList.add(npc);


    }

    public void setPlayer(Player player) {

        this.player = player;
    }

    public void RandomNPCEncounter() {

        Random random = new Random();

        Npc npc = npcList.get(random.nextInt(npcList.size()));
        System.out.println("You encountered: " + npc.getName() + "(HP: " + npc.getHealth() + ", Lv: " + npc.getLevel() + ")");
        npc.action(player);

    }
}
