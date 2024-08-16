import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
    public static void main(String[] args)  {
        Swimable p = new Swimable() {
            @Override
            public void swim(){
                System.out.println("I am swimming");
            }
        };
        p.swim();


        // Lambda expression
        // The reason that we can use "() -> implementation" is that interface contains one abstract method only.
        Swimable person = () -> System.out.println("I am swimming ...");
        System.out.println(person.toString()); //DemoLambda$$Lambda$1/0x0000029e81000400@3a71f4dd
        person.swim();

        person = () -> System.out.println("I am swimming !!!!!"); //
        System.out.println(person.toString()); //DemoLambda$$Lambda$2/0x0000029e81001800@85ede7b
        person.swim();

        Calculator sumCalculator = (a,b) -> a+b;
        System.out.println(sumCalculator.calculate(10,3)); //13

        Calculator multiplyCalculator = (a,b) -> a*b;
        System.out.println(multiplyCalculator.calculate(10,3)); //30

        // 1. More than one line of implementation
        // Then you have to use "return keyword withing the implementation block"
        // 2. if there is only one parameter, the you don't have to use (x), you can sinply use x
        Drivable father = x -> {
            if (x>65)
                return false;
            return true;
        };
        System.out.println(father.drive(66));//false
        System.out.println(father.drive(65));//true

        //for loop
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("def");

        //for-each loop
        String t = "";
        for (String s : strings){
            System.out.println(s);
            t += s;
        }

        System.out.println("t=" +t);


        //Lambda forEach
        strings.forEach(s -> System.out.println(s));
        strings.forEach(s -> {
            int x= 3;
            if (x>3) {
                System.out.println("hello");
            }
            else { 
                System.out.println(s+"1");
            }
            //t += s; // compile error

        });
        // Function.class
        // public interface Function<T,R>
        // R applt(T t);
        Function<String, Integer> stringLength = str-> 3;
        Function<String, Integer> stringLen = str-> str.length(); //formula
        System.out.println(stringLen.apply("hello")); //5
        System.out.println(stringLen.apply("abc")); //3

        Function <String, Integer> strLen2 = new StringLength();
        System.out.println(strLen2.apply("hello"));// 5
        System.out.println(strLen2.apply("abc"));// 3

        Function<Customer,Integer> nameLength = Customer -> Customer.getName().length();
        Function<Customer,String> greatingMessage = Customer -> {
            return "Hello, "+Customer.getName();
        };
        Customer c1 = new Customer("Peter Wong");
        System.out.println(nameLength.apply(c1));  //10
        System.out.println(greatingMessage.apply(c1)); //Hello, Peter Wong

        BiFunction<String, String, Integer> nameLength2 = (firstName, lastName) -> firstName.length() +lastName.length();
        System.out.println(nameLength2.apply("Peter","Wong"));//9

        System.out.println(getNameLength("Peter", "Wong"));//Static method 9

        nameLength2= (firstName, lastName) -> firstName.length() +lastName.length() +1;
        System.out.println(nameLength2.apply("Peter","Wong"));//10. You can change the formula without new class or method

        //Consumer
        // public interface Consumer<T> {

        //     /**
        //      * Performs this operation on the given argument.
        //      *
        //      * @param t the input argument
        //      */
        //     void accept(T t);
        Consumer<Customer> printCustomerName = Customer -> System.out.println(Customer.getName());
        printCustomerName.accept(new Customer ("Jenny"));

        // public interface BiConsumer<T, U> {

        //     void accept(T t, U u);
        MathOperation operation = MathOperation.MULTIPLY;
        BiConsumer<Integer , Integer> calculate = null;
        switch (operation){
            case SUM:
                calculate = (x,y) -> System.out.println(x+y);
                break;
            case SUBSTRACT:
                calculate = (x,y) -> System.out.println(x-y);
                break;
            case MULTIPLY:
                calculate = (x,y) -> System.out.println(x*y);
                break;
            case DIVIDE:
                calculate = (x,y) -> System.out.println(x/y);
                break;
        }
        calculate.accept(10, 10);//100
        
        Supplier<Integer> markSixNumber = () -> new Random().nextInt(49)+1;
        List<Integer> marksix = new LinkedList<>();
        int ball = -1;
            while (marksix.size() <6){
                ball = markSixNumber.get();
                if (marksix.contains(ball))
                    continue;
                marksix.add(ball);
            }
        System.out.println(marksix);

        Predicate <Customer> isNameTooLong = customer -> customer.getName().length() >5;
        System.out.println(isNameTooLong.test(new Customer("Jenny Wong"))); //true

        BiPredicate <String, Integer> isTooOld = (gender, age) -> (gender.equals("Male") && age>65) || (gender.equals("Female") && age>60);
        System.out.println(isTooOld.test("Female", 59)); //false
        System.out.println(isTooOld.test("Male", 66)); // true

    }
    public static int getNameLength (String firstName, String lastName){
        return firstName.length()+lastName.length();
    }
}
