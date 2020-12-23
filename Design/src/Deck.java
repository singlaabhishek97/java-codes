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

    //Getter methods for face and suite
    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuite() {
        return suite;
    }

    private boolean available = true;
    public boolean isAvailable() {return available; }
    public void markUnavailable() {available = false; }
    public void markAvailable() {available = true; }

    public String toString() {
        return (faceValue + " of " + suite);
    }
}

class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public int score() {
        int score = 0;
        for(Card card : cards) {
            score += card.getFaceValue();
        }
        return score;
    }

    public void addCard(Card card) {
        cards.add(card);
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