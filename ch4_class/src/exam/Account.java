package exam;

public class Account {

  //계좌번호(1234-12-12354), 계좌주 이름(홍길동), 잔액(100000)
  private String accountNum;
  private String owner;
  private int balance;

  public Account() {}

  public Account(String accountNum, String owner, int balance) {
    this.accountNum = accountNum;
    this.owner = owner;
    this.balance = balance;
  }

  //예금하다
  //doposit
  int deposit(int money) {
    balance = balance + money;
    return balance;
    //return balance += money;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  //출금하다
  //withdraw
  int withdraw(int money) {
    balance = balance - money;
    return balance;
    //return balance -= money;
  }

  @Override
  public String toString() {
    return (
      "Account [accountNum=" +
      accountNum +
      ", owner=" +
      owner +
      ", balance=" +
      balance +
      "]"
    );
  }
}
