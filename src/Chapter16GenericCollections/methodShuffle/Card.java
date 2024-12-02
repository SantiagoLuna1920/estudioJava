package Chapter16GenericCollections.methodShuffle;

public class Card {
    public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King };
    public static enum Suit {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suit suit;

    //constructor
    public Card( Face face, Suit suit ) {
        this.face = face;
        this.suit = suit;
    }

    // return face of the card
    public Face getFace() {
        return this.face;
    }

    // return suit of the card
    public Suit getSuit() {
        return this.suit;
    }

    // return string representation of card
    @Override
    public String toString() {
        return String.format("%s of %s", this.face, this.suit);
    }
} // end class card
