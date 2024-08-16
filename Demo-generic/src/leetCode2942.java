import java.util.ArrayList;
import java.util.List;

public class leetCode2942 {
  public static void main(String[] args) {
    List<Integer> ans = new ArrayList<>();
    String y = String.valueOf('o');
    String[] words = new String[] {"kidtwmw","ogh","trdedlh","wwbtlindg","naoylytpof","ujcbzwzkm","doamcoxdv"};
    for (int i = 0; i < words.length ; i++){
      if (ans.size() <=1){
          if (words[i].contains(y)){
              ans.add(i);
          }
      }
      else if (ans.size() ==2){
          if (words[i].contains(y)){
              ans.set(1,i);
          }
      }
    }
    System.out.println(ans);
  }
}
