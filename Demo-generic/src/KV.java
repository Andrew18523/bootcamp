public class KV<T,U> {
  private T t;
  private U u;

  public KV(){

  }

  public KV(T t,U u){
    this.t = t;
    this.u = u;
  }
  \
  public void setU (U u){
    this.u = u;
  }


  public static void main(String[] args) {
    KV<String, Customer> customers = new KV<>();
    customers.setU(new Customer()); // OK
    customers.setU("abc"); // "abc" is strings and customers value already set as customer

    KV<String, String> strings = new KV<>();


  }
}
