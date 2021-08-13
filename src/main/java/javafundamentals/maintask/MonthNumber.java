package javafundamentals.maintask;

import java.util.Scanner;

public class MonthNumber {
    //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter below a number from 1 to 12 to know the month:");
        if (!in.hasNextInt())
            throw new IllegalArgumentException("Not a number");
        int monthNumber = in.nextInt();
        String monthName;
        switch (monthNumber) {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: monthName = "Invalid month number";
                break;
        }
        System.out.println(monthName);
    }
}