public class DemoSwitchExpression {
  
  public static enum Color{
    RED, BLACK, YELLOW;
  }
  public static void main(String[] args) {
    Color color = Color.RED;
    
    //Tranditional Switch -> void
    switch (color){
      case RED:
        System.out.println("RED");
        break;
      case BLACK:
        System.out.println("BLACK");
        break;
      case YELLOW:
        System.out.println("BLACK");
        break;
    }

    // Switch Expression -> return something
    // 1. return something
    // 2. check if all possible enum value is handle
    // 3. no break because it is for return value
    String result = 
    switch(color){
      case RED -> "RED"; // return
      case BLACK, YELLOW -> "BLACK & YELLOW";
    };

    System.out.println(result);

    // yield
    String result2 = 
    switch(color){
      case RED -> {
        int x =3;
        if (x==3){
        yield "RED";
        } else {
        yield "RED!!!!!";
        }
      }
        // return
      case BLACK, YELLOW -> "BLACK & YELLOW";
    };
  }
}
