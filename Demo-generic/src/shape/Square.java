package shape;

import java.math.BigDecimal;

public class Square extends Shape{
  private double length;

  public Square(double length){
    this.length = length;
  }
  public double area(){
    return BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(length)).doubleValue();
  }
}
