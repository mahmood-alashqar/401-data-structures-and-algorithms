package LinkedListSourcePackege.types;


import LinkedListSourcePackege.data.Node;
public class LinkedList<T> {


    public Node<T> head;
    public Node<T> currentHead;
    public Node<T> current;
    private int size;
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
        }
        else
        {
            Node<T> currentHead = this.head;
            while (currentHead.getNext() != null) {//pass the current to next node
                currentHead = currentHead.getNext();
            }
            currentHead.setNext(newNode);
        }
        size++;
    }
    public boolean includes(T value){
        Node<T> currentHead = this.head;
        if(size != 0){
            while(currentHead != null){
                if(currentHead.getData() == value){
                    return true;
                }
                currentHead = currentHead.getNext();
            }
        }
        return false;
    }

public void append (T data){
    Node<T> newNode = new Node<>(data);
if (head==null){
    head=newNode;
}
    Node<T> currentHead = this.head;
while(currentHead.getNext() != null){

    currentHead=currentHead.getNext();
}
currentHead.setNext(newNode);
size ++;

}
public void inserBefore(T value,T data){
    Node<T> newNode = new Node<>(data);
    Node<T> currentHead = this.head;

    boolean isValue=includes(value);
    if(isValue){
        while(isValue){
            Node<T> currentHeadSpeedUp = currentHead.getNext();
            if(currentHeadSpeedUp.getData() == value){
                currentHead.setNext(newNode);
                newNode.setNext(currentHeadSpeedUp);
                isValue=false;
            }
            currentHead=currentHead.getNext();

        }
    }

}
    public void inserAfter(T value,T data){
        Node<T> newNode = new Node<>(data);
        Node<T> currentHead = this.head;

        boolean isValue=includes(value);
        if(isValue){
            while(isValue){
                if(currentHead.getData() == value){
                    Node<T> currentHeadSpeedUp = currentHead.getNext();
                    currentHead.setNext(newNode);
                    newNode.setNext(currentHeadSpeedUp);
                    isValue=false;
                }
                currentHead=currentHead.getNext();

            }
        }

    }
        public String tostringg () {

            Node<T> currentHead = this.head;
            if (size == 0) {
                System.out.println("nothing to display your chain is empty!!");
            }
            while (currentHead != null) {
                System.out.print("{" + currentHead.getData() + "} ->");
                currentHead=currentHead.getNext();

            }
            return "NULL";
        }

}