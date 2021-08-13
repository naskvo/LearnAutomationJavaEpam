package javafundamentals.optionaltask2;

import java.util.Arrays;
import java.util.Scanner;

public class SumBetween {
    // 2. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
    public static int[][] initializeMatrix(int n, int M) {
        final int FROM_NUMBER = -M;
        final int TO_NUMBER = M;
        final int RANGE = TO_NUMBER - FROM_NUMBER;
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * RANGE) - M;
            }
        }
        return mas;
    }

    public static void printMatrix(int[][] mas, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    public static void main(String[] args) {
        final int M = 10; //range of random values (from -M to M)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number n (matrix dimension):");
        int n = in.nextInt(); //matrix dimension
        if (n <= 0)
            throw new IllegalArgumentException("Invalid n value: value greater than 0 is expected");
        int[][] matrix = initializeMatrix(n, M);
        System.out.println("This is the initial matrix:");
        printMatrix(matrix, n);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int first;
            int second;
            int firstCol = 0;
            int secondCol = 0;
            boolean firstFound = false;
            boolean secondFound = false;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    first = matrix[i][j];
                    firstCol = j;
                    firstFound = true;
                    break;
                }
            }
            if (firstFound) {
                for (int j = firstCol + 1; j < n; j++) {
                    if (matrix[i][j] > 0) {
                        second = matrix[i][j];
                        secondCol = j;
                        secondFound = true;
                        break;
                    }
                }
            }
            int sumString = 0;
            if (firstFound && secondFound && Math.abs(secondCol-firstCol)>1) {
                for (int j = firstCol + 1; j < secondCol; j++) {
                    sum += matrix[i][j];
                    sumString += matrix[i][j];
                }
                System.out.println("Sum for the string №" + i + " = " + sumString);
            } else
                System.out.println("Sum for the string №" + i + " = 0");

        }
        System.out.println("Total sum = " + sum);
    }
}
