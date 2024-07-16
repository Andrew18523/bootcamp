import java.math.BigDecimal;

public class StringDemo {
   public static void main(String[] args) {
    // String is immutable so s.concat will not affect s
    String s = "hello";
    s.concat("world"); // concat() method return a new String Object, no impact to s
    System.out.println(s);//hello 
    String s2= s.concat("world");
    System.out.println(s2);

    //However StringBuilder is mutable. So sb.append will change the value of sb from "hello" to "hello world"
    //In StringBuilder, only 1 object will be used, the speed is faster as String Class need to create a new object reference to point to 
    //a new object with manipulated value and/or kill the original object to manipulate the original object value
    StringBuilder sb = new StringBuilder("hello");
    sb.append(" world");  // You don't have to save the address of sv, because you already changed the value of stored sb
    System.out.println(sb);// hello world
    sb.append("!!!");
    System.out.println(sb); //hello world!!!

    // As a developer, you have to figure out te impact of each instance method of each class

    //BigDecimal
    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 = BigDecimal.valueOf(3.4);
    bd.add(bd2); // you have to worry about the impact on bd. Is bd = 6.7?
    System.out.println(bd); //3,3

    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0));
    System.out.println(bd3.doubleValue());// 6.6
   }
}
