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

  public static boolean isOpposite(Direction d1, Direction d2){
    return (d1.getIndex()==Math.abs(d2.getIndex()));
  }

  public Direction oppsite(){
    for (Direction direction: Direction.values()){
      if ((direction.getIndex())*-1 == this.index){
        return direction;
      }
    }
    return null;
  }

  public static Direction oppsite(Direction direction){
    for (Direction d: Direction.values()){
      if (direction.getIndex() == (d.getIndex())*-1){
        return d;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Direction d1 = Direction.EAST;
    System.out.println(d1.isOpposite(Direction.WEST)); //true
    System.out.println(d1.isOpposite(Direction.SOUTH)); //false
    System.out.println(d1.oppsite());//West

    //Static method
    System.out.println(Direction.oppsite(d1));//Wast
  }
}

