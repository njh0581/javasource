package loop;

/* 제어문 -1) 조건문 2) 반복문
 * 1> 조건문 : 조건에 따라 다음 문장 수행 여부 결정
 * if switch
 *
 *
 */
public class ForEx1 {

  public static void main(String[] args) {
    // for (int i = 0; 1 < args.length; i++) {
    //   int i = 0; //초기화(제일 처음만 실행)
    //   1 < args.length; //조건식(조건식이 참일 때까지만 반복)
    //   i++; //증감식(반복문을 제어하는 변수의 값을 증가 혹은 감소)
    // }
    // I CAN DO IT 5번 출력
    //System.out.println("I CAN DO IT");

    // 1) int i = 0;
    // 2) i < 5;
    // 3) 반복문 안으로 진입 : syso 실행
    // 4) i++ => i = 1
    // 5) i < 5;
    // 6) 반복만 안으로 진입
    // 7) i++ => i = 2
    // 8) ....
    // 9) i++ => i = 5
    // 10) i < 5 조건이 false 가 되면 반복문은 종료
    for (int i = 0; i < 5; i++) {
      System.out.println("I CAN DO IT");
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
