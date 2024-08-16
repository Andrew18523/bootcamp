public record Book(double price, String author) {
  // with:
  // 1. getter -> price(), author()
  // 2. One constructor only - all arguement constructor
  // 3. attributes are private final
  // 4. Already support equals(), hashCode(), toString()
  // 5. class is final (Cannot be extend)
  // 6. Support custom instance method
  // 7. Support static method
  // 8. Support static, static final
  // 9. Do Not support final custom instance varible (price and author)
  //10. Do Not support custom constructor
  



  // Constant
  public static final double MIN_PRICE = 10;

  //Error public final double =0.0;

  public static double calculateDiscount (double price, double discountPercentage){
    return price*(1-discountPercentage);
  }

  public boolean isTooExpensive(){
    return this.price >100;
  }

  // All attribute are final
  // public void setPrice (double price){
  //   this.price = price;
  // }

}

