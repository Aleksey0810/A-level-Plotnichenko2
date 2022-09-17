package ua.plotnichenko.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {
        int mass[] = new int[2000];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println("Original");
        System.out.println(Arrays.toString(mass));
        System.out.println("with nullified evens");
        System.out.println(Arrays.toString(nullAllEvens(mass)));
    }
    static int[] nullAllEvens(int[] arr) {
        int[] nullified = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < nullified.length; i++) {
            if (nullified[i] % 2 == 0) {
                nullified[i] = 0;
            }
        }
        return nullified;
    }
}