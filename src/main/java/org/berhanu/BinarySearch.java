package org.berhanu;
/*
The binarySearch method takes an input sorted array arr and a target value to search for.
 It returns the index of the target value if it's present in the array, otherwise, it returns -1. In the main method,
a sample sorted array and a target value are provided, and the binary search algorithm is executed to find the target value in the array.

 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
/*

The binary search
algorithm works by repeatedly
 dividing the search interval in half and narrowing
 the search space until the target value is found or the search space is exhausted.


 */