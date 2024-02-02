package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    //'a','b','c','d' char 1차원 선언,생성
    char chArr[] = { 'a', 'b', 'c', 'd' };
    System.out.println(chArr); //abcd

    int intArr[] = { 78, 88, 9, 86, 55 };
    System.out.println(intArr);
    System.out.println(Arrays.toString(intArr)); // [78, 88, 9, 86, 55]

    //배열복사
    //더 큰 배열 생성 => 기존 배열 새로운 배열 복사
    int temp[] = new int[intArr.length * 2];
    //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    for (int i = 0; i < intArr.length; i++) {
      temp[i] = intArr[i];
    }
    intArr = temp;
    System.out.println("복사 후" + Arrays.toString(intArr));

    //"abc","def","hij","apple"
    String strArr[] = { "abc", "def", "hij", "apple" };
    System.out.println(Arrays.toString(strArr)); //["abc", "def", "hij", "apple"]
  }
}
