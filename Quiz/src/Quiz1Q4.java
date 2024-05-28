public class Quiz1Q4 {
  public static void main(String[] args) {
    String s ="hello";
    String newStr = "";

    if (s.length()<5 || s.indexOf("he")==1){
      newStr =s;
    } else {
      newStr +="str";
    }
    System.out.println(newStr);
  }
}
