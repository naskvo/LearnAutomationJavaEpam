package javafundamentals.maintask;

import java.util.Scanner;

public class RandomNumbers {
    //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args) {
        final int FROM_NUMBER = 0;
        final int TO_NUMBER = 100;
        System.out.println("How many random numbers from 0 to 100 should I generate?");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        for (int i = 0; i < quantity; i++) {
            int randomNumber = FROM_NUMBER + (int) (Math.random() * TO_NUMBER);
            System.out.print(randomNumber + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < quantity; i++) {
            int randomNumber = FROM_NUMBER + (int) (Math.random() * TO_NUMBER);
            System.out.println(randomNumber);
        }
    }
}