public class demooperator {
  public static void main(String[] args){
    int x = 3;
    x = x+1; //4
    System.out.println("x=" + x); //String + int -> String

    x++; // same as x=x+1
    System.out.println("x=" + x);
    x += 1; //same as x=x+1
    System.out.println("x=" + x);
    x += 2; //same as x=x+2
    System.out.println("x=" + x);
    ++x ; //same as x=x+1
    System.out.println("x=" +x);

    int y=4;
    y=y-1;
    y--;
    --y;
    y-=1;
    System.out.println(y);

    // *= , /=
    int p=4;
    p = p*2;
    p*= 2;
    p /=4;
    System.out.println(p);

    int z =10;
    z= z %3; //1
    int j =10;
    j %= 3; //1
    System.out.println("z=" + z +", j=" +j);

    String s = "hello";
    s= s + " world";
    s += "!!!";
    System.out.println("s=" + s);

    // >, < ,<=, >=
    boolean r1 = 10>3;
    boolean r2 = 4 >10;
    boolean r3 = 10 >= 10;
    boolean r4 = -9 <= 9;

    // and && or (||)
    boolean r5 = 10>3 && 20>= 20;// true&&true = true
    boolean r6 = 10 >3 && 4 <4; //true&&False = false

    boolean r7 = 10>3 || 20>=20; // ture||true = true
    boolean r8 = 10>3 || 3<8; // true||false = true
    boolean r9 = 3<10 || 3<8; //false||false = false

    char c10 = 'A';
    char c11 = 'B';
    boolean r10 = c10 == c11; // false. asking if a value is equals to another value, we use "=="
    boolean r11 = 'C' != 'D'; // ture, asking if 'C' equal to 'D'. which is false
    boolean r12 = 10/2 > 5*3; //false
    
    
    
    int i10 = 10;
    double d10=10.0;
    boolean r100 = i10==d10;
    System.out.println(r100);
  }
}
