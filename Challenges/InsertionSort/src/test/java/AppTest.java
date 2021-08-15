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
    //
}
