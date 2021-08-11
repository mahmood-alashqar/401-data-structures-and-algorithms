
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
    }
}
