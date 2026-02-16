public class DeckDriver {
    public static void main(String[] args) {

        int cardsPerRow = 8;
        int cardsThisRow = 0;
        Deck deck = new Deck();
        deck.initDeck();
        System.out.println("\nHere is a shuffled deck from deck class ...\n");

        while(!deck.emptyDeck()) {
            int myCard = deck.dealCard();
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow) {
                Deck.cardtoString(myCard);
                System.out.print(" ");
            } else {
                System.out.println("");
                cardsThisRow = 1;
                Deck.cardtoString(myCard);
                System.out.print(" ");
            }
        }

        System.out.println();

    }


}
