package deck;

public class Card {

  private String suit;
  private String rank;
  

  public Card(String suit, String rank){
    this.suit = suit;
    this.rank = rank;
  }

  public String toString(){
    return "The card is "+this.suit+" of "+this.rank+".";
  }

}
