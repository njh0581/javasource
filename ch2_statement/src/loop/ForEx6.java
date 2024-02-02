package loop;

public class ForEx6 {

  public static void main(String[] args) {
    //1~100 까지 숫자중에서 3의 배수만 더하기
    int sum = 0;
    for (int i = 1; i < 101; i++) {
      if (1 % 3 == 0) {
        sum += i;
      }
    }
    System.out.println("합" + sum);
  }
}
