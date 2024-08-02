public class DemoDivideByZero {
  public static void main(String[] args) {
    int amount = 0;
    System.out.println(divide(10, 3)); //3
    //Error:System.out.println(divide(10, amount)); //Exception
    //java.lang.ArithmeticException: / by zero
    // Approach 1:
    if (amount == 0){
      System.out.println(0);
    } else {
      System.out.println(divide(10, amount));
    }

    // Approcah 2: Handle Exception
    // Unchecked Exception (Runtime Exception) - Implicitly

    try {
      divide(10, amount); //divided by zero -> error -> catch immediatly
      // Lines of code
      String s ="hello";
      s=null;
      System.out.println(s.charAt(2)); //NullPointer Exception but it do not run as line 18 direct to line 23
    } catch (ArithmeticException e){
      //You can define your action like send email ....
      System.out.println("Hello! Divided by Zero:" + 10 +"/"+ amount);
    } catch (NullPointerException e){
      System.out.println("NPE: Please check");
    }

    try {
      divide(10, 2);
      // Lines of code
      String s ="hello";
      s=null;
      System.out.println(s.charAt(2)); //NullPointer Exception
    } catch (ArithmeticException e){
        //You can define your action like send email ....
        System.out.println("Hello! Divided by Zero:" + 10 +"/"+ amount);
    } catch (NullPointerException e){
        System.out.println("NPE: Please check");
    }

    // return int
    // throw ArithmeticException (Implicitly)

    double expense = CalculateExpensePerEmpolyee();
    System.out.println(expense);

    try {
      double expense2 = CalculateExpensePerEmpolyee2();
      System.out.println(expense2);
    } catch (ArithmeticException e){
      System.out.println("something to fix...");
    }
    try {
      double expense3 = CalculateExpensePerEmpolyee3();
      System.out.println(expense3);
    } catch (EmployeeCountZeroException e){
      //speific handling for the exception;
    }

  }
  public static int divide (int x, int y){
    return x/y;
  }
  
  //Approach 1
  public static int CalculateExpensePerEmpolyee(){
    try {
      return getDepartmentExpense()/getEmpolyeeCount(); //bug
    } catch (ArithmeticException e ){
      return getDepartmentExpense(); // fix
    }
  }

  //Approach 2 
  // When a method throw unchecked exception without handling, the exception will be throw back to caller.
  public static int CalculateExpensePerEmpolyee2(){
    return getDepartmentExpense()/getEmpolyeeCount(); //bug
  }

  //Approach 3
  public static int CalculateExpensePerEmpolyee3(){
    try {
    return getDepartmentExpense()/getEmpolyeeCount();//bug
    } catch (ArithmeticException e) {
      throw new EmployeeCountZeroException();
    }
  }

  public static int getEmpolyeeCount(){
    return 0;
  }

  public static int getDepartmentExpense(){
    return 140000;
  }
}
