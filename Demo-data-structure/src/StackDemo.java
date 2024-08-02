import java.util.List;
import java.util.Stack;

public class StackDemo {
  
  public static void main(String[] args) {
    //Last-in, First-out
    Stack<String> ss = new Stack<>();
    ss.add("Hello");
    ss.push("world");
    ss.push("abc");
    System.out.println(ss.pop()); // abc, remove and return the last element
    System.out.println(ss.pop()); // world
    ss.push("bbb");
    System.out.println(ss); //[Hello, bbb]

    List<String> ss2 = new Stack<>();
    //ss.push();
    ss2.add("123");
    ss2.add("abc");
    ss2.remove("123");
    System.out.println(ss2);
  }
}
