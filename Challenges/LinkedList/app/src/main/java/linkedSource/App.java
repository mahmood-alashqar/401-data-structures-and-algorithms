package linkedSource;

import types.LinkedList;

public class App {
  private static final LinkedList<Integer> list = new LinkedList<>();
  private static final LinkedList<Integer> list2 = new LinkedList<>();
  public static void main(String[] args) {
    System.out.println("Type of linked list is integer");
    list.add(1);
    list.add(2);
    list.add(3);
    list.insert(4);
    list.insert(5);
    list.insert(6);
    System.out.println("If value is include at linked list!! \uD83E\uDD14 " + list.includes(15));
    list.insertBefore(2 , 0);
    list.insertAfter(5 , -10);
    System.out.println("the kth is " + list.kthFromEnd(6));
    System.out.println("The Size of the list is  "+ list.getSize());
    System.out.println(list);
    list2.insert(4);
    list2.insert(4);
    list2.insert(1);
    list2.insert(5);
    list2.insert(1);
    list2.insert(4);
    list2.insert(4);
//    System.out.println("Ziped  List = "+ list.getzipLists(list , list2));
//    System.out.println( list2.palandrome(list2));
//    System.out.println( list2.reverseLinkedList(list2));
  }

}
