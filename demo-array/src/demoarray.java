import java.util.Arrays;

public class demoarray {
  public static void main(String[] args) {
    int[] arr = new int[3]; // when create an array object, you have to define the length of it. Now length is 3
    //arr[index]
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = -3;
    //arr[0] = "H"; // java complier knows "arr" is a integer array which store integer value
    System.out.println(arr[0]); //10
    System.out.println(arr[1]); //20
    System.out.println(arr[2]); //-2
    arr[0] = 100;
    System.out.println(arr[0]); //100

    //arr[3] = 200; // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    int[] arr2 =new int[] {10,20,-3};
    System.out.println(arr2[0]); //10
    System.out.println(arr2[1]); //20
    System.out.println(arr2[2]); //-2

    // String array ->"hello","abc","ijk"
    String[] arr3 =new String[] {"hello","abc","ijk"};
    System.out.println(arr3[0]); //"hello"
    System.out.println(arr3[1]); //"abc"
    System.out.println(arr3[2]); //"ijk"
    // Arrays.toString
    System.out.println(Arrays.toString(arr3));


    // 9, -3, -100, 90, 66, -4
    //for loop
    int[] arr4 =new int[] {9,-3,-100,90,66,-4};
    for (int i=0; i<arr4.length;i++){
      System.out.println(arr4[i]);
      }
      // loop
      //find the max value from arr4
      int max=0;
      int maxindex=0;
      for (int i=0; i<arr4.length;i++){
        if (arr4[i]>max || i==0){
          max= arr4[i];
          maxindex=i;
        }
      }

      System.out.println("Max value is "+max+" and the index is " +maxindex);
      int max1=Integer.MIN_VALUE;
      for (int i=0;i<arr4.length;i++){
        if (arr4[i]>max1){
          max1=arr4[i];
        }
      }
      System.out.println("Max value1 is "+max1);
      int min=Integer.MAX_VALUE;
      for (int i=0;i<arr4.length;i++){
        if (arr4[i]<min){
          min=arr4[i];
        }
      }
      System.out.println("Min value1 is "+min);

      char[] arr5 = new char[] {'l','e','e','r','q'};
      //1. count the number of 'e'
      //2. boolean result to store if 'r' exists
      //3. String result to store "qreel"
      boolean is_r_exist= false;
      int count_e = 0;
      String result_s = "";
      for (int i=0; i<arr5.length;i++){
        if (arr5[i]=='e'){
          count_e++;
        }
        if ( arr5[i]=='r'){
          is_r_exist=true;
        }
        result_s=arr5[i]+result_s;
      }
      System.out.println("The Count of 'e' is "+count_e);
      System.out.println("Boolean result of 'r' exists is "+is_r_exist);
      System.out.println("String result is "+result_s);

      result_s="";
      for (int i=arr5.length-1;i>=0;i--){
        result_s+=arr5[i];
      }
      System.out.println("String result is "+result_s);

      //Given two char[], -> result is a String Value which append all characters
      char c1[] = new char[] {'o','a','k','p'};
      char c2[] = new char [] {'a','b','f','t'};
      //4a. result = "oakpabftf"
      //4b. result ->'obkt' when even index, get value of c1, when odd index, get the value from c2
      String result_4a="";
      String result_4b="";
      
      for (int i=0; i<c1.length; i++){
        result_4a+=c1[i];
      }
      for (int i=0; i<c2.length; i++){
        result_4a+=c2[i];
      }
      System.out.println("Result of 4a is "+result_4a);

      for (int i=0;i<c1.length; i++){
        if (i%2==0){
          result_4b+=c1[i];
        } else {
          result_4b+=c2[i];
        }
      }
      System.out.println("Result of 4b is "+result_4b);

    }
}
