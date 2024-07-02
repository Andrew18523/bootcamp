public class DemoOverriding {
  public static void main(String[] args) {
    //Example 1
    Animal animal = new Cat();
    // complie-time checks the scope of object, but not the implementation.
    animal.walk(); // Cat is walking
    //animal.run(); // compile error because Animal.class has walk() only.

    //During runtime, the new cat object is created in heap memory,
    // then the object ref "animal" will point cat object and execute walk() method.
    // That is Cat.walk() -> Cat is walking

    //Example 2
    Animal animal2= new Animal();
    animal2.walk(); //Animal is walking ...

    //During runtime, the new animal object is created in heap memory,
    // then the object ref "animal2" will point animal object and execute walk() method.
    // That isAnimal.walk() -> Animal is walking

    // Example 3
    animal =new Dog();
    //animal.sleep(); //Error as object reference type determined the scope of the object.
    // animal is a object reference of Animal.class so it can only call the method in Animal.class
    animal.walk(); //Animal is walking ... as Dog.class did not override the walk() method.
  }
}
