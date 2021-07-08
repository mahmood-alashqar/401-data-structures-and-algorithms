package Stack_QueuePackege;
import Nodes.Node;
public class Stack<T> {
    private Node top;
    private int size=0;

    public boolean isEmpty(){
        if(top ==null){
            return true;
        }
        return false;
    }
    public void push(T newData){
        Node newNode = new Node<>(newData);
        if(isEmpty()){
            top =newNode;
            size++;
        }
        else{
            Node temp = top;
            newNode.setNext(temp);
            top = newNode;
           size++;
        }
    }
    public T peek(){
        return (T) top.getData();
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("your list is empty");
        }
        else{
            Node temp= top;
            top = top.next;
            temp.setNext(null);
            size--;
        }
    }
    public void tostring(){
        while (size!=0){
            System.out.print("{"+peek()+"} => ");
            pop();
        }
        System.out.print("Button");
        System.out.println("");
    }

}
