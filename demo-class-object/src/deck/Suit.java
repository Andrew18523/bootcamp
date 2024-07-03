package deck;

public enum Suit {
  DIAMOND(1),
  CLUB(2),
  HEART(3),
  SPADE(4),
  ;

  private int rank;

  private Suit(int value){
    this.rank = value;
  }

  public int getRank(){
    return this.rank;
  }

  public boolean isHigherThen (Suit suit){
    return this.rank > suit.getRank();
  }

  public static void main(String[] args) {
    Suit currentSuit = Suit.CLUB;
    Suit targetSuit = Suit.DIAMOND;
    // if (currentSuit.getRank() > targetSuit.getRank()){

    // }

    if (currentSuit.isHigherThen(targetSuit)){
      
    }
  }
}
