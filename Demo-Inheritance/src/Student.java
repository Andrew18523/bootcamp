//Person.class is a parent and Student.class is a child

public class Student extends Person1 {
  //private String name;
  private int studentId;
  //private int age;

  // Constructor -> process of constructing student object
  // public Student(String name, int studentId, int age){ //without Inheritance
    public Student(int studentId, String name, int age){
    // calling Parent class constructor ...
    // 1. Create Parent object inside Student Object (heap object)
    super(name,age);
    this.studentId = studentId;
    //this.name = name;
    //this.age = age;
  }

  //public String getName(){
    //return this.name;
  //}
  public int getStudentId(){
    return this.studentId;
  }
  //public int getAge(){
    //return this.age;
  //}

  // setAge in Student is meaningless as input ->outpu -> as input in setAge() in Person1.class. No manipulation
  //public void setAge(int age){
  // 2. call parent object setAge() method
    //super.setAge(age);
  //}

  public static void main(String[] args) {
    Student s = new Student( 1,"ABC", 13);
  }
}
