import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;

  public NumberBox(T number){
    this.number = number;
  }

  public static void main(String[] args) {
    NumberBox<Byte> byteBox = new NumberBox<>((byte) 1);
    //Long extends Number and Byte extedns Number
    //NumberBox<Byte> has no relationship with NumberBox<Long>
    // you cannot put long value into NumberBox<Byte>

    NumberBox<BigDecimal> bBox = new NumberBox<BigDecimal>(BigDecimal.valueOf(1));
    // Error: NumberBox<String> StringBox = new NumberBox<String>("ABC"); //String not under Number

  }
}
