package exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    //Account 객체를 담을 배열 생성
    Account accArr[] = new Account[3];

    //입력
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < accArr.length; i++) {
      System.out.println("INPUT 계좌번호 : ");
      String accountNum = sc.nextLine();
      System.out.println("INPUT 계좌주 이름 : ");
      String owner = sc.nextLine();
      System.out.println("INPUT 잔액 : ");
      int balance = Integer.parseInt(sc.nextLine());
      accArr[i] = new Account(accountNum, owner, balance);
    }
    for (Account account : accArr) {
      System.out.println(account);
    }
  }
}
