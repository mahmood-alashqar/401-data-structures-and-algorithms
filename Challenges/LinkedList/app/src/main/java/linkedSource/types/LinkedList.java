 
package types;

import data.Node;

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
}
