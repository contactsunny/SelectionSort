package com.contactsunny.poc.selectionsort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 6};
        System.out.println("Given array: " + Arrays.toString(array));

        array = selectionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    /**
     * Method to perform selection sort.
     *
     * @param array The input unsorted array
     *
     * @return The sorted array
     */
    private static int[] selectionSort(int[] array) {
        // Iterating from the starting of the array to the end.
        // This index also represents the end of the sub array where we have
        // the sorted sub array.
        for (int index = 0; index < array.length - 1; index++) {
            // minIndex will be the index of the current lowest element
            // in the unsorted sub array.
            int minIndex = index;
            // Iterating through the unsorted sub array to find the next lowest element.
            for (int index2 = index + 1; index2 < array.length; index2++) {
                // Checking if the current element is smaller than the current
                // smallest element. If so, we'll move the minIndex pointer
                // to the current element. This will be the element we'll swap with the element
                // at the "index" position.
                if (array[index2] < array[minIndex]) {
                    minIndex = index2;
                }
            }

            // After iterating through the inner loop, we'll see if the min index
            // pointer has changed or not. If it has, we'll check if the element
            // at minIndex is indeed less than the element at index. If so, we'll
            // swap the two.
            if (minIndex != index && array[minIndex] < array[index]) {
                int temp = array[index];
                array[index] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        // Returning the sorted array.
        return array;
    }
}
