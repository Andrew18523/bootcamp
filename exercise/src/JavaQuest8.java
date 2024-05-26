public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240
    int[] nums5 = new int[] { 80, 240,240,100,5,-10};

    // Your program should be able to handle all the above test case.
    int secondMax=0;
    int Max=0;
    // code here ...
    for (int i = 0; i<nums5.length-2;i++){
      if (nums5[i]<=nums5[i+1]){
        Max=nums5[i+1];
        secondMax=nums5[i];
      } else {
        Max=nums5[i];
        secondMax=nums5[i+1];
      }
      if (nums5[i+2]>Max){
        secondMax=Max;
        Max=nums5[i+2];
        nums5[i+1]=secondMax;
      } else if (nums5[i+2]> secondMax){
        secondMax= nums5[i+2];
        nums5[i+2]=Max;
        nums5[i+1]=secondMax;
      } else {
        nums5[i+2]=Max;
        nums5[i+1]=secondMax;
      }
    }
    System.out.println("Second Max Number is "+secondMax);
  }
}