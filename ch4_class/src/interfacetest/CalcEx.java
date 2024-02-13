package interfacetest;

public class CalcEx {

  public static void main(String[] args) {
    //참조변수가 사용할 수 있는 범위 제한
    CompleteCalc calc = new CompleteCalc();
    System.out.println("calc add " + calc.add(10, 2));
    System.out.println("calc divide " + calc.divide(15, 5));
    System.out.println("calc subtract " + calc.subtract(10, 2));
    System.out.println("calc times " + calc.times(2, 5));
    calc.showInfo();

    Calcurator calc2 = new CompleteCalc();
    System.out.println("calc add " + calc2.add(10, 2));
    System.out.println("calc divide " + calc2.divide(15, 5));
    System.out.println("calc subtract " + calc2.subtract(10, 2));
    System.out.println("calc times " + calc2.times(2, 5));
    //calc2. showInfo();

    Calc calc3 = new CompleteCalc();
    System.out.println("calc add " + calc3.add(10, 2));
    System.out.println("calc divide " + calc3.divide(15, 5));
    System.out.println("calc subtract " + calc3.subtract(10, 2));
    System.out.println("calc times " + calc3.times(2, 5));
    // calc3.showInfo();
  }
}
