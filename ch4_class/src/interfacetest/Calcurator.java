package interfacetest;

public abstract class Calcurator implements Calc {

  //times ,divide 추상메소드

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int subtract(int num1, int num2) {
    return num1 - num2;
  }
}
