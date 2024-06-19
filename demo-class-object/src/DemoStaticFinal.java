public class DemoStaticFinal {

  // Constant // snakecase
  // logoString // camelcase
  private static final String LOGO_STRING; // static variables, finalized
  private static String name; //static variables
  
  private final double salary = 0.0d; // final instance variable
  // cameelcase
  private int age;

  // static block is triggered before main method. So it still a proper position to initialize "static final" variable
  static{
    LOGO_STRING = "default";
  }

  public int getAge(){
    return this.age;
  }

  public double getSalary(){
    return this.salary;
  }

  public static String name(){
    return name;
  }

  public static String getLogo(){
    return LOGO_STRING;
  }

  //instance method cna access both instance and static variable
  public String test(){
    return this.age +" " +name+" " +this.salary +" "+LOGO_STRING;
  }

  // final is a java keyword. compiler would check all final variables have been initialized.

  public static void main(String[] args) {
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age = 10;
    //dsf.salary = 100d; //compile error. salary is a final variable.
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf2.age = 20;
    System.out.println(dsf2.salary); //0.0
    System.out.println(DemoStaticFinal.LOGO_STRING); //default

    // you cannot assign "static fianl" variable in main() method, it is too late
  }
}
