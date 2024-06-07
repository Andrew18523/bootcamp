public class Cat { // Class Name -> Name Convention should be able to describe physical object
  // state
  // attributes
  private String name;
  private int age;

  // behavior
  // instance method
  // setAge() is a method that can be called by object only
  // For Example, Car c1 = new Cat(); -> create a new object (new Cat()) and c1 is the object reference that reference to the new object (new Cat()) 
  // c1.setAge(13);
  // "this" -> the object pointed to C1 object reference

  // if No Constructor is defined
  // by default Java implicitly has a empty constructor
  public void setAge(int age){
    this.age =age;
  }
  // void is a return, requires return nothing.
  public void setName (String name){
    this.name = name;
  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }
  public String describe (){
    return "The name of the cat:" + this.name + ". Age:" +this.age+".";
  }
  public static void main(String[] args) {
    // the purpose of static method -> produce something by the input parameters
    // Sstatic method should not related with object
    // instance method is able to access (read & write) the object attributes
    Cat c1 = new Cat();
    c1.setAge(10);
    c1.setName("Peter");
    System.out.println(c1.describe()); //The name of the cat:Peter. Age:10.
  }
}
