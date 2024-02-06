package exam;

public class CalcEx {

  public static void main(String[] args) {
    //객체 생성
    Calc calc = new Calc();
    int result = calc.add(100, 20);
    System.out.println("덧셈 결과 " + result);

    System.out.println("곱셉 결과 " + calc.multiply(5, 6));

    result = calc.divide(10, 2);
    System.out.println("나눗셈 결과 " + result);
  }
}
