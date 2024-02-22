package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//java.time.LocalDate : 날짜
//java.time.LocalTime : 시간
//java.time.LocalDataTime :날짜/시간

public class LocalDateEx2 {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();
    System.out.println(today);
    System.out.println("윤년/평년 " + today.isLeapYear());
    System.out.println(now);

    //특정 날짜
    LocalDate birth = LocalDate.of(1950, 11, 23);
    LocalTime birthTIme = LocalTime.of(23, 11, 58);
    //날짜 덧셈
    System.out.println(birth.plusDays(1));
    //날짜 뺄셈
    System.out.println(birth.minusDays(1));

    LocalDateTime date = LocalDateTime.now();
    System.out.println(date); //2024-02-22T15:09:51.028686600
    System.out.println(date.getHour());
    System.out.println(date.getSecond());
    System.out.println(date.getYear());
    System.out.println(date.getMonth());
    System.out.println(date.getMonth().getValue());
    System.out.println(date.getDayOfMonth());
  }
}
