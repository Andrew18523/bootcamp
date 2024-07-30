import java.util.Arrays;

public class ArrayList1 {
  private Integer[] integers;

  public ArrayList1() {
    this.integers = new Integer[0];
  }

  public void add (Integer i){
    Integer[] arr = new Integer[this.integers.length +1];
    int idx = 0;
    for (Integer x : this.integers){
      arr[idx++]= x;
    }
    arr[idx]= i;
    this.integers = arr;
  }

  public boolean isEmpty(){
    return this.size() == 0;
  }

  public int size(){
    return this.integers.length;
  }
  public void remove (int index){
    Integer[] arr = new Integer[this.integers.length-1];
    int count = 0;
    for (int i = 0; i <this.integers.length;i++){
      if (i != index){
        arr[count++]=this.integers[i];
      }
    }
    this.integers= arr;
  }

  public Integer[] getInteger(){
    return this.integers;
  }
  public String toString(){
    return Arrays.toString(this.integers);
  }


  public static void main(String[] args) {
    ArrayList1 integer = new ArrayList1();
    integer.add(10);
    integer.add(2);
    integer.add(-4);
    for (Integer x: integer.getInteger()){
      System.out.println(x);
    }

    System.out.println(integer);
    integer.add(100);
    System.out.println(integer);
    integer.remove(1);
    System.out.println(integer);
  }
}
