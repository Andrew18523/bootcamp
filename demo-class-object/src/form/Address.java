package form;

public class Address {
  private String line1;
  private String line2;
  private String line3;
  // all argements constructor, getter
  
  public Address (String line1,String line2, String line3){
    this.line1=line1;
    this.line2=line2;
    this.line3=line3;
  }

  public String getLine1(){
    return this.line1;
  }

  public String getLine2(){
    return this.line2;
  }
  public String getLine3(){
    return this.line3;
  }

  public void setLine1(String line1){
    this.line1=line1;
  }

  public void setLine2(String line2){
    this.line2=line2;
  }

  public void setLine3(String line3){
    this.line3=line3;
  }

  public String toString (){
    return line1+", "+line2+", "+line3;
  }

  public static void main(String[] args) {
    Address address = new Address("Room 1", "MM House", "ABC ESTATE");
    Form f1 = new Form("Andrew","Leung",address); //Name: Andrew Leung. Address: Room 1, MM House, ABC ESTATE.
    System.out.println(f1); // println() -> call toString()

    System.out.println(f1.getAddress().getLine2());

    Form f2 = new Form("John","Chan",address);
    System.out.println(f2.getAddress().getLine2());
    f1.getAddress().setLine2("xyz");
    System.out.println(f1.getAddress().getLine2()); // xyz // same address object is pointed for f1 and f2. if we change the object with a object
    // reference in address object. It will change with both f1 and f2. 
    System.out.println(f2.getAddress().getLine2()); // xyz
    f1.getAddress().setLine2("MM House");

    Form f3 = new Form ("Alan","Chan",new Address("Room 1", "MM House", "ABC ESTATE"));
    f3.getAddress().setLine2("ijk");
    System.out.println(f3.getAddress().getLine2());
    System.out.println(f1.getAddress().getLine2());
  }
}
