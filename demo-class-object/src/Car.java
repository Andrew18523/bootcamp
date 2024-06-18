public class Car {
  private static int count = 0;
  private int id;
  private String color;

  //constructor can access static variable
  public Car (String color){
    this.id = ++count;
    this.color = color;
  }

  public int getId (){
    return this.id;
  }

  public String getColor(){
    return this.color;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setColor (String color){
    this.color = color;
  }

  public String toString(){
    return "ID:"+this.id+". Color:"+this.color+".";
  }
  public static void main(String[] args) {
    Car c1= new Car("Red");
    Car c2= new Car("Red");
    Car c3= new Car("Red");
    
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
  }
}
