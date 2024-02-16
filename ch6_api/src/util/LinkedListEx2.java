package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

  public static void main(String[] args) {
    //ArrayList 와 LinkedList 성능 차이
    ArrayList<String> aList = new ArrayList<>(2000000);
    LinkedList<String> linkedList = new LinkedList<>();

    System.out.println("순차적 추가 비교");
    System.out.println("ArrayList : " + add1(aList));
    System.out.println("LinkedList : " + add1(linkedList));
    System.out.println();

    System.out.println("중간 추가 비교");
    System.out.println("ArrayList : " + add2(aList));
    System.out.println("LinkedList : " + add2(linkedList));
    System.out.println();

    System.out.println("중간 삭제 비교");
    System.out.println("ArrayList : " + remove2(aList));
    System.out.println("LinkedList : " + remove2(linkedList));
    System.out.println();

    System.out.println("순차 삭제 비교");
    System.out.println("ArrayList : " + remove1(aList));
    System.out.println("LinkedList : " + remove1(linkedList));
    System.out.println();
  }

  public static long add1(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
      list.add(i + "");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long add2(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.add(500, "x");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long remove1(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = list.size() - 1; i >= 0; i--) {
      list.remove(i);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long remove2(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.remove(i);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
}
