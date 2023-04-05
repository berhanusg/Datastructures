package org.berhanu;


    // ArrayDuplicator.java
    public class ArrayDuplicator {
        public int[] duplicateArray(int[] original) {
            int[] duplicate = new int[original.length];

            for (int i = 0; i < original.length; i++) {
                duplicate[i] = original[i];
            }

            return duplicate;
        }


}
