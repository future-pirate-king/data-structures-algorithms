package com.practice.data_structures.hacker_rank;

public class ArrayProblems {
    private ArrayProblems() {}

    public static int [] reverseOfArray(int [] inputArray) {
        int [] reversedArray = new int[inputArray.length];
        for(int i = 1; i <= inputArray.length; i++ ) {
            final int index = inputArray.length - i;
            reversedArray[i - 1] = inputArray[index];
        }

        return reversedArray;
    }

    /**
     * find sum of hour glass and calculate sum then find max
     * hour glass = a b c
     *                d
     *              e f g
     * @param array 2d array
     * @return max sum
     */
    public static int maxSumOfHourGlass(int [][] array) {
        Integer max = null;
        final int hourRowLength = 3;
        final int hourColLength = 3;
        for (int i = 0; i < array.length; i++) {
            if((i + hourColLength) > array.length) {
                break;
            }

            final int[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                if((j + hourRowLength) > array.length) {
                    break;
                }

                final int sum = getSumOfHourGlass(array, i, j);
                if (max == null || max < sum) {
                    max = sum;
                }
            }
        }
        return max != null ? max : 0;
    }

    private static int getSumOfHourGlass(int[][] array, int col, int row) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i != 1 || j != 0) && (i != 1 || j != 2)) {
                    sum += array[col + i][row + j];
                }
            }
        }

        return sum;
    }
}
