package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Shape {
  
  // abstract class can create instance method without implementation
  // Method without implementation ->abstract method
  public abstract double area();


  public static double circleArea(double radius){
    return BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI)).setScale(3,RoundingMode.HALF_UP)
    .doubleValue();
  }
  // polymorphism
  public static double totalArea(Shape[] shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes){ // s is a object reference point to actual object (Circle/Square)
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    Shape[] shapes = new Shape[] {new Circle(3.0d), new Square(4.0d)};
    System.out.println(Shape.totalArea(shapes));//44.274

    // extra example
    StringBuilder sb = new StringBuilder("hello ");
    sb.append("world"); // In Java, you do not have to assign the return object to a reference
    //sb = sb.append("world"); // Why above can do this
    System.out.println(sb);

    // you should refer to Box.java for the answer
  }
}
