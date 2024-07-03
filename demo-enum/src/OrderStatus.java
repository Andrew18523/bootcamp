public enum OrderStatus {
  ORDERED(0),
  PAID(1),
  READY_TO_SHIP(2),
  DELIVERED(3);

  private final int statusIndex;

  private OrderStatus (int statusIndex){
    this.statusIndex= statusIndex;
  }

  public int getStatusIndex(){
    return statusIndex;
  }

  public OrderStatus next(){
    for (OrderStatus status:OrderStatus.values())
      if (this.statusIndex +1 == status.getStatusIndex()){
        return status;
      }
      return null;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.READY_TO_SHIP.next());
  }
}
