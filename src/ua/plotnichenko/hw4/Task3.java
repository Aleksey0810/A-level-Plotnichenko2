package ua.plotnichenko.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
            int mass[] = new int[1000];
            fillMass(mass, 1, 10);
            composite(mass);
        }
        public static void fillMass(int[] mass, int min, int max) {

            for (int i = 0; i < mass.length; i++) {
                mass[i] = ThreadLocalRandom.current().nextInt(min, max);
            }
            System.out.println(Arrays.toString(mass));
        }
        public static void composite(int mass[]) {
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                boolean composite = true;
                if (mass[i] > 3) {
                    for (int j = 2; j < mass[i]; j++)
                        if (mass[i] % j == 0) {
                            composite = true;
                            System.out.println(mass[i] + " составное ");
                            sum = sum + 1;
                            break;
                        }
                } else {
                    composite = false;
                }
            }
            System.out.println("Количество составных чисел в массиве: " + sum);
        }
    }
