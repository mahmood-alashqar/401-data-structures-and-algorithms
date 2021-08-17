import HashTable.HashTable;
import Insertion.Sort;
import Merge.MergSort;
import QuickSort.QuickSort;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class AppTest {
    Integer[] integerArr= new Integer[]{5, 25, 30, 15, 10};

    @Test
    public void testInsertionSort() {
        Sort integerSort = new Sort<>();
        assertArrayEquals(new Integer[]{5, 10, 15, 25, 30}, integerSort.insertionSort(integerArr));
    }
    @Test
    public void testMergeSort() {
        MergSort mergSort = new MergSort<>();
        assertArrayEquals(new Integer[]{5, 10, 15, 25, 30}, mergSort.mergeSort(integerArr));
    }
    @Test void quickSortTest(){

        int arr[] = {8,4,23,42,16,15};
        QuickSort quickSort=new QuickSort();
        quickSort.quickSort(arr,0,arr.length-1);

        String res= Arrays.toString(arr);
        assertEquals("[4, 8, 15, 16, 23, 42]",res); }

    @Test void newQuickTest(){

        int arr[] = {8,4,23,1,42,16,15};
        QuickSort quickSort=new QuickSort();
        quickSort.quickSort(arr,0,arr.length-1);

        String res= Arrays.toString(arr); assertEquals("[1, 4, 8, 15, 16, 23, 42]",res); }
    @Test
    void testHashMap(){
        HashTable<Object, Integer> salary = new HashTable<Object, Integer>();
        salary.add("John", 300);
        salary.add("Sally", 400);
        salary.add("Jade", 100);
        System.out.println("Delete Sally => " + salary.remove("Sally"));
        System.out.println("The size is => " + salary.getSize());
        assertTrue(salary.getSize()==2);
    }
    @Test
    public void testRepeatedWord(){

        String test ="Once upon a time, there was a brave princess who...";
        assertEquals(salary.repeatedWord(test.toLowerCase()),"the");
    }
    @Test
    public void testRepeatedWordRegardlessLowerOrUpperCase()
    {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals(salary.repeatedWord(test.toLowerCase()),"it");
    }
    @Test
    public void testReapeatedWordWithSymbol(){
        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn't know what I was doing in New York...";
        assertEquals(salary.repeatedWord(test.toLowerCase()),"summer");
    }
    @Test
    public void inseartionTest(){
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

        ArrayList test =  new ArrayList();
        test.add(1);
        test.add(5);
        test.add(4);
        assertEquals(salary.treeIntersection(binaryTree,binaryTree2),test);
    }
    @Test
    public void test_leftWithAllJoins(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("flow", "jam");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "test");

        List<String> list = new ArrayList<>();
        list.add("wrath: anger, delight");
        list.add("flow: jam, test");
        list.add("fond: enamored, averse");

        assertEquals("[wrath: anger, delight, flow: jam, test, fond: enamored, averse]" , salary.leftJoin(h1, h2).toString());
    }

    @Test
    public void test_leftWithSomeJoins(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored"); //
        h1.put("wrath", "anger"); //
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "jam");

        List<String> list = new ArrayList<>();
        list.add("diligent: employed, null");
        list.add("outfit: garb, null");
        list.add("wrath: anger, delight");
        list.add("guide: usher, null");
        list.add("fond: enamored, averse");

        assertEquals("[diligent: employed, null, outfit: garb, null, wrath: anger, delight, guide: usher, null, fond: enamored, averse]", salary.leftJoin(h1, h2).toString());
    }

    @Test
    public void test_leftWithEmptySecondHashMap(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();

        List<String> list = new ArrayList<>();
        list.add("diligent: employed, null");
        list.add("outfit: garb, null");
        list.add("wrath: anger, null");
        list.add("guide: usher, null");
        list.add("fond: enamored, null");

        assertEquals("[diligent: employed, null, outfit: garb, null, wrath: anger, null, guide: usher, null, fond: enamored, null]", salary.leftJoin(h1, h2).toString());

    }

    @Test
    public void test_leftBothEmptyHashMap(){
        HashMap h1 = new HashMap();
        HashMap h2 = new HashMap();

        List<String> list = new ArrayList<>();

        assertEquals("[]", salary.leftJoin(h1, h2).toString());

    }
}
