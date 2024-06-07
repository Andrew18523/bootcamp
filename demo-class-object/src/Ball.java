public class Ball {
 
  private double weight;
  private String color;
  private int number;

  public Ball(){
    this.color= "RED";
  }

  public Ball (Double weight, String color){
    this.weight=weight;
    this.color=color;
  }

  public Ball (Double weight, String color, int number){
    //this.weight=weight;
    //this.color=color;
    this(weight,color); // call self constructor
    this.number = number;
  }

  public void setColcr(String color){
    this.color = color;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public String getColor(){
    return this.color;
  }
  
  public double getWeight(){
    return this.weight;
  }

  public String toString(){
    return "The color of Ball is "+this.color+". The weight of Ball is "+this.weight+".";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball();
    System.out.println(b1.getColor()); //RED;

    Ball b2 = new Ball(10.2,"BLACK");
    System.out.println(b2.getColor());
    System.out.println(b2.getWeight());

    // After replacing the thString() method.
    //Ball@4517d9a3 ->The color of Ball is BLACK. The weight of Ball is 10.2.
    System.out.println(b2.toString());

  }
}
