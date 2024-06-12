public class DemoStringBuilder {
  public static void main(String[] args) {
    String x = "hello"; //slow performance when working on manipulation like concat and replace
    //So we use String for non manipulation work. Use StringBulider for string manipulation


     //"new StringBulider ()" is a constructor
    StringBuilder sb = new StringBuilder("hello"); //fast performance
    sb.append(" world"); // no need sb=sb.append
    System.out.println(sb.toString());

    sb.replace(1, 2, "xx"); 
    System.out.println(sb.toString()); // "hello world"

    sb.setCharAt(4, 'A');
    System.out.println(sb.toString()); // "hxxllo world"

    sb.reverse();
    System.out.println(sb.toString()); // "dlrow oAlxxh"

    sb.insert(3, "XX");
    System.out.println(sb.toString()); //dlrXXow oAlxxh

    sb.deleteCharAt(3);
    System.out.println(sb.toString()); //dlrXow oAlxxh

    String s = sb.substring(1,3);
    System.out.println(s);
    System.out.println(sb.toString());

  }
}
