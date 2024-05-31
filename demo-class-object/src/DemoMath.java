public class DemoMath {
  public static void main(String[] args) {
    // abs()
    int x = -3;
    int y = 8;
    int result_1 = Math.abs(x*y); // int *int = int
    System.out.println(result_1);

    double d = 3.3d;
    double result_2 = Math.abs(d*x);
    System.out.println(result_2);

    float f = 4.4f;
    float result_3 = Math.abs(f*x);
    System.out.println(result_3);

    long l = 5L;
    long result_4 = Math.abs(l*x);
    System.out.println(result_4);

    // max() and min()
    System.out.println("Max betwwen 10 and 9 = "+Math.max(10,9));
    System.out.println("Min betwwen 10 and 9 = "+Math.min(10,9));

    int max = Integer.MIN_VALUE;
    int[] arr = new int[] {4,-3,10,2};
    for (int i = 0; i<arr.length;i++){
        max=Math.max(max,arr[i]);
    }
    System.out.println(max);

    //round()
    double d1 = 3.1456d;
    System.out.println(Math.round(d1)); //3
    System.out.println(Math.round(3.12)); //3
    System.out.println(Math.round(3.5)); //4
    System.out.println(Math.round(3.7)); //4

    // pow(a,b)

    double r4 = Math.pow(2,3);
    System.out.println(r4); //8.0
    System.out.println(Math.pow(2.2,3));

    System.out.println(Math.sqrt(25));
    System.out.println(Math.sqrt(24));
    System.out.println(Math.sqrt(-25)); // NaN

    // random()  // from 0.0 to 1.0
    System.out.println(Math.random());
    System.out.println(Math.round(Math.random()*100)); // int from 0 to 100
  }
}
