package deck;

public class Card {

  private Suit suit;
  private Rank rank;
  

  public Card(Suit suit, Rank rank){
    this.suit = suit;
    this.rank = rank;
    }

    public Suit getSuit(){
      return this.suit;
    }

    public Rank getRank(){
      return this.rank;
    }
    // Coding Style:Early Return
    public boolean isHigherThen (Card card){
      if (this.rank.isHigherThen(card.getRank()))
        return true;
      if (this.suit.isHigherThen(card.getSuit())&& this.rank==card.getRank())
        return true;
      return false;
    }

  @Override
  public String toString(){
    return "The card is "+this.suit+" of "+this.rank+".";
  }

  public static void main(String[] args) {
    System.out.println(new Card(Suit.CLUB, Rank.FIVE).isHigherThen(new Card(Suit.DIAMOND, Rank.JACK))); // false
    System.out.println(new Card(Suit.DIAMOND, Rank.JACK).isHigherThen(new Card(Suit.CLUB, Rank.FIVE))); // true
    System.out.println(new Card(Suit.DIAMOND, Rank.JACK).isHigherThen(new Card(Suit.CLUB, Rank.JACK))); // false

  }

}
