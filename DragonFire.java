import java.util.Scanner;
// Settings for Creatures
//  Bus         ->  dragon [claw slash, tail swipe, fire breath, flamethrower]
//  Cafeteria   ->  orc    [sword chop, sword slash, bow attack]
//  Recess      ->  troll  [two hand pound, troll bite, rock toss]
//  Back Home   ->  goblic [mechanical crossbow, trap-floor, smoke-sachel]

public class DragonFire {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Settings s = new Settings();
        s.clearScreen();
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



        System.out.println(banner);
        

        s.bus();
        s.cafeteria();
        s.recess();
        s.backHome();
        s.ending();

        // Dubugging
        // s.showHealth(dragon, orc);
    }

}
