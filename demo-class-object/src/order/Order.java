package order;

import java.math.BigDecimal;

public class Order {
  private static int count =0;
  private int id;
  private Item[] items; // object reference -> one to many by using array
  private String coupon;

  public Order(String couupon){
    this.id = ++count;
    this.items = new Item[0];
    this.coupon = couupon;
  }
  
  public int getId(){
    return this.id;
  }

  public Item[] getItem(){
    return this.items;
  }

  public String getCoupon(){
    return this.coupon;
  }

  public double getDiscount(){
    if (isCouponValid())
      return 0.2d;
    return 0.0d;
  }

  public boolean isCouponValid(){
    if (this.coupon.equals("ABC"))
      return true;
    return false;
  }

  public void addItem(Item item){
    Item[] itemsList = new Item[this.items.length+1];
    for (int i = 0 ; i<this.items.length ;i++){
      itemsList[i] = this.items[i];
    }
    itemsList[itemsList.length-1] = item;
    this.items = itemsList;
  }

  public double total(){
    BigDecimal amount = BigDecimal.valueOf(0L);
    // add,subtract, multiply, divide method return new object
    for (int i = 0 ; i<this.items.length; i++){
      // amount.add(BigDecimal.valueOf(this.items[i].subtotal())); -> return new BigDecimal object instead of update the object
      amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    amount = amount.multiply(BigDecimal.valueOf(1.0 - getDiscount()));
    return amount.doubleValue();
  }


  public static void main(String[] args) {
    Order order = new Order("ABC");
    Item item = new Item(96.0d,2);
    System.out.println(item.subtotal()); //192.0 *subtotal not total
    order.addItem(item);

    Item item2 = new Item(10.0d, 3);
    order.addItem(item2);
    System.out.println(order.total());//222.0 *0.8 = 177.6
  }
}
