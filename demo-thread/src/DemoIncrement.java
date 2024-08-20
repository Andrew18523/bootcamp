import java.util.concurrent.atomic.AtomicInteger;

//Compare between AtomicInteger and synchronized method
// synchronized method is using synchronized on instance method which mean you can definie the method as you like
// But AtomicInteger always use for x++;

public class DemoIncrement {
  private int x; //default is 0
  private int k;
  private Object lock =  new Object();

  // Solution 2: AtomicInteger
  private AtomicInteger y = new AtomicInteger(0);
  
  // Solution 1 -> synchronized method
  public synchronized void increment (){
    this.x++;
  }

  // Solution 3 -> Locked a code block
  public  void increment2 (){
    this.k++;
    synchronized(lock){
      this.x++;
    }
  }

  public static void main(String[] args) {
    DemoIncrement ball = new DemoIncrement();

    
    Runnable task = () -> {
      Thread threadInfo = Thread.currentThread();
      System.out.println(threadInfo.getId());
      System.out.println(threadInfo.getName());
      for (int i = 0 ; i< 1_000_000; i++)
        ball.x++; // by default, x++ support multi thread
    };

    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);

    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e){

    };
    System.out.println("x="+ball.x);

    ball.x = 0;
    Runnable task2 = () ->{
      for (int i = 0 ; i< 1_000_000; i++)
        ball.increment(); // by default, x++ support multi thread
    };
    Thread thread3 = new Thread(task2);
    Thread thread4 = new Thread(task2);
    thread3.start();
    thread4.start();
    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException e){

    };
    System.out.println("Synchronized method: x="+ball.x);

    ball.x = 0;
    Runnable task3 = () ->{
      for (int i = 0 ; i< 1_000_000; i++)
        ball.y.incrementAndGet(); // similiar to y++, revise itseld, Thread-safe
    };
    Thread thread5 = new Thread(task3);
    Thread thread6 = new Thread(task3);
    thread5.start();
    thread6.start();
    try {
      thread5.join();
      thread6.join();
    } catch (InterruptedException e){

    };
    System.out.println("Atomic method: y="+ball.y.get());
    System.out.println("Progrom ends.");
    ball.x = 0;
    Runnable task4 = () ->{
      for (int i = 0 ; i< 1_000_000; i++)
        ball.increment2();; // similiar to y++, revise itseld, Thread-safe
    };
    Thread thread7 = new Thread(task4);
    Thread thread8 = new Thread(task4);
    thread7.start();
    thread8.start();
    try {
      thread7.join();
      thread8.join();
    } catch (InterruptedException e){

    };
    System.out.println("x="+ball.x);
    System.out.println("k="+ball.k);
  }
}
