import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoMapLambda {
  public static void main(String[] args) {
    //Map ->keyvalues
    Map<String, Customer> customerMap= new HashMap<>();
    customerMap.put("C123", new Customer("Sam"));
    customerMap.put("C125", new Customer("Peter"));
    if (customerMap.containsKey("C123"))
      System.out.println(customerMap.get("C123").getName()); //Sam

    Function<String, Customer> defaultCustomer = s ->new Customer("Dummy");
    customerMap.computeIfAbsent("C126", defaultCustomer);
    customerMap.computeIfAbsent("C125", defaultCustomer); // do not add as Key "C125" is present

    for (Map.Entry<String, Customer> entry : customerMap.entrySet()){
      System.out.println(entry.toString());
    }

    //2. merge -> BiFunction
    Map<String, Integer> map = new HashMap<>();
    map.put("Apple",1);
    map.put("Orange",3);
    map.put("Lemon",8);
    map.put("Pear",2);

    // all entry +2
    map.put("Apple",map.get("Apple")+2);
    map.put("Orange",map.get("Orange")+2);
    map.put("Lemon",map.get("Lemon")+2);
    map.put("Pear",map.get("Pear")+2);
    for (Map.Entry<String, Integer> entry : map.entrySet()){
      System.out.println("Key="+entry.getKey()+",value="+entry.getValue());
    }
    BiFunction<Integer,Integer,Integer> addValue = (oldValue,newValue) -> oldValue+newValue;
    map.merge("Orange", 3, addValue);
    map.merge("Peach", 4, addValue);

    System.out.println(map.get("Orange"));
    System.out.println(map.get("Peach"));

    // UnaryOperator
    // UnaryOperator <String> Function <String, String>
    UnaryOperator<String> nameFormula = s ->s+"!!!";
    System.out.println(nameFormula.apply("abc"));// "abc!!!"

    BinaryOperator <String> nameFormula2 = (s1,s2) -> s1+" "+s2;
    System.out.println(nameFormula2.apply("Peter","Wong"));
  }
}
