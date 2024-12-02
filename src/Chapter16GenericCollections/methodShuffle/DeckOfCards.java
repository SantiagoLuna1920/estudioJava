package Chapter16GenericCollections.methodShuffle;

import java.util.Collections;
import java.util.LinkedList;

public class DeckOfCards {
    private LinkedList<Card> list = new LinkedList<Card>(); // declare list that will store cards

    public DeckOfCards(){
        for(Card.Suit suit : Card.Suit.values()){
            for( Card.Face face : Card.Face.values() ) {
                list.add(new Card(face,suit));
            }
        }
        Collections.shuffle(list); //shuffle deck
    } // end DeckOfCards constructor

    // output deck
    public void printCards(){
        //display 52 cards
        for( int count = 0; count<list.size(); count++ ) {
            System.out.printf("%-19s%s",list.get(count),( (count+1)%4==0 ) ? "\n" : "");
        }
    }
}
