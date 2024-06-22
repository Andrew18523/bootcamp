

import java.math.BigDecimal;

public class Box3 {
  private String x;

  public Box3(){
    this.x = "";
  }

  public Box3 append (String y){
    this.x +=y;
    return this;
  }

  public String toString(){
    return this.x;
  }

  public static void main(String[] args) {
    StringBuilder sb =new StringBuilder();
    sb.append("hello");
    System.out.println(sb);

    Box3 box = new Box3();
    box.append("hello");
    System.out.println(box);
    
    BigDecimal bd = new BigDecimal(0.0d);
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.0d)); //add()->create new BigDecimal
    System.out.println(bd.doubleValue());  // 1.0? No
    System.out.println(bd2.doubleValue());  // 1.0? Yes
  }
}
