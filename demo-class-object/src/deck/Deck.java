package deck;

public class Deck {
  // Player, Deck, Card
  private static String[] suits = new String [] {"DIAMOND", "CLUB","HEART","SPADE"};
  private static String[] ranks = new String [] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

  public static int length = suits.length * ranks.length;

  private Card[] cards;

  public Deck(){
    this.cards = new Card [Deck.length]; // Card [52] = [card 1,card 2, ... , card 52]
    int idx = 0;
    for (String suit : suits) {
      for (String rank: ranks) {
        this.cards[idx++] = new Card(suit,rank);
      }
    }
  }

  public Deck (Card[] cards){
    this.cards= cards;
  }
  public Card[] getCards(){
    return this.cards;
  }
  public void setCards(Card[] cards){
    this.cards = cards;
  }
  public void shuffle(int times) {
    ShuffleManager sm = new ShuffleManager(getCards());
    sm.shuffle(times);
    this.cards = sm.getCards();
  }

  
  public static void main(String[] args) {
    Deck deck = new Deck();
    //Card[] cards = deck.getCards();
    deck.shuffle(100);
    //ShuffleManager s1 = new ShuffleManager(deck.getCards()).shuffle(1);;
    
    for (Card card : deck.getCards()){
      System.out.println(card);
    }
  }
}