package exam2;

public class ColorTV extends TV {

  private int color;

  public ColorTV(int size, int color) {
    super(size);
    this.color = color;
  }

  protected int getColor() {
    return color;
  }

  void printProperty() {
    System.out.println(size + "인치" + color + "컬러");
  }
}
