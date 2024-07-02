public interface Walkable {
  // Interface:
  // 1. No instance variable. *abstract class may have instance variable
  // 2. all methods are "public abstract" implicitly
  // 3. you can still declare public "public static final"
  // 4. A calass can implements more than 1 interface.
  // But it can only extend one Parent Class
 
  //Constant
  int AGE = 3;  // int AGE = 3 <- public static final int AGE = 3;
  
  //abstract void walk();
  void walk();

  // After Java 8, we have default method and static method in interface
  // default method can be override. 沒有 Default, Human.java 都要有run() method 才沒有error
  default void run(){
  System.out.println("Defalut. I am running");
  }

  static void swim(){
    System.out.println("static I am swiming");
  }
}
