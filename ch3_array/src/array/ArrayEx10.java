package array;

import java.util.Arrays;

//알고리즘 -정렬
//         선택정렬, 버블정렬
public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 25, 85, 55, 65, 5, 3 };
    // int i = 0, j = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   int min_idx = i;
    //   for (int j = i + 1; j < arr.length; j++) {}
    // }

    // int temp = 0, min = arr[0];

    //자바가 제공하는 sort
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
