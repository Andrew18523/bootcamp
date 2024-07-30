public class Human extends Superhuman implements Walkable, Readable { //Interface 技能/合約

  // Class can only inherit instance methods, instance variables.
  // Constructor CANNOT be inherited.
  public Human(){
    super();
  }

  public Human (double height){
    super(height);
  }
  @Override
  public void walk(){
    System.out.println("Human is walking....");
  }

  @Override 
  public void read(){
    System.out.println("Human is reading.");
  }

  // @Override
  // public double getHeight(){
  //   return super.getHeight();
  // }

  public static void main(String[] args) {
    System.out.println(Walkable.AGE); // 3, public static final
    Human h1 = new Human(1.60d);
    h1.walk(); //Human is walking....
    h1.run(); //Defalut. I am running
    Superman s1 = new Superman();
    s1.run(); //Superman is running
    Walkable.swim(); //static I am swiming
  }
  
}
