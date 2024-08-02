package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // Approach 1:
  public static double area(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // Approach 2; Generics
  // "<T extends Shape>" is to describe the parent relationship
  public static <T extends Shape> double area2 (List<T> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // List<Object> vs List<T>? difference?

  public static double area3(List<? extends Shape> shapes){
    return -1.0;
  }

  public static void main(String[] args) {
    // Circle vs shape -> Parent
    // List<Shape> vs List<Circle> -> Not Parent
    List<Shape> shapes = new LinkedList<Shape>();
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));
    shapes.add(new Square(4));

    System.out.println(Shape.area(shapes)); //99.692
    System.out.println(Shape.area2(shapes)); //99.692
    
    // ArrayList<Square> object
    // ArrayList<Circle> object
    // During the compile time, "? extends Shape" can be any type of Shape/Circle/Square. 
    List<? extends Shape> shapes2 = new ArrayList<Circle>();
    //Error: shapes2.add(new Circle(3.0)); // Because we are not able to put Circle in to 
    //List<Square> but ok for List<Shape> and List<Circle> so compile error as shapes 2 maybe List<Square>



    // "super" which allow type can be any parent class of Shape. Object is a parent class of Shape
    List<? super Shape> shapes3 = new ArrayList<Object>();
    shapes3.add(new Circle(3.0)); // So new we can put a Circle Object in to a ArrayList<Object>
    shapes3.add(new Circle(4.2));
    //Error: shapes3.add(new Bird()); // not OK during compile because "<? super Shape>" can be Shape or any parent class of shape. 
    //Shape is not the parent class of Bird.  So we cannot put Bird into List<Shape>()

    //Error: List<Object> objects = new ArrayList<Circle>();
    Object object = new Circle(2.4);
  }

}
