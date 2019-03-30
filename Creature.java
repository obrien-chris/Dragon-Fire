public class Creature {
    String name;
    int health;
    int[] attackPowers;
    String[] attackNames;
    int attackCount;
    int inventory;

    // public Creature(name,int health, int[] attackPowers, String[] attackNames) {
    //     this.health = health;
    //     this.attackPowers = attackPowers;
    //     this.attackNames = attackNames;
    // }

    public Creature(String name, int health, int[] attackPowers, String[] attackNames, int attackCount, int inventory) {
        this.name = name;
        this.health = health;
        this.attackPowers = attackPowers;
        this.attackNames = attackNames;
        this.attackCount = attackCount;
        this.inventory = inventory;
    }

    public static Creature newDragon() {
        String name = "Dragon";
        int[] attackPowers = {3,3,4,5};
        String[] attackNames = {"claw slash", "tail swipe", "fire breath", "flame thrower"};
        int attackCount = 2;
        int inventory = 1;
        Creature dragon = new Creature(name, 20, attackPowers, attackNames, attackCount, inventory);
        return dragon;
    }

    public static Creature newOrc() {
        String name = "Orc";
        int[] attackPowers = {2,3,5};
        String[] attackNames = {"sword chop", "sword slash", "bow attack"};
        int attackCount = 3;
        int inventory = 0;
        Creature orc = new Creature(name, 15, attackPowers, attackNames, attackCount, inventory);
        return orc;
    }

    public static Creature newTroll() {
        String name = "Troll";
        int[] attackPowers = {3,5,6};
        String[] attackNames = {"two-hand-pound", "troll-bite", "rock-toss"};
        int attackCount = 3;
        int inventory = 0;
        Creature troll = new Creature(name, 17, attackPowers, attackNames, attackCount, inventory);
        return troll;
    }

    public static Creature newGoblin() {
        String name = "Goblin";
        int[] attackPowers = {4,5,6};
        String[] attackNames = {"mechanical-crossbow", "trap-floor", "cannon-blast"};
        int attackCount = 3;
        int inventory = 0;
        Creature goblin = new Creature(name, 35, attackPowers, attackNames, attackCount, inventory);
        return goblin;
    }

    public String getFirstAttack() {
        return attackNames[0];
    }

    public int getInventory() {
        return this.inventory;
    }
}
