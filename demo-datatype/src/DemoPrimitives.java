public class DemoPrimitives {
  public static void main(String[] args) {
    // number / string (text)
    // number (integers/decimal)
    // int (integer) is a datatype that declaring the type of the value x can be stored.
    int x =3;
    //int y = 3.5; //failed as y cannot store a non-integer 3.5 into y
    int z=-9;
    int total = x+z; //-6
    System.out.println(total);
    // operator + - * /
    total += x; //total = total +x (total = -6 because total = x+z in line 9)
    System.out.println(total);
    total = x/z; // rounddown to nearest integer if not a integer =0
    System.out.println(total);
    total = x+x/z; //3+0=3
    System.out.println(total);
    total = x+x*z; //3+3*-9 = 3+-27=-24
    System.out.println(total);
  }
}
