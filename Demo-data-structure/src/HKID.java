import java.util.HashMap;
import java.util.Objects;

public class HKID {
  private String value;

  public HKID (String value){
    this.value=value;
  }

  public String getValue(){
    return this.value;
  }

  public String toString(){
    return "HKID="+this.value;
  }

  //if you @Override equals() and hashCode(),
  //you will define your way to distinguish the key is the same 
  @Override
  public int hashCode(){
    return Objects.hash(this.value);
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof HKID))
      return false;
    HKID hkid = (HKID) obj;
      return Objects.equals(this.value, hkid.getValue());
  }



  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567" , 34 "John"
    // "H2345678" , 18 , "Johnny"
    customerMap.put(new HKID("A123456"),new Customer(34, "John Wong")); //{HKID=A123456=(Customer Name=John. Age=34)}
    System.out.println(customerMap);
    customerMap.put(new HKID("H234567"),new Customer(18, "Johnny"));
    customerMap.put(new HKID("H234567"),new Customer(18, "Johnny Chan")); // if no @Override equals() and hashCode() in HKID.Class, 
    //it will use Object.class euqals() and hashCode. "new HKID("H234567")" in line 40 
    //is different object from "new HKID("H234567")" in line 41 because Object.class equals() is comparing the address.
    //SO we @Override equals() and hashCode() to make values in HKID become the key to distinguish is they are same key 
    System.out.println(customerMap); //{HKID=H234567=(Customer Name=Johnny Chan. Age=18), HKID=A123456=(Customer Name=John Wong. Age=34)}
    System.out.println(customerMap.get(new HKID("H234567"))); //(Customer Name=Johnny Chan. Age=18)

    // put()-> the author of HashMap created method euqals() and hashCode()
    // The object of creating equals() and hashCode() is to identify if they are same object
    // HashMap/class equal() is to identify if they are same key

    System.out.println(new HKID("1234").equals(new HKID("1234")));//true because you override equals() and hashCode()

    // put() program flow" hashmap.put(key, value) -> calls key.equals() and key.hashCode() 

    //How about HashMap<String, String>?
    // String.class and 8 Wrapper Class is already a final class which you cannot change the implementation
    //of equals() and hashCode(). The HashMap will use String.class or 8 Wrapper Class equals() and hashCode()
    // to define the key is the same
  }
}
