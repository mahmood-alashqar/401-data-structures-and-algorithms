
import Insertion.Sort;
import Merge.MergSort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Integer[] testArray = new Integer[]{4, -30, 30, 15, -15, 99, 9, 0};
        Sort<Integer> insertionsort = new Sort<>();
        MergSort<Integer> mergeSort = new MergSort<>();
        System.out.println(Arrays.toString(insertionsort.insertionSort(testArray)));
        System.out.println(Arrays.toString(mergeSort.mergeSort(testArray)));
    }
}
