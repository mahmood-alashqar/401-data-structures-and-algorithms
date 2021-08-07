/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Tree;

import Node.Node;
import kAryTree.KAryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest<T> {
    BinarySearchTree binerySearchTree = new BinarySearchTree();
    BinaryTree binaryTree = new BinaryTree();

    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testIfTreeEmpty() {
        binerySearchTree.add(5);
        assertNotNull(binerySearchTree);
    }

    @Test
    public void testAddTree() {
        binerySearchTree.add(5);
//        binerySearchTree.add(4);
        assertEquals(5, binerySearchTree.getRootKey());
    }

    @Test
    public void testAddLeftRght() {
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        assertEquals(2, binaryTree.getLeftBT());
    }

    @Test
    public void testInOrder() {
        ArrayList arrayList = new ArrayList();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.inOrder(binaryTree.getRoot());
        arrayList.add(binaryTree.arrayListInOrder);
        assertEquals("[[2, 1, 3]]", arrayList.toString());
    }

    @Test
    public void testPostOrder() {
        ArrayList arrayList = new ArrayList();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.postOrder(binaryTree.getRoot());
        arrayList.add(binaryTree.arrayListPostOrder);
        assertEquals("[[2, 3, 1]]", arrayList.toString());
    }

    @Test
    public void testPreOrder() {
        ArrayList arrayList = new ArrayList();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.preOrder(binaryTree.getRoot());
        arrayList.add(binaryTree.arrayListPreOrder);
        assertEquals("[[1, 2, 3]]", arrayList.toString());
    }

    @Test
    public void testMax() {
        binaryTree.setRoot(new Node<T>(1));
        binaryTree.getRoot().setLeft(new Node<T>(2));
        binaryTree.getRoot().setRight(new Node<T>(3));
        assertEquals(3, binaryTree.findMax());
    }

    BinaryTree binaryTreeTest = new BinaryTree();

    @Test
    public void breadthFirstValuesInTreeTest() {
        binaryTreeTest.setRoot(new Node(1));
        binaryTreeTest.getRoot().setLeft(new Node(2));
        binaryTreeTest.getRoot().setRight(new Node(3));
        binaryTreeTest.getRoot().getLeft().setLeft(new Node(4));
        binaryTreeTest.getRoot().getLeft().getLeft().setLeft(new Node(5));
        binaryTreeTest.getRoot().getRight().setLeft(new Node(6));
        assertEquals("[1, 2, 3, 4, 6, 5]", binaryTreeTest.breadthFirst(binaryTreeTest).toString());
    }
    @Test
    public void fizzBuzzTest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(30);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
        assertEquals("should return 1","1" , "" + kAryTree.getRoot().getKey());

        assertEquals("should return 2","2" , "" + kAryTree.getRoot().getChild(0).getKey());
        assertEquals("should return 3","3" , "" + kAryTree.getRoot().getChild(1).getKey());
        assertEquals("should return 4","4" , "" + kAryTree.getRoot().getChild(2).getKey());

        assertEquals("should return 5","5" , "" + kAryTree.getRoot().getChild(0).getChild(0).getKey());
        assertEquals("should return 6","6" , "" + kAryTree.getRoot().getChild(0).getChild(1).getKey());
        assertEquals("should return 7","7" , "" + kAryTree.getRoot().getChild(0).getChild(2).getKey());

    }
}
