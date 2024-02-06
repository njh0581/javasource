package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("657-043563-01-015", "홍길동", 10000);

    System.out.println("예금후 잔액 : " + account.deposit(10000));

    System.out.println("출금후 잔액 : " + account.withdraw(20000));
  }
}
