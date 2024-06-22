import java.util.Objects;

public class MiniCat {
    private String name;
  private String color;
  public MiniCat(String name, String color){
    this.name = name;
    this.color = color;
  }

  @Override
  //Override the original hashCode (address) and used to check the attribute in the MiniCat. If they have same attribute, same hashCode
  public int hashCode(){
    return Objects.hash(this.name, this.color);
  }
}
