package util;

import java.util.StringTokenizer;

//java.util.StringTokenizer : 긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러 개의 문자열로 분리
//                            구분자는 단 하나의 문자만 사용가능

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";

    StringTokenizer st = new StringTokenizer(str);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
    //기준을 주지 않을경우 스페이스바 한번 기준으로 잘라줌
    // str = "x=100*(200+300)/2";
    // StringTokenizer st2 = new StringTokenizer(str, "+", true);
    // while (st2.hasMoreTokens()) {
    //   System.out.println(st.nextToken());
    // }

    str = "1,김천재,100,100,100|2,박수재,95,85,90|3,이자바,80,90,90";
    StringTokenizer st3 = new StringTokenizer(str, "|");
    while (st3.hasMoreTokens()) {
      String token = st3.nextToken();
      StringTokenizer st4 = new StringTokenizer(token, ",");
      while (st3.hasMoreTokens()) {
        System.out.println(st3.nextToken());
      }
      System.out.println("===========================");
    }
  }
}
