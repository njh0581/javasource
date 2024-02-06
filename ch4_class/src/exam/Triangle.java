package exam;

public class Triangle {

  //밑변(baseLine) , 높이(height)
  private int baseLine;
  private int height;

  public Triangle() {}

  public Triangle(int baseLine, int height) {
    this.baseLine = baseLine;
    this.height = height;
  }

  //메소드 getArea()
  //밑변 * 높이 / 2
  double getArea() {
    return (baseLine * (double) height) / 2;
  }
}
