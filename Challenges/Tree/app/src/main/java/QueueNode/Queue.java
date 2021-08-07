package QueueNode;

import Node.Node;

public class Queue<T> {
    QueueNode<T> front;
    QueueNode<T> rear;
    int size = 0;

    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        return false;
    }

    public  void enQueue(Node data){
        QueueNode<T> node=new QueueNode(data);
        if(isEmpty()){
            front=node;
            rear=node;
            size++;
        }else{
            QueueNode temp=rear;
            rear=node;
            temp.setNext(node);
            size++;
        }
    }

    public T peek(){
        return (T) front.getData();
    }

    public T dequeue() {

        if(this.front == null){
            System.out.println("The Queue is empty and the zero value indicates not the actual value");
            return null;
        }else{
            QueueNode<T> temp = this.front;
            this.front = this.front.next;
            return (T) temp.getData();
        }
    }

    public void tostring(){
        while(size!=0){
            System.out.print("{"+peek()+"} ->");
            dequeue();
        }
        System.out.print("Null");
        System.out.println();

    }

    public String toString() {
        QueueNode current = front;
        if (current.getData() == null) {
            return "Tree is empty";
        }
        StringBuilder showList = new StringBuilder();
        while (current != null) {
            showList.append("{").append(current.getData()).append("}-> ");
            current = current.getNext();
        }
        return showList.toString();
    }
}