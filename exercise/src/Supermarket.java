import java.math.BigDecimal;
import java.time.LocalDate;

public class Supermarket {
  
  private String itemName;
  private LocalDate expiryDate;
  private int quantity; 
  private double price;

  public Supermarket (String itemName, LocalDate expiryDate,int quantity, double price){
    if (quantity <=0 || price <=0.0){
      System.out.println("Quantity or price is less then 0, please check.");
    } else {
      this.itemName = itemName;
      this.expiryDate = expiryDate;
      this.price = price;
      this.quantity = quantity;
    }
  }
  public void setItemName (String itemName){
    this.itemName=itemName;
  }
  public void setExpiryDate (LocalDate expiryDate){
    this.expiryDate=expiryDate;
  }
  public void setPrice (Double price){
    this.price= price;
  }
  public void setQuantity (int quantity){
    this.quantity=quantity;
  }

  public String getItemName (){
    return this.itemName;
  }
  public LocalDate getExpiryDate (){
    return this.expiryDate;
  }
  public double getPrice (){
    return this.price;
  }
  public int getQuantity (){
    return this.quantity;
  }

  public String toString(){
    return this.itemName +
      " has total " + this.quantity +
      " qty in stock. The price is " + this.price +
      ". And the expiry date is " + this.expiryDate +
      ".";
  }

  public double discount (){
    if (this.expiryDate.isBefore(LocalDate.now())){
      return 0;
    }
    else if (LocalDate.now().plusDays(180L).isBefore(this.expiryDate) == false){
      return 0.7;
    } else {
      return 1;
    }
  }
  public String totalPrice (int quantity, double discount){
    if (discount == 0){
      return "Item already expired. Please dispose it instead of selling it.";
    }
    else if (quantity> this.quantity){
      return "Item quantity is less than requested quantity";
    } else {
      this.quantity -= quantity;
      return "The total price is " + BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(quantity)).multiply(BigDecimal.valueOf(discount)).doubleValue();
    }
  }

  public static void main(String[] args) {
    Supermarket Chocolate = new Supermarket("Chocolate", LocalDate.of(2024,8,31), 100, 499);
    Supermarket Cola = new Supermarket("Cola", LocalDate.of(2025,12,31), 100, 12);
    Supermarket Chip = new Supermarket("Chip", LocalDate.of(2023,12,31), 100, 12);
    System.out.println(Cola.toString());
    System.out.println(Chocolate.toString());
    System.out.println(Chip.toString());
    System.out.println(Cola.totalPrice(10, Cola.discount()));
    System.out.println(Cola.toString());
    System.out.println(Chocolate.totalPrice(10, Chocolate.discount()));
    System.out.println(Chocolate.toString());
    System.out.println(Chocolate.totalPrice(100, Chocolate.discount()));
    System.out.println(Chocolate.toString());
    System.out.println(Chip.totalPrice(10, Chip.discount()));
    System.out.println(Chip.toString());

  }
  

}
