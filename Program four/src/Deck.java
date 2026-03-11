public class Deck {
    private Card[] deck = new Card[52];
    private int cardsDealt;

    // set each element of deck to a unique Card object,
    // and sets cardsDealt to zero.
    public Deck() {
        int ind =0;
        for (int i = 0; i < 4; ++i){
            for (int j = 0; j<13; ++j)
            {
                deck[ind] = new Card(i, j);
                ind++;
            }
        }
        this.cardsDealt = 0;
    }

    // return the value of cardsDealt.
    public int getCardsDealt() {
        return this.cardsDealt;
    }

    // sets cardsDealt specified value (cardsDealt)
    public void setCardsDealt(int cardsDealt){
        this.cardsDealt = cardsDealt;
    }

    // returns wheather or not all the cards in deck
    // have already been dealt (cardsDealt == 52).
    public boolean isEmptyDeck(){
        if (cardsDealt == 52) {
            return true;
        }

        return false;
    }

    // set cardsDealt to zero.
    public void collectAllCards(){
        setCardsDealt(0);
    }

    // if emptyDeck() is false ...
    // returns the card at location cardsDealt in deck,
    // and increments cardsDealt by 1.
    // else ...
    // returns null
    public Card dealCard(){
        if (!isEmptyDeck()){
            return deck[cardsDealt++];
        }
        else {
            return null;
        }
    }

    // apply 100 random card swaps within deck
    public void shuffleDeck(){
        shuffleDeck(100);
    }

    // apply swapCnt random card swaps within deck
    public void shuffleDeck(int swapCnt){
        for(int i = 0; i < swapCnt; ++i){
            int r = (int)(Math.random()*deck.length);
            int r2 = (int)(Math.random()*deck.length);
            Card temp = deck[r];
            deck[r] = deck[r2];
            deck[r2] = temp;
        }
    }
}
