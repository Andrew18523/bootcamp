import java.util.LinkedList;
import java.util.List;

public class Bank {

  public List<Account> accounts;
  private String address;

  public Bank(){
    this.accounts = new LinkedList<>();
  }

  public void add(Account account){
    accounts.add(new Account());
  }

  private static Account Account (double amount){
    return new Account();
  }


  public static class Account{
    private int accNo;
    private static int number =0;
    private double balance;

    public Account(){
      this.accNo  =++number;
    }



    public int getAccNo (){
      return accNo;
    }
    public void credit (double amount){
      this.balance +=amount;
    }
    public void print(){
      //this.address; // you cannot access the outer class intance variabke in static nested class
      // because Account and Bank are not in Parent relationship
    }
  }
}
