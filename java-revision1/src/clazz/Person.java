package clazz;

public class Person {
  private String name; // if you use public here, it implies the source value 
                      //can be read and replced by others
  

  public static final double PI = Math.PI;

  //By default a class implicitly contain empty constructor

  public Person(){

  }

  public String getName(){
    return name;
  }

  public Person (String name){
    this.name = name;
  }

  public void eat(){

  }
  @Override
  public String toString(){
    return "Person(" +
      "Name=" +this.name+
      ")";
  }
}
