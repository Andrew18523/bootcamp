public class DemoCharSequence {
  
  public static void main(String[] args) {
    String s ="abc";
    System.out.println(s.length()); //3
    String s3 =s; //type-safe

    CharSequence cs = "abc";
    System.out.println(cs.length()); //3 (polymorphism)
    // compile-time: the scope of object
    System.out.println(cs.charAt(1)); //b
    //error: cs.replace(); CharSequence interface do not have
    // Some of methods in String object is hidden by "cs" reference.
    
    //compiler error: String s2 = cs; //Why? 
    System.out.println(s.getClass());
    System.out.println(cs.getClass());
    //Compiler concern the type of "cs" only
    // commile time cannot realize the actual ibject reference by "cs"

    //both Parent Class and Interface relationship can apply "downcasting"

    //during comile-time, we don't guarantee if the casting will be successful;
    String s2 ="";
    if (cs instanceof String){
      s2 = (String) cs;
    }
    System.out.println(s2); //"abc"
    System.out.println(s2.replace("b", "a")); //"aac"
    
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb.length());//5
    System.out.println(sb.charAt(1));//"e"
    System.out.println(sb.reverse());// "olleH"

    CharSequence cs3 = new StringBuilder("Hello");
    System.out.println(cs3.length());//5
    System.out.println(cs3.charAt(1)); //e
    //Compiler error: System.out.println(cs3.reverse()); // There is no reverse() method in CharSquence interface as cs3 is a object rreference of CharSquence

    // Compiler error: StringBuilder sb2 = cs; // type-safety
    //Runtime error: StringBuilder sb2 = (StringBuilder) cs; // run-tme error, cs refer to String object
    // while object reference b2 is StringBuilder


  }
}
