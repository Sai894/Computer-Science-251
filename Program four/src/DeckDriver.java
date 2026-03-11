public class DeckDriver {
    public static void main(String[] args) {

        //should this be removed and what else should I change?
        Deck deck = new Deck();

        deck.shuffleDeck();

        for (int i = 0; i< 52; ++i)
        {
            System.out.println(deck.dealCard());
        }
    }
}
