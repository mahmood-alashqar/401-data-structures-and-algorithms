
import HashTable.HashTable;
import Insertion.Sort;
import Merge.MergSort;
import QuickSort.QuickSort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Integer[] testArray = new Integer[]{4, -30, 30, 15, -15, 99, 9, 0};
        Sort<Integer> insertionsort = new Sort<>();
        MergSort<Integer> mergeSort = new MergSort<>();
        System.out.println(Arrays.toString(insertionsort.insertionSort(testArray)));
        System.out.println(Arrays.toString(mergeSort.mergeSort(testArray)));
        QuickSort quickSort= new QuickSort();
        int arr[] = {4, -30, 30, 15, -15, 99, 9, 0};
        System.out.println(Arrays.toString(quickSort.quickSort(arr, 0, arr.length - 1)));

        //====================>>>

        HashTable<Object, Integer> salary = new HashTable<Object, Integer>();
        salary.add("John", 300);
        salary.add("Sally", 400);
        salary.add("Tom", 200);
        salary.add("Jade", 100);

        System.out.println("The size is => " + salary.getSize());
        System.out.println("The Sally allowance is => " + salary.get("Sally"));
        System.out.println("Delete Sally => " + salary.remove("Sally"));
        System.out.println("The size is => " + salary.getSize());
        String test ="Once upon a time, there was a brave princess who...";
        System.out.println("The Repeated Woed Is --->"+salary.repeatedWord(test.toLowerCase()));

        System.out.println("The size is => " + salary.getSize());

        BinaryTree<Integer> binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node<>(1));
        binaryTree.getRoot().setLeft(new Node<>(5));
        binaryTree.getRoot().setRight(new Node<>(3));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(4));
        BinaryTree<Integer> binaryTree2 = new BinaryTree();
        binaryTree2.setRoot(new Node<>(1));
        binaryTree2.getRoot().setLeft(new Node<>(5));
        binaryTree2.getRoot().setRight(new Node<>(2));
        binaryTree2.getRoot().getLeft().setLeft(new Node<>(4));
        System.out.println(salary.treeIntersection(binaryTree,binaryTree2));

        HashMap<Object, String> synonym  = new HashMap<Object, String>();
        synonym.put("fond", "enamored");
        synonym.put("wrath", "anger");
        synonym.put("diligent", "employed");
        synonym.put("outift", "garb");

        HashMap<Object, String> antonyms = new HashMap<Object, String>();
        antonyms.put("fond", "averse");
        antonyms.put("wrath", "delight");
        antonyms.put("diligent", "idle");
        antonyms.put("outift", "follow");

        System.out.println(salary.leftJoin(synonym,antonyms));
    }
}
