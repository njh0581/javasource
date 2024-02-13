package inheritance;

//원(circle)은 점(point)이다 => Circle is a Point
//원(circle)은 점(point)을 가지고 있다 => circle has a point

// public class Circle extends Point{
//     //int x;   //원점의 x 좌표
//     //int y;   //원점의 y 좌표
//     int r;   //반지름
// }

// 포함관계(hasa) : 한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를 선언
public class Circle {

  Point p = new Point();
  int r;
}
