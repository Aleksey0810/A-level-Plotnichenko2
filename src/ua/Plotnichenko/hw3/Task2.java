package ua.Plotnichenko.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите что то :");
        String ourText = scan.nextLine();
        System.out.println("Текст до изменения :" + ourText);

        isPolidrome(removeSpaces(ourText));
    }
    public static String removeSpaces(String phrase) {

        String cleanText = phrase.replaceAll("\\s", "");
        System.out.println("Текст после удаления пробеллов : " + cleanText);
        int length = cleanText.length();
        System.out.println("Длина строки : " + length);
        String mirror = new StringBuilder(cleanText).reverse().toString();
        return cleanText;

    }

    public static boolean isPolidrome(String phrase){

        boolean isPolidrome = false;
        String mirror = new StringBuilder(phrase).reverse().toString();

        if (phrase.equals(mirror)){
            System.out.println("Является палиндромом");
            return true;
        } else {
            System.out.println("Не является палиндромом");
            return false;
        }

    }

}

