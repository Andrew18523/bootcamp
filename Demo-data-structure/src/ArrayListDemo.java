import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
  public static void main(String[] args) throws Exception {
    Integer[] integers = new Integer[] {2,10,-4};
    //for-each
    int sum =0;
    for (Integer i : integers){
      sum+=i;
    }
    System.out.println(sum);//8

    // Remove 10
    integers[1]=null; 
    System.out.println(Arrays.toString(integers));// [2,null,-4]

    // 2. remove 10 and re-create array ->[2,-4]
    // .....

    // ArrayList
    ArrayList<Integer> integers2 = new ArrayList<Integer>(); // call constructor of ArrayList.class
    integers2.add(2);
    integers2.add(10);
    integers2.add(-4);
    sum=0;
    for (Integer i :integers2){
        sum+=i;
    }
    System.out.println(sum);//8

    // Difference between Integer[] and ArrayList<Integer>
    // 1. Initalization: 
    //   Array: Length of Array must be setup and cannot change the length.
    //   ArrayList: No need to setup the length and it can change it's length without open a new object.
    // 2. The underlying structure
    //   Array is a raw Data Structure in Java
    //   ArrayList is a class (array)
    
    System.out.println(integers2.size()); //3
    integers2.remove(1);
    System.out.println(integers2);//[2,-4]
    integers2.set(1,-100);
    System.out.println(integers2); //[2, -100]
    System.out.println(integers2.contains(2)); //true

    System.out.println(integers2.indexOf(-100)); // 1

    System.out.println(integers2.indexOf(-1000)); // -1

    integers2.add(2);
    System.out.println(integers2.indexOf(2)); //0
    System.out.println(integers2.lastIndexOf(2)); //2

    System.out.println(integers2.subList(1, 3)); //[-100, 2]

    System.out.println(integers2); //[2, -100, 2]

    // addAll()

    ArrayList<Integer> integers3 = new ArrayList<Integer>();
    integers3.add(100);
    integers3.addAll(integers2);
    System.out.println(integers3);//[100, 2, -100, 2]
   
    System.out.println(integers3.isEmpty()); //false

    ArrayList<String> strings = new ArrayList<>(); // you can skip the type (e.g."String") 
    // when you create the arrayList object (e.g. ArrayList<String>()) 
    // by default it follow the type specified at the left hand side
    
    strings.add("hello");
    strings.add("abc");
    strings.add("world");
    strings.remove(1); // remove by index
    strings.add("hello");
    strings.remove("hello"); //remove the first "hello" object
    System.out.println(strings); //[world, hello]

    // get by index get()
    System.out.println(strings.get(1));// "hello"

    //Question 1: Give String [], remove those string with length <=3
    String [] stringArray = new String[]{"anc","a","",null,"aaaa"};
    ArrayList<String> result = new ArrayList<>();
    for (String s: stringArray){
      if (s!=null && s.length()>3){
        result.add(s);
      }
    }
    System.out.println(result); //["aaaa"]

    // Question 2: Given Customer[], retrieve all person object with age >30 or name stratWith "J"
    Customer[] customer = new Customer [] {new Customer(40, "Mary"),
                                      new Customer(31,"John"),
                                        new Customer(29,"Benson")};
    ArrayList<Customer> customerList = new ArrayList<>();
    for (Customer c: customer){
      if (c.getAge() >30 || c.getName() != null && c.getName().startsWith("J")){
        customerList.add(c);
      }
    }
    System.out.println(customerList);

    ArrayList<Object> objects = new ArrayList<>();
    objects.add(new String ("abc"));
    objects.add(1);
    objects.add(LocalDate.of(2024,5,20));
    objects.add(new HKID("A1234567"));
    // print
    System.out.println(objects);

    //check if the object equal to xxxx....
    for (Object object: objects){
      if (object.equals(new String("abc"))){ //true, on run-time, when "abc".equals(new String("abc")) which use String object equals()
        System.out.println("hello");
      } else if (object.equals(new HKID("A1234567"))){ //use HKID object equals()
        System.out.println("hello2");
      } else if (object.equals(new Integer(1))){ // use Integer object equals()
        System.out.println("hello3");
      } else if (object.equals(LocalDate.of(2024,5,20))){ //use LocalDate object equals()
        System.out.println("hello4");
      } 
    }
    //Compare ArrayList<object> and ArrayList<String>

  }
}
