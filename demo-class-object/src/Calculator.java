public class Calculator {
  
  private int x;
  private int y;
  // static method -> instance method?
  public static int sum1(int x, int y){
    return x+y;
  }

  public void getX (int x){
  this.x = x;
  }
  public void getY (int y){
   this.y = y;
  }
  public int sum(){
    return x+y;
  }
  public int multiply(){
    return x*y;
  }
  


  public static void main(String[] args) {
    
    sum1(1,2); // 3
    Calculator.sum1(2, 3); // 5

    Calculator c1 = new Calculator();
    c1.getX(2);
    c1.getY(3);
    System.out.println(c1.sum());// 2+3
    System.out.println(c1.multiply()); // 2*3
  }

}
