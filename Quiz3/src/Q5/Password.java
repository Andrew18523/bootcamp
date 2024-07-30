package Q5;

public class Password {
  int level = 2; 

  public static void main(String[] args) {
    int age = Password.level; //level is instance variable, we cannot call
    System.out.println(this.level);// we cannot use this in main
  }
}
