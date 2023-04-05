package org.berhanu;
// ArrayDuplicatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayDuplicatorTest {
    @Test
    void testDuplicateArray() {
        ArrayDuplicator arrayDuplicator = new ArrayDuplicator();
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] duplicatedArray = arrayDuplicator.duplicateArray(originalArray);

        assertArrayEquals(expectedArray, duplicatedArray, "The duplicated array should be equal to the original array");
    }
}
