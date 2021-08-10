import Insertion.Sort;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
public class AppTest {

    @Test
    public void testInsertionSort() {
        Integer[] integerArr= new Integer[]{5, 25, 30, 15, 10};
        Sort integerSort = new Sort<>();
        assertArrayEquals(new Integer[]{5, 10, 15, 25, 30}, integerSort.insertionSort(integerArr));
    }
}
