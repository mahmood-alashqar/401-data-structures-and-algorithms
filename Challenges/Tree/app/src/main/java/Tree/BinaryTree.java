package Tree;


import Node.Node;

import java.util.ArrayList;
import java.util.Stack;

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
}