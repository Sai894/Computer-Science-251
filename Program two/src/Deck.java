public class Deck {

    private boolean[] myDeck = new boolean[52];

    public void initDeck() {
        for(int i = 0; i < myDeck.length; ++i) {
            this.myDeck[i] = false;
        }

    }

    public boolean emptyDeck() {
        for(int i = 0; i < myDeck.length; ++i) {
            if (!this.myDeck[i]) {
                return false;
            }
        }

        return true;
    }

    public int dealCard() {
        while(true) {
            if (!emptyDeck()) {
                int r = (int)(Math.random() * (double)myDeck.length);
                if (this.myDeck[r]) {
                    continue;
                }

                this.myDeck[r] = true;
                return r;
            }

            return -1;
        }
    }

    public static String cardtoString(int card) {
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
        return cardString;
    }
}

