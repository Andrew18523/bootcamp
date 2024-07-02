package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle implements Shape {
  private double radius;

  public Circle (double radius){
    this.radius = radius;
  }
  
  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .setScale(3,RoundingMode.HALF_UP)
      .doubleValue();
  }
  public static void main(String[] args) {
    Circle c1 = new Circle(2);
    System.out.println(c1.area());
  }
}
