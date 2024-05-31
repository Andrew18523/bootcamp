public class DemoMethod {
  public static void main(String[] args) { //only run public static void main
        
    // Method: you put something into the box and it turns something to you
    // Calling Method
    System.out.println("hello");
    int result = sum(10,3);
    System.out.println(result);

    System.out.println(lastchar("hello"));
    System.out.println(toString(new char[] {'a','b','c','e','f'}));
    System.out.println(max(new int[]{1,2,3,4,5,6,7,8,9}));
    System.out.println(isElderly(70));
    System.out.println(isSubstring("Hello", "llo"));
    System.out.println(circleArea(1));

    //double * double
    System.out.println(0.2*0.1);  // 0.020000000000000004 -> problem ->solution is Big Decimal
  }
  public static int sum (int x, int y){ // (The method takes two integer parameters from main) 
    //int sum-> The method returns an integer value. sum is the name of the method.
    // if you method is with return type, the method content should contain a key word "return"
    return x+y; // int + int -> int
  }
  public static char lastchar(String s){
    return s.charAt(s.length()-1);
  }
  public static String toString(char[] arr){
    // Approach 1 
    // String result= "";
    // for (int i=0; i<arr.length; i++){
    //     result+= arr[i];
    // }
    // return result;

    // Approach 2
    return String.valueOf(arr);
  }
  public static int max (int [] arr){
    int max =Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++){
      if (max<arr[i]){
        max=arr[i];
      }
    }
    return max;
  }
  public static boolean isElderly (int age){
    //>65
    // if (age>65){
    //     return true;
    // }
    // return false;

    return age >65;
  }
  public static boolean isSubstring(String str, String substr){
    //return str.contains(substr);

    //Approach 2;
    //indexOf() method return an int index which is the index position of substring
    // if return is -1 whcih mean the substring is not exist in the String
    //return str.indexOf(substr) != -1;
    
    for (int i =0; i<str.length()-substr.length()+1; i++){
        for (int j = 0; j<substr.length();j++){
            if (str.charAt(i+j) != substr.charAt(j)){
                break;
            }
            if ( j== substr.length()-1){
                return true;
            }
        }
    }
    return false;
  }
  public static double circleArea (int radius){
    return radius*radius*Math.PI;
  }
}
