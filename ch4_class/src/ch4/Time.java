package ch4;

//시,분,초는 모두 0보다 크거나 같아야 한다
//시의 범위는 0~23, 분, 초의 범위는 0~59이다

//오버로딩
//하나의 클래스에 동일한 이름으로 존재
//()안에 인자의 개수, 타입이 달라야함

public class Time {

  //멤버변수, 속성, 필드, 인스턴스 변수
  private int hour;
  private int minute;
  private float second;

  //클래스 변수
  private static String max;

  public int getHour() {
    return hour;
  }

  //메소드 내부에 선언된 변수 : 지역변수 : 메소드 종료 소멸
  //for, if => {}내부에 선언된변수는 블럭을 벗어나는경우 소멸
  //인스턴스 변수 : 인스턴스마다 다른값 저장
  //                참조변수가 없을 때 가비지컬렉터에 의해 제거됨
  //                인스턴스 생성시
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (minute < 0 || minute > 59) return;
    this.second = second;
  }
}
