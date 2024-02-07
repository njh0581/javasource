package exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println(
        "---------------------------------------------------------"
      );
      System.out.println(
        "1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출금 ㅣ 5.종료"
      );
      System.out.println(
        "---------------------------------------------------------"
      );
      System.out.print("메뉴 선택 >> ");
      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();

          break;
        case 5:
          run = false;
          break;
      }
    }
  }

  static void createAccount() {
    System.out.println("INPUT 계좌번호 : ");
    String accountNum = sc.nextLine();
    System.out.println("INPUT 계좌주 이름 : ");
    String owner = sc.nextLine();
    System.out.println("INPUT 잔액 : ");
    int balance = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accountNum, owner, balance);
        System.out.println("계좌가 생성되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] != null) {
        System.out.println(accArr[i]);
      }
    }
  }

  static void deposit() {
    //예금하다
    //계좌번호
    //예금액
    //배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    System.out.println("계좌번호를 입력하세요 : ");
    String accountNum = sc.nextLine();
    System.out.println("예금액을 입력하세요 : ");
    int money = Integer.parseInt(sc.nextLine());
    Account account = findAccount(accountNum);
    // for (Account account : accArr) {
    if (account != null) {
      //     if (account.getAccountNum().equals(accountNum)) {
      System.out.println("현재 잔액 : " + account.deposit(money));
      //         break;
    }
    //     }
    //   }
  }

  static void withdraw() {
    System.out.println("계좌번호를 입력하세요 : ");
    String accountNum = sc.nextLine();
    System.out.println("출금액을 입력하세요 : ");
    int money = Integer.parseInt(sc.nextLine());
    Account account = findAccount(accountNum);
    // for (Account account : accArr) {
    if (account != null) {
      //     if (account.getAccountNum().equals(accountNum)) {
      System.out.println("현재 잔액 : " + account.withdraw(money));
      //       break;
    }
    //   }
    // }
  }

  static Account findAccount(String accountNum) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccountNum().equals(accountNum)) {
          return account;
        }
      }
    }
    return null;
  }
}
