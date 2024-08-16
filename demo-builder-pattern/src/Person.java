public class Person {
  private String name;
  private int age;

  // Builder pattern should not contain empty constructor
  public Person (){
  }

  private Person (String name, int age){
    this.name = name;
    this.age = age;
  }

  public static Builder builder(){
    return new Person.Builder();
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }


  public void setName (String name){
    this.name = name;
  }

  public void setAge (int age){
    this.age =age;
  }

  public static class Builder{
    private String name;
    private int age;

    public Builder age(int age){
      this.age = age;
      return this;
    }
    public Builder name(String name){
      this.name = name;
      return this;
    }
    public Person build(){
      return new Person(this.name, this.age);
    }
  }

  public static void main(String[] args) {
    
    //Tranditional
    Person person = new Person();
    person.setName("John");
    person.setAge(18);

    Person person2 = Person.builder() // create a Builder object
      .age(18)
      .name("John")
      .build();
    System.out.println(person2.getName());
    System.out.println(person2.getAge());
  }
}
