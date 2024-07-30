package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
  public static void main(String[] args) {
    // Array vs ArrayList ->
    // 1. underlying structure of ArrayList is array
    // 2. array -> fixed length -> store in continous memory locations

    Cat cat = new Cat(Color.BLUE);
    // Heap
    // Step 1: Cat Object
    // Step 2: Eye Array Object
    // Step 3: Two Eye Objects
    // Step 4: 3 color Objects (created when you execute the main method)
    cat.getEyes(); //cat object -> get Eye array object
    cat.getLeftEye(); //cat object -> Eye array object ->get Eye object

    Eye[] eyes = cat.getEyes(); // backup the array object memory location
    Eye rightEye =eyes[1];

    // What is the relationship between the memory location of cat, eyes, rightEye?
    // 1. Eye[] (array). So Eye[0] and Eye[1] is in a continous memory location due to array characteristics
    // 2. Cat object vs Eye[] object
    // 3. Cat object vs eye object

    String[] strings = new String[5];

    // Because ArrayList's underlying is array which mean that using a continuos range of memory location to store the ArrayList
    // However, Linkedlist is using it object attribute to store it next item address. Which is different mechanism compare to ArrayList.

    LinkedList<String> string2= new LinkedList<>();
    string2.add("A");
    string2.add("B");
    string2.add("C");
    string2.add("D");
    string2.remove("B");
    string2.remove(0);
    System.out.println(string2.size()); //2
    System.out.println(string2.isEmpty());//false


    for (String s : string2){
      System.out.println(s);
    }



    List<String> string3= new ArrayList<>();
    string3.add("A");
    string3.add("B");
    string3.add("C");
    string3.add("D");
    string3.remove("B");
    string3.remove(0);

    for (String s : string3){
      System.out.println(s);
    }
    // So if we want to find 2nd and 3rd element of Linkedlist, we have to find 1st element then get 2nd then get 3rd
    // You can see there is a for loop in .Linkedlist.get() 
    // if (index < (size >> 1)) {
    //   Node<E> x = first;
    //   for (int i = 0; i < index; i++)
    //       x = x.next;
    //   return x;
    // }

    // LinkedList vs ArrayList
    // 1. underlying data structure
    // 2. Method Difference (i.e. LinkedList -> addFirst(),removeFirst())
    //We must use LinkedList as type for addFirst(),removeFirst()
    LinkedList<String> lL = new LinkedList<>();
    lL.add("Hello");
    lL.addFirst("abc");
    lL.add("def");
    lL.add("Hello");

    for (String s : lL){
      System.out.println(s);
    }

    System.out.println(lL.indexOf("Hello")); //1
    System.out.println(lL.contains("abc")); // true

    System.out.println(lL.lastIndexOf("Hello")); //3

    // Queue.class
    Queue<String> emails= new LinkedList<>();
    emails.add("john@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails.size()); // collection
    String head = emails.poll(); // return the first element in queue 
    // and remove the element from queue at the same time




    System.out.println(head); // john@gmail.com
    emails.add("Amy@gmail.com");
    emails.add("steven@gmail.com");
    String lookup = emails.peek();
    System.out.println(lookup); // peter@gmail.com

    // remove *remove()=poll() when remove has not parameter list
    emails.remove(new String("steven@gmail.com")); // using equal() in queue.class
    for (String s : emails){
      System.out.println(s);
    }
    List<String> string4 = new ArrayList<>();
    while (!emails.isEmpty() ) {
      string4.add(emails.poll());
    }
    System.out.println(emails.isEmpty());// true
    System.out.println(string4);

    string4.clear(); //Clear all the object inside the ArrayList
    string4.add("abc");
    string4=null; //remove the ArrayList Object
    // Error: string4.add("def"); // NPE null pointer exception


  }
}
