 
package types;

import data.Node;

import java.util.ArrayList;

public class LinkedList<T> {
  private Node<T> head;
  private int size;

  public void add(T data){
    Node<T> node = new Node<>(data);
    if(head == null) {
      head = node;
      return;
    }
    Node<T> current = this.head;
    while (current.getNext() != null){
      current = current.getNext();
    }
    current.setNext(node);
    size++;
  }

  public void insert(T data){
    Node<T> node = new Node<>(data);
    if(this.head == null){
      this.head = node;
    } else {
      Node<T> current = this.head;
      while (current.getNext() != null){
        current=current.getNext();
      }
      current.setNext(node);
    }
    size++;
  }

  public boolean includes(T value){
    Node<T> current = this.head;
    if(size != 0){
      while(current != null){
        if(current.getData() == value){
          return true;
        }
        current = current.getNext();
      }
    }
    return false;
  }

  public String toString(){
    Node<T> current = this.head;
    if (current == null) {
      return "Linked list is empty";
    }
    StringBuilder showList = new StringBuilder();
    while(current != null){
      if(!showList.toString().equals("")){
        showList.append("-> {").append(current.getData()).append("}");
      }else {
        showList.append("{").append(current.getData()).append("}");
      }
      current = current.getNext();
    }
    showList.append("-> NULL");
    return showList.toString();
  }
  public void insertBefore(T data , T newData){
    Node<T> node = new Node<T>(newData);
    if(head.getData() == data)
    {
      Node<T> node2 = new Node<T>(data);
      node2.setNext(head.getNext());
      head = node ;
      head.setNext(node2);
      size++;
      return;
    }
    else {
      Node<T> currentHead = head ;
      while (currentHead.getNext().getData() != data) {
        currentHead = currentHead.getNext();
      }
      Node<T> node2 = currentHead.getNext() ;
      node.setNext(node2);
      currentHead.setNext(node);
      size++;
    }

  }

  public void insertAfter(T data , T newData) {
    Node<T> node = new Node<T>(newData);
    Node<T> currentHead = head ;
    while (currentHead.getData() != data) {
      currentHead = currentHead.getNext();
    }
    node.setNext(currentHead.getNext());
    currentHead.setNext(node);
    size++;
  }

  public T kthFromEnd(int data){
    Node<T> currentHead = this.head ;
    for(int i = 1 ; i < (this.size - data) ; i++ ){
      currentHead = currentHead.getNext();
    }
    return (this.size - data) < 1 ? (T)"Exception":currentHead.getData() ;
  }
  public int getSize(){
    return size;
  }
  public  static LinkedList<Integer> getzipLists(LinkedList<Integer> list1 , LinkedList<Integer> list2){
    LinkedList<Integer> zipLinkedList = new LinkedList<Integer>() ;
    int biggerLength = list1.getSize() >= list2.getSize() ? list1.getSize() : list2.getSize() ;
    for(int i = 1 ; i<=biggerLength ; i++){
      if(list1.getSize()-i >= 0) {
        zipLinkedList.add(list1.kthFromEnd(list1.getSize() - i));
      }
      if(list2.getSize()-i >= 0)
      {
        zipLinkedList.add(list2.kthFromEnd(list2.getSize() - i));
      }
    }
    return zipLinkedList ;
  }


  public LinkedList<T> reverseLinkedList(LinkedList<T> theChain){
//    Node<T> currentTail = this.head ;
//
//    int i=0;
//    while (getSize()>i){
//      currentTail=currentTail.getNext();
//      if(currentTail.getNext()==null){
//    this.head.setNext(head.getData());
//    this.head.setData(currentTail.getData());
//    currentTail=this.head;
//        i++;
//
//
//      }
//
//    }
//return theChain;
    Node<T> next = null ;
    Node<T> previous = null;

    while(head.getNext() != null){
      next = head.getNext();//move next to next address
      head.setNext(previous);   //previous node will be the next node for head, so that head will point reverse
      previous = head; //incrementing previous to the current node
      head = next; //incrementing head

    }
    //at this point head points to last node and previous has the remaining reversed array
    head.next = previous;
    return theChain;
  }
  public boolean palandrome(LinkedList<T> p){
    ArrayList<T> t = new ArrayList<>();
    Node<T> curr = p.head;
    while (curr != null){
      t.add(curr.getData());
      curr = curr.next;
    }

    System.out.println(t.get(3) );
    if(t.size()%2==0) {
      for (int i = 0; i < t.size() - 1; i++) {

        for (int j = t.size() - 1; j > 0; j--) {

          if (t.get(i) == t.get(j)) {
            System.out.println("first if");
            i++;

            continue;

          } else {
            i++;

            return false;
          }
        }
      }

    }
    else{
      t.remove(size/2);
      for (int i = 0; i < t.size() - 1; i++) {

        for (int j = t.size() - 1; j > 0; j--) {

          if (t.get(i) == t.get(j)) {
            System.out.println("first if");
            i++;

            continue;

          } else {
            i++;

            return false;
          }
        }
      }
    }
    return true;
  }
}
