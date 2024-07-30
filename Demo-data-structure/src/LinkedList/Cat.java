package LinkedList;

public class Cat {
  private Eye[] eyes;

  public Cat(Color color){
    this.eyes = new Eye[2];
    this.eyes[0] = new Eye(color);
    this.eyes[1] = new Eye(color);
    }
  public Eye[] getEyes(){
    return this.eyes;
  }
  public Eye getLeftEye(){
    return this.eyes[0];
  }
  public Eye getRightEye(){
    return this.eyes[1];
  }
}
