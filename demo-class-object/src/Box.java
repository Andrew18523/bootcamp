import java.util.Arrays;

public class Box {
  //static variable (belongs to class)
  private static String prefix = "apple";

  private String name;

  private String[] strings;

  public Box (){
    this.strings= new String[0];
  }
  public Box (String [] strings){
    this.strings=strings;
  }
  public void setName (String name){
    this.name = Box.prefix.concat("-").concat(name);
  }

  public String getName (){
    return this.name;
  }
  public String[] getString (){
    return this.strings;
  }
  public String toString(){
    return "Box(string= "+Arrays.toString(this.strings)+")";
  }
  public void setString(int index, String s){
    this.strings[index] = s;
  }

  public void addString (String s){
    String [] temp = new String[this.strings.length+1];
    for (int i = 0; i<this.strings.length;i++){
      temp[i] = this.strings[i];
    }
    
    temp [temp.length-1] = s;
    this.strings = temp;
  }
  // revise the arr length
  // remove corresponding String

  public void deleteString (String s){
    int count = 0;
    for (int i = 0; i< this.strings.length;i++){
      if (s.equals(this.strings[i])==true){
        count++;
      }
    }
    String[] temp = new String[count];
    count = 0;
    for (int i = 0; i< this.strings.length;i++){
      if (s.equals(this.strings[i])==false){
        temp[count]=this.strings[i];
        count++;
      }
    }
    this.strings=temp;
  }
  // public void deleteString (String s){
  //   Box temp = new Box();
  //   for (int i = 0 ; i <this.strings.length ; i++){
  //     if (this.strings[i].equals(s)){
  //       continue;
  //     } else {
  //       temp.addString(this.strings[i]);
  //     }
  //   }
  //   this.strings=temp.getString();
  // }


  public static void main(String[] args) {
    Box box = new Box(new String[]{"Hello", "abc"});

    System.out.println(Arrays.toString(box.getString()));//[Hello, abc]
    System.out.println(box);//Box(string= [Hello, abc])
    box.setString(1, "box");
    System.out.println(box);// Box(string= [Hello, box])

    box.addString("def");
    System.out.println(box);// Box(string= [Hello, box, def])

    Box box1 = new Box(); // more convince for user to use
    box1.addString("Hello");
    box1.addString("abc");
    box1.addString("Hello");
    box1.addString("abc");
    System.out.println(box1); // Box(string= [Hello, abc, Hello, abc])
    box1.deleteString("Hello");
    System.out.println(box1);

    System.out.println(Box.prefix);//apple
    Box box2 = new Box();
    box2.setName("Andrew");
    System.out.println(box2.getName());//apple-Andrew


  }
}
