package EXAM;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    // 숫자 입력 받은 후 입력받은 숫자의 n! 계산
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자 입력 >>");
    int num = sc.nextInt();
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    System.out.printf("%d! = %d\n", num, fact);
  }
}
