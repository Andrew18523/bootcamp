package sorting;

import java.util.Comparator;

public class BallSortByColor implements Comparator<Ball> {
  
  //RED -> BLACK ->WhITE
  @Override
  public int compare(Ball b1, Ball b2){
    if (b1.getColor().getIndex() == b2.getColor().getIndex()){
      return -1;
    } 
    if  (b1.getColor().getIndex() < b2.getColor().getIndex()){
      return -1;
    }
    return 1;
  }
}
