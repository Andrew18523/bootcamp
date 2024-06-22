public class DemoNumber {
  
  public static void main(String[] args) {
    Double d = 2.9;
    Integer x = 1;

    Number n=x; // polymorphism
    // n is object reference
    n = d;

    Number[] numbers = new Number[] {1,2,3,4.0,4.6,5.1};
    //Error:   Double[] doubles = new Double[] {1,2,3,4.0,4.6,5.1}; 
    // int -> Integer (Autobox)
    // Integer vs Double (No relationship)
    // int vs double (upcast)
    Double[] doubles = new Double[] {Double.valueOf(1),4.0,4.6,5.1};

    //for each
    // for (object type : array object)
    for (Number num:numbers){
      System.out.println(num.getClass());
    }
    // class java.lang.Integer
    // class java.lang.Integer
    // class java.lang.Integer
    // class java.lang.Double
    // class java.lang.Double
    // class java.lang.Double
    int [][] grid = new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
    System.out.println(grid.length);
  }
}
