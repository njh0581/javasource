package array;

import java.util.Arrays;

public class ArrayEx8 {

  public static void main(String[] args) {
    //45개의 정수값을 저장하기 위한 배열 생성
    int numArr[] = new int[45];
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i + 1;
    }
    System.out.println(Arrays.toString(numArr));
    int temp;
    //i : 자리를 바꿀 대상 위치번호
    for (int i = 0; i < 6; i++) {
      //무작위 숫자 0~44
      int num = (int) (Math.random() * 45);

      temp = numArr[i];
      numArr[i] = numArr[num];
      numArr[num] = temp;
    }
    System.out.println(Arrays.toString(numArr));
  }
}
