package Q1;

public class SmallPig extends Pig implements Runner, Vegerarian {
  
  public static void main(String[] args) {
    SmallPig smallPig = new SmallPig();
    System.out.println(smallPig.eat());
  }
  
}
