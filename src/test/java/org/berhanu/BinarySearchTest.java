package org.berhanu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {2, 3, 4, 10, 40, 55, 60};
        int target = 10;
        int expectedIndex = 3;
        assertEquals(expectedIndex, BinarySearch.binarySearch(arr, target));

        int[] arr2 = {-10, -5, 0, 5, 10, 15};
        int target2 = -5;
        int expectedIndex2 = 1;
        assertEquals(expectedIndex2, BinarySearch.binarySearch(arr2, target2));

        int[] arr3 = {1, 3, 5, 7, 9};
        int target3 = 8;
        int expectedIndex3 = -1;
        assertEquals(expectedIndex3, BinarySearch.binarySearch(arr3, target3));
    }
}
/*

In this test class, we import the necessary JUnit classes and
create a test class called BinarySearchTest. Inside the class, we define
a test method testBinarySearch and annotate it with @Test to signify that it is a JUnit test method.

Within the testBinarySearch method, we create three different test cases:

An array arr and a target value target. We call the binarySearch method and assert that the expected index is returned.
An array arr2 and a target value target2. We call the binarySearch method and assert that the expected index is returned.
An array arr3 and a target value target3. We call the binarySearch method and assert that the expected index is returned.
These test cases help ensure that the binarySearch

 */