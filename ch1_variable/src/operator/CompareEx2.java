package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    //비교 연산자 결과는 true or false로 나옴
    //문자 vs 문자열
    //' ' vs " "
    //'A' "A"
    //대문자로 시작하면 객체타입
    String str1 = "홍길동";
    String str2 = "홍길동";
    String original;
    String str3 = new String(original = "홍길동");
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    //문자열 비교는 equals 사용
    System.out.println(str1.equals(str3));
  }
}
