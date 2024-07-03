public class Order {
  private OrderStatus orderStatus;
  private int paidAmount;
  private int orderAmount;

  public Order(int orderAmount){
    this.orderAmount = orderAmount;
    this.orderStatus = OrderStatus.ORDERED;
  }

  public void credit(int paidAmount){
    this.paidAmount+=paidAmount;
    // Encapsulation
    if (isPaid() && this.orderStatus==OrderStatus.ORDERED){
      // this.setOrderStatus(this.orderStatus.next());
      // this.orderStatus= OrderStatus.PAID;
      setToPaid();
    }
  }

  public void setToPaid(){
    this.orderStatus= OrderStatus.PAID;
  }
  public boolean isPaid(){
    if (this.paidAmount>=this.orderAmount){
      return true;
    }
    return false;
  }

  public OrderStatus getOrderStatus (){
    return this.orderStatus;
  }

  public void setOrderStatus(OrderStatus status){
    this.orderStatus = status;
  }


  public static void main(String[] args) {
    Order order = new Order(100);
    //....
    // credit card->100
    order.credit(50);
    System.out.println(order.isPaid());//false
    order.credit(50);
    // OrderStatus currenStatus = order.getOrderStatus();
    // if (order.isPaid() && order.getOrderStatus()== OrderStatus.ORDERED){
    //   order.setOrderStatus(order.getOrderStatus().next());
    // }
    System.out.println(order.getOrderStatus());//PAID
  }
}
