package thread;

//Thread (쓰레드)
// 프로세스 : 실행중인 프로그램(os 로부터 실행에 필요한 자원(메모리)을 할당받아 실행)
// 프로세스 : 프로그램을 수행하는 데 필요한 데이터 + 자원 + 쓰레드(실제로 작업을 수행)
// 모든 프로세스는 최소한 하나 이상의 쓰레드가 존재 => 둘 이상의 쓰레드를 가진 프로세스를 멀티쓰레드 프로세스

// 멀티 쓰레드 구현
// 1) Runnable 구현하는 클래스 작성
//    - run() 오버라이딩
//    -
// 2) Thread 상속받는 클래스 작성
public class BigLetters3 {

  public static void main(String[] args) {
    //익명 구현 : 1회성
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i <= 100; i++) {
          System.out.print(i + " ");
        }
      }
    };
    Thread t = new Thread(r);
    t.start(); //thread 실행

    Thread t2 = new SmallLetters2();
    t2.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
