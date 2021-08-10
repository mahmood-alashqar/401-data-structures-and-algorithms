import Insertion.Sort;
import Merge.MergSort;
import org.testng.annotations.Test;
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
}
