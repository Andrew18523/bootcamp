import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // Attributes
  private String firstName;
  private String lastName;
  private double weight;
  private double height;

  // Empty Constructor
  public Person(){
  }

  // All Argements Constructor
  public Person(String firstName, String lastName, double weight, double height){
    this.firstName = firstName;
    this.lastName = lastName;
    this.weight = weight;
    this.height =height;
  }

  // instance mtthod
  public String getFullName(){ // Attributes Presentation
    return this.firstName + " " + this.lastName;
  }

  public String toString(){
    return "Person(Name:" + this.firstName
              + " " + this.lastName
                + ". Weight is " +this.weight
                  + "KG. Height is " + this.height
                   + "M. BMI is "+ this.BMI() + ".";
  }


  // weight / (height * 2) -> BigDecimal
  public double BMI () {
    return BigDecimal.valueOf(this.weight).
      divide(BigDecimal.valueOf(Math.pow(this.height,2))
        ,RoundingMode.HALF_UP).doubleValue();
  }

  // Convert BMI() to static Method

  public static double BMI_Static (double weight, double height){
    return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(Math.pow(height,2)),RoundingMode.HALF_UP).doubleValue();
  }

  //setter
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastname(String lastName){
    this.lastName = lastName;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setHeight(double height){
    this.height = height;
  }

  //getter
  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }

  public static void main(String[] args) {
    
    //create a person (object, p1 is object reference)
    Person p1 = new Person(); // "new Person()" -> is a commend to create a new person object in Memory. p1 is the oject reference
    // set firsttName
    p1.setFirstName("Andrew");
    // set lastName
    p1.setLastname("Leung");
    // get fullName
    p1.setHeight(1.85);
    p1.setWeight(110);
    System.out.println("Full Name is "+p1.getFullName());
    System.out.println("BMI (Instance Method): "+p1.BMI()); // must have a person (object) then to call
    System.out.println("BMI (Static Method):" + Person.BMI_Static(110, 1.85)); // call static method - BMI_Static in class Person
    System.out.println(p1.toString());

    // Create a person object with given attributes values
    Person p2 = new Person("John", "Chan", 100, 1.7); 
    System.out.println(p2.getFirstName());
    System.out.println(p2.BMI());
    p2.setWeight(90);
    System.out.println(p2.BMI());
  }
}
