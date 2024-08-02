import java.util.Queue;
import sorting.BallSortByColor;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("del"); // sorting, [def]
    pq.add("abc"); // sorting, [def,abc]->[abc,def]
    pq.add("bbb"); // sorting, [abc,def]->[abc,bbb,def]
    System.out.println(pq); //[abc, del, bbb]
    pq.add("aax");
    System.out.println(pq); //[aax, abc, bbb, del], so the add() method does not prefectly perform sorting

    //while
    while (!pq.isEmpty()){
      System.out.println(pq.poll());  //aax     abc      bbb      del
    }
    //You can see the sorting is not happen during add()
    //The sorting will be complete when you call poll()

    //PriorityQueue.class add() & poll() differs to LinkedList.class (implementation)
    List<String> pq2 = new LinkedList<>();
    pq2.add("del");
    pq2.add("abc"); 
    pq2.add("bbb"); 
    pq2.add("aax");
    System.out.println(pq2);
    Collections.sort(pq2);
    System.out.println(pq2);
    // 1. JAVA 8 ->Stram
    // 2. Convert to Array -> Arrays.sort()

    Queue<Long> pq3 = new PriorityQueue<>(new LongDecendingSorting());
    pq3.add(-23L);
    pq3.add(10000L); 
    pq3.add(10l); 
    pq3.add(-200l);
    System.out.println(pq3.poll());//10000
    pq3.add(-400l);
    System.out.println(pq3.poll());//-10
    System.out.println(pq3.poll());//-23
    System.out.println(pq3.poll());//-200
    System.out.println(pq3.poll());//-400
    System.out.println(pq3); //[]


    Queue<Customer> pq5 = new PriorityQueue<>(CustomerSortByAge.of());
    pq5.add(new Customer("John",1));
    pq5.add(new Customer("Peter",10));
    pq5.add(new Customer("Steven",27));
    System.out.println(pq5.poll());
    System.out.println(pq5.poll());
    System.out.println(pq5.poll());

  }
}
