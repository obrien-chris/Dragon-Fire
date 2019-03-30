public class Card {
    private int rank;
    private int suit;
    System.out.println("balh?");

    private String[] ranks = {null, "Ace", "1", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spaces"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        System.out.println("hepl");
        String rank = ranks[this.rank];
        String suit = suits[this.suit];
        return("Bouthou" + rank + " of " + suit + "blah!");
    }
}
