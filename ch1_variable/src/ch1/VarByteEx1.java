package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        //타입(자료형) 변수명(소문자로 시작/두 개의 단어가 합해진 변수명은 두번째 단어 시작을 대문자로 함)
        //1. 정수형 - byte(1byte), short(2byte), int(4byte), long(8byte)
        byte age = 10, maxSpeed = 10;
        short age1 = 10, maxSpeed1 = 10;
        int age2 = 15, maxSpeed2 = 20;
        long age3 = 123456789, maxSpeed3 = 1000000000000L;

        age = 33;
        //age = 128;

        System.out.println(age + " , " + maxSpeed);
        System.out.println("나이 : " + age1 + ", 최고속도 : " + maxSpeed1);
        System.out.println("나이 : " + age2 + ", 최고속도 : " + maxSpeed2);
        System.out.println("나이 : " + age3 + ", 최고속도 : " + maxSpeed3);

    }
    
}
