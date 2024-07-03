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
      if (this.suit.isHigherThen(card.getSuit()))
        return true;
      return false;
    }

  @Override
  public String toString(){
    return "The card is "+this.suit+" of "+this.rank+".";
  }

}
