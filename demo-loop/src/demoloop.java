public class demoloop {
  public static void main(String[] args) {
    //int x=3;

    //for loop
    // initialization (varable declaration & assigment; continue criteria ; incremental opration)
    //Step 1: "int i=0"
    //Step 2: check if i<4? Yes
    //Step 3: print hello
    //Step 4: i++ -> i become 1
    //Step 5: check if i<4? Yes
    //Step 6: print hello
    //Step 7: i++ -> i become 2
    //Step 8: check if i<4? Yes
    //Step 9: print hello
    //Step 10: i++ -> i become 3
    //Step 11: check if i<4? Yes
    //Step 12: print hello
    //Step 13: i++ -> i become 4 
    //Step 14: check if i<4? No
    //Step 15: Exit For loop
    for (int i=0 ; i<4 ;i++) { //0,1,2,3
      System.out.println("hello");
    }
    //hello
    //hello
    //hello
    //hello
    
    //y=81
    int y=3;
    for (int i=0; i<3;i++){
      y*=3;
    }
    System.out.println("y="+y);

    // 2
    // 4
    // 6
    for (int i=0; i<7;i++){
      if(i !=0 && i%2 == 0){
        System.out.println(i);
      }
    }
    //  1 + 2 + 3 + ... + 10
    int sum=0;
    for (int i=0; i<11;i++){
      sum += i;
    }
    System.out.println("sum="+sum); //55

    int sum2=0;
    for (int i=0; i<9; i++){
      if (i !=0 && i%2==0){
        sum2 +=i;
      }
    }
    System.out.println("sum2="+sum2); //20
    for (int i=8; i>0; i--){
      if (i%2==0){
        System.out.println(i);
      }
    }
    int k=8;
    for (int i=0; i<9;i++){
      if ((k-i)%2==0 &&(k-i)!=0){
        System.out.println(k-i);
      }
    }
    //break
    for (int i=0;i<10;i++){
      if (i>7){
        break; //exit loop
      }
      System.out.println(i);// main logic
    }
    //0
    //1
    //...
    //7
    int total=0;
    for (int i=0; i<5; i++){
      if (i>3){
        continue; //if i>3 don't run main logic and go to i++
      }
      total+=i;
    }
    System.out.println("Total="+total);//6
  }
}
