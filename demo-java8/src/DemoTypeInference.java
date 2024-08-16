import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {
  public static void main(String[] args) {
    //Declaration
    int x;
    // value assignment
    x = 3;

    var y = 3; // compile time -> "int y =3" class file (byte code)
    //y ="hello";
    // y = 3.0;

    var z = "hello";
    var k = new Customer("John");

    List<Customer> customers = Arrays.asList(new Customer("Benny"), new Customer("Aiden"));
    for (var c: customers){

    }

    // NOT support 

    //Error: var age; // compiler force the initialization together with declaration
    int age2;

  }

  // Not support var for attribute
  // public static class example{
  //   var x;
  // }

  // NOT SUPPORT
  // Polymorphism -> method signature is determined during compile time
  // public static int sum (var x, var y){
  //   return x+y;
  // }
  
  // public static var sum (int x, int y){
  //   return x+y;
  // }
}
