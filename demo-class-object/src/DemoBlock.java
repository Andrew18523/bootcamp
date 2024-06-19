public class DemoBlock {
  
  private static int number;
  private String name;
  private static int number2;

  // static block
  // 1. trigger once only, no matter the number of static variable(s).
  // 2. even no static variable, it will pass through.
  static{
    System.out.println("start static blcok.");
    number = 3;
    Cat cat = new Cat();
    System.out.println("end static block.");
  }

  public DemoBlock(){
    System.out.println("calling empty constructor ...");
  }

  public DemoBlock (String name){
    System.out.println("calling all args constructor");
    this.name=name;
  }

  // instance block
  // 1. it is trigger when there is a new object
  // 2. it is trigger before constructor
  // 3. usage: as a block for common logic between constructors 
  {
    System.out.println("start instance blcok.");
    this.name = "John";
    System.out.println("end instance blcok.");
    number = 10;
  }


  public static void main(String[] args) {
    System.out.println("Start.");
    System.out.println(DemoBlock.number);//3

    DemoBlock db = new DemoBlock();
    DemoBlock db2 = new DemoBlock("abc");
    DemoBlock db3 = new DemoBlock();
    System.out.println(DemoBlock.number);//10
    System.out.println("end.");
  }
}
