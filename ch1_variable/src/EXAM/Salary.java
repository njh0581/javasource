package EXAM;

import java.util.Scanner;

public class Salary {

  public static void main(String[] args) {
    //10년 저축 금액
    Scanner sc = new Scanner(System.in);

    System.out.print("월급 입력");
    int salary = sc.nextInt();
    System.out.printf("10년 저축금액 %d", salary * 120);
    //int deposit = salary *12 *10;
    //System.out.println("10년 저축 금액 "+deposit);
  }
}
