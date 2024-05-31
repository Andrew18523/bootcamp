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
    System.out.println(Arrays.toString(arr3)); //[hello, abc,ijk]


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
    for (int i=0; i<c1.length; i++){
      result_4a+=c1[i];
    }
    for (int i=0; i<c2.length; i++){
      result_4a+=c2[i];
    }
    System.out.println("Result of 4a is "+result_4a); //oakpabftf
    String result_4b="";
    int length = c1.length>c2.length ? c1.length : c2.length; // conditional ? output_true : output_false 
    for (int i=0;i<length; i++){
      if (i%2==0){
        result_4b+=c1[i];
      } else {
        result_4b+=c2[i];
      }
    }
    System.out.println("Result of 4b is "+result_4b); //obkt
    char c3[] = new char[] {'o','a','k','p','o','a','k','p'};
    char c4[] = new char [] {'a','b','f','t'};
    String result_4c="";
    int length1 = c3.length>c4.length ? c3.length : c4.length;
    for (int i=0; i<length1;i++){
      if (i % 2== 0 && i<c3.length){
        result_4c +=c3[i];
      } else if (i % 2!= 0 && i < c4.length) {
        result_4c +=c4[i];
      }
      
    }
    System.out.println("Result of 4c is "+result_4c); //ovktok

    int[] arr6 = new int[] {4,8,3};
    double average = 0;
    int count = 0;
    for (int i=0; i<arr6.length;i++){
      average += arr6 [i];
      count ++;
    }
    average = (average/count);
    System.out.println(average);

    // swapping in array
    int[] arr7 = new int[] {6,10,-4,15};
    //swap -4 and 6 ->{-4,10,6,15};
    int temp = arr7 [2];
    arr[2] = arr[0];
    arr[0] = temp;
    System.out.println(Arrays.toString(arr7));

    //Level 1;
    //arr 9 = {-4,6,10,15}
    //move -4 to last
    int temp2 = 0;
    int[] arr9 = new int[] {-4,6,10,15};
    for (int i = 0 ;i <arr9.length-1; i++){
      temp2 = arr9[i];
      arr9[i]= arr9[i+1];
      arr9[i+1] = temp2;
    }
    System.out.println("New Arr9 = "+Arrays.toString(arr9));

    //Level 2
    int[] arr10 = new int[] {-4,15,10,6};
    int temp3 =0;
    for (int i = 0 ; i<arr10.length-1; i++){
      if (arr10[i]>arr10[i+1]){
        temp3 = arr10[i];
        arr10[i]=arr10[i+1];
        arr10[i+1]=temp3;
      }
    }
    System.out.println("New Arr10 = "+Arrays.toString(arr10));

    //Sorting -> {-4,6,10,15}
    //for loop
    //nested loop
    int temp1= 0;
    int[] arr8 = new int[] {6,10,-4,15,10,3,7,8,9,17,20,1,3};
    for (int i = arr8.length-1 ; i>0 ;i--){
      for (int j = 0 ; j < i ; j++){
        if (arr8[j]>arr8[j+1]){
          temp1 = arr8[j];
          arr8[j]=arr8[j+1];
          arr8[j+1]=temp1;
        }
      }
    }
    System.out.println("New arr8 = "+Arrays.toString(arr8));

    //Swap char value
    String s = "hello";//Swap e and o ->holle
    char[] c = new char[s.length()];
    //convert to char array
    //for (int i = 0 ; i <c.length; i++){
    //  c[i]=s.charAt(i);
    //}
    c=s.toCharArray(); //  {'h','e','l','l','o'}
    char temp4 = c[1];
    c[1] = c[4];
    c[4] = temp4;
    //String str = String.valueOf(c);
    //System.out.println(str);

    System.out.println(String.valueOf(c));


    
  }
}
