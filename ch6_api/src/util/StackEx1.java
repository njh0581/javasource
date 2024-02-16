package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//stack
//queue
public class StackEx1 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();
    stack.push("0");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
