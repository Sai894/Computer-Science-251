public class Main {
    public static void initDeck(boolean[] deck) {
        for(int i = 0; i < deck.length; ++i) {
            deck[i] = false;
        }

    }

    public static boolean emptyDeck(boolean[] deck) {
        for(int i = 0; i < deck.length; ++i) {
            if (!deck[i]) {
                return false;
            }
        }

        return true;
    }

    public static int dealCard(boolean[] deck) {
        while(true) {
            if (!emptyDeck(deck)) {
                int r = (int)(Math.random() * (double)deck.length);
                if (deck[r]) {
                    continue;
                }

                deck[r] = true;
                return r;
            }

            return -1;
        }
    }

    public static void printCard(int card) {
        int rank = card % 13;
        int suit = card / 13;
        String cardString = "";
        if (rank == 0) {
            cardString = "A";
        } else if (rank == 10) {
            cardString = "J";
        } else if (rank == 11) {
            cardString = "Q";
        } else if (rank == 12) {
            cardString = "K";
        } else {
            int newRank = rank + 1;
            cardString = "" + newRank;
        }

        if (suit == 0) {
            cardString = cardString + "C";
        } else if (suit == 1) {
            cardString = cardString + "S";
        } else if (suit == 2) {
            cardString = cardString + "H";
        } else if (suit == 3) {
            cardString = cardString + "D";
        }

        System.out.print(cardString);
    }

    public static void main(String[] args) {
        boolean[] myDeck = new boolean[52];
        int cardsPerRow = 8;
        int cardsThisRow = 0;
        initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");

        while(!emptyDeck(myDeck)) {
            int myCard = dealCard(myDeck);
            ++cardsThisRow;
            if (cardsThisRow <= 8) {
                printCard(myCard);
                System.out.print(" ");
            } else {
                System.out.println("");
                cardsThisRow = 1;
                printCard(myCard);
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}