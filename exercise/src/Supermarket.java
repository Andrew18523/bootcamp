import java.math.BigDecimal;
import java.time.LocalDate;

public class Supermarket {
  // 30% off discount will be given if the expired date is within 180 days.
  // All expired item should be disposed and not sell to customer.


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
      return 0; // Item should be disposed as already expired
    }
    else if (LocalDate.now().plusDays(180L).isBefore(this.expiryDate) == false){
      return 0.7; // 30% off for item's expiry date within 180 days
    } else {
      return 1;
    }
  }
  public String totalPrice (int quantity, double discount){
    if (discount == 0){
      return "Item already expired. Please dispose it instead of selling it."; // Item should be disposed as already expired. No stock should be reduce.
    }
    else if (quantity> this.quantity){
      return "Item quantity is less than requested quantity"; // requested quantity is greater then item quantity.
    } else {
      this.quantity -= quantity; // reduce the item quantity per transcation
      return "The total price is " + BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(quantity)).multiply(BigDecimal.valueOf(discount)).doubleValue();
    }
  }

  
  public static void main(String[] args) {
    Supermarket Chocolate = new Supermarket("Chocolate", LocalDate.of(2024,8,31), 100, 499);
    Supermarket Cola = new Supermarket("Cola", LocalDate.of(2025,12,31), 100, 12);
    Supermarket Chip = new Supermarket("Chip", LocalDate.of(2023,12,31), 100, 12);
    System.out.println(Cola.toString()); // Cola has total 100 qty in stock. The price is 12.0. And the expiry date is 2025-12-31
    System.out.println(Chocolate.toString()); // Chocolate has total 100 qty in stock. The price is 499.0. And the expiry date is 2024-08-31.
    System.out.println(Chip.toString()); // Chip has total 100 qty in stock. The price is 12.0. And the expiry date is 2023-12-31.
    System.out.println(Cola.totalPrice(10, Cola.discount())); // The total price is 120.0
    System.out.println(Cola.toString()); // Remaining stock -> Cola has total 90 qty in stock. The price is 12.0. And the expiry date is 2025-12-31.
    System.out.println(Chocolate.totalPrice(10, Chocolate.discount())); //Expiry Date is within 180 day from today. 30% off discount -> The total price is 3493.0
    System.out.println(Chocolate.toString()); // Remaining stock ->  Chocolate has total 90 qty in stock. The price is 499.0. And the expiry date is 2024-08-31.
    System.out.println(Chocolate.totalPrice(100, Chocolate.discount())); //Item quantity (90) is less than requested quantity (100)
    System.out.println(Chocolate.toString()); // No stock is reduce from line 91. -> Chocolate has total 90 qty in stock. The price is 499.0. And the expiry date is 2024-08-31.
    System.out.println(Chip.totalPrice(10, Chip.discount())); // Chip already expired. -> Item already expired. Please dispose it instead of selling it.
    System.out.println(Chip.toString()); // Remaining stock -> Chip has total 100 qty in stock. The price is 12.0. And the expiry date is 2023-12-31.

  }
  

}
