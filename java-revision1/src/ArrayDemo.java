public class ArrayDemo {
  
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3}; //right hand side -> array object, left hand side -> object reference

    // Error: Integer[] integers = new int[] {1,2,3}; // It is Not upcasting
    Integer[] integers2 = new Integer[] {1,2,3}; // upcast, 1 (int value) -> upcast -> Integer Object with value 1 -> put in Integer arrany index 0
    //4 object in total;
    //1. Array object
    //2. Integer Object with value 1
    //3. Integer Object with value 2
    //4. Integer Object with value 3
    
    System.out.println(integers2[2]); //3, integers2[2] is storing the address of "Integer Object with value 3"
  }
}
