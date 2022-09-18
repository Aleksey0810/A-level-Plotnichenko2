package ua.plotnichenko.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillArray(array);
        System.out.println();

    }

    public static void fillArray(int[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = k + 1;
                k++;
                if (i % 2 != 0) {
                    array[i][j] = -1 * array[i][j];
                }
            }
            System.out.println();
            System.out.print(Arrays.toString(array[i]));

        }
    }
}



