public class Box<T> {
  T data;
  public Box(T data){
    this.data = data;
  }

  public static void main(String[] args) {
    //
    //Box<String> box = null; //box = null npe
    //
    Box<String> box2 = new Box<>(null);// box =/= null and Box's data = null
  }
}
