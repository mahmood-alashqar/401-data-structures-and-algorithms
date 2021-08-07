package Tree;


import Node.Node;

import java.util.ArrayList;
import java.util.Stack;
import QueueNode.Queue;
import QueueNode.QueueNode;

public class BinaryTree<T> {
    private Node root;
//    Stack stack =new Stack();
    ArrayList arrayListInOrder = new ArrayList();
    ArrayList arrayListPostOrder = new ArrayList();
    ArrayList arrayListPreOrder = new ArrayList();

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.getLeft());
            arrayListInOrder.add(node.getKey());
            inOrder(node.getRight());
        }

    }
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            arrayListPostOrder.add(node.getKey());
        }
    }

    public void preOrder(Node node){
        if(node != null){
            arrayListPreOrder.add(node.getKey());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    public  boolean isEmpty(){
        if (root==null)
            return true;
        else
            return false;
    }
    public int getLeftBT(){
        return root.getLeft().getKey();
    }
    public int getRighBT(){
        return root.getRight().getKey();
    }
    int height(Node node)
    {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }

    private int max = 0;
    public Number findMax(){
        if (getRoot() != null){
            max = (int) getleftRight(root);
        }
        return max;
    }
    private Number getleftRight(Node node){
        if ((node.getRight() == null) && (node.getLeft() == null)){
            if (max < (int) node.getKey()){
                max = (int) node.getKey();
            }

        }
        if (node.getRight() != null){
            getleftRight(node.getRight());
        }
        if (node.getLeft() != null){
            getleftRight(node.getLeft());
        }
        return max;
    }
    public ArrayList<Integer> breadthFirst(BinaryTree tree) {
        ArrayList<Integer> list = new ArrayList<>();
        if (tree.root == null) {
            return null;
        }
        Queue<QueueNode> queue = new Queue<QueueNode>();
        queue.enQueue(tree.root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            list.add((Integer) node.getKey());
            if (node.getLeft() != null) {
                queue.enQueue(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.enQueue(node.getRight());
            }
        }
        return list;
    }
}