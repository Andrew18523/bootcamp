package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import shape.Bird;

//Objective learn existing interface
public class Ball implements Comparable<Ball> {
  private int number;
  private Color color;

  public Ball (int number, Color color){
    this.number = number;
    this.color = color;
  }

  public int getNumber(){
    return this.number;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public int compareTo(Ball ball){
    //Objective: provide your formula to sort the List<Ball>
    // Return value: 1 or -1
    
    //Example 1: sort by number (decending)
    // You have 2 ball object reference here: ball and this
    // -1 means "Move to left"/"Smaller index" (from left to right)
    // if (ball !=null && this.number >ball.getNumber()){
    //   return 1;
    // }
    // return -1;
    // Sort by color first then number
    if (ball !=null &&this.color.getIndex() == ball.getColor().getIndex()){
        if (ball !=null && this.number >ball.getNumber()){
          return 1;
        }
    return -1;
    }
    if (ball !=null && this.color.getIndex() > ball.getColor().getIndex()){
      return -1;
    }
    return 1;
  }



  public String toString(){
    return "(Number=" +this.number+", Color=" +this.color+")";
  }
  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(10, Color.BLACK));
    balls.add(new Ball(9, Color.WHITE));
    balls.add(new Ball(11, Color.RED));
    balls.add(new Ball(23, Color.BLACK));
    balls.add(new Ball(3, Color.RED));
    System.out.println(balls); 
    //(Number=10, Color=BLACK), (Number=9, Color=WHITE), (Number=11, Color=RED), (Number=23, Color=BLACK), (Number=3, Color=RED)

    // Sort
    // Collections.sort() ->call Loop List<Ball> -> ball.compareTo()
    // During compile time, JAVA

    // Approach 1
    Collections.sort(balls); // O(nlog n)
    System.out.println(balls); 
    //[(Number=9, Color=WHITE), (Number=10, Color=BLACK), (Number=23, Color=BLACK), (Number=3, Color=RED), (Number=11, Color=RED)]
    
    List<Bird> birds = new ArrayList<>();
    //Erro: Collections.sort(birds);// Bird do not implement Comparable

    int x =3;
    Comparator<Ball> formula = null;
    if (x>=3){
      formula = new BallSortByColor();
    } else {


    }

    // Approach 2 (Advantage: using class)
    balls.add(new Ball(14, Color.RED));
    balls.add(new Ball(29, Color.BLACK));
    Collections.sort(balls, formula);
    System.out.println(balls);
    //[(Number=14, Color=RED), (Number=11, Color=RED), (Number=3, Color=RED), (Number=29, Color=BLACK),
    // (Number=23, Color=BLACK), (Number=10, Color=BLACK), (Number=9, Color=WHITE)]
  }

}
