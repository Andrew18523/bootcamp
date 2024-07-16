public class MethodDemo {
  
  private String firstName;

  public MethodDemo(){

  }

  public MethodDemo(String firstName){
    this.firstName = firstName;
  }

  public static void main(String[] args) {
    int x = sum(1,2);

    Integer x2 = sum(1,2); //sum() return a int then auto-box to Wrapper Class Integer
    long l = sum(1,2); //sum() return a int then upcast to long  value
    //Error: Long l2 = sum(1,2); // compiler cannot do upcast and auto-box at the same statement
    Long l2 = l; // You should do it by 2 statement

    //Call static method
    MethodDemo.sum(2,3); // return 5 By calling Class.Method()

    //Call instance method
    MethodDemo md = new MethodDemo();
    md.sum2(2, 3); // return 5 By Object.Method()
    //However, there is no point to make sum() become a instance method sum2()
    //Because static method always use for own attribute of the object.
    MethodDemo md2 = new MethodDemo("John");
    System.out.println(md2.fullName("Wong"));
  }

  public static int sum (int x , int y){
    return x+y;
  }

  public int sum2 (int x , int y){
    return x+y;
  }

  public String fullName (String lastName){
    return this.firstName + " " +lastName;
  }

}
