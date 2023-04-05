package org.berhanu;

/*
In this example, we have an int[] called array and an int called target that we want to find within the array.
 The sequentialSearch method takes an int[] and an int as input, iterates through the array,
and compares each element with the target. If the target is found, it returns the index of the target element.
 If the target is not found, it returns -1.
*/
public class SequentialSearch {
    public static void main(String[] args) {
        int[] array = {12, 45, 23, 67, 32, 10, 89};
        int target = 32;

        int index = sequentialSearch(array, target);

        if (index != -1) {
            System.out.println("Target value " + target + " found at index " + index);
        } else {
            System.out.println("Target value " + target + " not found in the array");
        }
    }

    // Sequential search algorithm
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // target found, return index
            }
        }
        return -1; // target not found, return -1
    }
}
