public abstract class Superhuman {
  private double height;

  public Superhuman(){

  }
  //why abstract class has constructor? but we cannot create object for abstract class
  public Superhuman (double height){
    this.height = height;
  }

  public double getHeight(){
    return this.height;
  }
}
