public class Book1 {
  private double price;
  private String author;

  public Book1 (double price, String author){
    this.price = price ;
    this.author = author;
  }

  //Type of instance method
  // getter, setter ...
  // presentation -> definition
  public boolean isTooExpensive(){
    return this.price >100;

  }
  // transform (subString, replace)
  public static void main(String[] args) {
    Book book = new Book(110, "John");
    System.out.println(book.price()); //99
    System.out.println(book.author()); //John
    Book book1 = new Book(110, "John");
    System.out.println(book1.equals(book));
    System.out.println(book1.hashCode());
    System.out.println(book.hashCode());
    System.out.println(book1.toString());
    System.out.println(book1.isTooExpensive());
    System.out.println(Book.calculateDiscount(book.price(),0.1));

  }
}
