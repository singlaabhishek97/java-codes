import java.util.ArrayList;

enum Suit {
    SPADE, HEART, CLUB, DIAMOND
}

class Card {
    private int faceValue;
    private Suit suite;
    Card(int faceValue, Suit suite) {
        this.faceValue = faceValue;
        this.suite = suite;
    }
    public String toString() {
        return (faceValue + " of " + suite);
    }
}

public class Deck {
    private ArrayList<Card> cards;

    Deck() {
        cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for(Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    public static void main(String[] args) {

        Deck deck = new Deck();

    }
}