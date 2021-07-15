package Stack_QueuePackege;

import Nodes.Node;

public class Queue<T> {
    private Node front;
    private Node rear;
    private int size=0;

    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }

    public void enQueue (T newData){
        Node newNode = new Node<>(newData);
        if(isEmpty()){
            front =newNode;
            rear=newNode;
            size++;
        }else
        {
            Node temp =rear;
            rear=newNode;
            temp.setNext(newNode);
            size++;
        }
    }
    public void dequeue (){
        if(isEmpty()){
        }else
        {
            Node temp = front;
            front=front.getNext();
            temp.setNext(null);
            size--;
        }
    }
    public T peek(){
        return (T) front.getData();
    }
    public void tostring(){
        while (size!=0){
            System.out.print("{"+peek()+"} => ");
            dequeue();
        }
        System.out.print("Button");
        System.out.println("");
    }
}
