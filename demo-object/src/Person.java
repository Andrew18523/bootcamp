import java.util.Objects;

public class Person {

  private String hkid;
  private String name;

  public Person (String hkid, String name){
    this.hkid = hkid;
    this.name = name;
  }

  @Override
  public int hashCode(){
  return Objects.hash(hkid);
  }

  public static void main(String[] args) {
    Person p1 = new Person ("123456","Peter Wong");
    Person p2 = new Person ("123456","Stephen Wong");
    Person p3 = new Person ("456789", "Peter Wong");
    System.out.println(p1.hashCode()); //1450575490
    System.out.println(p2.hashCode()); //1450575490
    System.out.println(p3.hashCode()); //1539325858
  }
}