package sorting;

public enum Color {
  RED(1),BLACK(2),WHITE(3);

  private final int index;

  private Color (int index){
    this.index=index;
  }

  public int getIndex(){
    return this.index;
  }
}
