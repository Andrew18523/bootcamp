import java.util.Random;

public class DemoRandom {

  private int baseSalary = 6000;

  public void setBaseSalary(int salary){
    this.baseSalary = salary;
  }
  public static void main(String[] args) {
    // JDK

  // random -> usually interger
    int random =0;
    for (int i= 0 ; i<2;i++){
      random = new Random().nextInt(3); //0-2
      System.out.println(random);
    }
    int random2 = new Random().nextInt(3)+1;//1-3
    int random3 = new Random().nextInt(3-1)+1; // 1-2
    int random4 = new Random().nextInt(2)+49; // 49, 50
    System.out.println(random4);

    DemoRandom dr = new DemoRandom();
    System.out.println(dr.sum(2,3));
    System.out.println(DemoRandom.sum(2, 3));

    DemoRandom dr2 = new DemoRandom();
    dr2.sum2(2,3);
    DemoRandom dr3 = new DemoRandom();
    dr3.sum2(2,3);

  }

  public int getSalary(int bouns){
    return this.baseSalary + bouns;
  }

  public static int sum(int x, int y){
    return x+y;
  }
  public static int sum2(int x, int y){
    return x+y;
  }
}
