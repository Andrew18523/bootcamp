public class DemoString {
  public static void main(String[] args){
    //Primitive "string". Double quote to declear the value of String
    
    String x ="Hello";
    String y =" Wrold";
    System.out.println(x);
    System.out.println(x+y);

    //Primitive "int"
    // reminder
    int reminder = 10 % 3; //1
    int divide = 10 / 3;  //3
    System.out.println(reminder);
    System.out.println(divide);
    
    //10 May 2024
    //Primitive "double"
    double d1 = 10.3;
    double d2 = 10.34567;
    double d3 = -110.999;
    double result2= d1+d2 -d3;
    System.out.println(result2); 
    // double 去做加減乘除會有問題
    //e.g.
    double result3= 0.1+0.2;
    System.out.println(result3);  // rosult3 =0.30000000000000004
    double result4 = 2+ 4*0.25 *3 /2 -10;
    System.out.println(result4); // 2 + ((4*0.25*3)/2)-10 = -6.5
    int f1 =7;
    double f2 = 8.8;
    //int f3 = f1+f2; will result error as "int (7) + double (8.8)" will convert to "double(7.0) + double(8.8)"
    //which result must be double(15.8). However f3 (integer) is a int which result a error.
    int g = 10/3; // =3 which there in not a error because int (10) / int (3) which the result can be int (3) as no conversation of int to double.
    
    //Primitive "char" single quote to declear a char value. 
    char c1 = '!';
    char c2 = ' ';
    //char c3 = ''; is a error as char must contain a char value
    //char c4 = 'aa'; error

    //Primitive: boolean true/false
    //boolean b1="true"; no need double quote to qutoe true or false
    boolean b2 = true;
    boolean b3 = false;

    // Primitives for integer
    // int, long, byte, short
    byte y1 = 1;
    //byte can store the integer from -128 to 127
    byte y2 = -128;
    byte y3 = 127;
    // byte y4=128; //complle error (java can identify syntax error)
    // short s1 =32; // can store from -32768 to 32767
    // int from -2,147,483,647 to 2,147,483,647
    long L1 = -9223372036854775808L; // to 9,223,372,036,854,775,807
    // L must in the last char to indicate it is a long integer

    // Primitives for number with decimal
    double d10 = 10.2;
    float f10 = 10.2f;
    // float is a datatype which is lower than double. So you cannot assign a double(10.2) to a float (f10)
    // use f is the back to specify the value is a float value

    float resultf11 = 10.5f +10.5;
    double d11 = 99.99d; // same as double d11 = 99.99;

    double d12; // variable declaration
    d12 = 10.0; // value assigment
    double d13 = 11.0; //variable declaration and value assigment
    d13 = 19.0; // reassigement
    // double 13 = 19.0; you cannot redeclaer the declared variable again

    //Local Variable -> variable that in the main. you can only declear the variable once
  }
}
