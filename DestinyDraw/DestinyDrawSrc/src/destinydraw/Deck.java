package destinydraw;

import java.util.Random;
import java.util.ArrayList;

public class Deck {

    public static ArrayList<Cards> cards;
    String suitCard, rankCard;
    Cards collect;
//
    public Deck() { // a deck of cards that maintain 52 cards.
        cards = new ArrayList<Cards>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                cards.add(new Cards(i, j));
            }
        }

    }

    public Cards randomCards() {
        Random ran = new Random();
        int indexCards = ran.nextInt(cards.size());
        collect = cards.get(indexCards);
        suitCard = collect.getSuit();
        rankCard = collect.getRank();
        return cards.remove(indexCards);
    }

    public static void newDeck(){
        cards = new ArrayList<Cards>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                cards.add(new Cards(i, j));
            }
    }

    }
}
