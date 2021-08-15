
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
//
        System.out.println("The size is => " + salary.getSize());
    }
}
