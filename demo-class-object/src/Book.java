import java.time.LocalDate;

public class Book {
  private String name;
  private String authorName;
  private LocalDate publishDate;

  // instance method (object method)
  public void setName(String name){
    this.name = name;
  }
  // instance method (object method)
  public void setAuthor(String authorName){
    this.authorName = authorName;
  }
  // instance method (object method)
  public void setPublishDate (LocalDate date){
    this.publishDate = date;
  }

  public String getName (){
    return this.name;
  }
  public String getAuthorName (){
    return this.authorName;
  }
  public LocalDate getPublishDate (){
    return this.publishDate;
  }
  // static method (not related to object)
  public static String hello(){
    return "hello";
  }
  // instance method (object method)
  public static void main(String[] args) {
    
    //instance method belongs to object
    Book book1 = new Book();
    book1.setAuthor("John");
    book1.setPublishDate(LocalDate.of(2024,1,1));
    book1.setName("Book1");
    System.out.println("Book Name: "+book1.getName());
    System.out.println("Author Name: "+book1.getAuthorName());
    System.out.println("Publish Date: "+book1.getPublishDate());


    //static method belongs to class
    System.out.println(Book.hello());
    System.out.println("hello");
  }
}
