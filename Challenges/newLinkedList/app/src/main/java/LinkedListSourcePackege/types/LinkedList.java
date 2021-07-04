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
        System.out.println("after if in isert fun");
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