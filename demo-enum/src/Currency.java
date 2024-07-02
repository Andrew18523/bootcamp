public enum Currency {
  HKD("Hong Kong Dollar",1), // similar to new Currency ("Hong Kong Dollar")
  JPY("Japanese Yen",2),
  USD("US Dollar",3),
  ;

  private final String description;
  private final int DBvalue;

  //constructor 唔使PUBLIC 因為ENUM 會HKD("Hong Kong Dollar",1) SET 入去，因為佢係UNIQUE
  private Currency (String description , int DBvalue){
    this.description=description;
    this.DBvalue = DBvalue;
  }

  //Instance Methods
  public String getDescription (){
    return this.description;
  }

  public int getDBvalue (){
    return this.DBvalue;
  }

  @Override
  public String toString(){
    return "Currency(" + "Description="+ this.description + ", DBvalues=" +this.DBvalue+")";
  }

  public static Currency get (int DBvalue){
    for (Currency c : Currency.values()){
      if (c.getDBvalue()== DBvalue){
        return c;
      }
    }
    return null;
  }

  public static int get(Currency currency){
    return currency.getDBvalue();
  }

  public static String fullDescription (Currency currency){
    // if (currency == Currency.HKD){
    //   return "It is Hong Kong Dollar";
    // } else if (currency == Currency.USD){
    //   return "xxxxxxx"; 
    // } else if (currency == Currency.JPY){
    //   return String.valueOf(currency.getDBvalue());
    // }
    // return null; //<- end must be return null
    //Alternative switch (before java 14) +enum (perfect match)
    switch (currency) {
      case HKD:
        return "It is Hong Kong Dollar";
      case USD:
        return "xxxxxxx"; 
      case JPY:
        return String.valueOf(currency.getDBvalue());
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    //Error: Currency currency = "HKD";
    Currency currency = Currency.HKD;
    if (currency == Currency.USD){
      System.out.println("It is "+currency.getDescription());
    } else if (currency == Currency.HKD){
      System.out.println("It is "+currency.getDescription());
    } else if (currency == Currency.JPY ){
      System.out.println("It is "+currency.getDescription());
    }
    System.out.println(currency); // HKD
    // ENUM already override Object.toString()
    System.out.println(currency.toString()); // HKD
    // default instance methods provided by ENUM.class
    // 1. name()
    System.out.println(currency.name()); // HKD

    // 2. values() -> for-each loop
    for (Currency c: Currency.values()){
      System.out.println(c.getDescription());
    }
    // Hong Kong Dollar
    // Japanese Yen
    // US Dollar

    System.out.println(Currency.values().length); //3

    System.out.println(Currency.HKD.hashCode()); //791452441
    System.out.println(Currency.USD.hashCode()); //834600351

    System.out.println(Currency.JPY.equals(currency)); //false
    System.out.println(Currency.HKD.equals(currency)); //true

    System.out.println(currency.equals(Currency.HKD)); //not a good coding style
    System.out.println(currency != null && currency.equals(Currency.HKD)); // better

    System.out.println(Currency.get(1));

    String x ="abc";

    //Not OK
    if (x.equals("abc")){ // as x may equal to null;

    }

    //OK
    if ("abc".equals(x)){

    }
    //3. valueOf()-> static method
    System.out.println(Currency.valueOf("HKD").name()); // "HKD", "HKD" -> Currency enum -> name()->HKD
    //Error: System.out.println(Currency.valueOf("123").name()); //java.lang.IllegalArgumentException
  }


}
