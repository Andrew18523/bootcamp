public class DemoInteger {
  public static void main(String[] args) {
    int x = 1;
    Integer x2 = 1;
    System.out.println(x);
    System.out.println(x2);
    x = x+3;
    x -=10;

    x2 = x2 +3;
    x2 -= 10;

    //Integer is a wrapper class
    //class has method
    short s = (short) x;
    x2 += 60000;
    short s2 = x2.shortValue(); // overflow, similiar explicit conversation
    System.out.println(s2);;

    double d1 = x2.doubleValue();
    System.out.println(d1);

    // Conmparison (> , < , >= , <= , == , != for primitive value only)
    // For Integer (wrapper class comparsion), compareTo()
    Integer x3 = 4;
    Integer x4 = 8;
    Integer x5 = 8;
    boolean result1 = x4 > x3; //true (compare int value)
    System.out.println(x3.compareTo(x4)); // -1
    System.out.println(x4.compareTo(x3)); // 1
    System.out.println(x4.compareTo(x5)); // 0
    boolean result2 =x3.compareTo(x4) <0; //compare integer value
    boolean result3 =x3.compareTo(x4) >0;
    boolean result4 =x4.compareTo(x5) == 0;

    // Byte, Short, Integer, Long, Double, Float
    Float f1 =10.0f; // 10.0f is a float value -> autobox -> Float Value
    Float f2 = new Float(10.0f); // create a float object. Storing a float value
    Long l2 = f2.longValue();  //10

    Character c1 = new Character('a');
    char c2 = Character.toUpperCase('b');
    System.out.println(c2); // 'b'
    System.out.println(Character.toLowerCase('M')); // 'b'

    Boolean b3 = new Boolean(false);
    Boolean b4 = new Boolean(true);
    Boolean b5 = new Boolean(true);

    System.out.println(b3.compareTo(b4)); // -1
    System.out.println(b5.compareTo(b4)); // 0

    System.out.println(b3 == b4); // false
    System.out.println(b5 == b4); // false ??!! So we need method to copare value in Wrapper Class we will cover this topic in Week 5

    // autobox and unbox
    Integer i7 = 9; //9 is an int value ->  autobox -> Integer object
    int i8 = i7; // i7 is Integer object ->unbox -> int value

    // above is done by Java automatically. Below is the way without java to do autobox and unbox manually
    Integer i9 = new Integer(9);
    int i10 = i9.intValue();

    Integer i11 = Integer.valueOf(9); // static method, the result is as same as "new Integer(9)"

    int i12 = Integer.parseInt("10");
    System.out.println(i12);

    int i13 = Integer.parseInt("10a");
    System.out.println(i13);

    System.out.println(new Byte("10"));
    //System.out.println(new Byte(16)); // Byte has 2 entry either string or byte
    System.out.println(new Byte((byte) 10));
    }
}
