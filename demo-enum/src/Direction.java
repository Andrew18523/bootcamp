public enum Direction {
  EAST(1), SOUTH(2), WEST(-1), NORTH(-2);
  private final int index;

  private Direction (int index){
    this.index = index;
  }

  public int getIndex (){
    return this.index;
  }



  // advantage: able to present some relationship between among the enum objects

  public boolean isOpposite(Direction direction){
    if (this.getIndex()==Math.abs(direction.getIndex())){
      return true;
    } 
    return false;
  }

  public static void main(String[] args) {
    Direction d1 = Direction.EAST;
    System.out.println(d1.isOpposite(Direction.WEST)); //true
    System.out.println(d1.isOpposite(Direction.SOUTH)); //false
  }
}

