package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Shape is class containing area() abstract method
// Circle is a class inherit Shape Class
public class Circle extends Shape {
// public final class Circle extends Shape {
// final class cannot be extended

  private double radius;

  public Circle (double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  // abstract class is not allowed in regular class

  // 1. the parent class has the same method.
  // 2. compile would check if the parent class really has the same method
  @Override
  public final double area(){ // "final method" cannot be overrided in child class
    //return this.radius * this.radius *Math.PI;
    return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(Math.PI)).setScale(3,RoundingMode.HALF_UP)
      .doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 =new Circle(3.0);
    System.out.println(c1.area());
  }
  
}
