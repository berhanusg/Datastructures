package org.berhanu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArrayUtilsTest {

    @Test
    public void testIsSorted() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        assertTrue(ArrayUtils.isSorted(sortedArray));

        int[] unsortedArray = {1, 3, 2, 5, 4};
        assertFalse(ArrayUtils.isSorted(unsortedArray));

        int[] singleElementArray = {1};
        assertTrue(ArrayUtils.isSorted(singleElementArray));

        int[] emptyArray = {};
        assertTrue(ArrayUtils.isSorted(emptyArray));
    }
}
