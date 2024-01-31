package operator;

//++ = 변수 + 1
//-- = 변수 - 1
public class IncDecEx2 {

  public static void main(String[] args) {
    int x = 10, y = 20;

    x++;
    y++;

    System.out.printf("x=%d, y=%d\n", x, y);

    x--;
    y--;
    System.out.printf("x=%d, y=%d", x, y);
  }
}
