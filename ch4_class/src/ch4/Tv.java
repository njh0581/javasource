package ch4;

//String : null
//int,long : 0
//float,double : 0,0
//char : ' '
//boolean : false

//클래스 : 설계도
//객체 : 실제 존재

public class Tv {

  //색상(검정,흰색), 전원상태(on,off), 채널(6,7,8,...), 볼륨(11,12,...), 크기(50,65,...), ...
  String color;
  int channel;
  boolean power;

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }
  // 생성자
  // Tv(){}
}
