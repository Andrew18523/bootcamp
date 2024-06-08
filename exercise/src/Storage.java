import java.util.Arrays;

public class Storage {
  // the item name is unique and cannot be repeated
  // the storage is a 10x10 space {0,0} to {9,9} -> how can I work to check is the space is occpied??

  private String itemName;
  private int[] storageLocation;

  public Storage(String itemName,int [] storageLocation){
    if (storageLocation[0] > 9 || storageLocation[1]>9){
      System.out.println("The stoage location is out of bound.");
    } else {
      System.out.println("The item was store successfully");
      this.itemName=itemName;
      this.storageLocation = storageLocation;
    }
  }
  //setter
  public void setItemName(String itemName){
    this.itemName=itemName;
  }
  public String setStorageLocation(int[] storageLocation){
    if (storageLocation[0] > 9 || storageLocation[1]>9 || storageLocation[0] <0  || storageLocation[1]< 0){
      return "The stoage location is out of bound.";
    } else {
    this.storageLocation=storageLocation;
    return "";
    }
  }
  public String getItemName(){
    return this.itemName;
  }
  public int[] getStorageLocation(){
    return this.storageLocation;
  }

  public String toString(){
    if (this.storageLocation == null){
      return "Missing Storage Location.";
    } else {
    return "The Name of the item is " +
      this.itemName + ". The stoarge location is "+
      Arrays.toString(this.storageLocation)+".";
    }
  }

  public static void main(String[] args) {
    int [] c1StorageLocation = new int[] {10,0};
    Storage c1 = new Storage("Book1",c1StorageLocation);
    c1.setStorageLocation(c1StorageLocation);
    System.out.println(c1.toString());
    Storage c2 = new Storage("Book2", new int[]{1,1});
    System.out.println(c2.toString());
  }

}
