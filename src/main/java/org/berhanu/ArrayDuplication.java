package org.berhanu;

/*
In this example, we have an int[] called originalArray that we want to duplicate.
The duplicateArray method takes an int[] as input and creates a new array of the same length.
 It then iterates through the original array and copies its elements into the new array. Finally,
  it returns the duplicated array.
When run, this program will output the contents of the duplicated array, which will be identical to the original array:


 */
public class ArrayDuplication {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Duplicate the array
        int[] duplicatedArray = duplicateArray(originalArray);

        // Print the duplicated array
        for (int value : duplicatedArray) {
            System.out.print(value + " ");
        }
    }

    // Method to duplicate an array
    public static int[] duplicateArray(int[] original) {
        int[] duplicate = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            duplicate[i] = original[i];
        }

        return duplicate;
    }
}
