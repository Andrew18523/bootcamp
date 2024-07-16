package clazz;

import java.util.Objects;

public class Superman extends Person implements Flyable, PowerUp {
  
  public Superman(){

  }

  public Superman(String name){
    super(name); // call parent class constructor
  }

  @Override
  public void fly(){

  }

  @Override
  public void powerUp(){

  }

  public static void main(String[] args) {
    // Inheritance only for instance method and attribute
    // Do not inherit constructor
    Superman sm = new Superman(); // No name attribute in superman
    System.out.println(sm.getName()); // null so you need a class constructor
    // to call parent class constrctor
    Superman sm1 = new Superman("John");
    System.out.println(sm1.getName()); //John
    Person p1 = new Superman("Andrew");
    // Error: p1.fly(); // we cannot call p1.fly() becaose p1 is declared by Person,
                        // which cannot call instance method from Person.class Only
    p1.eat();
    //Error: Superman s1 = p1; // Parent (Person.class) -> child (Superman.class) (downcast) which is compiler error
    // why? because p1 is not 100% from Superman.class as there maybe another class 
    // which extending Person.class as well
    Superman s1 = (Superman) p1;

    // From programming perspective, if you want to eimiate the risk, you can use instance of
    Superman sm2;
    if (p1 instanceof Superman)
    sm2 = (Superman) p1;
    Superman sm3 = new Superman("John");
    System.out.println(sm1.toString());
    System.out.println(sm1.equals(sm3));//true

    PowerUp superman1= new Superman ("Sally");
    superman1.powerUp();// you can only call method in PowerUp
    // What is the point to use interface as object reference?
    // Because superman1 only able to use the method in PowerUp interface only.
  }
  @Override
  public boolean equals (Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Superman))
      return false;
    Superman superman = (Superman) obj;
    return Objects.equals(super.getName(), superman.getName());
    //return Objects.equals(this.getName(), superman.getName()); //there are potential risk if getName() method is
    // @Override in Superman, it may not match with our need of equals()
  }
  @Override
  public int hashCode(){
    return Objects.hash(super.getName());
  }
  
  @Override
  public String toString(){
    return "Superman("
      +"person =" +super.toString()
      + ")";
  }
}
