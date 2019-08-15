package com.practice.algorithms.binary_search;

public class BinarySearch {

    public static String searchElement(int[] sortedArray, int element) {
        if(sortedArray.length == 0) {
            return "Array is empty!";
        }

        int mid = sortedArray.length / 2;

        if(sortedArray[mid] == element) {
            return element + " found at mid position: " + mid;
        }

        int left = 0;
        int right = sortedArray.length - 1;

        while(left != mid && right != mid) {
            if(element > sortedArray[mid]) {
                left = mid + 1;
            } else if(element < sortedArray[mid]) {
                right = mid - 1;
            } else {
                return element + " found at position: " + mid;
            }

            mid = (left + right) / 2;
        }

        return element + " Not found!";
    }
}
