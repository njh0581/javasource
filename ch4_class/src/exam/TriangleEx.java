package exam;

public class TriangleEx {

  public static void main(String[] args) {
    Triangle triangle = new Triangle(11, 5);

    double getArea = triangle.getArea();
    System.out.println("넓이 " + getArea);
    // System.out.println("삼각형의 넓이 : " + triangle.getArea());
  }
}
