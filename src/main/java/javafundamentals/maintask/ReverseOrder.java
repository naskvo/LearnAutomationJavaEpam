package javafundamentals.maintask;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrder {
    //Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter below some arguments separated by space:");
        String inputString = in.nextLine();
        String[] splited = inputString.split(" ");
        String[] reverseArray = new String[splited.length];
        for (int i = 0; i < splited.length; i++) {
            reverseArray[reverseArray.length-1-i] = splited[i];
        }
        System.out.println("Your array: " + Arrays.toString(splited));
        System.out.println("Reverse array: " + Arrays.toString(reverseArray));
    }
}