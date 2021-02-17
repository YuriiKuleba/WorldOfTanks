package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;

public class T7_Find {
    public static void main(String[] args) throws Exception {
        int[] numbers = {0, 1, 100, 3, 4, 5, 6, 3, 8, 3};
        System.out.println(Arrays.toString(numbers));
        System.out.println();


//        System.out.println(find1(numbers, 100));
        System.out.println(find2(numbers, 7));
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * Method should return index of found value of -1 if not found.
     */
    public static int find1(int[] data, int value) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        // TODO YOUR CODE HERE
        return -1;
    }

    /**
     * Method should return count of found values.
     */
    public static int find2(int[] data, int value) {
        // TODO YOUR CODE HERE
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                k++;
            }
        }
        if (k == 0) {
            return -1;
        }
        return k;
    }

}
