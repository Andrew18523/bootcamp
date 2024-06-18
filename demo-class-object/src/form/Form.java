package form;
public class Form {
  private String firstName;
  private String lastName;
  private Address address;
  // private String Addressline1;
  // private String Addressline2;
  // private String Addressline3;
  public Form (){

  }
  public Form(String firstName, String lastName, Address address){
    this.firstName=firstName;
    this.lastName=lastName;
    this.address=address;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public Address getAddress(){
    return this.address;
  }

  public void setFirstName(String firstName){
    this.firstName=firstName;
  }
  public void setSecondName(String lastName){
    this.lastName=lastName;
  }
  public void setAddress(Address address){
    this.address=address;
  }

  public String toString(){
    return "Name: " +this.firstName+
      " "+ this.lastName+
      ". Address: "+
      this.address+".";
    }




}
