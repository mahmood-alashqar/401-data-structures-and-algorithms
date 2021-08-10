
import Insertion.Sort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Integer[] integerNegArr = new Integer[]{4, -30, 30, 15, -15, 99, 9, 0};
        Sort<Integer> integerNegSort = new Sort<>();
        System.out.println(Arrays.toString(integerNegSort.insertionSort(integerNegArr)));
    }
}
