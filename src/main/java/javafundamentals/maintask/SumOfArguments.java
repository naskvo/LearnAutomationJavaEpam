package javafundamentals.maintask;

import java.util.Scanner;

public class SumOfArguments {
    //Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter below some numbers separated by space or line break. Please, put any not numeric symbol " +
                "AFTER the last space or line break.");
        int sum = 0;
        int mult = 1;
        if (in.hasNextInt()) {
            while (in.hasNextInt()) {
                int n = in.nextInt();
                sum += n;
                mult *= n;
            }
            System.out.println("The sum is " + sum);
            System.out.println("The product is " + mult);
        } else
            System.out.println("You've written invalid numbers.");
    }
}
