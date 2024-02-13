package inheritance;

//상속 : 기존의 클래스를 재사용하여 새로운 클래스 작성
//       적은양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리하기 때문에 코드의 추가및
//       변경이 용이함 => 코드의 재사용성 증가 및 중복 제거
//       자손 클래스는 조상 클래스의 모든 멤버를 상속 받음
//       생성자와 초기화 블럭은 상속되지 않음
//
// Parent : 부모 클래스, 상위(suoer) 클래스, base 클래스
// Child : 자식 클래스, 하위(sub)클래스, 파생 클래스
public class Child extends Parent {

  public Child(int age) {
    super(age);
  }

  void play() {
    System.out.println("play!!!");
  }
}
