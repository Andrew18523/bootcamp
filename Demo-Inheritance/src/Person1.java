//abstract 相對抽象 Person vs Student -> 會用相對抽象的CLASS 去做一D COMMEN FACTOR

// public abstract class -> cannot new this object
public abstract class Person1 { 
  private String name;
  private int age;

  public Person1 (String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
  public void setAge(int age){
    this.age = age;
  }

  public static void main(String[] args) {
    
    // A object cannot be created via abstract class
    //Person1 p = new Person1("ABC",13);

    // Student.class is public
    // Student.class constructor is public
    Student s =new Student( 1,"ABC", 13);
    s.getName(); // because Person1.getName is public, so it can be call by Student.class
  }
}
