package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
  private double radius;

  public Circle (double radius){
    super(); // new Shape object
    this.radius = radius;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(radius)
      .multiply(BigDecimal.valueOf(radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .setScale(3,RoundingMode.HALF_UP)
      .doubleValue();
  }
}
