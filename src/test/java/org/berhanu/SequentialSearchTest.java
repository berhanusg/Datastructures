package org.berhanu;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequentialSearchTest {
    @Test
    public void testSequentialSearch() {
        int[] array = {12, 45, 23, 67, 32, 10, 89};

        assertEquals(SequentialSearch.sequentialSearch(array, 12), 0);
        assertEquals(SequentialSearch.sequentialSearch(array, 45), 1);
        assertEquals(SequentialSearch.sequentialSearch(array, 23), 2);
        assertEquals(SequentialSearch.sequentialSearch(array, 67), 3);
        assertEquals(SequentialSearch.sequentialSearch(array, 32), 4);
        assertEquals(SequentialSearch.sequentialSearch(array, 10), 5);
        assertEquals(SequentialSearch.sequentialSearch(array, 89), 6);
        assertEquals(SequentialSearch.sequentialSearch(array, 99), -1);
    }
}
