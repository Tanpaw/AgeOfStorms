public abstract class Npc {
    private String name;
    private int health, level;
    private boolean alignment;

    public Npc(String name, int health, int level, boolean alignment) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlignment() {
        return alignment;
    }

    public void setAlignment(boolean alignment) {
        this.alignment = alignment;
    }

    public abstract void action(Player player);
}
