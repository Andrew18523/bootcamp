import java.time.LocalDate;
import java.util.Objects;

public class Book { // same as public class Book extends object as implicitly inherit Object.class
  
  private String author;
  private LocalDate publishDate;

  public Book (String author, LocalDate publishDate){
    this.author = author;
    this.publishDate = publishDate;
  }

  public String getAuthor (){
    return this.author;
  }

  public LocalDate getPublisDate (){
    return this.publishDate;
  }

  // if you do not @Override, the hashCode() method by default repersenting th object address
  public int hashCode(){
    return Objects.hash(this.author,this.publishDate);
  }

  
  @Override // if override it , the purpose is to make it become turn even if they are
  //2 different object
  public boolean equals(Object obj){ //.equals(object x)
    if (this == obj)
      return true;
    
    if (!(obj instanceof Book)) // instanceof ->  is checking if the obect pointing by reference is an object decleared by Book
      return false;
    
    Book book = (Book) obj;
    return Objects.equals(this.author, book.getAuthor()) &&
      Objects.equals(this.getPublisDate(), book.getPublisDate());
    // if (book.getAuthor().equals(this.author)&& book.getPublisDate().compareTo(this.publishDate) == 0){
    //   return true;
    // }
    // return false;

  }

  public static void main(String[] args) {
    Book book1 = new Book("John",LocalDate.of(2024, 1, 10));
    Book book2 = new Book("John",LocalDate.of(2024, 1, 10));
    Book book3 = new Book("John",LocalDate.of(2024, 1, 11));
    System.out.println(book1.hashCode()); //75896896
    System.out.println(book2.hashCode()); //75896896
    System.out.println(book3.hashCode()); //75896897

    System.out.println(book1==book2); // false

    //identityHashCode to identity the object.
    System.out.println(System.identityHashCode(book1));//617901222
    System.out.println(System.identityHashCode(book2));//1159190947
    // 2 different object.

    //Object.class has equals() method
    // if you do not override, equals() by default checking object address
    System.out.println(book1.equals(book2)); // true after @Override

    // if both objects are located in different address , queal() must return false (no override)
    System.out.println(book1.equals(new Cat())); // false 

    System.out.println(book1.equals(book2)); // true 
    System.out.println(book1.equals(book3)); // false

    String str = "abc";
    System.out.println(str.hashCode()); // 96354
    System.out.println(((int) 'a' )*(int) Math.pow(31, 2)+((int)'b')*31+((int)'c')); // 96354

    // Implication:
    // there will be another string value with same hash code.
    // 2 different string can be potentially can be with same hash code

    String str2 = "abcdefghijkxyz";//2093920115
    System.out.println(str2.hashCode());
    String str3 = "abcdefghijkxyza";//487014222 Overflow int 
    System.out.println(str3.hashCode());

    Integer i3 = 365;
    System.out.println(i3.hashCode());

    System.out.println("abc".equals("abc")); //true
    System.out.println(new String ("abc").equals(new String ("abc"))); // true but they obvious is 2 different object.
    
    // "Compile time" is able to call equals()
    // "Run time" determine the implementation (method content) of equals() method
    Object s1 = new String("abcde");
    Object s2 = new String("abcde");
    System.out.println(s1.equals(s2)); // true (Runtime:String.equals())

    Object s3 = new Object();
    Object s4 = new Object();
    System.out.println(s3.equals(s4)); // false (Runtime:Object.equals())

  }
}
