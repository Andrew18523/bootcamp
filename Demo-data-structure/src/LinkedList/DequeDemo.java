package LinkedList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {
  public static void main(String[] args) {
  System.out.println("Deque");
  Deque<String> strings = new LinkedList<>();
  strings.add("abc"); //same as addFirst()
  System.out.println(strings);
  strings.add("def");
  System.out.println(strings);
  strings.addFirst("hello");
  System.out.println(strings);
  strings.addLast("world");
  System.out.println(strings);
  System.out.println(strings.peek()); //hello
  System.out.println(strings.peekFirst()); // hello
  System.out.println(strings.peekLast()); // world
  strings.remove(); // same as remove removeFirst()
  System.out.println(strings);
  strings.removeFirst();
  System.out.println(strings);
  strings.removeLast();
  System.out.println(strings);

  // Deque interface extends Queue interface
  // so it supports add(), remove(), size() etc.

  System.out.println();
  System.out.println("ArrayDeque");

  // ArrayDeque.class
  Deque<String> strings2 = new ArrayDeque<>(); //underlying DS -> Array - Fixed Length
  strings2.add("abc");  // create a new array object and then put string object into the array
  System.out.println(strings2);
  strings2.add("def");
  System.out.println(strings2);
  strings2.addFirst("hello");
  System.out.println(strings2);
  strings2.addLast("world");
  System.out.println(strings2);
  System.out.println(strings2.peek()); //hello
  System.out.println(strings2.peekFirst()); // hello
  System.out.println(strings2.peekLast()); // world
  strings2.remove(); 
  System.out.println(strings2);
  strings2.removeFirst();
  System.out.println(strings2);
  strings2.removeLast();
  System.out.println(strings2);

  Queue<String> strings3 = new ArrayDeque<>(); // Coding Presentation -> present to others that you decided to be first in first out.
  strings3.add("apple");
  strings3.add("orange");
  strings3.remove();
  System.out.println(strings3);

  Collection<String> strings4 = new ArrayDeque<>();
  List<String> strings5 = new ArrayList<>();
  strings5.add("apple");
  strings5.add("orange");
  strings5.add(1,"lemon");
  System.out.println(strings5);

  // Insertion - Array List or Liked List faster?
  // 

  }
}
