import java.util.Scanner;

public class DemoObject{
  public static void main(String[] args) {
    //get.class()
    StringBuilder sb = new StringBuilder(); //  java.lang.StringBuilder

    Scanner scanner = new Scanner(System.in); // java.util.Scanner

    Object object = new Object(); // Object is the top parent of all class 萬能指針
    // object can point to anything;
     object= "abc";
     object = Double.valueOf(13);
     object = new Cat();

     // all classes extend object.class. Inherit all methods from object.class
     System.out.println(new Cat().toString());//"I am a cat"
     System.out.println(new Dog().toString());//"Dog@6d03e736"

     Cat c1 = new Cat();
     System.out.println(c1.hashCode());//geberate an int value by object reference ->1452126962
     Cat c2 = new Cat();
     System.out.println(c2.hashCode());//931919113

     String x1 = new String("abc");
     String x2 = new String("abc");
     System.out.println(x1.hashCode());//96354
     System.out.println(x2.hashCode());//96354 Same? Because author of String already override 

     MiniCat c3 = new MiniCat("John","Red");
     System.out.println(c3.hashCode());//71833703
     MiniCat c4 = new MiniCat("John","Red");
     System.out.println(c4.hashCode());//71833703
     MiniCat c5 = new MiniCat("Peter","Red");
     System.out.println(c5.hashCode());//-1907720250
    // we can use hashCode to check is the 2 MiniCat are the same with same attribute 
    //because the original hashCode() was override in Cat.java
  }

  Object cat = new Cat();
  //Error: cat.run(); // -> cat (object reference) indeed point to car object
  // However, the run instance method can only be called by object decleared by Cat.class
  // if the object reference is decleard by object.class, it cannot call run() method as object.class do not have run() method
  //雖然 object reference "cat" 指住左 cat object. 但是cat 係用object.class 去declear。因為 object.class 無 run() method。所以call 唔到
  Cat cat4 = (Cat) cat;
  //cat4.run();
  // cat4 call 到run() method 因為cat4 係declear 為Cat.class
  
  
  Object cat2 = new Dog();
  Cat cat3 = (Cat) cat2; // cat2 is a dog object. why declear cat3 is no compile error. For Java, it only check with relation between cat/dog and object
  //Compile error: Cat cat4 = cat2; 
  //cat 2 is a Object.class which is higher than Cat.class 
  //So we cannot assign a higher class to lower class like assing double to a integer.

  // Java: Ensure Type Safty during compile time
  // public static Object sum(Object x, Object y){
  // return x+y; // "+" is only operate in String, Integer, int, Double etc...
  // because java is a language which strong in type. 
  // Because object class can be anything but some of the anything can not work with "+"
  //}
  public static int length1(String x){
    return x.length();
  }

  //Error: public static int length2 (Object x){
  //   return x.length():
  // }
}