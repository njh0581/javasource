package ch1;

//자동 형(타입)변환 : promotion
//정수형/문자형/실수형/논리형
//타입 변환 강능함 : 작은 타입 => 큰 타입
//연산 시 타입변환이 일어남 : 작은 타임 => 큰 타입
public class PromotionEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        int intValue = v1;
        
        System.out.println("intValue = " +intValue);
        
        short s1 =15;
        intValue = s1;
        System.out.println("intValue = " + intValue);
        
        //float type 이 int 보다 더 정밀한 수를 표현
        //int(4byte) => float(4byte)
        float floatValue = intValue;
        System.out.println("floatValue = " +floatValue);


        char ch1 = 'a';
        intValue = ch1;
        System.out.println("intValue = "+intValue);

        long longValue = intValue;
        System.out.println("longValue = " +longValue);

        double doubleValue = intValue;
        System.out.println("doubleValue = "+doubleValue);

        //int + double
        intValue = 55;
        doubleValue = 98.25d;
        double result = intValue + doubleValue;
        System.out.println("int + double = double 타입으로 변환됨");
        System.out.println(result);

        byte v2 = 15;
        int byteValue = v1 + v2; // 정수를 변수에 담는다면 int 사용
    }
}
