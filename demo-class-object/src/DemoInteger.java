public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value ->autobox -> Integer object (heap memory)

    //Internal Cache (for Number)
    i1 = 127; // i1 is a object reference. 127 is a newly created Integer object
    i2 = 127; // i1 is a object reference. 127 is a resue the original Integer object
    // range in -128 to 127 will re-use original object as they are common to use in real world
    System.out.println(i1==i2);// true (are they same object?)

    Integer i3 = 128; // -> create a new Object
    Integer i4 = 128; // -> create another new object
    System.out.println(i3==i4);// false (they are not the same object)

    //Important!!!!
    // For class, you should always compare their object value by Method!!!!
    System.out.println(i3.compareTo(i4)); // 0 -> value of i3 = value of i4
  }
}
