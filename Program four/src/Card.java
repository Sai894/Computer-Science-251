public class Card {

    private int suit;
    private int rank;


    public int getSuit() {return this.suit;}

    public int getRank() {return this.rank;}

    private void  setSuit(int suit) {
        if(suit >=0 && suit <= 3) {
            this.suit = suit;
        }
    }

    private void  setRank(int rank) {
        if(rank >= 0 && rank <= 12) {
            this.rank = rank;
        }
    }

    public Card() {
        this.suit = 0;
        this.rank = 0;
    }
    public Card(int suit, int rank) {
        setSuit(suit);
        setRank(rank);
    }

    public Card clone() {
        Card c = new Card();
        c.setSuit(this.suit);
        c.setRank(this.rank);
        return c;
    }

    public boolean equals(Card guest) {
        if (this.getSuit() == guest.getSuit() && this.getRank() == guest.getRank()) {
            return true;
        }
        else { return false; }

    }

    public String toString() {
        String name = "";
        if (getRank() == 0) {
            name = "A";
        }else if (getRank() == 10) {
            name = "J";
        }else if (getRank() == 11) {
            name = "Q";
        }else if (getRank() == 12) {
            name = "K";
        }else {
            int newRank = getRank() + 1;
            name = "" + newRank;
        }


        if (getSuit() == 0) {
            name = name +"C";
        }else if (getSuit() ==1) {
            name = name +"S";
        }else if (getSuit() == 2) {
            name = name +"H";
        }else if (getSuit() == 3) {
            name = name +"D";
        }


        return name;
    }

}
