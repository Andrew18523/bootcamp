public class CurrencyHolder {
  private final String currency;
  private final int DBvalue;

  public CurrencyHolder (String currency, int DBvalue){
    this.currency = currency;
    this.DBvalue = DBvalue;
  }

  public String getCurrency(){
    return this.currency;
  }
  

  public boolean isHKD(){
    return "HKD".equals(this.currency);
  }

  public static boolean isHKD(CurrencyHolder holder){
    return "HKD".equals(holder.getCurrency());
  }

  public static void main(String[] args) {
    // 1. cannot huarantee there is ONLY one HKD object in memory
    CurrencyHolder ch1 = new CurrencyHolder("HKD", 1);
    CurrencyHolder ch2 = new CurrencyHolder("HKD", 1);


    // 2. String is not a good idea to represent a parameter that with finite numbers of object
    System.out.println(ch1.isHKD()); // true, it is ok
    // but ...
    System.out.println(CurrencyHolder.isHKD(ch2)); // true 
    System.out.println(CurrencyHolder.isHKD(new CurrencyHolder("HKDs", 1))); // false
    //Error: System.out.println(CurrencyHolder.isHKD(Currency.123));// compile time error as Curreny must be HKD, USD, JPY
    System.out.println(CurrencyHolder.isHKD(Currency.HKD)); // true
    
  }
  //Solution:enum
  //enum.calss defined a finite number of values, so that complier can validate the parameters

  public static boolean isHKD(Currency currency){
    return "HKD".equals(currency.name());
  }

}
