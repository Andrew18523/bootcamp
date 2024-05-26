public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    System.out.println(str.charAt(15));
    System.out.println(str.charAt(1));
    System.out.println();
    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println(str.indexOf("t"));
    System.out.println(str.indexOf("x"));
    System.out.println(str.indexOf("L"));
    System.out.println();
    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());
    System.out.println();
    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace("Java", "Coding"));
    System.out.println();
    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length());
    System.out.println();
    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5, 8));
    System.out.println();
    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.toLowerCase());
    System.out.println();
    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str.replace('e', '*').toUpperCase());

  }
}