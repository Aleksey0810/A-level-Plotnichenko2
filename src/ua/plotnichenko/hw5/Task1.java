package ua.plotnichenko.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        fillArray(array);
        printArray(array);
        System.out.println();
        plusMinusString(array);
    }

    public static void fillArray(int[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k + 1;
                k++;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < 1; j++) {
                System.out.println();
            }
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void plusMinusString(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0)
                    array[i][j] = -1 * array[i][j];
            }
            System.out.println();
            System.out.print(Arrays.toString(array[i]));
        }
    }
}




