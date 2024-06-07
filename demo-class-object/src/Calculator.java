import java.math.BigDecimal;

public class Calculator {
  
  private int x;
  private int y;
  // static method -> instance method?
  public static int sum(int x, int y){
    System.out.println("int sum(int x, int y) is running");
    return x+y;
  }

  public static double sum(double x, double y){
    System.out.println("sum(double x, double y) is running");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static float sum(float x, float y){
    System.out.println("sum(float x, float y) is running");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).floatValue();
  }


  public void setX (int x){
  this.x = x;
  }
  public void setY (int y){
   this.y = y;
  }
  public int sum(){
    return this.x+this.y;
  }
  public int multiply(){
    return this.x*this.y;
  }
  
  public static void test(String[] args){
    for (int i = 0; i<args.length;i++){
      System.out.println(args[i]);
    }
  }

  public static void test2 (String... args){ //String... -> String[] (they are same type)
    // for-each
    for (String s:args){
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    
    System.out.println(sum(1,2)); // 3
    Calculator.sum(2, 3); // 5

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);
    System.out.println(c1.sum());// 2+3
    System.out.println(c1.multiply()); // 2*3

    //Method Overloading
    sum (1,2);
    //because you are passing int value so overloading determine
    // "sum(int x, int y)" should be call
    
    sum (1.0,2.0);
    //because you are passing double value so overloading determine
    // "sum(double x, double y)" should be call

    sum (1.0f, 2.0f);
    //because you are passing float value so overloading determine
    //float will upcast to find the method.
    // "sum(double x, double y)" should be call

    // String.valueOf() also a overloading. Below input is different but also work with overloading
    String.valueOf(10L);
    String.valueOf(new char [] {'a','b','c'});
    Calculator.test(new String[]{"abc","jkl"});
    Calculator.test2(new String[] {"abc","jkl"});
    Calculator.test2("abc","jkl");
  }

}
