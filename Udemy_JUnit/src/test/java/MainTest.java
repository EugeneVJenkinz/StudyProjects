import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void bubbleSort() {
        int[] array = {4, 12, -88, 0, 3};
        int[] expected = {-88, 0, 3, 4, 12};
        Main.bubbleSort(array);
        assertArrayEquals(expected, array);
    }
}