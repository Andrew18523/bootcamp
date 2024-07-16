public class WrapperClassDemo {
  
  public static void main(String[] args) {
    // the relationship between Object and Primitive
    int x =10;
    Integer x2 = x; //auto-box (int-> Integer)
    int x3 = x2; //un-box (Integer->int)

    Character c = 'c'; //char value -> Character Object (auto-box)
    // c -> object reference
    // 'c' -> auto=box-> New Character Object

    Boolean b = null;
    b= true; //auto-box (Primitive boolean -> Boolean object)
    b= false;
    b = Boolean.valueOf(true);
    //boolean b1 = null; // in Primitive, boolean cannot be null but Wrapper class Boolean can be null

    // Stack & Heap
    Integer i1 = 128;
    Integer i2 = 128;
    System.out.println(i1==i2); // false

    Integer i3 = 127;
    Integer i4 = 127;
    System.out.println(i3==i4); // true

    String s2 = "abc";
    String s3 = "abc";
    System.out.println(s2==s3);//true
    String s4 = new String("abc");
    System.out.println(s4==s3);//false
    String s5 = String.valueOf("abc");
    System.out.println(s5==s3);//true

  }
}
