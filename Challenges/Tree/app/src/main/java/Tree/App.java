/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Tree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        BinarySearchTree binerySearchTree= new BinarySearchTree();
        binerySearchTree.add(2);
        binerySearchTree.add(3);
        binerySearchTree.add(4);
        binerySearchTree.add(5);
        System.out.println("contains !!"+ binerySearchTree.contains(10));
//       binerySearchTree.inOrder(binerySearchTree.getRoot());
    }
}
