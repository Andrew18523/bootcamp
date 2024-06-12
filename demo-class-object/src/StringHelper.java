public class StringHelper {

  private String str; // attribute

  public StringHelper (String str){
    this.str = str;
  }

  public int length(){
    return str.length();
  }
  public StringHelper setCharAt (int index, char ch ){
    String temp = "";
    for (int i = 0; i<this.str.length(); i++){
      if (i != index)
        temp += this.str.charAt(i);
      else 
        temp += ch;
    }
    this.str = temp;
    return this;
  }

  public String toString(){
    return this.str;
  }
  public StringHelper append(String s){ //return StringHelper. it allow to write chain method in main
    this.str +=s;
    return this;
  }

  public String subString(int startIdx, int endIdx){
    String temp = new String("");
    for (int i = startIdx; i<endIdx;i++){
      temp += this.str.charAt(i);
    }
    return temp;
  }



  public static void main(String[] args) {
    StringHelper sh = new StringHelper("hello");
    sh.setCharAt(3, 'a');
    System.out.println(sh.toString());
    sh.append("world");
    System.out.println(sh.toString());//helaoworld

    sh.append("!!!").append("I am someone.").setCharAt(10, '#').setCharAt(11, '#');// chain method //helaoworld##!I am someone.
    System.out.println(sh.toString());

    "hello".charAt(1); // nothing

    System.out.println(sh.subString(2, 5)); //lao

  }
}
