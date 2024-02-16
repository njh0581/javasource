package util;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

  public static void main(String[] args) {
    List<String> list = new LinkedList<>();

    list.add("사과");
    list.add("배");
    list.add("딸기");
    list.add("바나나");
    for (String string : list) {
      System.out.println(string);
    }
  }
}
