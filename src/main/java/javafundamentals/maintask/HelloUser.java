package javafundamentals.maintask;

import java.util.Scanner;

public class HelloUser {
    //Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your name, please:");
        System.out.println("Hi, " + in.nextLine());
    }
}