package marksix;

import java.util.Objects;

public class SmallBall  extends Ball{
  private String color;

  public SmallBall (String color,int number){
    super(number);
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }
  @Override
  public String toString(){
    return "Small Ball("+"Color="+this.color+","+ super.toString()+")";
  }
  @Override
  public boolean equals(Object obj){
    if (this==obj)
      return true;
    if (!(obj instanceof SmallBall))
      return false;
    SmallBall smallBall = (SmallBall) obj;
    return Objects.equals(this.color, smallBall.getColor()) &&
              Objects.equals(this.getNumber(), smallBall.getNumber()); // or Objects.equals(super.getNumber(), smallBall.getNumber())

  }

  public int hashCode(){
    return Objects.hash(this.color, super.getNumber());

  }
  public static void main(String[] args) {
    SmallBall sb1 = new SmallBall("Red", 1);
    SmallBall sb2 = new SmallBall("Red", 1);
    SmallBall sb3 = new SmallBall("Red", 2);
    System.out.println(sb1.equals(sb2)); // true
    System.out.println(sb1.equals(sb3));  //false
    System.out.println(sb1.hashCode()); //2543985
    System.out.println(sb1.toString()); //Small Ball(Color=Red,Ball (Number=1))
  }
  
}
