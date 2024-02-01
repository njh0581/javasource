package loop;

public class ForEx4 {

  public static void main(String[] args) {
    //5행 10열의 별(
    /* int t = 1;
     * i < 6
     * int j = 1
     * j <11
     * System.out.print("*");
     * j++
     * j<11
     * System.out.print("*");
     * j++
     * ....
     * j== 11 안족 for문 종료
     * System.out.println();
     * 바깥쪽 for i++
     * i < 6
     * 안쪽 for 10번 수행
     * 바깥쪽 for문이 참일때까지 반복수행
     */

    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 11; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
