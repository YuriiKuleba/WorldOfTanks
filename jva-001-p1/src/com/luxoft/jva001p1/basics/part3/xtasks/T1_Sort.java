package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;
import java.util.Random;

public class T1_Sort {
    public static void main(String[] args) throws Exception {
        int[] numbers = getArrOfRandomInts(5);

        int[] copyToSort = Arrays.copyOf(numbers, numbers.length);

        long startTime = System.currentTimeMillis();

        sortAsc(copyToSort);

        long endTime = System.currentTimeMillis();

        System.out.println("-->" + (endTime - startTime));

        int[] copyToCheck = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(copyToCheck);
        System.out.println("Is numbers sorted: "
                + String.valueOf(Arrays.equals(copyToCheck, copyToSort)).toUpperCase());
    }

    private static int[] getArrOfRandomInts(int count) {
        int[] numbers = new int[count];

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }
        return numbers;
    }

    /**
     * Method should sort data array ascending order.
     */
    public static void sortAsc(int[] data) {
        System.out.println(Arrays.toString(data));

        // TODO YOUR CODE HERE
        for (int i = 0; i < data.length; i++) {

            System.out.println("First: " + Arrays.toString(data) + "\n");

            for (int j = 0; j < data.length - 1; j++) {

                System.out.println("Second: " + Arrays.toString(data) + "\n");
                int value1 = data[j];
                int value2 = data[j + 1];
                if (value1 > value2) {
                    swap(data, j, j + 1);
                    System.out.println("Swapping: " + Arrays.toString(data) + "\n");
                }
            }
        }

        System.out.println(Arrays.toString(data));
    }


    /**
     * Method should exchange values with idx1 and idx2 in data array.
     */
    public static void swap(int[] data, int idx1, int idx2) {

        int value1 = data[idx1];
        int value2 = data[idx2];
        data[idx1] = value2;
        data[idx2] = value1;
        // TODO SHOULD BE ALREADY IMPLEMENTED
    }
}
