package parent;

public class Chlid extends Father {
  // implicitly empty constructor
  public Chlid(String name){
    super(name);
    //super("John")
  }

  public static void main(String[] args) {
    Chlid c = new Chlid("Abc");
    Father f1 = new Father();
    Father f2 = new Chlid("DEF");
    //Error: Chlid c2 = new Father();
    // not allowed, parent object cannot be assigned to child reference type

    int x = 1;// x is an int object reference type and 1 is int value
  }
}
