public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int x = 1;
    int y = 1;
    int z = 1;
    for (int i=0 ; i<15; i++){
      if (i==0){
        System.out.println(y);
      } else{
        z = y;
        y = y+x;
        x = z;
        System.out.println(y);
      }
    }
  }
}