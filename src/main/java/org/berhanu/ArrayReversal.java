package org.berhanu;

/*
In this example, we have an int[] called originalArray that we want to reverse.
The reverseArray method takes an int[] as input and creates a new array of the same length.
It then iterates through the original array and copies its elements into the new array in reverse order.
Finally, it returns the reversed array.

When run, this program will output the contents of the reversed array:
*/
public class ArrayReversal {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Reverse the array
        int[] reversedArray = reverseArray(originalArray);

        // Print the reversed array
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
    }

    // Method to reverse an array
    public static int[] reverseArray(int[] original) {
        int[] reversed = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[original.length - 1 - i] = original[i];
        }

        return reversed;
    }
}
