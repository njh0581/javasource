package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
        //화면 출력
        int var1 = 35, var2 = 25;
        boolean flag = true;
        System.out.println(var1+", "+var2+", "+flag);
        System.out.printf("var1=%d, var2=%05d, flag=%b\n", var1, var2, flag);
        System.out.println("HELLO");

        float f1 = 3.141592f;
        double d1 = 31.41592f;
        System.out.printf("f1=%.5f\n",f1);
        System.out.printf("d1=%5.3f\n",d1);

        //printf 지시자
        //%d : 10진 정수 형태로 출력
        //%b : boolean 형태로 출력
        //&c : char 형태로 출력
        //%s : string 형태로 출력
        //%f : 부등소수점(float,double) 출력
        //숫자 : 총 자릿수


    }
}
