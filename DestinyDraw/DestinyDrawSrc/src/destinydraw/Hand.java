package destinydraw;

import javax.swing.JOptionPane;

public class Hand {

    private static Deck deck = new Deck();

    public static String[] randomCard = new String[8]; // Random cards that give to player.

    public static String[] cardFilePlayer = new String[8];

    public static String[] cardFileDealer = new String[8];

    public static int[] cardValuePlayer = new int[8];
    
    public static int[] cardValueDealer = new int[8];

    static String[] getRandomCard() {
        // get random five of cards from deck and give it to player.
        for (int i = 0; i < 8; i++) {
            randomCard[i] = String.valueOf(deck.randomCards());
        }
        return randomCard;

    }

    //
    public static int checkValue(String[] cardFace) {
        // Check value of cards.

        switch (cardFace[1]) {
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return Integer.parseInt(cardFace[1]);
        }
    }

    //
    static void drawCardPlayer() {
        //Print actual form of cards.
        getRandomCard();
        for (int i = 0; i < 8; i++) {
            String value = randomCard[i];
            String[] cardFace = value.split("_");
            cardFilePlayer[i] = cardFace[0] + cardFace[1];
            cardValuePlayer[i] = checkValue(cardFace);
        }

    }

    static void drawCardDealer() {
        //Print actual form of cards.
        getRandomCard();
        for (int i = 0; i < 8; i++) {
            String value = randomCard[i];
            String[] cardFace = value.split("_");
            cardFileDealer[i] = cardFace[0] + cardFace[1];
            cardValueDealer[i] = checkValue(cardFace);
        }

    }


}
