import java.util.ArrayList;
import java.util.List;

public class DemoVector {
  public static void main(String[] args) {
    //ArrayList vs Vector
    List<String> strings = new ArrayList<>();

    Runnable addStringTask = () ->{
      for (int i = 0 ; <1_000_000 ; i++){
        strings.add("Hello");
      }
    }; //run() method implementation

    Thread thread1 new Thread(addStringTask);
    thread1.start(); // call run()

    System.out.println("Program ends......");

  }
}
