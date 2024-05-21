public class demoloop2 {
  public static void main(String[] args) {
    //for (int i=0;;i++){
      //System.out.println("Hello World"); -> no exit condition
    //}

    //for (;;){ //No "Continue" Condition ->no "exit" condition -> infinate loop
      //System.out.println("hello"); 
    //}

    //Label: outerloop (any name) indicate the continue by using label
    outerloop: for (int i=1;i<=3;i++){
      for (int j=1;j<=3;j++){
        if (i==2 && j==2){
          continue outerloop;
        }
        System.out.println("i: "+i+"j: "+j );
      }
    }
  }
}
