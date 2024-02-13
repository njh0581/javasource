package interfacetest;

//interface
//모든 멤버 변수는 public static final 이어야 함
//모든 멤버 메소드는 public abstract임(abstract 생략 가능)
//추상화가 높은 상태(기본설계도)
//body를 가진 메소드는 static , default만 가능(1.8버전에서 추가)
//여러개 구현 가능
//public class Bonus implements Account, CheckingAccount
//public class Bonus extends CreditLine implements Account, CheckingAccount

public interface Account {
  //accountNo; only public, static & final
  //private String accountNo; 멤버변수 선언 불가

  public static final int SPADE = 4; //상수

  //Abstract methods do not specify a body
  public void deposit();

  static void getCardKind() {}

  default void getCard() {}
}
