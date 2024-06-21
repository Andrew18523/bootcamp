package Quiz2;

public class Quiz2Q1 {
  private String password;

  public Quiz2Q1(String x){
    this.password = x;
  }

  public String getPassword(){
    return this.password;
  }

  public static void main(String[] args) {
    Quiz2Q1 p1 = new Quiz2Q1("ABC");
    Quiz2Q1 p2 = new Quiz2Q1("ABC");
    Quiz2Q1 p3 = new Quiz2Q1("BCD");
    String s1 = new String ("abc");

    System.out.print(p1==p2); // false // not same object
    System.out.print(p2==p3); // false // not same object
    System.out.print(p1.getPassword().equals(p2.getPassword())); // true as value are same "ABC" = "ABC"
    System.out.print("abc".equals(s1)); // true // As JAVA String behavior 

  }
}
