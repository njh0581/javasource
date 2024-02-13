package exam2;

public class IPTV extends ColorTV {

  private String IP;

  public IPTV(int size, int color, String iP) {
    super(size, color);
    this.IP = iP;
  }

  protected String IP() {
    return IP;
  }

  void printProperty() {
    System.out.println(
      "나의 IPTV는 " +
      IP +
      " 주소의 " +
      getSize() +
      "인치" +
      getColor() +
      "컬러"
    );
  }
}
