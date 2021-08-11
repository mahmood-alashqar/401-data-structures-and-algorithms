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
}
