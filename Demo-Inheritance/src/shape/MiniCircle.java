package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MiniCircle extends Circle {
  
  private String color;
  public MiniCircle(double radius, String color){
    super(radius);
    this.color = color;
  }
  // @Override
  // public double area(){
  //    return BigDecimal.valueOf(super.getRadius()).divide(BigDecimal.valueOf(2),RoundingMode.HALF_UP).doubleValue();
  //   }


  public static void main(String[] args) {
    MiniCircle mc = new MiniCircle(3.0d,"RED");
    System.out.println(mc.getRadius());
    System.out.println(mc.area());
  }
}
