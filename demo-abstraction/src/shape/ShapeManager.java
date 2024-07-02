package shape;

public class ShapeManager {
  private Shape shape; // attribute can be an interface
  
  // Design:
  // You should put an object which implemented the contract (interface)
  // so that the parameter object Must contain area() method.
  public ShapeManager(Shape shape){
    this.shape = shape;
  }

  public void setShape (Shape shape){
    this.shape = shape;
  }

  //During compile time, Java guarantee object is able to call area() method.
  public boolean isTooBig(){
    return this.shape.area()>20.0;
  }

  public static void main(String[] args) {
    // Shape circle = new Circle(3.0);
    // ShapeManager shapeManager = new ShapeManager(circle);
    ShapeManager shapeManager = new ShapeManager(new Circle(3.0));
    System.out.println(shapeManager.isTooBig()); // true
    ShapeManager shapeManager2 = new ShapeManager(new Square(4.0));
    System.out.println(shapeManager2.isTooBig());// false

  }
}
