public class Demo {
  public static void main(String[] args) {
    //Ball bank = new Bank()

    // Nested static class
    // Bank bank = new Bank();
    // Bank.Account account = Bank.Account();
    // System.out.println(account.getAccNo());

    // Inner class (non-static)
    Box box = new Box();
    Box.Ball ball =box.new Ball();
    System.out.println(ball.getCapacity()); // 10
    box.add(ball);
    System.out.println(box.getBalls().size());  //1

    //Anonymous Inner Class

    int x =3
    if(x==3){
      Swimable john = new Swimable(){
        @Override
        public void swim(){
          System.out.println("John is swimming");
        }
      };
    }
    else {
      Swimable sally = new Swimable(){
        public String name = "Sally";
  
        public String getName(){
          return this.name;
        }
  
        @Override
        public void swim(){
          System.out.println("Sally is swimming");
        }
      };
    }
    


    sally.swim();
    // sally.getName(); // Polymorphsim
  }
}
