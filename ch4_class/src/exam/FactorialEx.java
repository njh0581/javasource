package exam;

public class FactorialEx {

  public static void main(String[] args) {
    System.out.println(factorial(4));
  }

  //재귀호출 : 메소드 자신을 호출
  static int factorial(int n) {
    int result = 0;
    if (n == 1) result = 1; else result = n * factorial(n - 1);

    return result;
  }
}
