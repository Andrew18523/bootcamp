public class DemoNestedLoop {
  public static void main(String[] args) {
    for (int i=0; i<4 ; i++){
      for (int j=0; j<2;j++){
        System.out.println("hello");
      }
    }
    for (int i=0; i<4 ; i++){
      for (int j=0; j<2;j++){
        System.out.println("hello. "+"i="+i+" j="+j);
      }
    }
    //hello. i=0 j=0
    //hello. i=0 j=1
    //hello. i=1 j=0
    //hello. i=1 j=1
    //hello. i=2 j=0
    //hello. i=2 j=1
    //hello. i=3 j=0
    //hello. i=3 j=1

    //output
    //hello. i=1 j=0
    //hello. i=3 j=0
    for (int i=0; i<4 ; i++){
      if (i%2!=0){
        for (int j=0; j<2;j++){
          if(j%2==0){
            System.out.println("hello. "+"i="+i+" j="+j);
          }
        }
      }
    }
    //Approcah 1:
    for (int i=0; i<4 ; i++){
      for (int j=0; j<2;j++){
        if(i%2==1 && j%2==0){
          System.out.println("hello1. "+"i="+i+" j="+j);
        }
      }
    }
    //Approach 2:
    for (int i=0;i<4;i++){
      if (i%2==0){
        continue;
      }
      for (int j=0;j<2;j++){
        if(j%2 !=0){
          continue;
        }
        System.out.println("hello2. "+"i="+i+" j="+j);
      }
    }

    // 1 -20
    // 1 3 5 7 9 12 14 16 18 20

    for (int i=0;i<21;i++){
      if (i<=10 && i%2==0){
        continue;
      } else if (i>10 && i%2 != 0){
        continue;
      } else {
        System.out.println(i);
      } 
    }

    for (int i=0;i<21;i++){
      if (i<=10 && i%2==1 ||i>10 && i%2 != 1){
        System.out.print(i+" ");
      }
    }
    System.out.println();
    //Searching
    String s= "Vincent Book Game Laptop";//13
    //Find the first index of char'a'
    for (int i=0; i<s.length();i++){
      if(s.charAt(i)=='a'){
        System.out.println("The first index of char'a' is "+i);
        break; // break is exit for loop not if loop
      }
    }
  }
}
