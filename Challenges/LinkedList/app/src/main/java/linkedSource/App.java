package linkedSource;

import types.LinkedList;

public class App {
  private static final LinkedList<Integer> list = new LinkedList<>();
  private static final LinkedList<String> list2 = new LinkedList<>();
  public static void main(String[] args) {
    System.out.println("Type of linked list is integer");
    list.add(1);
    list.add(2);
    list.add(3);
    list.insert(4);
    list.insert(5);
    list.insert(6);
    System.out.println("If value is include at linked list!! \uD83E\uDD14 " + list.includes(15));
    System.out.println(list);
  }
}
