public class Box<T> { // <T> juts can be any & unknown type cannot be primitive 
  private T value;

  public Box(){

  }

  public Box (T value){
    this.value = value;
  }

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public static void main(String[] args) {
    // Run time 
    // You have to define the type <T> during run-time. So we define the class is Interger.class at line 23
    Box <Integer> integerBox = new Box<>(); //
    integerBox.setValue(100);  
    Box <Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer());

    //You cannot use T during run-time
    //Error: Box<T> box = new Box<>();
  }
}
