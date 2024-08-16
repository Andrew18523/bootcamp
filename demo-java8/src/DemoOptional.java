import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    String s ="hello";
    s=null;
    generate(s); //OK

    //method user
    //generate(s).charAt(0); // error

    //Alternative
    //generate2() -> return Optional<String> -> the return value can be null or not null
    // the java will force to hadle null sceanrio during compile-time.
    Optional<String> result = generate2(s);
    char target = ' ';
    if (result.isPresent()){
      target = result.get().charAt(0);
    } else{
      target = ' ';
    }

    // Ways to create Optional Object
    System.out.println(Optional.of("hello"));//Optional[hello]
    //Runtime error: Optional.of(null); //not ok
    Optional<String> s2 = Optional.ofNullable(null); // ok
    s2 = Optional.ofNullable("abc"); //ok
    Optional<String> optString = Optional.empty(); //same as Optional.ofNullable(null)

    // ifPresent() -> Lambda Expression
    target = ' ';
    int x =0;
    generate2("abc").ifPresent(string -> {
      string.charAt(0);
      // Error: target = string.charAt(0); // NOT OK for write
      System.out.println(x); // OK for read
    });

    System.out.println("target=" + target);

    // Stream -> findFirst(), findAny()
    List<Customer> customers =  Arrays.asList(new Customer("John",13), new Customer("Jenny",30), new Customer("Peter" ,28));
    Optional<Customer> optCustomer = customers.stream()
      .filter(customer -> customer.getAge()>20)
      .findFirst();
      
      optCustomer.ifPresent(c-> System.out.println(c.toString()));//Customer(Name=Jenny, Age =30)

      customers.stream()
      .filter(customer -> customer.getAge()>20)
      .findFirst().ifPresent(c-> System.out.println(c.toString()));//Customer(Name=Jenny, Age =30)

      // should not findFirst and get directly
      // customers.stream()
      //  .filter(customer -> customer.getAge()>50)
      //  .findFirst() // Optonal.ofNullable(null)
      //  .get(); //java.util.NoSuchElementException:

      // Ways to take pout the element from optional object
      // 1. isPresent()
      // 2. ifPresent()
      // 3. orElse()
    Optional<Customer> optCustomer2 = Optional.of(new Customer("Mary",21));
    Customer customer = optCustomer2.orElse(new Customer("Susan",29)); // if null then all orElse
    System.out.println(customer);
      // 4. ofElseThrow()
    Customer customer2 = optCustomer2.orElseThrow(() -> new RuntimeException());
      // 5. ofElseGet()
      Customer customer3 = optCustomer2.orElseGet(() -> new Customer("dummy",-99));

      Optional<String> optCusotmer4 = null;
      //Error: optCusotmer4.orElse("hello"); // NPE


  }

  // method aurthor
  public static String generate (String s){
    if (s == null)
      return null;
    return s.replace ('a','b').toUpperCase();
  }

 //1. Optional<String> != String
  public static Optional<String> generate2 (String s){
    if (s == null)
      return Optional.ofNullable(null);
    return Optional.of(s.replace ('a','b').toUpperCase());
  }
}
