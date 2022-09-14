package ua.plotnichenko.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
        public static void main(String[] args) {
            int[] randomNumbers = new int[10];
            fillArray(randomNumbers);
            System.out.println(Arrays.toString(randomNumbers));
            System.out.println(getArrayAverage(randomNumbers));
            System.out.println(getArrayAverageGeometric(randomNumbers));
        }

        public static void fillArray(int [] randomNums){
            Random random = new Random();
            for (int i = 0; i < randomNums.length; i++) {
                randomNums[i] = random.nextInt(10);
            }
        }
        public static int getArrayAverage(int[] randomNumbers) {
            int sum = 0;
            int average;
            for (int j = 0; j < randomNumbers.length; j++) {
                sum = sum + randomNumbers[j];
            }
            average = sum / randomNumbers.length;
            return average;
        }
        public static double getArrayAverageGeometric(int[] randomNumbers) {
            int geometricAverage = 1;
            for (int i = 0; i < randomNumbers.length; i++) {
                geometricAverage *= randomNumbers[i];
                Math.pow (geometricAverage,1.0/randomNumbers.length);
            }
            return geometricAverage;
        }
    }
