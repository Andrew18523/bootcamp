public class BusinessException extends Exception { 
  //implies this is checked exception
  private int code;

  public int getErrorcode(){
    return this.code;
  }
  // public BusinessException (int errorcode ,String message){
  //   super(message);
  //   this.errorcode=errorcode;
  // }

  public BusinessException (ErrorCode errorCode){
    super(errorCode.getMessage());
    this.code = errorCode.getCode();
  }

  public String codeWithMessage(){
    return "Error code:" + this.code + " - " + this.getMessage(); 
  }
}
