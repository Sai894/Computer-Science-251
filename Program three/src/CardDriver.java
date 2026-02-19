public class CardDriver {
    public static void main(String[] args) {

      Card[] deck = new Card[52];
      int c = 0;

      for(int i = 0; i < 4; i++) {
          for (int j = 0; j < 13; j++) {
              Card nest =  new Card(i,j);
              deck[c] = nest;
              c++;
          }
      }

      for(int i = 0; i < 100; i++) {
          int r = (int)(Math.random()*deck.length);
          int r2 = (int)(Math.random()*deck.length);
          Card temp = deck[r];
          deck[r] = deck[r2];
          deck[r2] = temp;
      }

      for(int i = 0; i < deck.length; i++) {
          System.out.println(deck[i].toString());

      }

      Card Qof = new Card(0,11);
      int loc = 0;
      for(int l = 0; l < deck.length; l++) {
          if(Qof.equals(deck[l])) {
              loc = l;
              break;
          }
      }

      System.out.println("Queen of clubs is located at " + loc);
    }
}
