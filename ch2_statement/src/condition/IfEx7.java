package condition;

import java.util.Scanner;

public class IfEx7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("월을 입력하세요");
    int month = sc.nextInt();
    if (month == 3 || month == 4 || month == 5) {
      System.out.println("현재 계절은 봄입니다.");
    } else if (month == 6 || month == 7 || month == 8) {
      System.out.println("현재 계절은 여름입니다.");
    } else if (month == 9 || month == 10 || month == 11) {
      System.out.println("현재 계절은 가을입니다.");
    } else if (month == 12 || month == 1 || month == 2) {
      System.out.println("현재 계절은 겨울입니다.");
    }
  }
}
