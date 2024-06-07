import java.util.Arrays;

public class Bag {
  private int[] integers;

  public Bag(){

  }

  public Bag(int[] integers){
    this.integers = integers;
  }

  public void setIntegers(int[] integers){
    this.integers= integers;
  }

  public int[] getIntegers(){
    return integers;
  }

  public String toString(){
    return "Bag("
      +"Integers="
      +Arrays.toString(this.integers)
      +")";
  }
  public static void main(String[] args) {
    int[] integers = new int[] {3,1,2}; // created a new object int[] with object reference "intergers"
    Bag b1 = new Bag(integers); // created a new ojbect "Bag" with object reference "b1". "intergers" is a reference in object to point to int [] in line 29;
    System.out.println(b1.toString()); 
    int[] x =b1.getIntegers(); // x is a object reference. Via getIntegers() method return the int[] {3,1,2}
    b1.setIntegers(new int[] {5,6,7});

    // missing object reference -> we cannot reach the object again -> Java will delete the object
    System.out.println(new Bag(new int[] {1,2,3}).toString());
  }
}
