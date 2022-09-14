package ua.plotnichenko.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       String input = "pull up if I pull up";
       String spacesFreeInput = removeSpaces(input);
        System.out.println("Input: " + input);
        System.out.println("Without spaces: " + spacesFreeInput);
        System.out.println("Is palindrome: " + isPalindrome(spacesFreeInput));
    }
    public static String removeSpaces(String input) {
        return input.replaceAll("\\s", "");

    }

    public static boolean isPalindrome(String text) {
        return new  StringBuilder(text).reverse().toString().equalsIgnoreCase(text);
    }

}

