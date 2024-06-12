public class DemoLiteralPool {
  public static void main(String[] args) {
    // Literal Pool (String)
    String str1 = "hello";
    String str2 = "hello"; // str1 and str2 is the object reference to point to a same object by Java
    // if using str2 = new String("hello"), str2 will be a object reference to point to another object

    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1==s2);//true
    System.out.println(System.identityHashCode(s1)); //617901222
    System.out.println(System.identityHashCode(s2)); //617901222

    String s3 = "hello";
    String s4 = new String("hello");
    System.out.println(s3==s4);//false
    System.out.println(s3==s1 && s3==s2);//true

    s3=s4;
    System.out.println(s3==s4);//true

    //concat string will be consider as new String
    String s5="he";
    String s6="llo";
    s5 +=s6; //hello (new String)
    System.out.println("S1=" + s1); //hello
    System.out.println("S5=" + s5); //hello
    System.out.println(s5==s1); //false

    // Immutable 
    String s7 = "hello";
    System.out.println(System.identityHashCode(s7)); //617901222
    s7 += " world"; // in heap, it cannot change "hello" to "hello world"
    System.out.println(System.identityHashCode(s7)); //2061475679 (new string object)

    String s8 = "hello";
    System.out.println(System.identityHashCode(s8));//617901222
    s8=s8.replace("e", "a");// new
    System.out.println(System.identityHashCode(s8));//140435067

    String s9 = "hello";
    System.out.println(System.identityHashCode(s9));//617901222
    s9=s9.toUpperCase();
    System.out.println(System.identityHashCode(s9));//1450495309


  }
}
