public class DemoInternalCache {
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

    // Float, Double (No Interal Cache in JVM)
    Float f1 = 10.2345f; //autobox: float value -> Float Object
    Float f2 = 10.2345f; //autobox: float value -> Float Object

    System.out.println("f1==f2: "+String.valueOf(f1==f2));//false

    Double d1 = 128.2345d; //autobox: double value -> double Object
    Double d2 = 128.2345d; //autobox: double value -> double Object
    System.out.println("d1==d2: "+String.valueOf(d1==d2));//false

    Boolean b1 = true; //autobox: boolean value -> boolean Object
    Boolean b2 = true; //autobox: boolean value -> boolean Object
    System.out.println("b1==b2: "+String.valueOf(b1==b2)); //true

    //Character support Internal Cache (-128 to 127)
    Character c1 = 'c'; //autobox: character value -> character Object
    Character c2 = 'c'; //autobox: character value -> character Object
    System.out.println("c1==c2: "+String.valueOf(c1==c2)); //true

    Character c3 = '我'; //autobox: character value -> character Object
    Character c4 = '我'; //autobox: character value -> character Object
    System.out.println("c3==c4: "+String.valueOf(c3==c4));//false
  }
}
