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

  //출금하다
  //withdraw
  int withdraw(int money) {
    balance = balance - money;
    return balance;
    //return balance -= money;
  }
}
