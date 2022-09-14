package ua.plotnichenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            startGame();
        }
        private static void startGame() {
        int secret = new Random().nextInt(12);
        Scanner input = new Scanner(System.in);
        while (true) {
            if (makeRound (secret, input)) {
                break;
            }
        }
            System.out.println("correct answer");
        }
        private static boolean makeRound(int secret, Scanner scanner) {
            System.out.println("Your turn: ");
            int guess = scanner.nextInt();
            if (guess == secret) {
                return true;
            }
            if (guess > secret) {
                System.out.println( " It is greater than a secret");
            } else {
                System.out.println("It is less than a secret");
            }
            return false;
            }
}
