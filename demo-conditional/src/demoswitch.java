public class demoswitch {
  public static void main(String[] args){
    char grade ='B';
    //check grade 'B'
    switch (grade) {
      case 'A':
        System.out.println("THE GARDE IS " +grade);
        break;// break the switch statement
      case 'B':
        System.out.println("THE GARDE IS " +grade);
        break;// break the switch statement
      case 'C':
        System.out.println("THE GARDE IS " +grade);
        break;// break the switch statement
      default:
        System.out.println("No grade"); 

    }
    if (grade=='A' ||grade=='B'||grade=='C'){
      System.out.println("THE GARDE IS " +grade);
    } else {
      System.out.println("No grade");
    }
    int x =0;
    switch (grade) {
      case 'A'://B=char(65) and A=char(64) so x+=10 will not active
        x +=10;
      case 'B':
        x +=10;
      case 'C':
        x +=10;
      default:
        x +=10; 
    System.out.println(x); //30
    }
  }
}
