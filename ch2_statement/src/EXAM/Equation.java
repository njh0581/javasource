package EXAM;

public class Equation {

  public static void main(String[] args) {
    //4x + 5y = 60 모든 해 구하기
    //단, x,y 10이하의 자연수

    for (int x = 1; x < 11; x++) {
      for (int y = 1; y < 11; y++) {
        if (4 * x + 5 * y == 60) {
          System.out.printf("(%d, %d)", x, y);
        }
      }
    }
  }
}
