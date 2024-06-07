public class TestCat {
  public static void main(String[] args) {
    // Local Variable
    String name = "John";

    // Local Variable
    Cat c1 = new Cat(); // "new Cat()" -> produce Cat Object in memory
    // memory address -> 1203xaxaxxasgh (dummy)
    // c1 -> object reference -> able to find the cat object c1作為一個reference去得到個 CAT OBJECT 
    c1.setAge(10);
    System.out.println(c1.getAge());

    // Local Variable
    Cat c2 = new Cat();
    c2.setAge(7);
    System.out.println(c1.getAge());
    System.out.println(c2.getAge());

    Ball b = new Ball();
    // "Ball b" -> becasue Ball.class is "public class"
    // "new Ball()" => because the constructor is public"

    b.setColcr("RED");
  }
}
