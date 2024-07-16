public class PrimitiveDemo {

  public static void main(String[] args) {
    int x = 10; // left hand side x -> variable, right hand side 10 -> int value
    // compiler check if 10 can be assiged to x

    long l = x; // long range is higher than int type (promotion/ upcast)
    //short s = x; // short range is lower than int type (downcast-> eplicit casting)
    short s1 = (short) x; // As a developer, you decided to adopt the risk of precision loss
    // compiler dose not concern the value assigned to x duing compile time
    // instead, it concern the "range" of type only

    int y =100;
    char c = (char) y; //downcasting
    char c1 = 100;

    //Default value
    long l2 ; // Declaration
    System.out.println(l2); // You cannot use a variable without intialization

    float f = 0.3f; // we need to use f after 0.3, because 0.3 is a double value by default
    byte b = 9; // java still allow int value to assgined to byte and short type
    double d2 = 0.9d; //double d2 = 0.9; is also ok
  }
}