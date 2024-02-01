package condition;

//if-else if 처리 대체
public class SwitchEx1 {

  public static void main(String[] args) {
    char ch1 = 'a';
    switch (ch1) {
      case 'a':
        System.out.println("a입니다");
        break;
      case 'b':
        System.out.println("b입니다");
        break;
      default:
        System.out.println("a 도 b 도 아닙니다");
        break;
    }
  }
}
