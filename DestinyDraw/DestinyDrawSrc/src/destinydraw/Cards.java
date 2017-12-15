package destinydraw;

import java.util.*;

public class Cards {

    private int suit, rank;
    private String[] cardSuit = {"C_", "S_", "D_", "H_"};
    private String[] cardRank = {"A", "2", "3", "4", "5",
            "6", "7", "8", "9", "10", "J", "K", "Q"};

    public Cards(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit(){

        return cardSuit[this.suit];
    }

    public String getRank(){

        return cardRank[this.rank];
    }

    public String toString(){
        String thisCards = cardSuit[this.suit]+cardRank[this.rank];
        return thisCards;
    }

}