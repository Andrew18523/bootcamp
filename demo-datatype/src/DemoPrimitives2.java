public class DemoPrimitives2 {
  public static void main(String[] args) {
    long l1 = 10; // 10 -> int value
    long l2 = 10L; // 10L -> long value
    long l3 = 10l; // l is similiar to 1. Avoid to us 'l'

    // Java: int -> long
    long l4 = 64; //assign int value 63 to long variable l4 (int value -> long value as the tpye of int is lower than long)
    //int i1 = 64L; //you cannot assign a long value 63L to int variable i1 because long is a type higher than int
    
    // byte -> short -> int -> long -> float -> double
    // char -> int (ascii)
    double d1= 1.9;
    double d2 = 1.0d;
    double d3 = 10L;

    byte b1 = 10; //OK, why? 10 (int value) -> byte
    
    //you can only explicitly assign a value that with a type higher than the data type
    float f3 = (float) 1.9d; // downcast (overflow/ precision loss)
    int i2 = (int) 1.9d;

    System.out.println(i2);

    short s1 =129;
    byte b2 = (byte) s1; // Java not care about the value s1. s1 cannot assign to b2 because type of byte is lower than short
    System.out.println("b2="+b2);//-127 ->overflow

    byte b3 = 127;
    short s2 = b3; //no risk as short is higher than byte

    double d4 = 10.9;
    int i3 = (int) d4;
    System.out.println("i2="+i2); //10 precision loss
    
    char c1 = 'a'; //97 (ascii)
    char c2 = 'A'; //65 (ascii)
    if (c1 == c2) { //checking 97==65 ->false
      System.out.println("c1 = c2" + c2);
    }
    if (c1 > c2){ //checking 97 >65 ->true
      System.out.println("c1 > c2 :" + c2); //String + char = String
      System.out.println("c1 > c2 :" + (int) c2); // String + int =String
    }
    int c1Intvalue = c1; //ok, char -> int (upcast)

    int charvalue = 97;
    char c3 = (char) charvalue;
    System.out.println("c3="+c3);

    char c4 = '你';
    System.out.println((int)c4);
    char c5 = 'あ';
    System.out.println((int)c5);

    char character = 'a' +1;
    System.out.println(character);

    char zero ='0';
    int asciicode = zero;
    System.out.println(asciicode);

    // 228
    int sum =228;
    System.out.println((char)sum);

    short a = (byte) 128 ; //int->byte ->short
    System.out.println(a);

  }
}
