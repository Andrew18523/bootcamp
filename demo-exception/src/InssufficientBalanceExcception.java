public class InssufficientBalanceExcception extends BusinessException {
  
  public InssufficientBalanceExcception() {
    super(ErrorCode.INSUFF_BAL);
  }

  // public String codeWithMessage(){
  //   return "Error code:" + ErrorCode.INSUFF_BAL.getCode() + " - " + ErrorCode.INSUFF_BAL.getMessage(); 
  // }
}
