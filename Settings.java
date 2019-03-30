import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Random;


public class Settings {
    Creature dragon = Creature.newDragon();
    Creature orc = Creature.newOrc();
    Creature troll = Creature.newTroll();
    Creature goblin = Creature.newGoblin();

    //////////////////////////////////////////////////
    // Helper Functions
    //////////////////////////////////////////////////
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void pressEnter() {
        Scanner in = new Scanner(System.in);
        System.out.println("<press enter>");
        in.nextLine();
    }

    public void sleepSpace() {
        sleep(500);
        // sleep(5500);
        p("");
    }

    public void sleep(int t) {
        try
        {
            Thread.sleep(t);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }

    public void p(String x) {
        System.out.println(x);
    }

    public void p1(String x) {
        System.out.print(x);
    }

    public void pf(String x, int y) {
        System.out.printf(x, y);
    }

    public void pff(String x, String y, int z) {
        System.out.printf(x, y, z);
    }

    public String getAns() {
            Scanner in = new Scanner(System.in);
            System.out.print("> ");
            String ans = in.nextLine();
            return ans;
    }

    public boolean ansEquals(String ans, String target) {
        String subTarget;
        if (ans.length() >= target.length()) {
            subTarget = ans.substring(0, target.length());
            if (subTarget.equals(target)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    //////////////////////////////////////////////////
    // Plot Functions
    //////////////////////////////////////////////////
    public void bus() {
        String[] options = {"attack", "give", "flee"};
        String act1 = String.join("\n"
, "   _   ___ _____   ___         _____ _          ___         "
, "  /_\\ / __|_   _| |_ _|  ___  |_   _| |_  ___  | _ )_  _ ___"
, " / _ \\ (__  | |    | |  |___|   | | | ' \\/ -_) | _ \\ || (_-<"
, "/_/ \\_\\___| |_|   |___|         |_| |_||_\\___| |___/\\_,_/__/"
);
        String dragon_ascii = String.join("\n"
, "       ,  ,                 "
, "   ,  /|_|\\                 "
, "  /( ( @ @ ) )\\  /|         "
, " //\\  \\   /  /\\\\((          "
, "//  '-/'-'\\-'  \\\\))         "
, "|(   | (=) |   )|(          "
, "\\    (\\\\=//     /)          "
, " \\|\\|\\/\"\"\"\\/|/|/'           "
);
                       


        p(act1);
        p("\n");
        p("You're on the bus on the way to school.");
        p("In your lunchbag are tacos.");
        p("You start talking with someone in the seat next to you when...");
        sleepSpace();
        p("The bus stops right before a fire breathing dragon!");
        sleepSpace();
        p(dragon_ascii);
        p("\n");
        pressEnter();

        encounterDragon(options);

        p("(Dragon) I love tacos!");
        sleepSpace();
        p("(Dragon) I want to be your friend - *One* who gives me tacos!");
        p("The dragon 'poofs' and becomes really small.");
        sleepSpace();
        p("Then the dragon crawls into your backpack.");
        pressEnter();
    }

    public void cafeteria() {
        String act2 = String.join("\n"
, "\n\n\n"
, "========================================================"
, "   _   ___ _____   ___ ___         _____ _        "
, "  /_\\ / __|_   _| |_ _|_ _|  ___  |_   _| |_  ___ "
, " / _ \\ (__  | |    | | | |  |___|   | | | ' \\/ -_)"
, "/_/ \\_\\___| |_|   |___|___|         |_| |_||_\\___|"
, "                                                  "
, "  ___       __     _           _      "
, " / __|__ _ / _|___| |_ ___ _ _(_)__ _ "
, "| (__/ _` |  _/ -_)  _/ -_) '_| / _` |"
, " \\___\\__,_|_| \\___|\\__\\___|_| |_\\__,_|"
, "----------------------------------------------------"
// , "\n\n                                      "
);                           

        // Banner
        p(act2);

        // Dialog
        p("You arrive at school, say hi to your teacher, and sit down to get ready for school.");
        sleepSpace();
        p("You noticed that your backpack isn't much heavier then it is normally.");
        sleepSpace();
        p("When you go to open your backpack to get your books and pensils, you find that the dragon is curled-up fast-asleep.");
        sleepSpace();
        p("You figure it must be tired so you try not to disturb it's sleep, so you focus hard on your schoolwork.");
        sleepSpace();
        p("It's almost lunch-time and you're just a little hungry. You start wondering how hungry the dragon is. Right when the bell rings Dragon starts moving around in your backpack almost like an excited dog.");
        sleepSpace(); 
        p("Dragon hops into your pocket ready for lunch!");
        sleepSpace();
        p("When you get to the cafeteria, right when you and Dragon are about to eat, a muscular, angry looking orc comes out ready to attack!");
        pressEnter();

        // Battle
        encounterMonster(dragon, orc);
        pressEnter();
        p("You gained one taco");
        p("Your health is back too");
        p("You learned a new skill: fire breath!");
        dragon.attackCount = 3;
        dragon.inventory += 1;
        dragon.health = 20;
        pressEnter();
        p("\n\n");
    }

    public void recess() {
        String act3 = String.join("\n"
, "   _   ___ _____    ___ ___ ___         ___                  "
, "  /_\\ / __|_   _|  |_ _|_ _|_ _|  ___  | _ \\___ __ ___ ______"
, " / _ \\ (__  | |     | | | | | |  |___| |   / -_) _/ -_|_-<_-<"
, "/_/ \\_\\___| |_|    |___|___|___|       |_|_\\___\\__\\___/__/__/"
, "---------------------------------------------------------------"
, "\n"
);                                                        

        p(act3);
        p("After lunch you head back to class with Dragon in your pocket.");
        sleepSpace();
        p("In the classroom, you learn from the teacher like normal.");
        sleepSpace();
        p("Dragon seems to have taken interest in the subjects too.");
        sleepSpace();
        p("When it's time for recess Dragon hops into your pocket again.");
        sleepSpace();
        p("Out in the playground all is quite..");
        sleepSpace();
        p("A little too quite...!");
        sleepSpace();
        p("A giant smelly troll, as tall as the school, comes pounding straight to you and Dragon!");
        pressEnter();
        encounterMonster(dragon, troll);
        pressEnter();
        p("You gained another taco");
        p("Your health is back too");
        p("You learned a new skill: flame thrower!");
        dragon.attackCount = 4;
        dragon.health = 20;
        pressEnter();
        p("\n\n");
    }


    public void backHome() {
        String actvi = String.join("\n"
, "   _   ___ _____  __   _____         _  _               "
, "  /_\\ / __|_   _| \\ \\ / /_ _|  ___  | || |___ _ __  ___ "
, " / _ \\ (__  | |    \\ V / | |  |___| | __ / _ \\ '  \\/ -_)"
, "/_/ \\_\\___| |_|     \\_/ |___|       |_||_\\___/_|_|_\\___|"
, "                                                        "
, " ___                _     _  _               "
, "/ __|_ __ _____ ___| |_  | || |___ _ __  ___ "
, "\\__ \\ V  V / -_) -_)  _| | __ / _ \\ '  \\/ -_)"
, "|___/\\_/\\_/\\___\\___|\\__| |_||_\\___/_|_|_\\___|"
, "\n"
, "----------------------------------------------------------"
);


        // Testing
        dragon.attackCount = 4;
        dragon.inventory += 1;

        p(actvi);
        p("It's the end of the school day and you're back on the bus ready to get home.");
        sleepSpace();
        p("On the bus you're thinking, 'What a cRaZy day!!!'");
        sleepSpace();
        p("You say good-bye to the bus driver, step off the bus, and start walking to the front door.");
        sleepSpace();
        p("There's this strange light coming from behind the house.");
        sleepSpace();
        p("As you start walking back there you hear this weird laugh and the sound of machines!");
        sleepSpace();
        p("Out from a poof of smoke jumps a goblin with steam punk googles.  It's sitting on top of a robot and it seems to be controlling it with leavers and buttons!");
        pressEnter();
        encounterMonster(dragon, goblin);


        p("\n");
        pressEnter();
    }

    public void ending() {
        String banner = String.join("\n"
, "========================================================="
, "========================================================="
, " ____                                _____ _          "
, "|  _ \\ _ __ __ _  __ _  ___  _ __   |  ___(_)_ __ ___ "
, "| | | | '__/ _` |/ _` |/ _ \\| '_ \\  | |_  | | '__/ _ \\"
, "| |_| | | | (_| | (_| | (_) | | | | |  _| | | | |  __/"
, "|____/|_|  \\__,_|\\__, |\\___/|_| |_| |_|   |_|_|  \\___|"
, "                 |___/                                 "
, "========================================================="
, "========================================================="
, ""
);
        clearScreen();
        p(banner);
        p("Congratulations!");
        p("You completed the game!");
        p("\n\n\n");
        p("Developed by - Uncle Cool Chris LLC");
        pressEnter();

    }


    //////////////////////////////////////////////////
    // Action Sequence
    //////////////////////////////////////////////////
    public void encounterDragon(String[] options) {
        while (true) {
            p("What do you do?");
            p("\n");
            for (int i = 0; i < options.length; i++) {
                p("* " + options[i]);
            }

            String ans = getAns();
            p("___________________________________________");
            if (ansEquals(ans, options[0])) {
                System.out.println("You try to get close to attack but the dragon pushes you back!");
            } else if (ansEquals(ans, options[1])) {
                if (ans.equals("give")) {
                    p("give what?");
                } else if (ans.equals("give taco")) {
                    p("only one taco?!");
                } else {
                    break;
                }
            } else if (ansEquals(ans, options[2])) {
                System.out.println("You try to flee but the dragon blocks your way.");
            } else {
                System.out.println("sorry, you can't do that");
            }
            p("\n");


        }
    }

    public void encounterMonster(Creature dragon, Creature monster) {
        while (true) {
            p("_________________________________________");
            pf("Dragon health: %d\n", dragon.health); 
            pff("%s health: %d\n", monster.name, monster.health); 
            sleep(2500);

            boolean won = playerAttack(dragon, monster);
            sleep(2500);
            if (won) {
                p("You defeated the " + monster.name + "!");
                break;
            }
            else {
                monsterAttack(monster, dragon);
                boolean lost = dragon.health <= 0;
                if (lost) {
                    clearScreen();
                    p("Oh no you lost!");
                    pressEnter();
                    DragonFire.startGame();
                }
            }
        }
    }

    public boolean monsterAttack(Creature monster, Creature dragon) {
        Random random = new Random();
        int number = random.nextInt(3);
        String attackName = monster.attackNames[number];
        int attackPower = monster.attackPowers[number];
        p(monster.name + " attacks with " + attackName);
        p(monster.name + " does " + attackPower + " damage!");
        dragon.health -= attackPower;
        sleep(3000);
        return true;

    }


    public boolean playerAttack(Creature dragon, Creature monster) {
        String[] attackOptions =  Arrays.copyOfRange(dragon.attackNames,0,dragon.attackCount);
        int tacoCount = dragon.inventory;
        String[] eatTaco = {"eat taco [" + tacoCount + "]"};
        String[] options = Stream.concat(Arrays.stream(attackOptions), Arrays.
                stream(eatTaco)).
                toArray(String[]::new);

        while (true) {
            p("===========================================");
            p("What should Dragon do?");
            p("\n");
            for (int i = 0; i < options.length; i++) {
                p("* " + options[i]);
            }
            String ans = getAns();
            p("___________________________________________");
            // Eat taco
            if (ans.equals("eat taco")) {
                // if (dragon.inventory >  0) {
                if (dragon.inventory >  0) {
                    // There are available tacos
                    dragon.health = 20;
                    dragon.inventory -= 1;
                    p("Dragon's health back to 20");
                    return false;
                } else {
                    // Out of tacos
                    p("You're out of tacos!");
                    sleep(3000);
                }
            } else {
                // Attack
                int attackPower = getAttackPower(dragon.name, dragon.attackNames, ans);
                if (attackPower >= 0) {
                    int mh = monster.health;
                    attackPower = dragon.attackPowers[attackPower];
                    monster.health = mh - attackPower;
                    if (monster.health <= 0) {
                        return true;
                    } else {
                        p("Dragon did " + attackPower + " damage.");
                        return false;
                    }
                } else {
                    System.out.println("Sorry, that option is not available.");
                }
            }
        }
    }

    public int getAttackPower(String name, String[] attackNames, String ans) {
        for (int i = 0; i < attackNames.length; i++) {
            if (attackNames[i].equals(ans)) {
                p(name + " attacks with " + attackNames[i] + "!");
                return i;
            } 
        }
        return -99;
    }

    public void playAgain() {
        p1("Play again Y/n");
        String ans = getAns().toLowerCase();
        if (ans.equals('y') || ans.equals("yes")) {
            DragonFire.startGame();
        } else {
            System.exit(0);
        }
        
    }

    //////////////////////////////////////////////////
    // Test Functions
    //////////////////////////////////////////////////
    public void showHealth(Creature a, Creature d) {
        System.out.println(d.health - a.attackPowers[0]);
    }

    public void printStringArray(String[] sa) {
        for (int i = 0; i < sa.length; i++) {
            System.out.println("\t* " + sa[i]);
        }
    }
}
