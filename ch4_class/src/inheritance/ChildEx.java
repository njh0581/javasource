package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    // 부모, 자식 인스턴스 생성 가능
    Parent patent = new Parent(15);
    Child child = new Child(20);
    Child2 child2 = new Child2(25);
    GrandChild grandChild = new GrandChild(30);

    System.out.println("부모의 멤버변수 " + patent.getAge());
    System.out.println("부모가 물려준 멤버 변수 child" + child.getAge());
    System.out.println("부모가 물려준 멤버 변수 child2" + child2.getAge());
    System.out.println("child 멤버 메소드 ");
    child.play();
    System.out.println("Parent가 물려준 멤버 변수 " + grandChild.getAge());
    grandChild.play(); // child 가 물려준 멤버 메소드
  }
}
