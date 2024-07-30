import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

// HashSet Summary:
// 1. the order is determine by rule not insert sequence
// 2. HashSet cannot add duplicated value

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();

    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    System.out.println(strings); //[abc, def, hello], ording is not determined by the order of insertion

    ArrayList<String> strings2 = new ArrayList<>();

    strings2.add("hello");
    strings2.add("abc");
    strings2.add("def");
    System.out.println(strings2); //[hello, abc, def], ording is determined by the order of insertion

    boolean hsResult = strings.add("hello"); // not adding duplicated value
    boolean alResult = strings2.add("hello");// adding duplicated value

    System.out.println(hsResult); //false
    System.out.println(strings); //[abc, def, hello]
    System.out.println(alResult); //true
    System.out.println(strings2);//[hello, abc, def, hello]

    System.out.println(strings.size()); //3
    System.out.println(strings.remove("abc")); //true
    System.out.println(strings);//[def, hello]
    System.out.println(strings.contains("def"));//true

    // Question 1: Remove duplicated value
    String[] arr = new String [] {"abc","def","xyz", "def"};
    HashSet<String> result = new HashSet<>();
    //loop
    for (String s: arr){
      result.add(s);
    }
    System.out.println("result="+result);

    // Question 2: Find all duplicated values
    HashSet<String> result2= new HashSet<>();
    ArrayList<String> arrList = new ArrayList<>();
    for (String s: arr){
      if(!result2.add(s)){
        arrList.add(s);
      }
    }
    System.out.println("arrList="+arrList);

  }
}
