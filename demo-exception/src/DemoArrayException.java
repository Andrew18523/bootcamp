import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayException {
  public static void main(String[] args) {
    int [] arr = new int[5];
    arr[0]=0;
    arr[1]=1;
    arr[2]=2;
    arr[3]=3;
    arr[4]=4;
    //Error: arr[5]=1; // java.lang.ArrayIndexOutOfBoundsException

    int idx = 0;
    if (idx >=0 && idx < arr.length){
      arr[idx] = 10;
    }

    try {
      arr[5] = 1;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("end of program");
    }
    String str ="hello";
    str.charAt(1); //e
    //Error: str.charAt(str.length()); //java.lang.StringIndexOutOfBoundsException String Underlying DS is char array
    //Error str.substring(0,6); //java.lang.StringIndexOutOfBoundsException

    int result = Integer.parseInt("1");
    System.out.println(result);

    int result2;
    try {
    result2 = Integer.parseInt("hello");//java.lang.NumberFormatException
    } catch (NumberFormatException e) {
      result2 =-1;
      System.out.println("NumberFormatException. Message:" + e.getMessage());
    }
    System.out.println(result2);

    System.out.println(getDescreption(18));// audit
    int age = -1;
    try {
      getDescreption(age);
    } catch (IllegalArgumentException e){
      System.out.println(e.getMessage()); //Age should not be negative
    }

    List<String> strings =new ArrayList<>(); //arr[0]
    //Error: strings.get(0); //java.lang.IndexOutOfBoundsException
    
    List<String> string2 = new LinkedList<>(); 
    //Error: string2.get(0); //java.lang.IndexOutOfBoundsException
  }

  public static String getDescreption (int age){
    if (age<0)
      throw new IllegalArgumentException("Age should not be negative"); // invalid parameter
    if (age>=66)
    return "Elderly";
    if (age>=18)
      return "Audit";
    return "Children";
  }
}
