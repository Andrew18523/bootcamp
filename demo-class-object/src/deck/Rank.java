package deck;

public enum Rank {
  ACE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NIGHT(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13),
  ;

  private int value;

  private Rank (int value){
    this.value = value;
  }

  public int getvalue(){
    return this.value;
  }

  public boolean isHigherThen (Rank rank){
    return this.value > rank.getvalue();
  }
}
