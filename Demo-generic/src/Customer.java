public class Customer {
  private String name;
  private int age;

  public Customer (){

  }
  public Customer(String name, int age){
    this.name = name;
    this. age = age;
  }

  public int getAge (){
    return this.age;
  }


  @Override
  public String toString(){
    return "(Customer Name="
      + this.name
      + ", Age="
      + this.age
      + ")";
  }
}
