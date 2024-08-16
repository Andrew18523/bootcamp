public class Account {
  private double balance;

  public Account (){
    this.balance = 0;
  }

  public double getBalance (){
    return this.balance;
  }

  public void setBalance (double balance){
    this.balance = balance;
  }

  public void credit (double amount){
    this.balance +=amount;
  }
  // public void debit (double amount) throws BusinessException{
  //   if (this.balance <= amount)
  //     throw new BusinessException(ErrorCode.INSUFF_BAL); //checked excpetion
  //     //throw new IllegalArgumentException();
  //   this.balance -= amount;
  // }

  public void debit (double amount) throws InssufficientBalanceExcception{
    if (this.balance <= amount)
      throw new InssufficientBalanceExcception();
    this.balance -= amount;
  }

  public static void main(String[] args) throws InssufficientBalanceExcception{ // throw -> JVM. JVM still cannot handle
    Account account = new Account();
    account.credit(100);
    try{
    account.debit(70);
    account.debit(40); //error
    } catch (BusinessException e){
      System.out.println(e.codeWithMessage());
    } finally{
      System.out.println("this is a section to run no matter there is excpetion or not");
    }
    System.out.println(account.getBalance());
  }
}
