import java.math.BigDecimal;
import java.math.RoundingMode;

public class DeomBigDecimal {
  public static void main(String[] args) {
    double x = 0.2;
    double y = 0.3;
    System.out.println(x*y);

    BigDecimal b1 = new BigDecimal("0.2");
    BigDecimal b2 = new BigDecimal("0.1");

    BigDecimal b3 = b1.multiply(b2);
    System.out.println(b3.doubleValue());
    System.out.println("By BigDecimal: "+sum(0.2,0.1));
    System.out.println("By 0.1 + 0.2 directly: "+(0.1+0.2));
    System.out.println(divide(1000.0,11.1)); 
    System.out.println(BigDecimal.valueOf(3.3)
      .subtract(BigDecimal.valueOf(4.4)).multiply(BigDecimal.valueOf(5.5)));
  }

  public static double sum (double d1, double d2){
     BigDecimal b1 = BigDecimal.valueOf(d1);
     BigDecimal b2 = BigDecimal.valueOf(d2);
     return b1.add(b2).doubleValue();
  }
  //Divide
  //method
  public static double divide (double d1, double d2){
    //BigDecimal v1 = BigDecimal.valueOf(d1);
    //BigDecimal v2 = BigDecimal.valueOf(d2);
    //return v1.divide(v2).doubleValue();
    // equal to below
    return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2),RoundingMode.UP).setScale(3,RoundingMode.UP).doubleValue();
  }

  // d1.subtract().multiply()

}