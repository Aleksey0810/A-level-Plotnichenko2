package ua.plotnichenko.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int mass[] = new int[1000];
        fillMass(mass, 1, 10);
        simpleNum(mass);
    }
    public static void fillMass(int[] mass, int min, int max) {

        for (int i = 0; i < mass.length; i++) {
            mass[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void simpleNum(int[] mass) {
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            boolean simple = true;

            if (mass[i] != 1) {
                for (int j = 2; j < mass[i]; j++)
                    if (mass[i] % j == 0) {
                        simple = false;
                        System.out.println(mass[i] + " не простое ");
                        break;
                    }
                if (simple) {
                    System.out.println(mass[i] + " простое ");
                    sum = sum + 1;
                }
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел в массиве: " + sum);
    }
}
