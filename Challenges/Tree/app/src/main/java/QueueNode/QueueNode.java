package QueueNode;

import Node.Node;

public class QueueNode<T> extends Node {
    public QueueNode<T> next;
    private final
    T data;
    public QueueNode(T data) {
        super();
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public QueueNode<T> getNext() {
        return next;
    }
    public void setNext(QueueNode<T> next) {
        this.next = next;
    }
}
