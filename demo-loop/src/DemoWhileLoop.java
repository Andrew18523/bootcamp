public class DemoWhileLoop {
  public static void main(String[] args) {
    for (int i = 0;i<5;i++){
      System.out.println(i);
    }
    int i = 0;
    while (i<5){
      System.out.println(i);
      i++;
    }


    int[] arr = new int[] {10, -100, 9, 7};
    //sum all number by while loop
    i = 0;
    int sum = 0;
    while (i<arr.length){
      sum +=arr[i];
      i++;
    }
    System.out.println(sum);

    i=0;
    while (i<300){
      if (i>30){
        break;
      }
      i++;
    }
    System.out.println("i="+i);

    // 123 -> 1+2+3 = 6;
    // 100 -> 1+0+0 = 1;
    // 4562 -> 4,5,6,3 = 18;
    // use while loop
    
    int i1 = 4563;
    sum = 0;
    while (i1>0){
      sum += i1 % 10;
      i1 = i1/10; // 123 -> 12
    }
    System.out.println(sum);

    // Reverse number
    // 54321 ->12345
    // 101->101
    sum =0;
    int i2 = 123456789;
    int power = String.valueOf(i2).length() -1;
    while (i2>0){
      sum += (i2 % 10)*Math.pow(10,power);
      i2 = i2/10; // 123 -> 12
      power--;
    }
    System.out.println("reversed number="+sum);
  }
}
