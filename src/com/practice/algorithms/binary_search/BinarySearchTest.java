package com.practice.algorithms.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void emptyArray() {
        String result = BinarySearch.searchElement(new int[]{}, 5);
        assertEquals("Array is empty!", result);
    }

    @Test
    void elementAtMidOdd() {
        int element = 3;
        int[] sortedArray = {1, 2, 3, 4, 5};
        int mid = sortedArray.length / 2;

        String result = BinarySearch.searchElement(sortedArray, element);
        assertEquals(element + " found at mid position: " + mid, result);
    }

    @Test
    void elementAtMidEven() {
        int element = 4;
        int[] sortedArray = {1, 2, 4, 5};
        int mid = sortedArray.length / 2;

        String result = BinarySearch.searchElement(sortedArray, element);
        assertEquals(element + " found at mid position: " + mid, result);
    }

    @Test
    void elementAtPosition() {
        int element = 2;
        int[] sortedArray = {1, 2, 3, 4, 5};

        String result = BinarySearch.searchElement(sortedArray, element);
        assertEquals(element + " found at position: " + 1, result);
    }

    @Test
    void elementNotFound() {
        int element = 6;
        int[] sortedArray = {1, 2, 3, 4, 5};

        String result = BinarySearch.searchElement(sortedArray, element);
        assertEquals(element + " Not found!", result);
    }
}

