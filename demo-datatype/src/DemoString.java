public class DemoString {
  public static void main(String[] args){
    //Primitive "string". Double quote to declear the value of String
    
    String x ="Hello";
    String y =" Wrold";
    System.out.println(x);
    System.out.println(x+y);
    
    double price=9.99;
    String item = "Book";
    String description = "The "+item + "cost $" +price;
    System.out.println(description);
    
    char a= 'A';
    String message = "The answer is:"+a;
    System.out.println(message);
    a++;
    System.out.println(a);
    char b=65;
    System.out.println(b);

    // String Method (Tool)
    String t ="Hello";
    System.out.println("The lenght of " + t+" is "+t.length()); // -> t.lengt() = 5
    
    //check if t >=4, if yes, print hello, else goodbye
    if (t.length()>=4){
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }
    // Method 2: equals()
    String s1 = "Hello";
    String s2 = "Hello" ;
    if (s1.equals(s2)) { //要記呢個 .euqals().
      System.out.println("They are having same String value");
    } else {
      System.out.println("They are not with same value");
    }
    if (!s1.equals(s2)) { //"!" = "NOT"
      System.out.println("They are not with same value");
    } else {
      System.out.println("They are having same String value");
    }




    if (s1 == s2){
      System.out.println("They are having same String value");
    } else {
      System.out.println("They are not with same value");
    }

    // check if s1 length >6 or s1 equal s2, print ..
    if (s1.length()>=6 || s1.equals(s2)) { // (a||b) run a first then b
      System.out.println(".."); // result A
    } else {
      System.out.println("XX"); // result B
    }
    //method
    if (s1.length()>=6) {
      System.out.println(".."); // result C
    } else if (s1.equals(s2)) {
      System.out.println(".."); // result D
    } else {
      System.out.println("XX"); // result E
    }
    // 雖然RESULT 一椒，但是METHOD 1 得2個RESULT 但係METHOD 2 有3個RESULT
    // check if s1 length >6 or s1 equal s2, print ..
    if (s1.length()>=6 && s1.equals(s2)) { // (a||b) run a first then b
      System.out.println(".."); // result A
    } else {
      System.out.println("XX"); // result B
    }
    //method
    if (s1.length()>=6) {
      if (s1.equals(s2)){
        System.out.println("..");
      } else {
        System.out.println("XX");
      }
     }  else {
      System.out.println("XX"); // result E
    }

    //Method 3: chatAT(int index) for example ,charAt(0)
    String s3 = "world";
    // 0 means the first character
    System.out.println("the 1sy character of s3="+ s3.charAt(0));
    System.out.println("the 1sy character of s3="+ s3.charAt(4));
    //System.out.println("the 1sy character of s3="+ s3.charAt(5)); ->StringIndexOutOfBoundsException
    System.out.println("the 1sy character of s3="+ s3.charAt(s3.length()-1)); //always shows the last character

    // check the last character is d
    String x2 = "hello world";
    if (x2.charAt(x2.length()-1) == 'd' && x2.length()>=5){ //only String can use .equals() charAt ->world -> d which is char so can not use .equals()
      System.out.println("Correct");
    }
    // Method 4: substring(int beginIndex, int endIndex)
    String result = x2.substring(0,2);
    System.out.println(result); //he
    System.out.println(x2.substring(0,0)); //""
    System.out.println(x2.substring(0,1)); //"h"

    // check if the first three character is "wel". Print yes
    String x3= "welcome";
    // incorrect as string cannot use ==
    if (x3.substring(0,3)=="wel"){
      System.out.println("yes");
    } else{
      System.out.println("no");
    }
    
    // Correct method
    if (x3.substring(0,3).equals("wel")){
      System.out.println("yes1");
    } else {
    System.out.println("no1");
    }

    // Correct method 2
    if (x3.charAt(0)=='w'&& x3.charAt(1)== 'e'&& x3.charAt(2)== 'l'){
      System.out.println("yes2");
    } else {
      System.out.println("no2");
    }
    System.out.println();
    System.out.println("isEmpty()");
    // isEmpty()
    // Empty String -> ""
    String x7="";
    String x8=" ";
    String x9="abc";
    System.out.println(x7.isEmpty());// true
    System.out.println(x8.isEmpty());// false
    System.out.println(x9.isEmpty());// false
    System.out.println();
    System.out.println("isBlank()");
    // isBlank()
    // Blank String -> ""," "
    System.out.println(x7.isBlank());// true
    System.out.println(x8.isBlank());// true
    System.out.println(x9.isBlank());// false

    //substring(0,3)
    //substring(0)
    String s10 = "hello";
    System.out.println(s10.substring(0)); //from index 0 to end //hello
    System.out.println(s10.substring(0,3)); //from index 0 to 3 //hel

    //hello -> HELLO
    System.out.println(s10.toUpperCase());
    String s11 = "HeLLo";
    System.out.println(s11.toLowerCase());

    //replace(a,b)
    System.out.println(s10.replace('l','x')); //replace character 'l' to 'x'
    System.out.println(s10.replace("ll","xxx")); //replace sequence character "ll" to "xxx"

    //contain ()
    System.out.println(s10.contains("ell")); // s10 is contains sequence character "ell" ->true

    //startsWith()
    //endsWith()
    System.out.println(s10.startsWith("He"));
    System.out.println(s10.endsWith("o"));

    //trim() remove left and right space
    String s12 = "      Hello, bootcamp !!!!     ";
    System.out.println(s12.trim());

    String [] strings = new String [] {"hello","abcijk","vincent","HeLLo","    HeLLO     "};
    //how many string contains "ELL" but ingore case
    String check = "ELL";
    int count = 0;
    for (int i= 0 ; i<strings.length; i++){
      if (strings[i].toUpperCase().contains(check)){
        count++;
      }
    }
    System.out.println("Total "+count+" string contins 'ELL'");
  }
}
