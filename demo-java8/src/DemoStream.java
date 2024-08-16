import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("John");
    strings.add("Johnny");
    strings.add("Sam");

    // lambda for-each
    strings.forEach(s -> System.out.println(s));

    for (int i = 0; i<strings.size(); i++){
      strings.set(i,strings.get(i).toLowerCase());
    }
    strings.forEach(s -> System.out.println(s));

    List<String> capNames = strings.stream() //List<String> -> Stream<String>
      .map(s->s.toUpperCase()) //Stream<String>
      .collect(Collectors.toList());
    System.out.println(strings);
    System.out.println(capNames);

    capNames.add("SAM");
    System.out.println(capNames);

    Set<String> capNames2 =capNames.stream()
      .map(s ->{
        String newStr = s.toLowerCase() +s.toUpperCase();
        return newStr +"!!!";
      }).collect(Collectors.toSet());

    System.out.println(capNames2); //[johnJOHN!!!, johnnyJOHNNY!!!, samSAM!!!]

    List<Customer> customers = new LinkedList<>();
    customers.add (new Customer("John" , 11));
    customers.add (new Customer("Peter" , 25));
    customers.add (new Customer("May" , 60));

    List<Customer> customersAfterFilter = customers.stream()
      .filter(customer-> customer.getAge() >=25).collect(Collectors.toList());

      System.out.println(customersAfterFilter); 
      //[Customer(Name=Peter, Age =25), Customer(Name=May, Age =60)]

      //filter name length >=4
      // return List <String>
      List<String> customersNameAfterFilter = customers.stream() //Stream<Customer>
        .filter( c -> c.getName().length() >=4) //Stream<Customer>
        .map(c-> c.getName())  //Stream<String>
        .collect(Collectors.toList()); // List<String>

      System.out.println(customersNameAfterFilter); //[John, Peter]

      // Simple For-each alternative
      List<String> customerNameForLoop = new LinkedList<>();
      for (Customer c  : customers){
        if (c.getName().length()>=4){
          customerNameForLoop.add(c.getName());
        }
      }
      System.out.println(customerNameForLoop); //[John, Peter]

      //filter() map()
      customers.stream() //Stream<Customer>
        .map(c-> c.getName()) //Stream<String>
        .filter( str -> str.length() >=4) //Stream<String>
        .collect(Collectors.toList()); //Stream<String> -> List<String>

        customers.stream() //Stream<Customer>
        .filter( c -> c.getName().length() >=4) //Stream<Customer>
        .map(c-> c.getName()) //Stream<String>
        .forEach(name->System.out.println(name));
        // John
        // Peter

        customers.stream()
          .filter(c->c.getAge() <40)
          .count(); // long 2L

        customers.add(new Customer("Peter",38));

        // disitint -> remove duplicated (by equals() and hashCode())
        List<Customer> customerAfterDistinct = 
          customers.stream().distinct().collect(Collectors.toList()); //4

        System.out.println(customerAfterDistinct);

        //Sorting
        Comparator<Customer> sortByAge = (c1,c2)-> c1.getAge() < c2.getAge() ? 1 : -1;
        List<String> customerNameAfterSort = customers.stream()
          .filter(c -> c.getAge() <40)
          //.sorted((c1,c2)-> c1.getAge() < c2.getAge() ? 1 : -1) // sort by age decending order
          .sorted(sortByAge)
          .map(c -> c.getName())
          .collect(Collectors.toList());

    // int compare(T o1, T o2);
      System.out.println(customerNameAfterSort);

      // Terminal Operation (collect(), count(), etc.) -> return non-Stream
      // Intermediate Operation (filter(), map(), sorted(), distinct() -> return Stream
      Stream<Customer> customerList = customers.stream() // Stream<Customer>
        .filter(c -> !"John".equals(c.getName())); //Stream<Customer>
        // c.getNmae().equals("john") -> null pointer

      System.out.println(customerList.count()); //3
      //Error: System.out.println(customerList.collect(Collectors.toList())); 
      //stream has already been operated upon or closed 
      // You cannot preform 2 terminal operator on a stream object

      // Map -> key: name, value: name length
      List<String> animals = Arrays.asList("Lion","Tigers", "Bears");
      //From List to Stream to Map
      Map<String,Integer> animalMap = animals.stream()
        .collect(Collectors.toMap(s->s, s-> s.length()));

      System.out.println(animalMap);

      //groupBy
      List<Staff> staffs = Arrays.asList(new Staff("HR","John")
        ,new Staff("IT","Peter")
        ,new Staff("MARKET","Sally")
        ,new Staff("IT","Jonh"));

      Map<String, List<Staff>> staffMap = staffs.stream()
        .collect(Collectors.groupingBy(staff -> staff.getDepartment()));

      System.out.println(staffMap);
      System.out.println(staffMap.get("IT"));

      //from List<Staff> to Map <String , List<Staff>
      // contains => get -> List.add() ->put
      //
      //for (){
      //}

      List<Staff> staffList = Arrays.asList(new Staff("HR","John",30000)
        ,new Staff("IT","Peter",20000)
        ,new Staff("MARKET","Sally",40000)
        ,new Staff("IT","Jonh",25000));

        // HR 30000
        // MARKET 40000
        // IT 45000

      Map<String, Integer> deptMap =  staffList.stream()
        .collect(Collectors.groupingBy(s-> s.getDepartment()
        ,Collectors.summingInt(s -> s.getSalary())));

      System.out.println(deptMap.get("HR")); // 30000
      System.out.println(deptMap.get("MARKET")); // 40000
      System.out.println(deptMap.get("IT")); //45000

      //Construct Stream object by initial values
      Stream<Integer> integers = Stream.of(4,1,2,3);
      Stream<Staff> staffEmptyStream = Stream.empty();

      // Stream
      // filter, Distinct -> reduce elements
      // map -> revise object definition (No change on element cout)
      // count, grouping by -> summarize operation 

      //Specific Case:
      List<Integer> integers3 = Stream.of(2,3,4).map(i -> {
        System.out.println(i);
        return i+1;
      }).collect(Collectors.toList());

      System.out.println(integers3);

      // map () -> interminate operation -> it won't execute until terminal operation
      Stream<Integer> integers4 = Stream.of(2,3,4).map(i -> {
        System.out.println(i);
        return i+1;
      }); // Sysout did not work because the stream object did not perform terminal operation

      //count is a terminal operation but it run System.out.println(i). Because all terminal operation 
      //will check if they will make inpact on the result. i.e. map did not affect the result of count. But map will affect collect
      System.out.println(integers4.count()); //3

  }
}
