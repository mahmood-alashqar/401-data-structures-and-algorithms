/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Tree;
import Node.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    BinarySearchTree binerySearchTree= new BinarySearchTree();
    BinaryTree binaryTree = new BinaryTree();
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test
    public void testIfTreeEmpty(){
        binerySearchTree.add(5);
        assertNotNull(binerySearchTree);
    }
    @Test
    public void testAddTree(){
        binerySearchTree.add(5);
//        binerySearchTree.add(4);
        assertEquals(5,binerySearchTree.getRootKey());
    }
    @Test
    public void testAddLeftRght(){
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        assertEquals(2,binaryTree.getLeftBT());
    }
    @Test
    public void testInOrder(){
        ArrayList arrayList = new ArrayList();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.inOrder(binaryTree.getRoot());
        arrayList.add(binaryTree.arrayListInOrder);
    assertEquals("[[2, 1, 3]]",arrayList.toString());
    }
    @Test
    public void testPostOrder(){
        ArrayList arrayList = new ArrayList();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.postOrder(binaryTree.getRoot());
        arrayList.add(binaryTree.arrayListPostOrder);
        assertEquals("[[2, 3, 1]]",arrayList.toString());
    }
    @Test
    public void testPreOrder(){
        ArrayList arrayList = new ArrayList();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.preOrder(binaryTree.getRoot());
        arrayList.add(binaryTree.arrayListPreOrder);
        assertEquals("[[1, 2, 3]]",arrayList.toString());
    }
    @Test
    public void testMax(){
        bineryTree.setRoot(new Node(1));
        bineryTree.getRoot().setLeft(new Node(2));
        bineryTree.getRoot().setRight(new Node(3));
        assertEquals(3,bineryTree.findMax());
    }

}
